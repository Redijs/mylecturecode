package lv.renata.users;
 //superclasss mantos no shiis klasess

//name get, address set un get
public class Person {
	private String name;
	private String address;
	
	
	public Person (String name, String address){
		this.name = name;
		this.address = address;
		
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	
	
	public String toString (){
		return this.name + "("+this.address + ")";
		
	}
	

}
