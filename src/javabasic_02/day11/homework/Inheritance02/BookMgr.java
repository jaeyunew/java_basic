package javabasic_02.day11.homework.Inheritance02;

public class BookMgr extends Book {
    public Book[] booklist;

    public BookMgr(Book[] booklist) {
        this.booklist = booklist;
    }

    public void printBooklist() {
        for (int i = 0; i < booklist.length; i++) {
            System.out.println(booklist[i].getTitle());
        }

    }

    public void printTotalPrice() {
        int sum = 0;
        for (int i = 0; i < booklist.length; i++) {
            sum += booklist[i].getPrice();

        }
        System.out.println("전체 책 가격의 합 : " + sum);

    }
}
