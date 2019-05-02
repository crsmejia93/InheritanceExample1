package com.company;

public class Main {

    public static void main(String[] args) {
	    Book book1 = new Book();
	    book1.setTitle("The book");
	    book1.setAuthor("An Author");
	    book1.setDescription("A book about something written in it");
	    book1.setPages(100);
	    book1.setPrice(19.99);

		Book book2 = new Book();
		book2.setTitle("The book");
		book2.setAuthor("An Author");
		book2.setDescription("A book about something written in it");
		book2.setPages(100);
		book2.setPrice(19.99);

		if(book2.equals(book1)){
			System.out.println("The books are the same");
		}else{
			System.out.println("The books are not the same");
		}


	    Software software1 = new Software();
	    software1.setOs("Windows 10");
	    software1.setPlatform("PC");
	    software1.setProgrammer("Some programmer");
	    software1.setPrice(130.0);

		Software software2 = new Software();
		software2.setOs("Windows 8");
		software2.setPlatform("PC");
		software2.setProgrammer("Some programmer");
		software2.setPrice(130.0);

		if(software1.equals(software2)){
			System.out.println("The Softwares are the same");
		}else{
			System.out.println("The Softwares are not the same");
		}
    }
}
