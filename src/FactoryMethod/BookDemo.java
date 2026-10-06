package FactoryMethod;

public class BookDemo {

	public static void main(String[] args) {
		Book bk = Book.getBookObject();
		System.out.println(bk);

	}

}
