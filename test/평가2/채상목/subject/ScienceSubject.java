package ��2.ä���.subject;

public class ScienceSubject extends Subject {
	private int phy;
	private int chemi;
	
	public ScienceSubject(int kor, int eng, int math, int phy, int chemi) {
		super(kor, eng, math);
		this.phy = phy;
		this.chemi = chemi;
		this.sum = kor + eng + math +phy +chemi;
		this.avg = Math.round(sum / 5);
	}

	public int getPhy() {
		return phy;
	}

	public void setPhy(int phy) {
		this.phy = phy;
	}

	public int getChemi() {
		return chemi;
	}

	public void setChemi(int chemi) {
		this.chemi = chemi;
	}

	@Override
	public void sum() {
		sum = (kor + eng + math +phy +chemi);
	}

	@Override
	public void average() {
		avg = (Math.round(sum / 5));
	}
	
	public String showSubjectInfo() {
		return "*�⺻����* ���� : " +kor +", ���� : " +eng +", ���� : " +math 
				+" | *�̰� ����* ���� : " +phy +", ȭ�� : " +chemi 
				+" | [�հ� : " +sum +", ��� : " + avg +"]";
	}
}
