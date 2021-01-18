package 평가2.채상목;

import java.util.ArrayList;

public class CalcRank {
	public ArrayList<Student> calcRank(ArrayList<Student> list) {
		for(int i = 0;  i < list.size(); i++) {
			for(int j = 0; j < list.size(); j++) {
				if(list.get(i).subject.getSum() <
						list.get(j).subject.getSum()) {
					list.get(i).rank++;
				}
			}
		}
		return list;
	}
}
