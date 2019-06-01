import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

public class Storage
{
	
	public int bookID;
	public String category;
	public String title;
	private String author;
	private Date dateofissue= new Date();
	private int bookcount;
	private ArrayList <String> BookStocks[] = new ArrayList <String>();
	private Daneismos-polisi borrow = null; 

    public Storage(int ID, String ctg, String text, String writer, Date date, int count )
    {
		bookID=ID;
		category=ctg;
		title=text;
		author=writer;
		dateofissue=date;
		bookcount=count;
    }

    Scanner input = new Scanner(System.in);

    private int choice = input.nextInt();

    switch(choice)
    {
	    case:1 //search storage

            public void loadinglist()
            {
	
                for (int i=0; i<BookStocks[].size(); i++)
                {
                    System.out.println(BookStocks[i].bookID + "\t\t" + BookStocks[i].category + "\t\t" + BookStocks[i].title + "\t\t" + BookStocks[i].author + "\t\t" + BookStocks[i].dateofissue + "\t\t" + BookStocks[i].bookcount"\n");
                }
		    }
	
            public void setBook(int code)
            {
			    bookID = code;
		    }

            public boolean check_storage()
            {
                for (int i=0; i<BookStocks[].size(); i++)
                {
				    if (BookStocks[i].bookID=code)
					    return true;
				    else 
					    return false;
		        }
            }
        
            public int getbookstocks()
            {
                for (int i=0; i<BookStocks[].size(); i++)
                {
				    if (BookStocks[i].bookcount>0)
					    return bookcount;
				    else 
					    System.out.println("Unavailable stock of book");
			    }
		    }
		
            public void setNumberOfbooks(int num)
            {
			    System.out.println("Enter the number of books:");
			    num = input.nextInt();
		    }

            public void update(Daneismos-Polisi b)
            {
			    borrow = b;
		    }

            public boolean isBorrowed()
            {
			    if(borrow!=null)
				    return true;
			    else
				    return false;
		    }
		
	    break;
	
	    case 2:    // remove book from BookStocks

            public void removeBook(int book)
            {
			    book = input.nextInt();
		    }

            public boolean check_list()
            {
                for (int i=0; i<BookStocks[].size(); i++)
                {
				    if (BookStocks[i].bookID=book)
					    return true;
				    else
					    return false;
		        }
		    }

            public void reduce_stock()
            {
				
                for(i=0; i<BookStocks[].size(); i++)
                {
                    if(BookStocks[i].bookID = book)
                    {
					    BookStocks[i].bookcount--;
					    System.out.println("Validate removal");
				    }
                    else 
                    {
					    System.out.println("There is no such a book.");
				    }
                }
            }

	    break;
    }
}
