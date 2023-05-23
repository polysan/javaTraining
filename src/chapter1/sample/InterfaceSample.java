package chapter1.sample;

public interface InterfaceSample {
	 void escape();
	// コンパイルエラー
//	private void shot();
	
	// インターフェースのprivateなメソッドは内容を実装する必要がある
	private void shot() {
		System.out.println("");
	};
	
	// privateメソッドにdefaultは不要➡コンパイルエラー
//	private default shot() {
//		System.out.println("");
//	};
	
	static void add() {
		System.out.println("addメソッド呼び出し");
	}
}
