import java.util.ArrayList;

public class NewEditions extends Notification
{
	private String bookName;
	private String authorName;
	private String publisherName;
	private double bookPrice;
	private int grades;
	private ArrayList<String> BookEdition[] = new ArrayList<String>();
	
	
  public void checkNewEditions()
  {
    //Show the new editions of books
        
    for (int i=0; i<BookEdition[].size(); i++);
    {
      System.out.println(BookEdition[i].bookName + "\t\t" + BookEdition[i].authorName + "\t\t" + BookEdition[i].publisherName + "\t\t" + BookEdition[i].bookPrice + "\t\t" + BookEdition[i].grades"\n");
		}
	}
    
  public void set_a_book(string newbook)
  {
		BookEdition[i].bookName = newbook;
	}
	
  public boolean check_list()
  {
		if(BookEdition[i].bookName = newbook)
			return true;
		else
			return false;
	}
	
  public int getbookID()
  {
		return bookID;
	}
	
  public void validate_addition()
  {
		System.out.println("Adding a book.");
		System.out.println("Make an new Order.");
	}

}