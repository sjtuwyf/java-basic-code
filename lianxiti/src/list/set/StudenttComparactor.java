package list.set;

import java.util.Comparator;

public class StudenttComparactor implements Comparator<Studentt> {
    @Override
    public int compare(Studentt o1, Studentt o2) {
        if (o1.getScore() >o2.getScore()) {
            return -1;
        } else if (o1.getScore() < o2.getScore()) {
            return 1;
        }else {
            if (o1.getAge() > o2.getAge()) {
                return 1;
            } else if (o1.getAge() < o2.getAge()) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
