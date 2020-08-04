
public class BasicStack<T> {
	
	private T[] data;
	private int stackPointer;
	
	BasicStack() {
		data = (T[]) new Object[1000];
		stackPointer = 0;
	}
	
	public int getStackLength() {
		return stackPointer; 
	}
	
	public void push(T newStackItem) {
		data[stackPointer++] = newStackItem;
	}
	
	public T pop() {
		if(stackPointer == 0) {
			throw new NullPointerException("There are no items in the stack");
		}
		return data[stackPointer--];
	}
	
	public boolean searchForStackItem(T searchItem) {
		boolean itemFound = false;
		for(int i = 0; i < stackPointer; i++) {
			if(data[i].equals(searchItem)) {
				itemFound = true;
				break;
			}
		}
		
		return itemFound;
	}
	
	public T getItem(T item) {
		while(stackPointer > 0) {
			T tempItem = pop();
			if(item.equals(tempItem)) {
				return tempItem;
			}
		}
		
		throw new IllegalArgumentException("Item could not be found");
	}
}
