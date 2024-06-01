package threadexam2;

public class Dish {
	private boolean empty = true;//음식이 접시에 담겨 있는지 확인용
	
	public boolean isEmpty() {
		return empty;
	}
	
	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
	
}
