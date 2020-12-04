package classpart;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderTest_1 {	
	public static void main(String[] args) {
		OrderTest order = new OrderTest();
		order.ordNum = 99999998l;
		order.ordID = "ABC123";
		
		Date ordDay = new Date();
        SimpleDateFormat ordDate = new SimpleDateFormat("yyyy년 MM월 dd일");
        System.out.println("현재날짜 : "+ ordDate.format(ordDay));
        
		order.ordName = "bob";
		order.productNum = "PD9999-88";
		order.address = "제주도특별시";
		
		System.out.println("주문 번호 : " +order.getOrdNum());
		System.out.println("주문자 아이디 : " +order.getOrdID());
		System.out.println("주문 날짜 : " +ordDate.format(ordDay));
		System.out.println("주문자 이름 : " +order.getOrdName());
		System.out.println("주문 상품 번호 : " +order.getProductNum());
		System.out.println("배송 주소 : " +order.getAddress());
	}
}
