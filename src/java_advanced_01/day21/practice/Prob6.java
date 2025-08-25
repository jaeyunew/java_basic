package java_advanced_01.day21.practice;

import java.io.*;

// 문제 6: 이미지 복사 (바이트 스트림 활용)
//        image.jpg 파일을 읽어서 copy.jpg 파일로 복사하세요.  image.jpg는 여러분이 지정합니다.
public class Prob6 {

    public static void main(String[] args) throws IOException {
        String originalFile = "C:/Temp/image.jpg";
        String copyFile = "C:/Temp/copy.jpg";

        InputStream is = new FileInputStream(originalFile);
        OutputStream os = new FileOutputStream(copyFile);

/*        byte[] buffer = new byte[2048];
        while (true) {
            int read = is.read(buffer);
            if (read == -1) break;
            os.write(buffer, 0, read);
        }*/

        is.transferTo(os);

        os.flush();
        os.close();
        is.close();

    }
}
