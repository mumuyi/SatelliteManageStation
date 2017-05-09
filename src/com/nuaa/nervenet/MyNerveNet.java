package com.nuaa.nervenet;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import org.joone.engine.LinearLayer;
import org.joone.engine.Monitor;
import org.joone.engine.NeuralNetEvent;
import org.joone.engine.NeuralNetListener;
import org.joone.engine.SigmoidLayer;
import org.joone.io.MemoryInputSynapse;
import org.joone.io.MemoryOutputSynapse;
import org.joone.net.NeuralNet;
import org.joone.net.NeuralNetLoader;

import com.nuaa.utils.DataNormalization;

public class MyNerveNet implements NeuralNetListener,java.io.Serializable{
	private static final long serialVersionUID = -7149016651065876255L;
	private NeuralNet nnet = null;
	private MemoryInputSynapse inputSynapse;
	LinearLayer input;
	SigmoidLayer hidden, output;
	boolean singleThreadMode = true;

	private static String filename = "C:/Users/ai/Desktop/data/model/model";

	public double getPredictData(String parameterName, int point) {
		double ans = -1.11111;
		nnet = restoreNeuralNet(parameterName);
		if (nnet != null) {
			double[][] inputArray = new double[][] { { point } };
			// 获取之前的输入层;
			LinearLayer input = (LinearLayer) nnet.getInputLayer();
			inputSynapse = new MemoryInputSynapse();
			// 将原来的输入突触去掉;
			input.removeAllInputs();
			// 加上新的突触;
			input.addInputSynapse(inputSynapse);
			// 设置新的突触;
			inputSynapse.setInputArray(inputArray);
			inputSynapse.setAdvancedColumnSelector(" 1 ");
			Monitor monitor = nnet.getMonitor();
			// 这个是指测试的数量;
			monitor.setTrainingPatterns(1);
			monitor.setTotCicles(1);
			// 这不是训练过程，并不需要学习;
			monitor.setLearning(false);
			MemoryOutputSynapse memOut = new MemoryOutputSynapse();
			// set the output synapse to write the output of the net

			nnet.addOutputSynapse(memOut);
			System.out.println(nnet.check());
			nnet.getMonitor().setSingleThreadMode(singleThreadMode);
			nnet.go();

			double[] pattern = memOut.getNextPattern();
			System.out.println(" Output pattern " + " = " + pattern[0]);
			
			//逆归一化;
			DataNormalization dn=new DataNormalization();
			ans=dn.antiNormalization(parameterName, pattern[0]);
		}
		return ans;
	}

	private NeuralNet restoreNeuralNet(String parameterName) {
		NeuralNetLoader loader = new NeuralNetLoader(filename + parameterName + ".nnet");
		NeuralNet nnet = loader.getNeuralNet();
		return nnet;
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
	
	@Override
	public void cicleTerminated(NeuralNetEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void errorChanged(NeuralNetEvent e) {
		Monitor mon = (Monitor) e.getSource();
		if (mon.getCurrentCicle() % 100 == 0)
			System.out.println(
					" Epoch:  " + (mon.getTotCicles() - mon.getCurrentCicle()) + "  RMSE: " + mon.getGlobalError());
	}

	@Override
	public void netStarted(NeuralNetEvent e) {
		Monitor mon = (Monitor) e.getSource();
		System.out.print(" Network started for  ");
		if (mon.isLearning())
			System.out.println(" training. ");
		else
			System.out.println(" interrogation. ");
	}

	@Override
	public void netStopped(NeuralNetEvent e) {
		Monitor mon = (Monitor) e.getSource();
		System.out.println(" Network stopped. Last RMSE= " + mon.getGlobalError());
		if (mon.isLearning()) {
			saveModel(); // 序列化对象
		}
	}

	@Override
	public void netStoppedError(NeuralNetEvent e, String error) {
		System.out.println(" Network stopped due the following error:  " + error);
	}
	
	public static void main(String[] argv){
		MyNerveNet bp=new MyNerveNet();
		bp.getPredictData("yjs088",200);
	}
}
