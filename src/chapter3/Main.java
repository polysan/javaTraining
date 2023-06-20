package chapter3;

public class Main {

	public static void main(String[] args) {
		Thread t = new SampleThread();
		// startメソッドで新しいスレッドが実行される
		t.start();

		System.out.println("main");

		// RunnableのインスタンスをThreadのコンストラクタに渡すことで新しいスレッドを作る
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("sub");
			}
		});
        // Runnableは関数型インターフェースなのでラムダ式で書ける
		Thread t3 = new Thread(() -> {
			System.out.println("sub");
		});

	}

}
