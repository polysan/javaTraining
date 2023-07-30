package chapter7;

public class Main {

	public static void main(String[] args) {
		// ジェネリクス：<T>に自分で型を指定できる
		Currency<Double> currency = new Currency<Double>(7.23);
		System.out.println(currency.getAmount());

		// 非変性なのでコンパイルエラーとなる
		//		List<Object> a = new ArrayList<String>();

		Test<A> a = new Test<A>();
		Test<B> b = new Test<B>();
		//		Test<C> c = new Test<C>(); コンパイルエラー

		a.execute(new A());
		a.execute(new B());
		b.execute(new B());

	}
}
