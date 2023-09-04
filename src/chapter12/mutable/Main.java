package chapter12.mutable;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		TestCalendar a = new TestCalendar(new Date());
		TestCalendar b = new TestCalendar(a);

		System.out.println(a == b);
		System.out.println(a.equals(b));
	}

}
