package java_advanced_01.day22.practice;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

@AllArgsConstructor
@ToString
public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String name;
    private transient int age; //직렬화 시 age필드 제외
}
