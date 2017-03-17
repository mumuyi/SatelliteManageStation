package com.nuaa.entiy;

public class FrameData {
	//计数;
	private int counter;
	
	//星上时间;
	private long ysj023;//秒;
	private int ysj024;//毫秒;
	
	//控制模式信息;
	private String ykm001;
	
	//双电平遥测量;
	private String ydp130;
	private String ydp131;
	private String ydp132;
	private String ydp133;
	private String ydp134;
	private String ydp135;
	private String ydp136;
	private String ydp137;
	private String ydp138;
	private String ydp139;
	private String ydp140;
	private String ydp141;
	private String ydp142;
	private String ydp143;
	private String ydp144;
	private String ydp145;
	private String ydp146;
	private String ydp147;
	private String ydp148;
	private String ydp149;
	private String ydp150;
	private String ydp151;
	private String ydp152;
	private String ydp153;
	private String ydp154;
	private String ydp155;
	private String ydp156;
	private String ydp157;
	private String ydp158;
	private String ydp159;
	private String ydp160;
	private String ydp161;
	private String ydp162;
	private String ydp163;
	private String ydp164;
	private String ydp165;
	private String ydp166;
	private String ydp167;
	
	//指令反馈;
	private byte yzl166;
	private byte yzl167;
	private byte yzl168;
	private byte yzl169;
	private byte yzl170;
	private byte yzl171;
	private byte yzl172;
	private byte yzl173;
	private byte yzl174;
	private byte yzl175;
	private int yzl176;
	private byte yzl177;
	private byte yzl178;
	private byte yzl179;
	private byte yzl180;
	private byte yzl181;
	private byte yzl182;
	private byte yzl183;
	
	//故障管理;
	private byte ygz184;
	private String ygz185;
	private String ygz186;
	private String ygz187;
	private String ygz188;
	private String ygz189;
	private String ygz190;
	private String ygz191;
	private String ygz192;
	private String ygz193;
	
	//星上状态;
	private String yxs504;
	private String yxs505;
	private String yxs601;
	private String yxs602;
	private String yxs603;
	private String yxs610;
	private byte yxs611;
	private byte yxs612;
	
	//组号 帧计数;
	private int groupNumber;
	private int frameCounter;
	
	//磁强计A输出,磁强计B输出;
	private double yca002;
	private double yca003;
	private double yca004;
	private double ycb005;
	private double ycb006;
	private double ycb007;
	
	//卫星测量遥测;
	private double ycl046;
	private double ycl047;
	private double ycl048;
	private double ycl049;
	private int ycl050;
	private int ycl051;
	private int ycl052;
	
	//轨道解算;
	private int ygd040;
	private int ygd041;
	private int ygd042;
	private int ygd043;
	private int ygd044;
	private int ygd045;
	
	//模拟太敏输出;
	private double ytm008;
	private double ytm009;
	private double ytm010;
	private double ytm011;
	private double ytm012;
	private double ytm013;
	private double ytm014;
	private double ytm015;
	
	//GPS输出;
	private long ygp024;
	private long ygp025;
	private double ygp026;
	private double ygp027;
	private double ygp028;
	private double ygp029;
	private double ygp030;
	private double ygp031;
	private double ygp032;
	private byte ygp033;
	private byte ygp034;
	
	//陀螺输出;
	private double ytl016;
	
	//姿控状态遥测;
	private int ykz060;
	private int ykz061;
	private int ykz062;
	private String ykz063;
	private String ykz064;
	private String ykz065;
	private String ykz066;
	private String ykz067;
	private String ykz068;
	private String ykz069;
	private String ykz501;
	private String ykz502;
	private String ykz503;
	
	//84 坐标 GPS;
	private double ygp040;
	private double ygp041;
	private double ygp042;
	private double ygp043;
	private double ygp044;
	private double ygp045;
	private byte ygp046;
	private byte ygp047;
	
	//通信;
	private double ytx070;
	private double ytx071;
	private double ytx072;
	private double ytx073;
	private double ytx074;
	private short ytx075;
	private short ytx076;
	private short ytx077;
	private short ytx078;
	
	//电源;
	private double ydy079;
	private double ydy080;
	private double ydy081;
	private double ydy082;
	private double ydy083;
	private double ydy084;
	private double ydy085;
	private double ydy086;
	
	//星上计算机;
	private double yjs087;
	private double yjs088;
	private double yjs089;
	private double yjs090;
	private double yjs091;
	private double yjs092;
	
	//控制率计算结果;
	private double ykl053;
	private double ykl054;
	private double ykl055;
	private double ykl056;
	private double ykl057;
	private double ykl058;
	private double ykl059;
	
