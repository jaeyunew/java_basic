package java_advanced_01.day18.homework;

import lombok.Data;

import java.util.Date;

@Data
public class Board {
    private int bno;       //글번호

    public int getBno() {
        return bno;
    }

    public String getbTitle() {
        return bTitle;
    }

    public String getbContent() {
        return bContent;
    }

    public String getbWriter() {
        return bWriter;
    }

    public Date getbDate() {
        return bDate;
    }

    private String bTitle;  //글제목
    private String bContent; //글내용
    private String bWriter;  //글쓴이
    private Date bDate;     //글쓴 날짜
}
