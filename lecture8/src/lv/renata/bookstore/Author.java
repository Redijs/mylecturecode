package lv.renata.bookstore;

public class Author {
	private String name;
	private String email;
	private char gender;
	
	
	
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
		if (checkGender(gender)){
			this.gender = gender;
		}else{
			this.gender = 'x';
		}
		
	public Author (String name){ //kaa izsaukt tikai vaardu
		this.name = name;
		
	}
		
	}
	//ja veertiiba ir m vai f, ljauts pieshkirt veertiibu. ja cita - tad nee
	public static  boolean checkGender(char gender){ //char gender - gender ir vnk nosaukums
		char m = 'm';
		char f = 'f';
		if (m==gender || f == gender){ // ja gender ir m vai f ir true, ja kkas cits - false
			return true;
		}else{
			return false;
		}
	}
	//shoos dabujaam automaatiski ar Source / Generate getters un setters
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) { // set email, jo to varees mainiit. Citiem nav, jo citi parametri nemainaas
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	@Override
	public String toString() {  //automaatiski generate toString metodi // lai paarbaudiitu Author test1 = new Author ("name", "name@name", 'f');
		return "Author [name=" + name + ", email=" + email + ", gender="
				+ gender + "]";
	}
	
	
	
	
}
