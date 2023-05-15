package main;

import sample.Outer;
import sample.Sample;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Outer outer = new Outer();
		outer.test();
		outer.interFace();
		outer.interFace2();

		// 匿名クラス
		var sample = new Sample(10) {
			void modify(int num) {
				setNum(num);
			}
		};
		sample.modify(100);
		System.out.println(sample.getNum());
	}

}
