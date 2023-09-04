package chapter12.immutable;

// 不変オブジェクト
// finalで修飾して継承を禁止
public final class ImmutableTest {
	// フィールドをfinalで修飾し継承をさせない
	private final int num;
	private final String str;

	// 修飾なし → 外部のパッケージからインスタンス化させない
	ImmutableTest(int num, String str) {
		this.num = num;
		this.str = str;
	}

	// getterは参照をそのまま戻さない
	// 新しいインスタンスを生成してそのまま戻す
	public String getStr() {
		return new String(str);
	}

	// setterは元の値を変更せず
	// 新しい値を持った新しいインスタンスを生成して戻す
	public ImmutableTest setStr(String str) {
		return new ImmutableTest(this.num, str);
	}

	@Override
	public String toString() {
		return "num:" + this.num + " " + "str:" + this.str;
	}

}
