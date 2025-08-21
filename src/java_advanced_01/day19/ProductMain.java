package java_advanced_01.day19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ProductMain {

    public static void main(String[] args) {
        //List<Product> ArrayList products 생성
        List<Product> products = new ArrayList<Product>();

        //5개의 제품을 생성하여 products 에 저장해주세요
        products.add(new Product("1", "텀블러", "스타벅스", 20000));
        products.add(new Product("2", "마우스", "로지텍", 30000));
        products.add(new Product("3", "모니터", "삼성", 40000));
        products.add(new Product("4", "아이폰", "애플", 1000000));
        products.add(new Product("5", "애플워치", "애플", 300000));

        //객체 스트림을 얻어서 각 제품의 정보를 출력하세요
        Stream<Product> productStream = products.stream();
        productStream.forEach(System.out::println);


//        productStream.forEach(product -> System.out.println(product));
    }
}
