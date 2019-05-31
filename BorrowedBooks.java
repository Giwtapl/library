import java.util.Date;
import java.util.ArrayList;

public class BorrowedBooks extends Notification
{	
	private ArrayList<String> BorrowedBooks[] = new ArrayList<String>();
	private Date dateofborrowing= new Date();
	private int days;
	
    public void checkBorrowedBooks()
    {
		//searching borrowed books
		
        for (int i=0; i<BorrowedBooks[].size(); i++);
        {
            System.out.println(BorrowedBooks[i].bookID + "\t\t" + BorrowedBooks[i].last_name + "\t\t"+ BorrowedBooks[i].fisrt_name + "\t\t" + BorrowedBooks[i].dateofborrowing "\t\t" + BorrowedBooks[i].days "\n");
	    }
    }
	
    public boolean check_deadline()
    {
		if (days < 15 )
			return true;
		else
			return false;
	}
    
    public int getmessage()
    {
		return last_name;
	}
	
    public void decreasePoints()
    {
        for (int i=0; i<BorrowedBooks[].size(); i++);
        {
            if(BorrowedBooks[i].days > 15)
            {
                points= points - 2;
            }
            else
            {
                System.out.println(" There is no time violation.");
            }
	    }
    }
}