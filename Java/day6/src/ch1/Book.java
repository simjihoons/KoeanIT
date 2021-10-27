package ch1;

public class Book {
	int id;
	String title;
	String author;
	
	
	public Book(int id,String title , String author) {
		this.id = id;
		this.title = title;
		this.author = author;
			
	}
	

	public void showInfo() {
		System.out.println("Book Id : "+id+"\nBook Name : "+title+"\nBook Author : "+author);
		
	}
	
	
}
