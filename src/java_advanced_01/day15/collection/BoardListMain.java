package java_advanced_01.day15.collection;

import java.util.ArrayList;
import java.util.List;

public class BoardListMain {
    public static void main(String[] args) {
        List<Board> boardList = new ArrayList<>();

        //글 하나 작성하여 게시판에 올립니다.
        boardList.add(new Board("컬렉션 학습 첫째날1", "쉽지않음1", "sym1"));
        boardList.add(new Board("컬렉션 학습 첫째날2", "쉽지않음2", "sym2"));
        boardList.add(new Board("컬렉션 학습 첫째날3", "쉽지않음3", "sym3"));
        boardList.add(new Board("컬렉션 학습 첫째날4", "쉽지않음4", "sym4"));

        //현재 게시판의 글의 수
        int size = boardList.size();
        System.out.println("전체 글 수 : " + size);
        for (Board board : boardList) {
            System.out.println("제목 : " + board.getSubject());
            System.out.println("내용 : " + board.getContent());
            System.out.println("글쓴이 : " + board.getWriter());
            System.out.println("-----------------------------");
        }
        //특정 인덱스의 객체 가져오기
        Board board = boardList.get(2);
        System.out.println("제목 : " + board.getSubject());
        System.out.println("내용 : " + board.getContent());
        System.out.println("글쓴이 : " + board.getWriter());

        System.out.println("==========삭제==========");
        boardList.remove(2);
    }
}
