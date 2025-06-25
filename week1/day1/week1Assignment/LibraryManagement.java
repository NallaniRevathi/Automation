package week1Assignment;

public class LibraryManagement {

	public static void main(String[] args) {

	Library lib = new Library();
	System.out.println(lib.addBook("Beloved"));
	lib.issueBook();
	}

}