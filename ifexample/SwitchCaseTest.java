package ifexample;

public class SwitchCaseTest {
	public static void main(String[] args) {
		int floor = 5;
		String store = null;
		
		switch(floor) {
		case 1: 
			store = "�౹";
			break;
		case 2: 
			store = "�����ܰ�";
			break;
		case 3: 
			store = "�Ǻΰ�";
			break;
		case 4: 
			store = "ġ��";
			break;
		case 5: 
			store = "�ｺŬ��";
			break;
		default: store = "���� ��";
		}
		System.out.println(floor +"�� " +store +"�Դϴ�." );
	}
}
