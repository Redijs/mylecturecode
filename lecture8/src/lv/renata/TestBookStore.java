package lv.renata;



import lv.renata.bookstore.Author;
import lv.renata.bookstore.Book;

public class TestBookStore {

	public static void main(String[] args) {
		Author rowling = new Author ("J.K.Rowling", "rowling@gmail.com", 'f');
		Author rainis = new Author ("Rainis", "rainis@gmail.com", 'm');
		System.out.println(rowling.getEmail());//gribam dabuut tikai email);
		rowling.setEmail("rowli@gmail.com");
		System.out.println(rowling.getEmail());
		
		
		Book harrypoter = new Book("Harry Potter", rowling, 20.3, 1000);
		Book testbook = new Book ("Books", new Author ("Author 1", "email@email1", 'm'), 20.5, 1200);
		//shis tikai testeeshanai, paspeeleeties, kas notiek, kad iekshaa ir parametrs no citas klases
		System.out.println(testbook.toString());
		System.out.println(harrypoter.toString());
		
	
		
		
		System.out.println("_____________________________");
		System.out.println("_____________________________");
		System.out.println("_____________________________");
		
		
		Author test1 = new Author ("name", "name@name", 'f'); //paarbaudiit vajag 
		Author test2 = new Author ("name1", "name@name1", '0');
		
		System.out.println(test1.toString());
		System.out.println(test2.toString());
		System.out.println("_____________________________");
		
		
		
		char m = 'm';
		char f = 'f';		
		char o = 'o';
		
	if (m==o || f == o){
		System.out.println("It is M  or F");
	}else{
		System.out.println("It is not M or F");
	}
		
		
		
		switch (o){
			case 'm':
				System.out.println("It is m");
			    break;
			case 'f':
				System.out.println("It is f");
				break;
			default:
				System.out.println("Not in the list");
				
		}

	}
}
