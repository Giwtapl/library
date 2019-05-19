import java.util.Scanner
import java.util.ArrayList;

public abstract class Members
{
    private int member_ID;
    private String last_name;
    private String first_name;
    private int points;
    private String sale , lend;

    private ArrayList <String> MemberList = new ArrayList <String>("ID" , "Last Name" , "First Name" ,
     "Sale" , "Lend" ,"Points");

    static int currentIdNumber = 0;

    Scanner s = new Scanner ( System.in )

    public Members(int Id , String l, String f , Double p) 
    {
        currentIdNumber++;

        if(member_ID == -1)
        {
            member_ID = currentIdNumber;
        }
        else
            member_ID = ID;
    }

    public void setFirstName(String f)
    {
        first_name = f;
    }
    public void setLastName(String l)
    {
        last_name = l;
    }

    public void removeMember( ) 
    {
        System.out.println("Enter the last name you want removed: ");
        String last_name = s.next();
        System.out.println("Enter the first name you want removed: ");
        String first_name = s.next();
        if (this.last_name = l) 
        {
            System.out.println ("The member you chose is removed.")   
        }
        else ( this.last_name != l)
        {
            System.out.println("You did not choose a valid name.")
    }

    public int getMemberId()
    {
        return member_ID;
    }

    public String getFirstName()
    {
        return first_name;
    }

    public String getLastName()
    {
        return last_name;
    }

    public void checkMember_Data( String n ) 
    {
        System.out.println("Enter last name: ");
        String last_name = s.next();
        System.out.println("Enter first name: ");
        String first_name = s.next();
        if (this.last_name = l) 
        {
            System.out.println ("There is already a member with that name.")   
        }
        else ( this.last_name != l)
        {
            System.out.println("You have to get a membership card.")
        }
    }

    public String setMemberCard() 
    {
        System.out.println("Enter the last name of the new member: ");
        String last_name = s.next();
        System.out.println("Enter the first name of the new member: ");
        String first_name = s.next();

        currentIdNumber++;
        points = points + 50;
    }

 }
