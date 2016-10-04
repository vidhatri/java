package in.ac.kletech;

interface  simCard {
 
   String sShopName="HARSHA COMPLEX";
   
 
}
class Customer implements simCard {


	String sCustName;
	String sCustAddress;
	
	int iCustID;
	
	String sSimName;
   
	
	public Customer(String sCustName, String sCustAddress, int iCustID,
			String sSimName) {
		super();
		this.sCustName = sCustName;
		this.sCustAddress = sCustAddress;
		this.iCustID = iCustID;
		this.sSimName = sSimName;
	}





	public int getiCustID() {
		return iCustID;
	}
	
	
	
	
	
	public String getsCustName() {
		return sCustName;
	}
	
	
	public String getsCustAddress() {
		return sCustAddress;
	}
	
	
	
  public String getsSimName() {
		return sSimName;
	}





void ChooseSim(){
	  if(sSimName=="BSNL")
	  {
		  System.out.println("Pay amount rupees 50");
	  }
	  else if(sSimName=="AIRTEL")
      {
          System.out.println("Pay amount of rupees 70");	  
      
      }
	  else if(sSimName=="VODAFONE")
	  {
		   System.out.println("Pay amount of rs 20");
	  }
	  else 
	  {
		   System.out.println("Sim out of stock");
	  }
 }
 
}