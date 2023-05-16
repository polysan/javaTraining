package sample;

public class Sample implements InterfaceSample {
	private int num;

	public Sample(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public void escape() {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	public static void add() {
		System.out.println("Sampleのadd");
	}

	
}
