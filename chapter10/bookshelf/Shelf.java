package bookshelf;

import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<> ();
	}
	
	public ArrayList<String> getShelf() {
		return shelf; // 리스트 반환
	}
	
	public int getCount() {
		return shelf.size(); //요소의 갯수를 반환
	}
}
