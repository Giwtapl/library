import java.util.Scanner;
import java.util.Date;

public class Daneismos-Polisi 
{
	public int points;
	private String selling;
	private Date date_selling;
	private Date date_lending;
	private int id;
	private double payment;
	private int count;
	private double money;
	private text completion_message;
	
    Scanner input = new Scanner(System.in);
    
    public daneismos-polisi() 
    {
		System.out.println("Dwse kwdiko vivliou");
		this.bookID=input.nextLine();
        input.nextLine();
    }
	
    public boolean check_selling()
    {
		if (selling= selling)
			return true;
        else if (selling=only_daneismos)
        {
		    System.out.println("Proorizetai mono gia daneismo");
        }
        else
            points=ponts+5;
    }
	
    public void set_lending_date(Date ld)
    {
        lending_date=ld;
    }

    public boolean check_storage()
    {
	    if (storage>0)
		    return true;
        else
        {
            System.out.println("Den iparxoun apothemata.Pigaine stis nees paraggelies");
        }
    }

    public void reduce_stock(int count)
    {
        count=count-1;
    }

    public boolean check_member(string member) 
	{
		System.out.println(" Enter id of the member :");
		this.member_id=input.nextLine();
		input.nextLine();
		if(member_id=id)
			return true;
        else
        {
            System.out.println(" Pigaine stin Lista Melwn ");
        }
	}
	
    public void set_date_selling(Date sd)
    {
        date_selling=sd;
    }
	
    public void selling_points(int points) 
    {
        points=points + 10;
    }
	
    public void record_payment(double payment) 
    {
        return payment;
    }
	
    public void increase_money (double price) 
    {
        money=money+price;
    }
	
    public void get_completion_message()
    {
        return completion_message;
    }
}		