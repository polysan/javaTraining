package chapter7;

public class Test2 <T>{
	
	T value;
	
	public Test2(T value) {
		super();
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

}
