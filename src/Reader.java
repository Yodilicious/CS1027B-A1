
public class Reader {
	
	public void find (String pattern) {
		
		feed.find(pattern);
	}
	
	public void read () {
		
	}
	
	public Reader (Feed feed) {
		
		this.feed = feed;
	}

	private Feed feed;
}
