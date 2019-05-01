package com.company;

public class Main {

    public static void main(String[] args) {
	    Book book1 = new Book();
	    book1.setTitle("The book");
	    book1.setAuthor("An Author");
	    book1.setDescription("A book about something written in it");
	    book1.setPages(100);
	    book1.setPrice(19.99);
		System.out.println(book1.toString());

	    Software software1 = new Software();
	    software1.setOs("Windows 10");
	    software1.setPlatform("PC");
	    software1.setProgrammer("Some programmer");
	    software1.setPrice(130.0);
		System.out.println(software1.toString());
    }
}
