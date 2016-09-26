package ac.in.kletech.library;

public class Librarydemo {

	public static void main(String[] args) {
		Library A=new Library(3, 17, 7,"DEPARTMENT WISE");
        A.validateref();
        A.validatelend();
        A.validatedigi();
        A.validateQues();
	}

}
