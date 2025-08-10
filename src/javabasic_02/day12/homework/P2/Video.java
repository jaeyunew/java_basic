package javabasic_02.day12.homework.P2;

public class Video extends Content {
    private String genre;

    public Video(String title, String genre) {
        super(title);
        this.genre = genre;
    }

    @Override
    public void totalPrice() {
        if ("new".equals(genre)) {
            price = 2000;
        } else if ("comic".equals(genre)) {
            price = 1500;
        } else if ("child".equals(genre)) {
            price = 1000;
        } else {
            price = 500;
        }
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}