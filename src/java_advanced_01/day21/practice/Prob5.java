package java_advanced_01.day21.practice;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

// 문제 5: 바이트 단위 파일 읽기
//        byte_output.txt 파일을 읽어 화면에 출력하세요.
public class Prob5 {

    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("C:/Temp/byte_output.txt");

            while (true) {
                int data = is.read();

                if (data == -1) break;
                System.out.println((char) data);
            }

            is.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("I/O exception");
        } catch (Exception e) {
            System.out.println("Exception");
        }


    }
}
