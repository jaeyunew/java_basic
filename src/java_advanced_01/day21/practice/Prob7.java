package java_advanced_01.day21.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

// 문제 7: 파일 크기 출력
//        copy.jpg 파일의 크기를 바이트 단위로 출력하세요.
public class Prob7 {

    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("C:/Temp/copy.jpg");
            int fileSize = 0;

            byte[] buffer = new byte[4096];
            while (is.read(buffer) != -1) {
                fileSize += buffer.length;

            }
            is.close();
            System.out.println(fileSize);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("I/O exception");
        } catch (Exception e) {
            System.out.println("Exception");
        }

    }
}
