import java.lang.*;

public interface BookShopOperations
{
	public abstract boolean insertBook(Book b);
	boolean removeBook(Bookt b);
	Book searchBook(int isbn);
	void showAllBooks();
}