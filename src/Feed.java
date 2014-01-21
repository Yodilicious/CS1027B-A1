
public class Feed {
	
	public int readFrom (int start) {
		
		for (int i = start; i < size; i++) {
			
			System.out.println(list [i]);
		}
		
		return size - 1;
	}
	
	public void find (String pattern) {
		
		System.out.println ("name: " + this.name);
		
		for (int i = 0; i < size; i++) {
			
			if (list [i].contains(pattern)) {
				
				System.out.println(list [i]);
			}
		}
	}
	
	/**
	 * add method adds a person to the list and uses the expandCapacity method
	 * @param String 
	 */
	public void add (String item) {
		
		if (list.length - 1 == size) {
			expandCapacity ();
		}
		list [size++] = item;
	}
	
	
	/**
	 * expandCapacity method is a helper method
	 * that creates a new array to store friends with twice the capacity
	 * of the existing one
	 */
	 
	private void expandCapacity () {
		String [] largerList = new String[list.length * 2];
		
		for (int i = 0; i < list.length; i++)
			largerList[i] = list[i];
		
		list = largerList;
	}
	
	/** 
	 * Constructor creates Feed array of a certain size
	 * @param name
	 */
	public Feed (String name) {
		
		this.name = name;
		this.list = new String[DEFAULT_LIST_SIZE];
	}
		
	private String name;
	private String[] list;
	private int size;
	private final int DEFAULT_LIST_SIZE = 10;
}
