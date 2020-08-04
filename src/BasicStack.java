import java.lang.String;
import java.util.ArrayList;

public class BasicStack implements Stack {
	
	private ArrayList<String> data;
	
	BasicStack() {
		data = new ArrayList<String>();	
	}
	
	public int getStackLength() {
		return data.size();
	}
	
	public boolean searchForStackItem(String searchItem) {
		data.forEach(item -> {
			if(item.equals(searchItem)) {
				return;
			}
		});
		return false;
	}
	
	public String getItem(String item) {
		while(!data.isEmpty()) {
			String tempItem = pop();
			if(item.equals(tempItem)) {
				return tempItem;
			}
		}
		
		throw new IllegalArgumentException("Item could not be found");
	}

	@Override
	public String pop() {
		if(data.size() == 0) {
			throw new NullPointerException("There are no items in the stack");
		}
		return data.remove(data.size() - 1);
	}

	@Override
	public void push(java.lang.String newItem) {
		data.add(newItem);
	}

}
