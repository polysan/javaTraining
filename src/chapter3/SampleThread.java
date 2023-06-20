package chapter3;

//	マルチスレッドで処理を実装するにはThreadクラスのサブクラスを実装する
public class SampleThread extends Thread {
	//	新しいスレッドで実行したいことはrunメソッドに記述する
	@Override
	public void run() {
		System.out.println("sub");
	}
}
