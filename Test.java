public class Book {

	private int bookId;

	private double bookPrice;

	public int getBookId() {

		return bookId;

	}

	public void setBookId(int bookId) {

		this.bookId = bookId;

	}

	public double getBookPrice() {

		return bookPrice;

	}

	public void setBookPrice(double bookPrice) {

		this.bookPrice = bookPrice;

	}

}

public class Test {

	public static void main(String[] args) {

		Book bobj=new Book();

		

		bobj.setBookId(123);

		bobj.setBookPrice(500);

		System.out.println("BookId:"+bobj.getId());

		System.out.println("BookPrice:"+bobj.getBookPrice());

	}

}