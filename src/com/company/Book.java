package com.company;

public class Book extends Product{
    private String title;
    private String author;
    private int pages;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString(){
        return "Title: "+getTitle()+
                "\nAuthor: "+getAuthor()+
                "\nNumber of Pages: "+getPages()+
                "\nPrice: "+getPrice()+"\n\n";
    }
}
