package javabasic_02.day11.homework.Inheritance02;

public class Book {
    private String title;
    private int price;

    public Book(){
        String title="";
        int price = 0;
    }
    public Book(String title,int price){
        this.title=title;
        this.price=price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
