package project1;
                  // Encapsulation Concept In Java....
public class encapsulation {

	private String Name= "irfanullah";
	private int accNo = 4435;
	
	
	void setName(String name){
		this.Name=name;
	}
	void setaccNo(int accNo){
		this.accNo=accNo;
	}
	// Get Name from setter method.
	String getName(){
		return Name;
	}
	// Get Account_number from setter method.
	int getaccNo(){
		return accNo;
	}
	
	
	public static void main(String[] args) {
		
		
		encapsulation obj = new encapsulation();
		obj.setName("Tasal");
		obj.setaccNo(12398);
		
		// To access only returned Values...
		System.out.println(obj.getName());
		System.out.println(obj.getaccNo());

	}

}
