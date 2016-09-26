package ac.in.kletech.library;

public class Library {
         
		private int iRefsec;
		private int iLendsec;
        private  int iDigisec;
        private String sQuespapsec;
        
         public Library(int iRefsec, int iLendsec, int iDigisec, String sQuespapsec) {
			super();
			this.iRefsec = iRefsec;
			this.iLendsec = iLendsec;
			this.iDigisec = iDigisec;
			this.sQuespapsec = sQuespapsec;
		}

		public int getiRefsec() {
			return iRefsec;
		}

		public int getiLendsec() {
			return iLendsec;
		}

		public int getiDigisec() {
			return iDigisec;
		}

		public String getsQuespapsec() {
			return sQuespapsec;
		}
		
		
		void validateref()
		{
		if(iRefsec<4 && iRefsec>0)
			System.out.println("Can be seated");
		else
			System.out.println("Have to leave this section");
		}
		
		void validatelend()
		{
			if(iLendsec<15 && iLendsec>0)
			{
				System.out.println("NO PENALTY");
			}
			else if(iLendsec>15 && iLendsec<22)
			{
				 iLendsec=(iLendsec-15)*20;
			System.out.println("Penalty = "+iLendsec);
			}
			else if(iLendsec>22 && iLendsec<29)
			{
				 iLendsec=(iLendsec-22)*50;
			System.out.println("Penalty = "+iLendsec);
			}
			else if(iLendsec>29 && iLendsec<36)
			{
				 iLendsec=(iLendsec-29)*150;
			System.out.println("Penalty = "+iLendsec);
			}
			else
			{
				iLendsec=(iLendsec-36)*300;
			    System.out.println("Penalty = "+iLendsec);
			}
		}
		
		
		  void validatedigi(){
			  if(iDigisec<6 && iDigisec>4)
			  {
				    System.out.println("OPEN");
			  }
			  else
				    System.out.println("NOT OPEN");
		  }
		  
		  void validateQues(){
			  if(sQuespapsec=="DEPARTMENT WISE")
			  {
				    System.out.println("It is on left");
			  }
			  else if(sQuespapsec=="SUBJEACT WISE")
			  {
				    System.out.println("It is on right");
			  }
			  else
				  System.out.println("INVALID");
		  }

}
