package basic_study.Collection_homework;

import java.util.LinkedList;
import java.util.List;

public class BoardDao {

    public List<Board> getBoard() {
        List<Board> list = new LinkedList<Board>();
        list.add(new Board("제목1","내용1"));
        list.add(new Board("제목2","내용2"));
        list.add(new Board("제목3","내용3"));
        return list;
    }
}
