package ifexample;

public class SwitchCaseTest {
	public static void main(String[] args) {
		int floor = 5;
		String store = null;
		
		switch(floor) {
		case 1: 
			store = "약국";
			break;
		case 2: 
			store = "정형외과";
			break;
		case 3: 
			store = "피부과";
			break;
		case 4: 
			store = "치과";
			break;
		case 5: 
			store = "헬스클럽";
			break;
		default: store = "없는 층";
		}
		System.out.println(floor +"층 " +store +"입니다." );
	}
}
