package java_advanced_01.day18.AnonymousClass.class05;

public interface Operate {
    //추상 메서드
    int operate(int a, int b);
    //default 메서드
    default void print(){
        System.out.println("print");
    }
}
