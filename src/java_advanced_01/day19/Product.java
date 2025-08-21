package java_advanced_01.day19;


import lombok.AllArgsConstructor;
import lombok.Data;

//제품
@Data
@AllArgsConstructor
public class Product {

    //제품은 제품번호(no), 제품이름(name), 제조사(company), 가격(price)이란 속성을 가지고 있다.
    //Setter, Getter toString 오버라이딩 하세요
    //제품생성시 모든 속성의 값을 할당하여 제품을 생산합니다.

    private String no;
    private String name;
    private String company;
    private Integer price;


}
