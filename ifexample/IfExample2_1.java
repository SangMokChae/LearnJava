package ifexample;

public class IfExample2_1 {
	public static void main(String[] args) {
		int age = 7;
		int charge = 0;
		
		if (age < 8) {
			charge = 1000;
			System.out.println("취학 전 아동입니다.");
		} 
		if (9 <= age && age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		} 
		if (15 <= age && age < 20) {
			charge = 2500;
			System.out.println("중, 고등학생입니다.");
		} 
		if (21 <= age && age < 60) {
			charge = 3000;
			System.out.println("일반인입니다.");
		}
		if (age >= 60) {
			charge = 0;
			System.out.println("경로우대입니다.");
		}
		System.out.println("입장료는 " +charge +"원 입니다.");
	}
}
