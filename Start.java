import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		StoryBook sb1 = new StoryBook();
		sb1.setIsbn("121-325");
		sb1.setBookTitle("Java");
		sb1.setAuthorName("Karim");
		sb1.setPrice(10);
		sb1.setAvailableQuantity(20);
		sb1.setCategory("Programming");
		
		StoryBook sb2 = new StoryBook();
		sb2.setIsbn("112-561");
		sb2.setBookTitle("Java");
		sb2.setAuthorName("Seaim");
		sb2.setPrice(20);
		sb2.setAvailableQuantity(15);
		sb2.setCategory("Comedy");
		
		StoryBook sb3 = new StoryBook();
		sb3.setIsbn("553-101");
		sb3.setBookTitle("Java");
		sb3.setAuthorName("Rahim");
		sb3.setPrice(30);
		sb3.setAvailableQuantity(10);
		sb3.setCategory("friction");
		
		StoryBook sb4 = new StoryBook();
		sb4.setIsbn("894-232");
		sb4.setBookTitle("Java");
		sb4.setAuthorName("karim");
		sb4.setPrice(40);
		sb4.setAvailableQuantity(20);
		sb4.setCategory("Comedy");
		
		StoryBook sb5 = new StoryBook();
		sb5.setIsbn("135-655");
		sb5.setBookTitle("Java");
		sb5.setAuthorName("Seaim");
		sb5.setPrice(50);
		sb5.setAvailableQuantity(12);
		sb5.setCategory("Friction");
		
		System.out.println("-----------------End Of Story Book----------------");
		
		TextBook tb1 = new TextBook();
		tb1.setIsbn("541-252");
		tb1.setBookTitle("Java");
		tb1.setAuthorName("Seaim");
		tb1.setPrice(10);
		tb1.setAvailableQuantity(20);
	    tb1.setStandard(12);
		
		TextBook tb2 = new TextBook();
		tb2.setIsbn("251-252");
		tb2.setBookTitle("Java");
		tb2.setAuthorName("Karim");
		tb2.setPrice(20);
		tb2.setAvailableQuantity(15);
	    tb2.setStandard(20);
		
		TextBook tb3 = new TextBook();
		tb3.setIsbn("024-287");
		tb3.setBookTitle("Java");
		tb3.setAuthorName("Seaim");
		tb3.setPrice(30);
		tb3.setAvailableQuantity(15);
	    tb3.setStandard(31);
		
		TextBook tb4 = new TextBook();
		tb4.setIsbn("852-874");
		tb4.setBookTitle("java");
		tb4.setAuthorName("kuddus");
		tb4.setPrice(40);
		tb4.setAvailableQuantity(40);
	    tb4.setStandard(10);
		
		TextBook tb5 = new TextBook();
		tb5.setIsbn("578-741");
		tb5.setBookTitle("java");
		tb5.setAuthorName("Kuddos");
		tb5.setPrice(50);
		tb5.setAvailableQuantity(15);
	    tb5.setStandard(52);
		System.out.println("----------------End Of Text Book-----------------");
		
		BookShop b = new BookShop(" ***Book Shop**** ");
		System.out.println("\n--------------------------------------\n");
		
		b.showDetails();
		System.out.println("\n*********** Text Books **************\n");
		b.showAllBooks();
		
		if(b.insertBook(tb1))
		{System.out.println(tb1.getIsbn() + " Available");}
		else
		{System.out.println(tb1.getIsbn() + " Not Available");}
		
		if(b.insertBook(tb2))
		{System.out.println(tb2.getIsbn() + " Available");}
		else
		{System.out.println(tb2.getIsbn() + " Not Available");}
		
		if(b.insertBook(tb3)){System.out.println(tb3.getIsbn() + " Available");}
		else
		{System.out.println(tb3.getIsbn() + " Not Available");}
	
	    if(b.insertBook(tb4)){System.out.println(tb4.getIsbn() + " Available");}
		else
		{System.out.println(tb4.getIsbn() + " Not Available");}
	
     	if(b.insertBook(tb5)){System.out.println(tb5.getIsbn() + " Available");}
		else
		{System.out.println(tb5.getIsbn() + " Not Available");}
		
		if(b.insertBook(sb1)){System.out.println(sb1.getIsbn() + " Available");}
		else
		{System.out.println(sb1.getIsbn() + " Not Available");}
		
		if(b.insertBook(sb2)){System.out.println(sb2.getIsbn() + " Available");}
		else
		{System.out.println(sb2.getIsbn() + " Not Available");}
		
		if(b.insertBook(sb3)){System.out.println(sb3.getIsbn() + " Available");}
		else
		{System.out.println(sb3.getIsbn() + " Not Available");}
		
		if(b.insertBook(sb4)){System.out.println(sb4.getIsbn() + " Available");}
		else
		{System.out.println(sb4.getIsbn() + " Not Available");}
		
		if(b.insertBook(sb5)){System.out.println(sb5.getIsbn() + " Available");}
		else
		{System.out.println(sb5.getIsbn() + " Not Available");}
		
		System.out.println("\n--------------------------------------\n");
		
		b.showDetails();
		System.out.println("\n*********** Text Book **************\n");
		b.showAllBooks();
		System.out.println("\n*********** Story Book **************\n");
		b.showAllBooks();
		System.out.println("\n--------------------------------------\n");
	
		if(b.removeBook(tb1)){System.out.println(tb1.getIsbn() +  "Available");}
		else{System.out.println(tb1.getIsbn() + "Not Available");}
		
		if(b.removeBook(tb2)){System.out.println(tb2.getIsbn() +  "Available");}
		else{System.out.println(tb2.getIsbn() + "Not Available");}
		
		
		if(b.removeBook(sb1)){System.out.println(sb1.getIsbn() +  "Available");}
		else{System.out.println(sb1.getIsbn() + "Not Available");}
		
		if(b.removeBook(sb2)){System.out.println(sb2.getIsbn() +  "Available");}
		else{System.out.println(sb2.getIsbn() + "Not Available");}
		
	    System.out.println("\n--------------------------------------\n");
		
		b.showDetails();
		System.out.println("\n*********** Text Book **************\n");
		b.showAllBooks();
		
		
		System.out.println("\n------------------Story Book--------------------\n");
		b.showAllBooks();
	
		System.out.println("\n--------------------------------------\n");

	     Book sb = b.searchBook(sb1.getIsbn());
		
		if(sb != null)
		{
			System.out.println("Found....");
			sb.showDetails();
		}
		else
		{
			System.out.println("Not Found with Isbn: " + sb1.getIsbn());
		}
		System.out.println("\n--------------------------------------\n");
		Book tb = b.searchBook(tb1.getIsbn());
		if(tb != null)
		{
			System.out.println("Found....");
			tb.showDetails();
		}
		else
		{
			System.out.println("Not Found with Isbn: " + tb1.getIsbn());
		}
	
	   
	
	   }
	}
   
