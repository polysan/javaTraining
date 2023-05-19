package functionalInterface;

import java.util.function.Supplier;

public class SupplierSample {
	public void exe() {
		Supplier<String> sup = () -> "Hello!!";
		System.out.println(sup.get());
	}

	public void exe2(Supplier<A> supplier) {
		A a = supplier.get();
		a.hello();
	}

}
