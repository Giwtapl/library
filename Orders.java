import java.util.Scanner

public class Orders 
{
    private int order_ID;
    private double balance;
    private double amount;
    private int copies;
    private String title;
    private String new_order;

    static int order_ID = 0;

    Scanner s = new Scanner ( System.in)

    public Orders(int ID , double x , int copy , double cash_balance , String text)
    {
        order_ID = ID;
        amount = x;
        copies = copy;
        balance = cash_balance;
        title = text ;
    }

    public void checkBookList ()
    {
      System.out.println("You should check the Book List from your Suppliers!")
    }

    public void setCopies() 
    {
        System.out.println("Enter the title of the book you want to order: " );
        String title = s.nextLine();
        System.out.println("Enter the number of copies: ");
        double copies = s.nextDouble();
    }

    public void setMeanOfPayment( int y) 
    {
      System.out.println ("Choose the mean of payment: 1.Pay on Delivery , 2.Credit Card , 3.Debit Card
      4.Paypal , 5.Bank Acount Deposit ")  

      switch (y) 
      {
        case 1:
          System.out.println("You chose: Pay on Delivery.");
          break;
        case 2:
          System.out.println("You chose: Credit Card.");
          break;
        case 3:
          System.out.println("You chose: Debit Card.");
          break;
        case 4:
          System.out.println("You chose: Paypal.");
          break;
        case 5:
          System.out.println("You chose: Bank Acount Deposit.");
          break;
        default:
          System.out.println("You did not choose a mean of payment.");
      }
    }

    public int getOrderId()
    {
      return order_ID;
    }

    public String getNewOrder() 
    {
      return new_order 
    }

    public boolean checkBalance ()
    {
      if(balance >= amount)
      {
        return true;
      }
      else
      {
        return false;
      }
    }
}

