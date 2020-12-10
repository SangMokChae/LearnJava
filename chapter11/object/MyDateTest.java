package object;

class MyDate {
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate md = (MyDate)obj;
			if(this.day == md.day && this.month == md.month && this.year == md.year) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		if(month < 10) {			
			return Integer.parseInt(year +"" +0+month +"" +day);
//			return Integer.parseInt(String.valueOf(year) +String.valueOf(month) +String.valueOf(day));
		} else {
			return Integer.parseInt(year +"" +month +"" +day);
		}
	}
}

public class MyDateTest {
	public static void main(String[] args) {
		MyDate date1 = new MyDate(18, 9, 2004);
		MyDate date2 = new MyDate(18, 9, 2004);
		System.out.println(date1.equals(date2));
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
		System.out.println(System.identityHashCode(date1));
		System.out.println(System.identityHashCode(date2));
	}
}
