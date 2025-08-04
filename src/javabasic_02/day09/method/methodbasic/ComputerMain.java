package javabasic_02.day09.method.methodbasic;

public class ComputerMain {
    public static void main(String[] args) {
        //Computer 객체 생성
        Computer2 myCom = new Computer2();

        int result = 0;

        result = myCom.totalSum(1, 2, 3);
        System.out.println(result);

        result = myCom.totalSum(1,2,3,4,5);
        System.out.println(result);

        int[] values={1,2,3,4,5};
        result=myCom.totalSum(values);
        System.out.println(result);

        result=myCom.totalSum(new int[]{1,2,3,4,5});
        System.out.println(result);
    }
}
