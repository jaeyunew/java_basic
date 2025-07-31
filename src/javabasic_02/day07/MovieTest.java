package javabasic_02.day07;

public class MovieTest {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.name = "아바타";
        movie1.date = "2022.12.14";
        movie1.character = "제이크 설리";
        movie1.genre = "액션";
        movie1.time = 192;
        movie1.age = "12세";

        Movie movie2 = new Movie();
        movie2.name = "좀비딸";
        movie2.date = "2025.07.30";
        movie2.character = "조정석";
        movie2.genre = "개그";
        movie2.time = 136;
        movie2.age = "9세";

        Movie movie3 = new Movie();
        movie3.name = "F1 더무비";
        movie3.date = "2025.06.22";
        movie3.character = "브래드 피트";
        movie3.genre = "스포츠";
        movie3.time = 184;
        movie3.age = "15세";

        Movie[] movielist = new Movie[3];

        movielist[0] = movie1;
        movielist[1] = movie2;
        movielist[2] = movie3;

        System.out.println("------각 배열의 인덱스를 참조 출력-------");
        System.out.println(movielist[0].name);
        System.out.println(movielist[1].name);
        System.out.println(movielist[2].name);

        System.out.println("-----------iter 참조 출력-----------");

        for (Movie movie : movielist) {
            System.out.println(movie.name);
        }

        System.out.println("-----------itar 참조 출력-----------");

        for (int i = 0; i < movielist.length; i++) {
            Movie movie = movielist[i];
            System.out.println(movie.name);
        }
    }
}
