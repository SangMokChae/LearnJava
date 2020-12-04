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
//		//super.customerName �� customer Ŭ������ customerName�� ���Ѵ�. �� ������ü�� ���� �ҷ��´�.
//		super();
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		saleRatio = 0.1;
//		this.agentID = agentID;
//		System.out.println("VIPCustomer(int, String, int) ������ ȣ�� ");
//	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		//super.customerName �� customer Ŭ������ customerName�� ���Ѵ�. �� ������ü�� ���� �ҷ��´�.
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
//		System.out.println("VIPCustomer(int, String, int) ������ ȣ�� ");
	}

	public int getAgentID() {
		return agentID;
	}
}
