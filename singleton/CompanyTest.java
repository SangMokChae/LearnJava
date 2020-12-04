package singleton;

public class CompanyTest {
	public static void main(String[] args) {
		Company myCompany1 = Company.getInstance();
		//new가 아닌 getInstance로 호출한다.
		Company myCompany2 = Company.getInstance();
		System.out.println(myCompany1 == myCompany2);
	}
}
