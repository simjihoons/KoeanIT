package ch2;

public class Book {
	private int bookId;
	private String title;
	private String author;

	public Book(int bookId, String title, String author) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}

	// toString() 재정의
	@Override
	public String toString() {
		//return "[" + title + "]";
		return bookId+","+title+","+author;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			Book tempBook = (Book)obj;
			
			//논리적 설계
			if(this.title == tempBook.title && this.author == tempBook.author) {
				return true;
			}else {
				return false;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Book book = new Book(1, "데미안", "홍길동");
		System.out.println(book);
	}// EOM

}
