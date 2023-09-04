package chapter12.mutable;

import java.util.Date;

// 可変オブジェクト
public class TestCalendar {
	private Date date;

	public TestCalendar(Date date) {
		this.date = new Date(date.getTime());
	}

	// インスタンスをコピーするコンストラクタ
	public TestCalendar(TestCalendar input) {
		this.date = new Date(input.date.getTime());
	}

	// 可変オブジェクトへの参照をgetterで戻す場合はコピーを戻す
	public Date getDate() {
		return (Date) date.clone();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;
		TestCalendar other = (TestCalendar) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		return true;
	}

}
