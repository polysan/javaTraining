package chapter2.main;

import java.util.function.Consumer;
import java.util.function.Predicate;

import chapter2.comsumer.Item;
import chapter2.functionalInterface.B;
import chapter2.functionalInterface.SupplierSample;
import chapter2.predicate.Person;
import chapter2.predicate.Person.Gender;

public class Main {

	public static void main(String[] args) {
		SupplierSample a = new SupplierSample();
		a.exe();
		// ラムダ式
		a.exe2(() -> new B());
		// メソッド参照
		a.exe2(B::new);

		Consumer<String> consumer = x -> System.out.println(x);
		consumer.accept("consumer");

		Item item = new Item.Builder(100).with(b -> {
			b.name = "orange";
			b.price = 120;
		}).build();
		System.out.println(item);

		Predicate<Person> isMale = p -> p.getGender().equals(Gender.MALE);
		Predicate<Person> isFemale = p -> p.getGender().equals(Gender.FEMALE);
		Predicate<Person> isAdult = p -> p.getAge() >= 20;

		Person sample = new Person(Gender.FEMALE, 19);

		if (isMale.or(isFemale.and(isAdult)).test(sample)) {
			System.out.println("OK");
			return;
		}
		System.out.println("NG");

	}

}
