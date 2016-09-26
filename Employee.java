package ac.in.kletech.employee;

public class Employee {
	private static int iEmpID;
	private String sEmpName;
	private float fEmpBasicSalary;
	private float fAllowance;
	
	public Employee( String sEmpName, float fEmpBasicSalary) {
		
		this.sEmpName = sEmpName;
		this.fEmpBasicSalary = fEmpBasicSalary;
			}

	public int getiEmpID() {
		return iEmpID;
	}

	public String getsEmpName() {
		return sEmpName;
	}

	public float getfEmpBasicSalary() {
		return fEmpBasicSalary;
	}

	public float getfAllowance() {
		return fAllowance;
	}
	
	static int iEmpID(){
		return ++iEmpID;
		
	}
	
	void calNetSalary(){
		float fGrossSalary;
		float fNetSalary;
		float fIncomeTax = 0;
		
		fAllowance=((fEmpBasicSalary*46)/100);
		
	    fGrossSalary =( fEmpBasicSalary+fAllowance);
	    if(fGrossSalary<5000)
	    	
	        fIncomeTax=0;
	    
	    else if(fGrossSalary>=5000 && fGrossSalary<10000)
	    	
	    	fIncomeTax=((10*fGrossSalary)/100);
	    
	    else if(fGrossSalary>=10000 && fGrossSalary<20000)
	    	
	    	fIncomeTax=(20*fGrossSalary)/100;
	    
	    else if(fGrossSalary>=20000 )
	    	
	    	fIncomeTax=(30*fGrossSalary)/100;
	    
	    fNetSalary=fGrossSalary-fIncomeTax;
	    
	    System.out.println("ID of the employee : " +iEmpID);
	    System.out.println("Basic Salary of the employee: " +fEmpBasicSalary);
	    System.out.println("Gross Salary of the employee: " +fGrossSalary);
	    System.out.println("Income Tax of the employee: " +fIncomeTax);
	    System.out.println("Net Pay Salary of the employee : " +fNetSalary);
	    
	}
	

}
