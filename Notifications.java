public class Notifications
{
    protected NewEditions issue;
    protected BorrowedBooks card;
    
    public Notification(NewEditions is, BorrowedBooks c)
    {   
        issue = is;
        card = c;
    }
    
    public NewEditions get_editions()
    {
        return issue;
    }
    
    public BorrowedBooks getBorrowedBooks()
    {
        return card;
    }
}
    