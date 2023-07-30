package chapter7;

// ジェネリクスを使った型パラメータ
public class Currency<T> {
	private T amount;

	public Currency(T amount) {
		super();
		this.amount = amount;
	}

	public T getAmount() {
		return amount;
	}

}
