package bookshelf;

import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<> ();
	}
	
	public ArrayList<String> getShelf() {
		return shelf; // ����Ʈ ��ȯ
	}
	
	public int getCount() {
		return shelf.size(); //����� ������ ��ȯ
	}
}
