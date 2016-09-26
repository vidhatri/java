package ac.in.kletech.customer;

public class Retaildemo {

	
	public static void main(String[] args) {
	 
			Customer c1 = new Customer(12, "A", "KLE", 982637);
			if(c1.validateTeleNo()&&c1.validateCustName()==true)
			{
				Purchasebill b1=new Purchasebill(1020,1);
				c1.display();
				b1.calculateBill();
				b1.itemDetails();
			}
			
			}


	}


