package bookshelf;

public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0); //����Ʈ�� �Ǿտ����� ��ȯ�ϰ� �����.
	}

	@Override
	public int getSize() {
		return getCount();
	}
}
