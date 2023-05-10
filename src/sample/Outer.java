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

}
