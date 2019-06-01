package library;

import java.util.Scanner;

public class Library
{
	public static void main(String[] args) 
	{

		Scanner in = new Scanner(System.in);
		
		// create a new member and a new book from storage
		Members nbMember = new Members();
		Storage book = new Storage();
		
		int menuItem;
		boolean quit = false;
		
		do
		{
			System.out.println("--------------------------------------------");
		    System.out.println("|         Welcome to our library!          |");
		    System.out.println("|------------------------------------------|");
		    System.out.println("|   Please Select From The Menu Options:   |");
		    System.out.println("|------------------------------------------|");
		
		
			System.out.println("Choose a menu item ");
			menuItem = in.nextInt();


			 switch (menuItem) 
			 {
				
               case 1:

					nbMember.checkMemberData();					

                     break;

               case 2:

                     book.check_storage();

                     break;

               case 3:

                     book.check_selling();
                    
                     break;

               case 4:

                    Notification not = new Notification();
					
					searchnot = input.nextInt();

						switch(searchnot)
						{

							case 1:
								not.checkNewEditions();
							break;
                    
							case 2:
								not.checkBorrowedBooks();
							break;
						}	
					
					break;					

               case 5:

                     Orders order = new Orders();
					 order.checkBookList();

                     break;
					 
               case 6:

						Events event = new Events();
						event.searchEvents();
                  
					break;
				   
               case 7:

						Epistrofes epvivliou = new Epistrofes();
						epvivliou.check_aitia();

                   break;

               case 0:

                     quit = true;

                     break;

               default:

                     System.out.println("Invalid choice. Choose an integer between 0 and 7");

            }
	
		}
		while (!quit);
	
	}
	
}
