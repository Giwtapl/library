package library;

import java.util.Scanner;

public class Library
{
    public static void main(String[] args) 
    {
		Scanner input = new Scanner(System.in);
		System.out.println("********************Welcome to the Student Library!********************");
        System.out.println("              Please Select From The Following Options:               ");
        System.out.println("**********************************************************************");
        books nb= new books();
        members nbMember= new Members();
        
        int choice;

        do
        {
	        nb.dispMenu();
	        choice=input.next.Int();
	
            switch(choice)
            {
		        case 1:
		        book b=new book();
		        nb.Storage(b);
		        break;
		
		        case 2:
		        nb.NewEditions();
		        break;
		
		        case 3:
		        nb.BorrowedBooks();
		        break;
		
		        case 4:
		        nb.Daneismos-Polisi();
		        break;
		
		        case 5:
		        nb.Epistrofes();
		        break;
		
		        case 6:
		        nb.Orders();
		        break;
		
		        case 7:
		        member m= new Member();
		        nbMember.Members(m);
		        break;
		
		        case 8:
		        nbMember.Events();
		        break;
		
		        case 9:
		        nbMember.Notifications();
		        break;
		
		        default:
		        System.out.println("Choice should be between 0 to 9.");
            }
        }
        while (choice!=0);
    }
}
