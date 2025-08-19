package java_advanced_01.day18.AnonymousClass.class04;

public class Main {
    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 20;

        //Calculator 클래스를 생성하여 계산할 수 있도록 클래스 필드에 값을 전달
        Calculator calculator = new Calculator(number1,number2);

        int result1 = calculator.calculate(new Operate(){
            @Override
                    public int operate(int a, int b){
                return a + b;
            }
        });
        System.out.println(result1);

        int result2 = calculator.calculate(new Operate(){
            @Override
            public int operate(int a, int b){
                return a - b;
            }
        });
        System.out.println(result2);
    }
}
