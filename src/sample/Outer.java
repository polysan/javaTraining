package sample;

public class Outer {
	int outerMember = 100;

	// インナークラス
	// Outerのメンバーとして利用する
	// publuicなどアクセス修飾子を利用可能
	class inner {

	}

	// staticインナークラス
	// Outerのメンバーとして利用する
	// publuicなどアクセス修飾子を利用可能
	static class StaticInner {

	}

	public void test() {
		int a = 10;
		// ローカルクラス
		// メソッド内で定義されるクラス
		class Inner {
			public void run() {
				// 外部のメンバーにアクセスできる
				System.out.println("innerメソッド");
				System.out.println(outerMember);
				System.out.println(a);
			}
		}

		Inner inner = new Inner();
		inner.run();
	}

	public void interFace() {
		// 匿名クラス インターフェースの実装クラスを定義せずにメソッドを実行できる
		// 匿名クラスで生成したインスタンスを変数に代入する場合
		InterfaceSample a = new InterfaceSample() {
			@Override
			public void escape() {
				System.out.println("escape");
			};
		};
		a.escape();
	}

	public void interFace2() {
		// 匿名クラス
		// 匿名クラスで生成したインスタンスを変数に代入しない場合
		new InterfaceSample() {
			@Override
			public void escape() {
				System.out.println("escape2");
			};
		}.escape();

	}

}
