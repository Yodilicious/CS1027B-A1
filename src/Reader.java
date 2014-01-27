/** 
 * Class that represents a Reader as a list of news items
 * @author CS1027
 */
 
public class Reader {
	
	/** 
	 * Method that prints all items in the feed that contain the parameter pattern
	 * @param pattern
	 */
	public void find (String pattern) {
		
		feed.find (pattern);
	}
	
	/** 
	 * Method that prints all the news items that have been added to the feed 
	 * Uses variable nextItem that gives the index of the next item that should be printed   
	 */
	public void read () {
		nextItem = feed.readFrom (nextItem);
	}
	
	/** 
	 * Constructor that takes a String pattern as parameter
	 * @param pattern
	 */
	public Reader (Feed feed) {
		
		this.feed = feed;
		this.nextItem = 0;
	}	
	
	/* 
	 * Attribute declarations
	 */
	private Feed feed;
	private int nextItem;
}
	