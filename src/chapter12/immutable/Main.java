package chapter12.immutable;

public class Main {

	public static void main(String[] args) {
		// ビルダーから不変オブジェクトを作成
		TestBuilder testBuilder = new TestBuilder();
		testBuilder.setNum(1);
		testBuilder.setStr("鈴木");
		ImmutableTest test = testBuilder.build();
		System.out.println(test);
		
		String test2 = test.getStr();
		ImmutableTest test3 = test.setStr("test3");
		System.out.println(test2);
		System.out.println(test3);
	}
}
