package chapter3;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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

		NewCashedThreadPool();

		CyclicBarrier();
	}

	private static void NewCashedThreadPool() {
		// スレッドプールを利用したマルチスレッド処理
		ExecutorService exec = Executors.newCachedThreadPool();
		Runnable test = () -> {
			System.out.println(Thread.currentThread().getId());
		};

		try {
			for (int i = 0; i < 5; i++) {
				exec.submit(test);
			}

			Thread.sleep(1 * 10000);

			System.out.println("10秒後");

			for (int i = 0; i < 5; i++) {
				exec.submit(test);
			}

			Thread.sleep(7 * 10000);

			System.out.println("70秒後");

			for (int i = 0; i < 5; i++) {
				exec.submit(test);
			}

		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

	private static void CyclicBarrier() {
		ExecutorService exec = Executors.newFixedThreadPool(5);

		java.util.concurrent.CyclicBarrier barrier = new CyclicBarrier(5,
				() -> {
					System.out.println("it's all done");
				});
		for (int i = 0; i < 5; i++) {
			exec.submit(new Task(barrier));

		}
	}

}
