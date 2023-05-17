package enums;

public enum Fruits {
	// 列挙が３つあるenumでコンストラクタを定義すると、コンストラクタが3回呼ばれる
	BANANA("バナナ"), APPLE("リンゴ"), MELON("メロン");

	private final String value;

	private Fruits(String value) {
		System.out.println(value);
		this.value = value;
	}

	@Override
	public String toString() {
		return this.value;
	}
}
