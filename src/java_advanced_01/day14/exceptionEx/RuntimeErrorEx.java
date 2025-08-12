package java_advanced_01.day14.exceptionEx;

import java.util.Scanner;

public class RuntimeErrorEx {
    public static void main(String[] args) {

        int array[] = {10, 20, 30};  //0,1,2
        //System.out.println(array[3]); ArrayOutOfBoundException

        //System.out.println(12/0); ArithmeticException

        String str = null;
        //System.out.println(str.length()); NullPointerException

        //정수가 아닌 문자열을 정수로 변환할때 예외 발생 : NumberFormatException
        String stringNumber = "3.141592";
        //int number = Integer.parseInt(stringNumber);
        float number = Float.parseFloat(stringNumber);
        System.out.println(stringNumber);

        //ClassCastException : 타입변환은 상위클래스와 하위 클래스간의 상속, 인터페이스 캐스팅
        Integer num = 30;
        Object x = num;
        // System.out.println((String) x); String이 아니라 Integer로 캐스팅

        //InputMismatchException
        //의도치 않은 입력 오류 발생할 때 예외

        Scanner in = new Scanner(System.in);
        System.out.println("정수 3개를 입력하세요");

        int num1 = in.nextInt();
        in.close();


    }
}
