package in.ac.kletech;

public class balance {class Balance implements simCard{
    float fBalanceAmt;
    int iNoOfMins;
    
    public Balance(float fBalanceAmt, int iNoOfMins) {
		super();
		this.fBalanceAmt = fBalanceAmt;
		this.iNoOfMins = iNoOfMins;
	}

	public float getfBalanceAmt() {
		return fBalanceAmt;
	}

	public int getiNoOfMins() {
		return iNoOfMins;
	}
    float BalanceUpdate(){
    	fBalanceAmt=iNoOfMins*1.5f;
    	return fBalanceAmt;
    	
    }
 } 

}
