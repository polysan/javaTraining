package chapter1.main;

import chapter1.enums.Fruits;
import chapter1.sample.InterfaceSample;
import chapter1.sample.Outer;
import chapter1.sample.Sample;

public class Main {

	public static void main(String[] args) {
		System.out.println("---匿名クラス・インターフェース---");
		Outer outer = new Outer();
		outer.test();
		outer.interFace();
		outer.interFace2();

		// 匿名クラス
		var sample = new Sample(10) {
			// 匿名クラスの初期化子
			{
				setNum(50);
			}

			void modify(int num) {
				setNum(num);
			}
		};
		sample.modify(100);
		System.out.println(sample.getNum());

		// インターフェースのstaticメソッドはインターフェースから直接呼び出す
		InterfaceSample.add();
		sample.escape();
		Sample.add();

		System.out.println("---匿名クラス・インターフェース---");
		System.out.println("--enum---");
		// enum
		Fruits type = Fruits.MELON;
		System.out.println(type);

		for (var value : Fruits.values()) {
			System.out.println(value);
		}
		System.out.println(Fruits.valueOf("APPLE"));
		System.out.println("--enum---");
	}

}
