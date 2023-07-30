package chapter7;

//  型パラメータをAもしくはAのサブクラスに限定することでhelloメソッドはコンパイルエラーにならない
public class Test<T extends A> {
	public void execute(T t) {
		t.hello();
	}
}
