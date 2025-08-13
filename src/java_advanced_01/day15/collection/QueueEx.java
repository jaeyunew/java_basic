package java_advanced_01.day15.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<Integer> queue_int = new LinkedList<>();   //Integer형 queue 선언
        Queue<String> queue_str = new LinkedList<>();    //String 형 queue 선언

        //데이터(객체) 추가
        queue_int.add(1);
        queue_int.add(2);
        queue_int.add(3);
        queue_int.add(4);

        System.out.println(queue_int.offer(5));
        System.out.println(queue_int.remove(2));
        System.out.println(queue_int);
        queue_int.poll();
        System.out.println(queue_int);
        queue_int.poll();
        System.out.println(queue_int);
    }
}
//어디에 큐가 많이 쓰이는가?
//멀티태스킹을 위한 프로세스 스케줄링 방식을 구현할 때 적용

