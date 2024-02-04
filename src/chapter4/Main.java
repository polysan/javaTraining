package chapter4;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		List<Item> list = List.of(new Item("apple", 100), new Item("banana", 80), new Item("apple", 200));

		// appleの平均価格
		System.out.println("-----------------------");
		System.out.println("appleの平均価格");
		double result = list.stream().filter(f -> f.getName().equals("apple"))
				.mapToInt(Item::getPrice).average().getAsDouble();
		System.out.println(result);

		// 10個の乱数を出力
		System.out.println("-----------------------");
		System.out.println("10個の乱数を出力");
		var r = new Random();
		IntStream.generate(r::nextInt).limit(10).forEach(System.out::println);

		// 合計金額の10倍
		System.out.println("-----------------------");
		System.out.println("合計金額の10倍");
		int totalPrice = list.stream().mapToInt(o -> o.getPrice() * 10).reduce(0, (total, i) -> {
			return total + i;
		});
		System.out.println(totalPrice);
	}
}
