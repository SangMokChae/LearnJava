package bookshelf;

public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0); //리스트의 맨앞에꺼를 반환하고 지운다.
	}

	@Override
	public int getSize() {
		return getCount();
	}
}
