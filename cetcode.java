package in.ac.kletech;

public class University {
	final static String code1="E030";
	final static String code2="E241";
	int noOfStud=new int[8];
	School s=new School[8];
	static
	{
		System.out.println("Welcome to kle technological university");
		System.out.println("CET codes:"+code1+"and "+code2);
		
	}
 class school
 {
	 private String sProgramCode;
	 private String sSchoolCordinator;
	 private int iNoOfStud;
	 private int iNoOfStaff;
	 
	 public String getsProgramCode(){
		 return sProgramCode;
	 }
	 
	 public String getsSchoolCordinator(){
		 return sSchoolCordinator;
	 }
	 
	 
     public int getiNoOfStud(){
    	 return iNoOfStud;
     }
     
     public int getNoStaff(){
    	  return iNoOfStaff;
     }
	 

	public school(String sProgramCode, String sSchoolCordinator, int iNoOfStud,
			int iNoOfStaff) {
		super();
		this.sProgramCode = sProgramCode;
		this.sSchoolCordinator = sSchoolCordinator;
		this.iNoOfStud = iNoOfStud;
		this.iNoOfStaff = iNoOfStaff;
		if(iNoOfStud>120)
			System.out.println("intake in "+this.sProgramCode);
		else
			this.iNoOfStud=iNoOfStud;
		    this.iNoOfStaff=iNoOfStaff;
	}
	void createschool()
	{
		 s[0]=new school("CS,"VIDHATRI",70,67);
		 s[1]=new school("EE,"SNEHAL",78,21);  
		 s[2]=new school("ARCHITECTURE,"VIDHATRI",59,30);
		s[3]=new school("MECH,"VARUN",40,20); 
		s[4]=new school("ROBOTICS,"PRADEEP",30,20);
		 s[5]=new school("CS,"ANKITA",52,22);									" +
		 s[6]=new school("EC,"AASHISH",90,25);
         s[7]=new school("BIOTECH,"REVATHI",120,40);
	}
	void calNoStud()
	{
		for(int i=0;i<noOfStud.length;i++)
		{
			noOfStud[i]=s[i].getiNoOfStud();
		}
	}
 }
		
	
 
 
