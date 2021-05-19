import java.lang.*;

public abstract class implements BookOperations
{
    protected String isbn;
	protected  String bookTitle;
	protected  String authorName;
	protected  double price;
	protected  int availableQuantity;
   
	
	public Book()
	{System.out.println("Book");}
	public Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity)
	{
		System.out.println("Details");
		this.isbn = isbn;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.price = price;
		this.availableQuantity = availableQuantity;
	}	
	
	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}

	public String getIsbn()
	{
		return isbn; 
	}
	

	public void setAuthorName(String authorName)
	{
		this.authorName = authorName;	
	}

	public String getAuthorName()
	{
		return authorName; 
	}


	public void setBookTitle(String bookTitle)
	{
		this.bookTitle = bookTitle;	
	}

	public String getBookTitle()
	{
		return bookTitle; 
	}


	public void setPrice(double price)
	{
		this.price=price; 
	}
	
	public double getPrice()
	{ 
		return price;
	}

		public void setAvailableQuantity(int availableQuantity)
	{
		this.availableQuantity = availableQuantity; 
	}
	

		public int getAvailableQuantity()
	{
		return availableQuantity; 
	}
	
	public void addQuantity(int amount)
{
	if(amount>0)
	{
		availableQuantity = availableQuantity + amount;
		System.out.println("Done");
	}
	else
	{
		System.out.println("Invalid Request");
	}
	
}
public void sellQuantity(int amount)
{
	if(amount>0 && amount<=availableQuantity)
	{
		availableQuantity = availableQuantity - amount;
		System.out.println("Done");
	}
	else
	{
		System.out.println("Invalid Request");
	}
}
     abstract public void showDetails();
	
	{
		System.out.println("ISBN: "+ isbn);
		System.out.println("Author Name: "+ authorName);
		System.out.println("Book Title: "+ bookTitle);
		System.out.println("Price: "+ price);
		System.out.println("Available Quantity: "+ availableQuantity);
	}
}