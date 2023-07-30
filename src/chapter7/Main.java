package chapter7;

public class Main {

	public static void main(String[] args) {
		// ジェネリクス：<T>に自分で型を指定できる
		Currency<Double> currency = new Currency<Double>(7.23);
		System.out.println(currency.getAmount());
		
		// 非変性なのでコンパイルエラーとなる
//		List<Object> a = new ArrayList<String>();
	}
}
