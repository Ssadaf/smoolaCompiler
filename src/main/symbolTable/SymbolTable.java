package symbolTable;

import java.util.*;

public class SymbolTable {

	SymbolTable pre;
	HashMap<String, SymbolTableItem> items;
	public boolean isUpdated;

	// Static members region

	public static SymbolTable top;
	
	private static Stack<SymbolTable> stack = new Stack<SymbolTable>();

	// Use it in pass 1 scope start
	public static void push(SymbolTable symbolTable) {
		if(top != null)
			stack.push(top);
		top = symbolTable;
	}

	// Use it in pass1 scope end
	public static void pop() {
//		System.out.println("----------poping symb table");
		top = stack.pop();

	}

	// End of static members region

	public SymbolTable() {
		this(null);
		isUpdated = false;
	}

	public SymbolTable(SymbolTable pre) {
		this.pre = pre;
		this.items = new HashMap<String, SymbolTableItem>();
	}

	public void put(SymbolTableItem item) throws ItemAlreadyExistsException {
		if(items.containsKey(item.getKey()))
			throw new ItemAlreadyExistsException();
		items.put(item.getKey(), item);
	}

	public SymbolTableItem getInCurrentScope(String key) {
		return items.get(key);
	}

	public SymbolTableItem get(String key) throws ItemNotFoundException {
		SymbolTableItem value = items.get(key);
		if(value == null && pre != null)
			return pre.get(key);
		else if(value == null)
			throw new ItemNotFoundException();
		else
			return value;
	}

	public SymbolTable getPreSymbolTable() {
		return pre;
	}

	public void updateSymbolTables(SymbolTable superior){
		this.items.putAll(superior.items);
	}

	public boolean hasItem(String key){
//		printAllSymbolTableItems();
		return items.containsKey(key);
	}

	public void printAllSymbolTableItems(){
		for (String key: items.keySet()) {
			System.out.println(key );
		}
	}
}