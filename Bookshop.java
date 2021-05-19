import java.lang.*;

public class BookShop implements BookShopOperations
{
	
	private String name;
	private BookListsOfBooks books[] = new book[100];
	
	public BookShop()
	{
		System.out.println("E-BookShop");
	}
	public BookShop(String name)
	{
		System.out.println("P-BookShop");
		this.name = name;
	}
	public void setName(String name)
	{this.name = name;}
	public String getName()
	{return name;}
	
	public void showDetails()
	{
		System.out.println(" isbn: " + isbn);
		System.out.println("AuthorName: " + name);
		System.out.println("price: " + price);
		
	}

	
	boolean insertBook(Book b)
	{
		boolean flag = false;
		for(int i = 0; i<book.length; i++)
		{
			if(book[i] == null)
			{
				book[i] = tb;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	boolean removeBook(Book b)
		{
		boolean flag = false;
		for(int i=0; i<book.length; i++)
		{
			if(book[i] == b)
			{
				book[i] = null;
				flag = true;
				break;
			}
		}
		return flag;		
	}
	
		void showAllBooks( )
	{
		for(int i=0; i<book.length; i++)
		{
			if(book[i] != null)
			{
				book[i].showDetails();
				System.out.println();
			}
			
		}
	}
	
	public Book searchBook(String isbn)
	{
		Book flag = null;
		for(int i=0; i<book.length; i++)
		{
			if(book[i] != null)
			{
				if(book[i].getIsbn() == isbh)
				{
					flag = book[i];
					break;
				}
			}
		}
		return flag;
	}
}

	
	
	