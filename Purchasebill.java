package ac.in.kletech.customer;

public class Purchasebill {
	private int iBillID;
	private int iQty;
	private double dBillAmount;

	public int getiBillID() {
		return iBillID;
	}

	public int getiQty() {
		return iQty;
	}

	public double getdBillAmount() {
		return dBillAmount;
	}
	Purchasebill(int iBillID,int iQty)
	{
		this.iBillID=iBillID;
		this.iQty=iQty;
	}
	Itemdetails item = new Itemdetails(1010);
	void calculateBill() {

		if (iQty <= 0 || iQty >= 5) {
			System.out.println("So many items cannot be processed at once. Please Try Again");
		} else {
			dBillAmount = iQty * item.getdItemPrice();
			if (dBillAmount >= 1000)
				dBillAmount -= (dBillAmount * 0.1);
			else if (dBillAmount >= 500)
				dBillAmount -= (dBillAmount * 0.05);
			
		}
		item.display1();
	}
	
	void itemDetails() {
		System.out.println("Bill ID = " + iBillID);
		System.out.println("Number of items = " + iQty);
		System.out.println("Total Bill = " + dBillAmount);
	}
}