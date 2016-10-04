package in.ac.kletech;

public class simCardDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Customer ravi=new Customer("ravi","vidyanagar",2424, "BSNL") ;
		
		System.out.println("Customer ID="+ravi.getiCustID());
		System.out.println("Customer name="+ravi.getsCustName());
		System.out.println("Customer address="+ravi.getsCustAddress());
		System.out.println("Customer choosed sim="+ravi.getsSimName());
	    ravi.ChooseSim();
	    
	    

	}

}
