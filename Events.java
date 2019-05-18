import java.util.Scanner
import java.util.Date;

public class Events
{
    private int seats;
    private String costumer_Data; 
    private String[] presentation ;
    
    Scanner s = new Scanner ( System.in)

    public Events (int s , String c , Scanner p)
    {
        seats = s;
        costumer_Data = c;
        presentation = p;
    }

    public void searchEvents() 
    {
        for (int i = 0; i < 11; i++) 
        {
            System.out.println(presentation[i]);
        }
    }

    public boolean setPesentation()        
    {
        System.out.println("Choose the Book Presentation that you want: " );
        String presentation = s.nextLine();
        if ( presentation[i] = presentation )
        {
             return true;
        }
        else
        {
            return false;
        }
    }

    public int getFreeSeats() 
    {  
        return seats   
    }

    public String SetCostumerData() 
    {
        System.out.println("Enter the costumer's data: ");
        String costumer_Data = s.next();
        System.out.println("Enter the number of seats that you need: ")
        int seats = s.next();
    }

}