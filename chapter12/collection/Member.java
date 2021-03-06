package collection;

public class Member implements Comparable<Member> {
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member =(Member)obj;
			if(this.memberId == member.memberId) {
				return true;				
			} else {
				return false;
			}
		}
		return false;
	}


	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberName +" 회원님의 아이디는 " +memberId +"입니다.";
	}

//	@Override
//	public int compareTo(Member member) { // 정렬
//		return (this.memberId - member.memberId) * (-1); // * -1을 해서 내림차순으로 변경해준다.
////		return this.memberName.compareTo(member.memberName);
//	}
	
	public int compareTo(Member member) { // 이름순으로 정렬 /중복 제거 처리안됨
		return (this.memberName.compareTo(member.memberName));
	}
}
