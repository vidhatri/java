package ac.in.kletech.customer;

public class Customer {
	private int iCustID;
	private String sCustName;
	private String sAddress;
	private long lTeleNo;

	public int getiCustID() {
		return iCustID;
	}

	public String getsCustName() {
		return sCustName;
	}

	public String getsAddress() {
		return sAddress;
	}

	public long getlTeleNo() {
		return lTeleNo;
	}
	Customer(int iCustID,String sCustName,String sAddress,long lTeleNo)
	{
		this.iCustID=iCustID;
		this.lTeleNo=lTeleNo;
		this.sAddress=sAddress;
		this.sCustName=sCustName;
	}

	boolean validateTeleNo() {
		if (lTeleNo / 1000000000 < 1 || lTeleNo / 1000000000 > 10)
           return false;
		else
			return true;
	}

	boolean validateCustName() {
		if (sCustName.length() <= 4 || sCustName.length() >= 20)
			return false;
		else
			return true;
	}

	void display()
	{
		System.out.println("ID : " + iCustID);
		System.out.println(" Name : " + sCustName);
		System.out.println(" Address : " + sAddress);
		System.out.println(" Telephone Number : " + lTeleNo);
	}
}


