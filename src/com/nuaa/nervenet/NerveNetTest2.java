package com.nuaa.nervenet;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.joone.engine.FullSynapse;
import org.joone.engine.LinearLayer;
import org.joone.engine.Monitor;
import org.joone.engine.NeuralNetEvent;
import org.joone.engine.NeuralNetListener;
import org.joone.engine.SigmoidLayer;
import org.joone.engine.learning.TeachingSynapse;
import org.joone.io.MemoryInputSynapse;
import org.joone.io.MemoryOutputSynapse;
import org.joone.net.NeuralNet;
import org.joone.net.NeuralNetLoader;

import com.nuaa.entiy.FrameData;
import com.nuaa.entiy.MyHibernate;

public class NerveNetTest2 implements NeuralNetListener, java.io.Serializable{
	private static final long serialVersionUID = 8904087654343983744L;
	private static NeuralNet nnet = null;
	private MemoryInputSynapse inputSynapse, desiredOutputSynapse;
	LinearLayer input, output;
	SigmoidLayer hidden;
	boolean singleThreadMode = true;

	//input
	private double[][] inputArray;

	//desired output
	private double[][] desiredOutputArray;

//	private static String filename="C:/Users/ai/Desktop/data/model/modelyjs088.nnet";
	private static String filename="C:/Users/ai/Desktop/data/model/model";
	
	
	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {

		
		 //新建对象;
		 //初始化神经网络;
		 //训练神经网络;
		 //测试神经网络;
		
		NerveNetTest2 bp = new NerveNetTest2();  
		bp.inputArray=bp.prepareinputData();
		bp.desiredOutputArray=bp.prepareoutputData();
        bp.initNeuralNet();  
        bp.train();  
        bp.interrogate();  
	}

	/**
	 * 训练神经元;
	 */
	public void train() {

		// set the inputs
		inputSynapse.setInputArray(inputArray);
		// 表示的是输入层数据使用的是inputArray的前两列数据;
		inputSynapse.setAdvancedColumnSelector(" 1 ");
		// set the desired outputs
		desiredOutputSynapse.setInputArray(desiredOutputArray);
		desiredOutputSynapse.setAdvancedColumnSelector(" 1 ");

		// get the monitor object to train or feed forward
		Monitor monitor = nnet.getMonitor();

		// set the monitor parameters
		// 设置神经网络训练的步长参数，步长越大，神经网络梯度下降的速度越快;
		monitor.setLearningRate(0.8);
		monitor.setMomentum(0.3);
		// 设置神经网络的输入层的数据大小size;
		monitor.setTrainingPatterns(inputArray.length);
		// 这个指的是设置迭代数目;
		monitor.setTotCicles(1500);
		// 这个true表示是在训练过程;
		monitor.setLearning(true);

		long initms = System.currentTimeMillis();
		// Run the network in single-thread, synchronized mode
		nnet.getMonitor().setSingleThreadMode(singleThreadMode);
		nnet.go(true);
		System.out.println(" Total time=  " + (System.currentTimeMillis() - initms) + "  ms ");
	}

	/**
	 * 测试神经网络;
	 */
	public void interrogate() {

		double[][] inputArray = preparetestData();
		// set the inputs
		inputSynapse.setInputArray(inputArray);
		inputSynapse.setAdvancedColumnSelector(" 1 ");
		Monitor monitor = nnet.getMonitor();
		// 这个是指测试的数量;
		monitor.setTrainingPatterns(30);
		monitor.setTotCicles(1);
		// 这不是训练过程，并不需要学习;
		monitor.setLearning(false);
		MemoryOutputSynapse memOut = new MemoryOutputSynapse();
		// set the output synapse to write the output of the net

		if (nnet != null) {
			nnet.addOutputSynapse(memOut);
			System.out.println(nnet.check());
			nnet.getMonitor().setSingleThreadMode(singleThreadMode);
			nnet.go();

			for(int i=0;i<30;i++){
				double[] pattern = memOut.getNextPattern();
				System.out.println(" Output pattern " +(i+70)+ " = " + (pattern[0]*10000));
			}
			System.out.println(" Interrogating Finished ");
		}
	}

