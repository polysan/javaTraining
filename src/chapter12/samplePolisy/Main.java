package chapter12.samplePolisy;

import java.io.FilePermission;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.Permissions;
import java.security.Policy;

public class Main {

	@SuppressWarnings({ "removal", "deprecation" })
	public static void main(String[] args) throws IOException {

		Permissions permissions = new Permissions();
		permissions.add(new FilePermission("/", "read"));
		Policy.setPolicy(new SamplePolisy(permissions));

		// セキュリティポリシーに沿ったセキュリティ機構が有効になる
		System.setSecurityManager(new SecurityManager());

		// ルートディレクトリのファイルとディレクトリを表示
		Files.list(Paths.get("/")).forEach((p) -> {
			System.out.println(p.getFileName());
		});
	}

}
