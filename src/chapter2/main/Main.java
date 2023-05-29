package chapter2.main;

import java.util.function.Consumer;

import chapter2.functionalInterface.B;
import chapter2.functionalInterface.SupplierSample;

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
		
		
	}

}
