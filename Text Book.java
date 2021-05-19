import java.lang.*;

public class TextBook extends Book
{
	private int standard;
   
	
	
	public TextyBook()
	{
		super();
		System.out.println("TB-E");
	}
	public TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard)
	{
		super(isbn,bookTitle,authorName, price,availableQuantity,category,int standard);
		System.out.println("TB-P");	
		this.standard  = standard ;
	}

    public void setStandard (int standard )
	{
		this.standard = standard;
	}

    public int getStandard()
	{
		return standard ;
	}
	
	
		showDetails()
		{
		super.showDetails();
		System.out.println("Standard: "+ standard);
	
	]
	
}