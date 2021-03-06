package constructor;

public class MyDate {
	private int day;
	private int month;
	private int year;
	private boolean valid = true;
	
	
	public MyDate(int day, int month, int year) {
		this.year = year;
		setMonth(month);
		setDay(day);
	}

	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if (month == 2) {
			if(day < 1 || day > 28) {
				valid=false;
				return;
			}
		}
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if (1 <= month && month <= 12) {
			this.month = month;
		}else {
			valid = false;
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

//	public String isValid() {
//		if (valid) {
//			return "유효한 날짜입니다.";
//		} else {
//			return "유효하지 않은 날짜입니다.";
//		}
//	}
	public boolean isValid() {
		return valid;
	}
}