	//通信应答计数;
	private short yty506;
	private short yty507;
	private short yty508;
	private short yty509;
	
	//功能遥测量;
	private double ygn035;
	private double ygn036;
	private double ygn037;
	private double ygn038;
	private double ygn039;
	
	//大容量地址;
	private int ydz093;
	private int ydz094;
	private int ydz095;
	private int ydz096;
	private int ydz097;
	private int ydz098;
	private int ydz099;
	private int ydz100;
	private int ydz101;
	private int ydz102;
	private int ydz103;
	private int ydz104;
	
	//延时时间;
	private long ysj001;
	private long ysj002;
	private long ysj003;
	private long ysj004;
	private long ysj005;
	private long ysj006;
	
	//温度遥测;
	private double ywd105;
	private double ywd106;
	private double ywd107;
	private double ywd108;
	private double ywd109;
	private double ywd110;
	private double ywd111;
	private double ywd112;
	private double ywd113;
	private double ywd114;
	private double ywd115;
	private double ywd116;
	private double ywd117;
	private double ywd118;
	private double ywd119;
	private double ywd120;
	private double ywd121;
	private double ywd122;
	private double ywd123;
	private double ywd124;
	private double ywd125;
	private double ywd126;
	private double ywd127;
	private double ywd128;
	private double ywd129;
	
	
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	public long getYsj023() {
		return ysj023;
	}
	public void setYsj023(long ysj023) {
		this.ysj023 = ysj023;
	}
	public int getYsj024() {
		return ysj024;
	}
	public void setYsj024(int ysj024) {
		this.ysj024 = ysj024;
	}
	public String getYkm001() {
		return ykm001;
	}
	public void setYkm001(String ykm001) {
		this.ykm001 = ykm001;
	}
	public String getYdp130() {
		return ydp130;
	}
	public void setYdp130(String ydp130) {
		this.ydp130 = ydp130;
	}
	public String getYdp131() {
		return ydp131;
	}
	public void setYdp131(String ydp131) {
		this.ydp131 = ydp131;
	}
	public String getYdp132() {
		return ydp132;
	}
	public void setYdp132(String ydp132) {
		this.ydp132 = ydp132;
	}
	public String getYdp133() {
		return ydp133;
	}
	public void setYdp133(String ydp133) {
		this.ydp133 = ydp133;
	}
	public String getYdp134() {
		return ydp134;
	}
	public void setYdp134(String ydp134) {
		this.ydp134 = ydp134;
	}
	public String getYdp135() {
		return ydp135;
	}
	public void setYdp135(String ydp135) {
		this.ydp135 = ydp135;
	}
	public String getYdp136() {
		return ydp136;
	}
	public void setYdp136(String ydp136) {
		this.ydp136 = ydp136;
	}
	public String getYdp137() {
		return ydp137;
	}
	public void setYdp137(String ydp137) {
		this.ydp137 = ydp137;
	}
	public String getYdp138() {
		return ydp138;
	}
	public void setYdp138(String ydp138) {
		this.ydp138 = ydp138;
	}
	public String getYdp139() {
		return ydp139;
	}
	public void setYdp139(String ydp139) {
		this.ydp139 = ydp139;
	}
	public String getYdp140() {
		return ydp140;
	}
	public void setYdp140(String ydp140) {
		this.ydp140 = ydp140;
	}
	public String getYdp141() {
		return ydp141;
	}
	public void setYdp141(String ydp141) {
		this.ydp141 = ydp141;
	}
	public String getYdp142() {
		return ydp142;
	}
	public void setYdp142(String ydp142) {
		this.ydp142 = ydp142;
	}
	public String getYdp143() {
		return ydp143;
	}
	public void setYdp143(String ydp143) {
		this.ydp143 = ydp143;
	}
	public String getYdp144() {
		return ydp144;
	}
	public void setYdp144(String ydp144) {
		this.ydp144 = ydp144;
	}
	public String getYdp145() {
		return ydp145;
	}
	public void setYdp145(String ydp145) {
		this.ydp145 = ydp145;
	}
	public String getYdp146() {
		return ydp146;
	}
	public void setYdp146(String ydp146) {
		this.ydp146 = ydp146;
	}
	public String getYdp147() {
		return ydp147;
	}
	public void setYdp147(String ydp147) {
		this.ydp147 = ydp147;
	}
	public String getYdp148() {
		return ydp148;
	}
	public void setYdp148(String ydp148) {
		this.ydp148 = ydp148;
	}
	public String getYdp149() {
		return ydp149;
	}
	public void setYdp149(String ydp149) {
		this.ydp149 = ydp149;
	}
	public String getYdp150() {
		return ydp150;
	}
	public void setYdp150(String ydp150) {
		this.ydp150 = ydp150;
	}
	public String getYdp151() {
		return ydp151;
	}
	public void setYdp151(String ydp151) {
		this.ydp151 = ydp151;
	}
	public String getYdp152() {
		return ydp152;
	}
	public void setYdp152(String ydp152) {
		this.ydp152 = ydp152;
	}
	public String getYdp153() {
		return ydp153;
	}
	public void setYdp153(String ydp153) {
		this.ydp153 = ydp153;
	}
	public String getYdp154() {
		return ydp154;
	}
	public void setYdp154(String ydp154) {
		this.ydp154 = ydp154;
	}
	public String getYdp155() {
		return ydp155;
	}
	public void setYdp155(String ydp155) {
		this.ydp155 = ydp155;
	}
	public String getYdp156() {
		return ydp156;
	}
	public void setYdp156(String ydp156) {
		this.ydp156 = ydp156;
	}
	public String getYdp157() {
		return ydp157;
	}
	public void setYdp157(String ydp157) {
		this.ydp157 = ydp157;
	}
	public String getYdp158() {
		return ydp158;
	}
	public void setYdp158(String ydp158) {
		this.ydp158 = ydp158;
	}
	public String getYdp159() {
		return ydp159;
	}
	public void setYdp159(String ydp159) {
		this.ydp159 = ydp159;
	}
	public String getYdp160() {
		return ydp160;
	}
	public void setYdp160(String ydp160) {
		this.ydp160 = ydp160;
	}
	public String getYdp161() {
		return ydp161;
	}
	public void setYdp161(String ydp161) {
		this.ydp161 = ydp161;
	}
	public String getYdp162() {
		return ydp162;
	}
	public void setYdp162(String ydp162) {
		this.ydp162 = ydp162;
	}
	public String getYdp163() {
		return ydp163;
	}
	public void setYdp163(String ydp163) {
		this.ydp163 = ydp163;
	}
	public String getYdp164() {
		return ydp164;
	}
	public void setYdp164(String ydp164) {
		this.ydp164 = ydp164;
	}
	public String getYdp165() {
		return ydp165;
	}
	public void setYdp165(String ydp165) {
		this.ydp165 = ydp165;
	}
	public String getYdp166() {
		return ydp166;
	}
	public void setYdp166(String ydp166) {
		this.ydp166 = ydp166;
	}
	public String getYdp167() {
		return ydp167;
	}
	public void setYdp167(String ydp167) {
		this.ydp167 = ydp167;
	}
	public byte getYzl166() {
		return yzl166;
	}
	public void setYzl166(byte yzl166) {
		this.yzl166 = yzl166;
	}
	public byte getYzl167() {
		return yzl167;
	}
	public void setYzl167(byte yzl167) {
		this.yzl167 = yzl167;
	}
	public byte getYzl168() {
		return yzl168;
	}
	public void setYzl168(byte yzl168) {
		this.yzl168 = yzl168;
	}
	public byte getYzl169() {
		return yzl169;
	}
	public void setYzl169(byte yzl169) {
		this.yzl169 = yzl169;
	}
	public byte getYzl170() {
		return yzl170;
	}
	public void setYzl170(byte yzl170) {
		this.yzl170 = yzl170;
	}
	public byte getYzl171() {
		return yzl171;
	}
	public void setYzl171(byte yzl171) {
		this.yzl171 = yzl171;
	}
	public byte getYzl172() {
		return yzl172;
	}
	public void setYzl172(byte yzl172) {
		this.yzl172 = yzl172;
	}
	public byte getYzl173() {
		return yzl173;
	}
	public void setYzl173(byte yzl173) {
		this.yzl173 = yzl173;
	}
	public byte getYzl174() {
		return yzl174;
	}
	public void setYzl174(byte yzl174) {
		this.yzl174 = yzl174;
	}
	public byte getYzl175() {
		return yzl175;
	}
	public void setYzl175(byte yzl175) {
		this.yzl175 = yzl175;
	}
	public int getYzl176() {
		return yzl176;
	}
	public void setYzl176(int yzl176) {
		this.yzl176 = yzl176;
	}
	public byte getYzl177() {
		return yzl177;
	}
	public void setYzl177(byte yzl177) {
		this.yzl177 = yzl177;
	}
	public byte getYzl178() {
		return yzl178;
	}
	public void setYzl178(byte yzl178) {
		this.yzl178 = yzl178;
	}
	public byte getYzl179() {
		return yzl179;
	}
	public void setYzl179(byte yzl179) {
		this.yzl179 = yzl179;
	}
	public byte getYzl180() {
		return yzl180;
	}
	public void setYzl180(byte yzl180) {
		this.yzl180 = yzl180;
	}
	public byte getYzl181() {
		return yzl181;
	}
	public void setYzl181(byte yzl181) {
		this.yzl181 = yzl181;
	}
	public byte getYzl182() {
		return yzl182;
	}
	public void setYzl182(byte yzl182) {
		this.yzl182 = yzl182;
	}
	public byte getYzl183() {
		return yzl183;
	}
	public void setYzl183(byte yzl183) {
		this.yzl183 = yzl183;
	}
	public byte getYgz184() {
		return ygz184;
	}
	public void setYgz184(byte ygz184) {
		this.ygz184 = ygz184;
	}
	public String getYgz185() {
		return ygz185;
	}
	public void setYgz185(String ygz185) {
		this.ygz185 = ygz185;
	}
	public String getYgz186() {
		return ygz186;
	}
	public void setYgz186(String ygz186) {
		this.ygz186 = ygz186;
	}
	public String getYgz187() {
		return ygz187;
	}
	public void setYgz187(String ygz187) {
		this.ygz187 = ygz187;
	}
	public String getYgz188() {
		return ygz188;
	}
	public void setYgz188(String ygz188) {
		this.ygz188 = ygz188;
	}
	public String getYgz189() {
		return ygz189;
	}
	public void setYgz189(String ygz189) {
		this.ygz189 = ygz189;
	}
	public String getYgz190() {
		return ygz190;
	}
	public void setYgz190(String ygz190) {
		this.ygz190 = ygz190;
	}
	public String getYgz191() {
		return ygz191;
	}
	public void setYgz191(String ygz191) {
		this.ygz191 = ygz191;
	}
	public String getYgz192() {
		return ygz192;
	}
	public void setYgz192(String ygz192) {
		this.ygz192 = ygz192;
	}
	public String getYgz193() {
		return ygz193;
	}
	public void setYgz193(String ygz193) {
		this.ygz193 = ygz193;
	}
	public String getYxs504() {
		return yxs504;
	}
	public void setYxs504(String yxs504) {
		this.yxs504 = yxs504;
	}
	public String getYxs505() {
		return yxs505;
	}
	public void setYxs505(String yxs505) {
		this.yxs505 = yxs505;
	}
	public String getYxs601() {
		return yxs601;
	}
	public void setYxs601(String yxs601) {
		this.yxs601 = yxs601;
	}
	public String getYxs602() {
		return yxs602;
	}
	public void setYxs602(String yxs602) {
		this.yxs602 = yxs602;
	}
	public String getYxs603() {
		return yxs603;
	}
	public void setYxs603(String yxs603) {
		this.yxs603 = yxs603;
	}
	public String getYxs610() {
		return yxs610;
	}
	public void setYxs610(String yxs610) {
		this.yxs610 = yxs610;
	}
	public byte getYxs611() {
		return yxs611;
	}
	public void setYxs611(byte yxs611) {
		this.yxs611 = yxs611;
	}
	public byte getYxs612() {
		return yxs612;
	}
	public void setYxs612(byte yxs612) {
		this.yxs612 = yxs612;
	}
	public int getGroupNumber() {
		return groupNumber;
	}
	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}
	public int getFrameCounter() {
		return frameCounter;
	}
	public void setFrameCounter(int frameCounter) {
		this.frameCounter = frameCounter;
	}
	public double getYca002() {
		return yca002;
	}
	public void setYca002(double yca002) {
		this.yca002 = yca002;
	}
	public double getYca003() {
		return yca003;
	}
	public void setYca003(double yca003) {
		this.yca003 = yca003;
	}
	public double getYca004() {
		return yca004;
	}
	public void setYca004(double yca004) {
		this.yca004 = yca004;
	}
	public double getYcb005() {
		return ycb005;
	}
	public void setYcb005(double ycb005) {
		this.ycb005 = ycb005;
	}
	public double getYcb006() {
		return ycb006;
	}
	public void setYcb006(double ycb006) {
		this.ycb006 = ycb006;
	}
	public double getYcb007() {
		return ycb007;
	}
	public void setYcb007(double ycb007) {
		this.ycb007 = ycb007;
	}
	public double getYcl046() {
		return ycl046;
	}
	public void setYcl046(double ycl046) {
		this.ycl046 = ycl046;
	}
	public double getYcl047() {
		return ycl047;
	}
	public void setYcl047(double ycl047) {
		this.ycl047 = ycl047;
	}
	public double getYcl048() {
		return ycl048;
	}
	public void setYcl048(double ycl048) {
		this.ycl048 = ycl048;
	}
	public double getYcl049() {
		return ycl049;
	}
	public void setYcl049(double ycl049) {
		this.ycl049 = ycl049;
	}
	public int getYcl050() {
		return ycl050;
	}
	public void setYcl050(int ycl050) {
		this.ycl050 = ycl050;
	}
	public int getYcl051() {
		return ycl051;
	}
	public void setYcl051(int ycl051) {
		this.ycl051 = ycl051;
	}
	public int getYcl052() {
		return ycl052;
	}
	public void setYcl052(int ycl052) {
		this.ycl052 = ycl052;
	}
	public int getYgd040() {
		return ygd040;
	}
	public void setYgd040(int ygd040) {
		this.ygd040 = ygd040;
	}
	public int getYgd041() {
		return ygd041;
	}
	public void setYgd041(int ygd041) {
		this.ygd041 = ygd041;
	}
	public int getYgd042() {
		return ygd042;
	}
	public void setYgd042(int ygd042) {
		this.ygd042 = ygd042;
	}
	public int getYgd043() {
		return ygd043;
	}
	public void setYgd043(int ygd043) {
		this.ygd043 = ygd043;
	}
	public int getYgd044() {
		return ygd044;
	}
	public void setYgd044(int ygd044) {
		this.ygd044 = ygd044;
	}
	public int getYgd045() {
		return ygd045;
	}
	public void setYgd045(int ygd045) {
		this.ygd045 = ygd045;
	}
	public double getYtm008() {
		return ytm008;
	}
	public void setYtm008(double ytm008) {
		this.ytm008 = ytm008;
	}
	public double getYtm009() {
		return ytm009;
	}
	public void setYtm009(double ytm009) {
		this.ytm009 = ytm009;
	}
	public double getYtm010() {
		return ytm010;
	}
	public void setYtm010(double ytm010) {
		this.ytm010 = ytm010;
	}
	public double getYtm011() {
		return ytm011;
	}
	public void setYtm011(double ytm011) {
		this.ytm011 = ytm011;
	}
	public double getYtm012() {
		return ytm012;
	}
	public void setYtm012(double ytm012) {
		this.ytm012 = ytm012;
	}
	public double getYtm013() {
		return ytm013;
	}
	public void setYtm013(double ytm013) {
		this.ytm013 = ytm013;
	}
	public double getYtm014() {
		return ytm014;
	}
	public void setYtm014(double ytm014) {
		this.ytm014 = ytm014;
	}
	public double getYtm015() {
		return ytm015;
	}
	public void setYtm015(double ytm015) {
		this.ytm015 = ytm015;
	}
	public long getYgp024() {
		return ygp024;
	}
	public void setYgp024(long ygp024) {
		this.ygp024 = ygp024;
	}
	public long getYgp025() {
		return ygp025;
	}
	public void setYgp025(long ygp025) {
		this.ygp025 = ygp025;
	}
	public double getYgp026() {
		return ygp026;
	}
	public void setYgp026(double ygp026) {
		this.ygp026 = ygp026;
	}
	public double getYgp027() {
		return ygp027;
	}
	public void setYgp027(double ygp027) {
		this.ygp027 = ygp027;
	}
	public double getYgp028() {
		return ygp028;
	}
	public void setYgp028(double ygp028) {
		this.ygp028 = ygp028;
	}
	public double getYgp029() {
		return ygp029;
	}
	public void setYgp029(double ygp029) {
		this.ygp029 = ygp029;
	}
	public double getYgp030() {
		return ygp030;
	}
	public void setYgp030(double ygp030) {
		this.ygp030 = ygp030;
	}
	public double getYgp031() {
		return ygp031;
	}
	public void setYgp031(double ygp031) {
		this.ygp031 = ygp031;
	}
	public double getYgp032() {
		return ygp032;
	}
	public void setYgp032(double ygp032) {
		this.ygp032 = ygp032;
	}
	public byte getYgp033() {
		return ygp033;
	}
	public void setYgp033(byte ygp033) {
		this.ygp033 = ygp033;
	}
	public byte getYgp034() {
		return ygp034;
	}
	public void setYgp034(byte ygp034) {
		this.ygp034 = ygp034;
	}
	public double getYtl016() {
		return ytl016;
	}
	public void setYtl016(double ytl016) {
		this.ytl016 = ytl016;
	}
	public int getYkz060() {
		return ykz060;
	}
	public void setYkz060(int ykz060) {
		this.ykz060 = ykz060;
	}
	public int getYkz061() {
		return ykz061;
	}
	public void setYkz061(int ykz061) {
		this.ykz061 = ykz061;
	}
	public int getYkz062() {
		return ykz062;
	}
	public void setYkz062(int ykz062) {
		this.ykz062 = ykz062;
	}
	public String getYkz063() {
		return ykz063;
	}
	public void setYkz063(String ykz063) {
		this.ykz063 = ykz063;
	}
	public String getYkz064() {
		return ykz064;
	}
	public void setYkz064(String ykz064) {
		this.ykz064 = ykz064;
	}
	public String getYkz065() {
		return ykz065;
	}
	public void setYkz065(String ykz065) {
		this.ykz065 = ykz065;
	}
	public String getYkz066() {
		return ykz066;
	}
	public void setYkz066(String ykz066) {
		this.ykz066 = ykz066;
	}
	public String getYkz067() {
		return ykz067;
	}
	public void setYkz067(String ykz067) {
		this.ykz067 = ykz067;
	}
	public String getYkz068() {
		return ykz068;
	}
	public void setYkz068(String ykz068) {
		this.ykz068 = ykz068;
	}
	public String getYkz069() {
		return ykz069;
	}
	public void setYkz069(String ykz069) {
		this.ykz069 = ykz069;
	}
	public String getYkz501() {
		return ykz501;
	}
	public void setYkz501(String ykz501) {
		this.ykz501 = ykz501;
	}
	public String getYkz502() {
		return ykz502;
	}
	public void setYkz502(String ykz502) {
		this.ykz502 = ykz502;
	}
	public String getYkz503() {
		return ykz503;
	}
	public void setYkz503(String ykz503) {
		this.ykz503 = ykz503;
	}
	public double getYgp040() {
		return ygp040;
	}
	public void setYgp040(double ygp040) {
		this.ygp040 = ygp040;
	}
	public double getYgp041() {
		return ygp041;
	}
	public void setYgp041(double ygp041) {
		this.ygp041 = ygp041;
	}
	public double getYgp042() {
		return ygp042;
	}
	public void setYgp042(double ygp042) {
		this.ygp042 = ygp042;
	}
	public double getYgp043() {
		return ygp043;
	}
	public void setYgp043(double ygp043) {
		this.ygp043 = ygp043;
	}
	public double getYgp044() {
		return ygp044;
	}
	public void setYgp044(double ygp044) {
		this.ygp044 = ygp044;
	}
	public double getYgp045() {
		return ygp045;
	}
	public void setYgp045(double ygp045) {
		this.ygp045 = ygp045;
	}
	public byte getYgp046() {
		return ygp046;
	}
	public void setYgp046(byte ygp046) {
		this.ygp046 = ygp046;
	}
	public byte getYgp047() {
		return ygp047;
	}
	public void setYgp047(byte ygp047) {
		this.ygp047 = ygp047;
	}
	public double getYtx070() {
		return ytx070;
	}
	public void setYtx070(double ytx070) {
		this.ytx070 = ytx070;
	}
	public double getYtx071() {
		return ytx071;
	}
	public void setYtx071(double ytx071) {
		this.ytx071 = ytx071;
	}
	public double getYtx072() {
		return ytx072;
	}
	public void setYtx072(double ytx072) {
		this.ytx072 = ytx072;
	}
	public double getYtx073() {
		return ytx073;
	}
	public void setYtx073(double ytx073) {
		this.ytx073 = ytx073;
	}
	public double getYtx074() {
		return ytx074;
	}
	public void setYtx074(double ytx074) {
		this.ytx074 = ytx074;
	}
	public short getYtx075() {
		return ytx075;
	}
	public void setYtx075(short ytx075) {
		this.ytx075 = ytx075;
	}
	public short getYtx076() {
		return ytx076;
	}
	public void setYtx076(short ytx076) {
		this.ytx076 = ytx076;
	}
	public short getYtx077() {
		return ytx077;
	}
	public void setYtx077(short ytx077) {
		this.ytx077 = ytx077;
	}
	public short getYtx078() {
		return ytx078;
	}
	public void setYtx078(short ytx078) {
		this.ytx078 = ytx078;
	}
	public double getYdy079() {
		return ydy079;
	}
	public void setYdy079(double ydy079) {
		this.ydy079 = ydy079;
	}
	public double getYdy080() {
		return ydy080;
	}
	public void setYdy080(double ydy080) {
		this.ydy080 = ydy080;
	}
	public double getYdy081() {
		return ydy081;
	}
	public void setYdy081(double ydy081) {
		this.ydy081 = ydy081;
	}
	public double getYdy082() {
		return ydy082;
	}
	public void setYdy082(double ydy082) {
		this.ydy082 = ydy082;
	}
	public double getYdy083() {
		return ydy083;
	}
	public void setYdy083(double ydy083) {
		this.ydy083 = ydy083;
	}
	public double getYdy084() {
		return ydy084;
	}
	public void setYdy084(double ydy084) {
		this.ydy084 = ydy084;
	}
	public double getYdy085() {
		return ydy085;
	}
	public void setYdy085(double ydy085) {
		this.ydy085 = ydy085;
	}
	public double getYdy086() {
		return ydy086;
	}
	public void setYdy086(double ydy086) {
		this.ydy086 = ydy086;
	}
	public double getYjs087() {
		return yjs087;
	}
	public void setYjs087(double yjs087) {
		this.yjs087 = yjs087;
	}
	public double getYjs088() {
		return yjs088;
	}
	public void setYjs088(double yjs088) {
		this.yjs088 = yjs088;
	}
	public double getYjs089() {
		return yjs089;
	}
	public void setYjs089(double yjs089) {
		this.yjs089 = yjs089;
	}
	public double getYjs090() {
		return yjs090;
	}
	public void setYjs090(double yjs090) {
		this.yjs090 = yjs090;
	}
	public double getYjs091() {
		return yjs091;
	}
	public void setYjs091(double yjs091) {
		this.yjs091 = yjs091;
	}
	public double getYjs092() {
		return yjs092;
	}
	public void setYjs092(double yjs092) {
		this.yjs092 = yjs092;
	}
	public double getYkl053() {
		return ykl053;
	}
	public void setYkl053(double ykl053) {
		this.ykl053 = ykl053;
	}
	public double getYkl054() {
		return ykl054;
	}
	public void setYkl054(double ykl054) {
		this.ykl054 = ykl054;
	}
	public double getYkl055() {
		return ykl055;
	}
	public void setYkl055(double ykl055) {
		this.ykl055 = ykl055;
	}
	public double getYkl056() {
		return ykl056;
	}
	public void setYkl056(double ykl056) {
		this.ykl056 = ykl056;
	}
	public double getYkl057() {
		return ykl057;
	}
	public void setYkl057(double ykl057) {
		this.ykl057 = ykl057;
	}
	public double getYkl058() {
		return ykl058;
	}
	public void setYkl058(double ykl058) {
		this.ykl058 = ykl058;
	}
	public double getYkl059() {
		return ykl059;
	}
	public void setYkl059(double ykl059) {
		this.ykl059 = ykl059;
	}
	public short getYty506() {
		return yty506;
	}
	public void setYty506(short yty506) {
		this.yty506 = yty506;
	}
	public short getYty507() {
		return yty507;
	}
	public void setYty507(short yty507) {
		this.yty507 = yty507;
	}
	public short getYty508() {
		return yty508;
	}
	public void setYty508(short yty508) {
		this.yty508 = yty508;
	}
	public short getYty509() {
		return yty509;
	}
	public void setYty509(short yty509) {
		this.yty509 = yty509;
	}
	public double getYgn035() {
		return ygn035;
	}
	public void setYgn035(double ygn035) {
		this.ygn035 = ygn035;
	}
	public double getYgn036() {
		return ygn036;
	}
	public void setYgn036(double ygn036) {
		this.ygn036 = ygn036;
	}
	public double getYgn037() {
		return ygn037;
	}
	public void setYgn037(double ygn037) {
		this.ygn037 = ygn037;
	}
	public double getYgn038() {
		return ygn038;
	}
	public void setYgn038(double ygn038) {
		this.ygn038 = ygn038;
	}
	public double getYgn039() {
		return ygn039;
	}
	public void setYgn039(double ygn039) {
		this.ygn039 = ygn039;
	}
	public int getYdz093() {
		return ydz093;
	}
	public void setYdz093(int ydz093) {
		this.ydz093 = ydz093;
	}
	public int getYdz094() {
		return ydz094;
	}
	public void setYdz094(int ydz094) {
		this.ydz094 = ydz094;
	}
	public int getYdz095() {
		return ydz095;
	}
	public void setYdz095(int ydz095) {
		this.ydz095 = ydz095;
	}
	public int getYdz096() {
		return ydz096;
	}
	public void setYdz096(int ydz096) {
		this.ydz096 = ydz096;
	}
	public int getYdz097() {
		return ydz097;
	}
	public void setYdz097(int ydz097) {
		this.ydz097 = ydz097;
	}
	public int getYdz098() {
		return ydz098;
	}
	public void setYdz098(int ydz098) {
		this.ydz098 = ydz098;
	}
	public int getYdz099() {
		return ydz099;
	}
	public void setYdz099(int ydz099) {
		this.ydz099 = ydz099;
	}
	public int getYdz100() {
		return ydz100;
	}
	public void setYdz100(int ydz100) {
		this.ydz100 = ydz100;
	}
	public int getYdz101() {
		return ydz101;
	}
	public void setYdz101(int ydz101) {
		this.ydz101 = ydz101;
	}
	public int getYdz102() {
		return ydz102;
	}
	public void setYdz102(int ydz102) {
		this.ydz102 = ydz102;
	}
	public int getYdz103() {
		return ydz103;
	}
	public void setYdz103(int ydz103) {
		this.ydz103 = ydz103;
	}
	public int getYdz104() {
		return ydz104;
	}
	public void setYdz104(int ydz104) {
		this.ydz104 = ydz104;
	}
	public long getYsj001() {
		return ysj001;
	}
	public void setYsj001(long ysj001) {
		this.ysj001 = ysj001;
	}
	public long getYsj002() {
		return ysj002;
	}
	public void setYsj002(long ysj002) {
		this.ysj002 = ysj002;
	}
	public long getYsj003() {
		return ysj003;
	}
	public void setYsj003(long ysj003) {
		this.ysj003 = ysj003;
	}
	public long getYsj004() {
		return ysj004;
	}
	public void setYsj004(long ysj004) {
		this.ysj004 = ysj004;
	}
	public long getYsj005() {
		return ysj005;
	}
	public void setYsj005(long ysj005) {
		this.ysj005 = ysj005;
	}
	public long getYsj006() {
		return ysj006;
	}
	public void setYsj006(long ysj006) {
		this.ysj006 = ysj006;
	}
	public double getYwd105() {
		return ywd105;
	}
	public void setYwd105(double ywd105) {
		this.ywd105 = ywd105;
	}
	public double getYwd106() {
		return ywd106;
	}
	public void setYwd106(double ywd106) {
		this.ywd106 = ywd106;
	}
	public double getYwd107() {
		return ywd107;
	}
	public void setYwd107(double ywd107) {
		this.ywd107 = ywd107;
	}
	public double getYwd108() {
		return ywd108;
	}
	public void setYwd108(double ywd108) {
		this.ywd108 = ywd108;
	}
	public double getYwd109() {
		return ywd109;
	}
	public void setYwd109(double ywd109) {
		this.ywd109 = ywd109;
	}
	public double getYwd110() {
		return ywd110;
	}
	public void setYwd110(double ywd110) {
		this.ywd110 = ywd110;
	}
	public double getYwd111() {
		return ywd111;
	}
	public void setYwd111(double ywd111) {
		this.ywd111 = ywd111;
	}
	public double getYwd112() {
		return ywd112;
	}
	public void setYwd112(double ywd112) {
		this.ywd112 = ywd112;
	}
	public double getYwd113() {
		return ywd113;
	}
	public void setYwd113(double ywd113) {
		this.ywd113 = ywd113;
	}
	public double getYwd114() {
		return ywd114;
	}
	public void setYwd114(double ywd114) {
		this.ywd114 = ywd114;
	}
	public double getYwd115() {
		return ywd115;
	}
	public void setYwd115(double ywd115) {
		this.ywd115 = ywd115;
	}
	public double getYwd116() {
		return ywd116;
	}
	public void setYwd116(double ywd116) {
		this.ywd116 = ywd116;
	}
	public double getYwd117() {
		return ywd117;
	}
	public void setYwd117(double ywd117) {
		this.ywd117 = ywd117;
	}
	public double getYwd118() {
		return ywd118;
	}
	public void setYwd118(double ywd118) {
		this.ywd118 = ywd118;
	}
	public double getYwd119() {
		return ywd119;
	}
	public void setYwd119(double ywd119) {
		this.ywd119 = ywd119;
	}
	public double getYwd120() {
		return ywd120;
	}
	public void setYwd120(double ywd120) {
		this.ywd120 = ywd120;
	}
	public double getYwd121() {
		return ywd121;
	}
	public void setYwd121(double ywd121) {
		this.ywd121 = ywd121;
	}
	public double getYwd122() {
		return ywd122;
	}
	public void setYwd122(double ywd122) {
		this.ywd122 = ywd122;
	}
	public double getYwd123() {
		return ywd123;
	}
	public void setYwd123(double ywd123) {
		this.ywd123 = ywd123;
	}
	public double getYwd124() {
		return ywd124;
	}
	public void setYwd124(double ywd124) {
		this.ywd124 = ywd124;
	}
	public double getYwd125() {
		return ywd125;
	}
	public void setYwd125(double ywd125) {
		this.ywd125 = ywd125;
	}
	public double getYwd126() {
		return ywd126;
	}
	public void setYwd126(double ywd126) {
		this.ywd126 = ywd126;
	}
	public double getYwd127() {
		return ywd127;
	}
	public void setYwd127(double ywd127) {
		this.ywd127 = ywd127;
	}
	public double getYwd128() {
		return ywd128;
	}
	public void setYwd128(double ywd128) {
		this.ywd128 = ywd128;
	}
	public double getYwd129() {
		return ywd129;
	}
	public void setYwd129(double ywd129) {
		this.ywd129 = ywd129;
	}
}
