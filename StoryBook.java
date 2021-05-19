import java.lang.*;

public class StoryBook extends Book
{

   private static String category;
	
	
	public StoryBook()
	{
		super();
		System.out.println("SB-E");
	}
	public StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String category)
	{
		super( isbn, bookTitle,authorName, price,availableQuantity, String category);
		System.out.println("SB-P");
	
	}

    public void setCategory(String category)
	{
		this.category = category;
	}

    public double getCategory( )	
	{
	  return category;
	}


	public void	showDetails()
		{
		super.showDetails();
		System.out.println("Category: "+ category);
	}
		
	
}