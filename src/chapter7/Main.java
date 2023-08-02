package chapter7;

import java.util.Collection;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// ジェネリクス：<T>に自分で型を指定できる
		Currency<Double> currency = new Currency<Double>(7.23);
		System.out.println(currency.getAmount());

		// 非変性なのでコンパイルエラーとなる
		//		List<Object> a = new ArrayList<String>();

		Test<A> a = new Test<A>();
		Test<B> b = new Test<B>();

		a.execute(new A());
		a.execute(new B());
		b.execute(new B());

		List<Integer> i = List.of(1, 2, 3, 4, 5);
		List<String> s = List.of("A", "B", "C");

		printAll(i);
		printAll(s);

		//	上限境界ワイルドカード <? extends B>
		Test2<? extends B> test = new Test2<B>(new B());
		B bb = test.getValue();
		bb.hello();

		Test2<? extends B> test2 = new Test2<C>(new C());
		B bb2 = test2.getValue();
		bb2.hello();

		// 下限型ワイルドカード <? super B>
		Test2<? super B> test3 = new Test2<B>(new B());
		Object bb3 = test3.getValue();

		Test2<? super B> test4 = new Test2<A>(new A());
		Object bb4 = test4.getValue();

		test4.setValue(new B());
		test4.setValue(new C());

	}

	// 引数をワイルドカードにすることでIntegerとStringどちらのリストにも使える（非境界ワイルドカード）
	public static void printAll(Collection<?> collection) {
		collection.stream().forEach(System.out::println);
	}
}
