package ac.in.kletech.customer;

public class Itemdetails {
	private int iItemID;
	private double dItemPrice;
	public int getiItemID() {
		return iItemID;
	}
	public double getdItemPrice() {
		return dItemPrice;
	}
	Itemdetails(int iItemID)
	{
		this.iItemID=iItemID;
		validateItemID(iItemID);
	}
	void validateItemID(int iItemID)
	{
		if(iItemID==1001)
		{
			dItemPrice=100;
		}
		if(iItemID==1002)
		{
			dItemPrice=200;
		}
		if(iItemID==1003)
		{
			dItemPrice=300;
		}
		if(iItemID==1004)
		{
			dItemPrice=400;
		}
		if(iItemID==1005)
		{
			dItemPrice=500;
		}
		else
			System.out.println("Item does not Exist");
		
	}
	void display1()
	{
		System.out.println("Item ID = "+iItemID);
		System.out.println("Price = "+dItemPrice);
	}


}
