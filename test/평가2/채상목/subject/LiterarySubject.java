package ��2.ä���.subject;

public class LiterarySubject extends Subject {
	private int his;
	
	public LiterarySubject(int kor, int eng, int math, int his) {
		super(kor, eng, math);
		this.his = his;
		this.sum = kor + eng+ math +his;
		this.avg = Math.round(sum / 4);
	}

	public int getHis() {
		return his;
	}

	public void setHis(int his) {
		this.his = his;
	}

	@Override
	public void sum() {
		sum = (kor + eng+ math + his);
	}

	@Override
	public void average() {
		avg = (Math.round(sum / 4));
	}
	
	public String showSubjectInfo() {
		return "*�⺻����* ���� : " +kor +", ���� : " +eng +", ���� : " +math 
				+" | *���� ����* ���� : " +his +" | [�հ� : " +sum +", ��� : " + avg +"]";
	}
}
