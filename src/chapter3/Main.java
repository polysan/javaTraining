package chapter3;

public class Main {

	public static void main(String[] args) {
		Thread t = new SampleThread();
		//		startメソッドで新しいスレッドが実行される
		t.start();

		System.out.println("main");
	}

}
