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
        //this equals method is case-sensitive
        if(obj == null){
            return false;
        }

        if(obj instanceof Book){
            Book book = (Book)obj;
            if(book.getTitle().length()!= this.getTitle().length()
                    &&book.getAuthor().length()!= this.getAuthor().length()){
                return false;
            }
            for (int i=0; i<book.getTitle().length();i++){
                if(book.getTitle().charAt(i)!=this.getTitle().charAt(i)){
                    return false;
                }
            }
        }
        //if this statement is reached then the objects are equal
        return  true;
    }

    @Override
    public String toString(){
        return "Title: "+getTitle()+
                "\nAuthor: "+getAuthor()+
                "\nNumber of Pages: "+getPages()+
                "\nPrice: "+getPrice()+"\n\n";
    }
}
