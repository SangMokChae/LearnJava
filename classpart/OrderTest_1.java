package classpart;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderTest_1 {	
	public static void main(String[] args) {
		OrderTest order = new OrderTest();
		order.ordNum = 99999998l;
		order.ordID = "ABC123";
		
		Date ordDay = new Date();
        SimpleDateFormat ordDate = new SimpleDateFormat("yyyy�� MM�� dd��");
        System.out.println("���糯¥ : "+ ordDate.format(ordDay));
        
		order.ordName = "bob";
		order.productNum = "PD9999-88";
		order.address = "���ֵ�Ư����";
		
		System.out.println("�ֹ� ��ȣ : " +order.getOrdNum());
		System.out.println("�ֹ��� ���̵� : " +order.getOrdID());
		System.out.println("�ֹ� ��¥ : " +ordDate.format(ordDay));
		System.out.println("�ֹ��� �̸� : " +order.getOrdName());
		System.out.println("�ֹ� ��ǰ ��ȣ : " +order.getProductNum());
		System.out.println("��� �ּ� : " +order.getAddress());
	}
}
