package inheritance;

public class VIPCustomer extends Customer{
	private int agentID;
	double saleRatio;
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
//	public VIPCustomer() {
//		//super.customerName 은 customer 클래스의 customerName을 뜻한다. 즉 상위객체의 것을 불러온다.
//		super();
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		saleRatio = 0.1;
//		this.agentID = agentID;
//		System.out.println("VIPCustomer(int, String, int) 생성자 호출 ");
//	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		//super.customerName 은 customer 클래스의 customerName을 뜻한다. 즉 상위객체의 것을 불러온다.
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
//		System.out.println("VIPCustomer(int, String, int) 생성자 호출 ");
	}

	public int getAgentID() {
		return agentID;
	}
}