	/**
	 * 初始化神经网络;
	 */
	public void initNeuralNet() {

		// First create the three layers
		// 创建三层网络:输入层,隐藏层,输出层;
		input = new LinearLayer();
		hidden = new SigmoidLayer();
		output = new LinearLayer();

		// set the dimensions of the layers
		// 设定每一层的神经元个数;
		input.setRows(1);
		hidden.setRows(3);
		output.setRows(1);

		// 取个名字;
		input.setLayerName(" L.input ");
		hidden.setLayerName(" L.hidden ");
		output.setLayerName(" L.output ");

		// Now create the two Synapses
		// 创建两个映射关系或者说神经突触;
		FullSynapse synapse_IH = new FullSynapse(); /* input -> hidden conn. */
		FullSynapse synapse_HO = new FullSynapse(); /* hidden -> output conn. */

		// 将三个层连接起来，synapse_IH用来连接输入层和隐含层，synapse_HO用来连接隐含层和输出层;
		// Connect the input layer whit the hidden layer
		input.addOutputSynapse(synapse_IH);
		hidden.addInputSynapse(synapse_IH);
		// Connect the hidden layer whit the output layer
		hidden.addOutputSynapse(synapse_HO);
		output.addInputSynapse(synapse_HO);

		// the input to the neural net
		// 这里指的是使用了从内存中输入数据的方法;
		inputSynapse = new MemoryInputSynapse();

		input.addInputSynapse(inputSynapse);

		// The Trainer and its desired output
		// 从内存中输入数据，指的是从输出层应该输出的数据;
		desiredOutputSynapse = new MemoryInputSynapse();

		TeachingSynapse trainer = new TeachingSynapse();

		trainer.setDesired(desiredOutputSynapse);

		// Now we add this structure to a NeuralNet object
		nnet = new NeuralNet();

		nnet.addLayer(input, NeuralNet.INPUT_LAYER);
		nnet.addLayer(hidden, NeuralNet.HIDDEN_LAYER);
		nnet.addLayer(output, NeuralNet.OUTPUT_LAYER);
		nnet.setTeacher(trainer);
		output.addOutputSynapse(trainer);
		nnet.addNeuralNetListener(this);
	}

	public void cicleTerminated(NeuralNetEvent e) {
	}

	public void errorChanged(NeuralNetEvent e) {
		Monitor mon = (Monitor) e.getSource();
		if (mon.getCurrentCicle() % 100 == 0)
			System.out.println(
					" Epoch:  " + (mon.getTotCicles() - mon.getCurrentCicle()) + "  RMSE: " + mon.getGlobalError());
	}

	public void netStarted(NeuralNetEvent e) {
		Monitor mon = (Monitor) e.getSource();
		System.out.print(" Network started for  ");
		if (mon.isLearning())
			System.out.println(" training. ");
		else
			System.out.println(" interrogation. ");
	}

	public void netStopped(NeuralNetEvent e) {
		Monitor mon = (Monitor) e.getSource();
		System.out.println(" Network stopped. Last RMSE= " + mon.getGlobalError());
		if (mon.isLearning()) {
			saveModel(); // 序列化对象
		}
	}

	public void netStoppedError(NeuralNetEvent e, String error) {
		System.out.println(" Network stopped due the following error:  " + error);
	}

	private void saveModel() {
		try {
			FileOutputStream stream = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(stream);
			out.writeObject(nnet);// 写入nnet对象
			out.close();
		} catch (Exception excp) {
			excp.printStackTrace();
		}
	}

	private NeuralNet restoreNeuralNet(String parameterName) {
		NeuralNetLoader loader = new NeuralNetLoader(filename+parameterName+".nnet");
		NeuralNet nnet = loader.getNeuralNet();
		return nnet;
	}
	
	private double[][] prepareoutputData(){
		double[][] output=new double[50][1];
		for(int i=0;i<50;i++){
			output[i][0]=(((-4.0*i*i)+(400.0*i))/10000.0);
			System.out.println(""+output[i][0]);
		}
		return output;
	}
	
	private double[][] prepareinputData(){
		double[][] input=new double[50][1];
		for(int i=0;i<50;i++){
			input[i][0]=i;
		}
		return input;
	}
	
	private double[][] preparetestData(){
		double[][] input=new double[50][1];
		for(int i=70;i<99;i++){
			input[i-70][0]=i;
		}
		return input;
	}
	
	public double getPredictData(String parameterName,int point){
		double ans=-1.11111;
		NeuralNet bpNNet = restoreNeuralNet(parameterName);
		if (bpNNet != null) {
			double[][] inputArray = new double[][] { { point } };
			//获取之前的输入层;
			LinearLayer input = (LinearLayer) bpNNet.getInputLayer();
			inputSynapse = new MemoryInputSynapse();
			//将原来的输入突触去掉;
			input.removeAllInputs();
			//加上新的突触;
			input.addInputSynapse(inputSynapse);
			//设置新的突触;
			inputSynapse.setInputArray(inputArray);
			inputSynapse.setAdvancedColumnSelector(" 1 ");
			Monitor monitor = bpNNet.getMonitor();
			// 这个是指测试的数量;
			monitor.setTrainingPatterns(1);
			monitor.setTotCicles(1);
			// 这不是训练过程，并不需要学习;
			monitor.setLearning(false);
			MemoryOutputSynapse memOut = new MemoryOutputSynapse();
			// set the output synapse to write the output of the net

			bpNNet.addOutputSynapse(memOut);
			System.out.println(bpNNet.check());
			bpNNet.getMonitor().setSingleThreadMode(singleThreadMode);
			bpNNet.go();


			double[] pattern = memOut.getNextPattern();
			System.out.println(" Output pattern " + " = " + pattern[0]);
			return pattern[0];
		}
		return ans;
	}
}