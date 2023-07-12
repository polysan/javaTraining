package chapter5;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File file = new File("data.txt");
		File dir = new File("data");
		try {
			// ファイルが存在しなければファイルを作成
			if (!file.exists()) {
				file.createNewFile();
				System.out.println(file.getAbsolutePath());
			}
			// ディレクトリがなければ作成
			if (!dir.exists()) {
				dir.mkdir();
				System.out.println(dir.getAbsolutePath());
			}
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
