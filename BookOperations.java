import java.lang.*;

public interface BookOperations{

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
