package java_advanced_01.day17.comparatorEx;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        if (o1.age > o2.age) return 1;
        else if (o1.age < o2.age) return -1;
        else return 0;
    }
}
