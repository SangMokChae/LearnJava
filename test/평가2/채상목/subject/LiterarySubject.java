package 평가2.채상목.subject;

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
		return "*기본교과* 국어 : " +kor +", 영어 : " +eng +", 수학 : " +math 
				+" | *문과 교과* 역사 : " +his +" | [합계 : " +sum +", 평균 : " + avg +"]";
	}
}
