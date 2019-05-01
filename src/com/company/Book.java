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
    public boolean equals(Object obj){
        boolean isTrue=false;
        if(obj == this ){
            return true;
        }

        if(!(obj instanceof Book)){
            return false;
        }
        //type cast obj to Book
        Book book = (Book)obj;
        if((book.title.equalsIgnoreCase(this.title))||
                (book.author.equalsIgnoreCase(this.author))){
            isTrue = true;
        }
        return isTrue;
    }

    @Override
    public String toString(){
        return "Title: "+getTitle()+
                "\nAuthor: "+getAuthor()+
                "\nNumber of Pages: "+getPages()+
                "\nPrice: "+getPrice()+"\n\n";
    }
}
