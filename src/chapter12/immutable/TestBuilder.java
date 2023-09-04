package chapter12.immutable;

public class TestBuilder {
	private int num;
	private String str;

	public void setNum(int num) {
		this.num = num;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public ImmutableTest build() {
		if (this.str == null) {
			this.str = "none";
		}
		return new ImmutableTest(num, str);
	}
}
