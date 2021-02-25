package RandomAndArrayList;

import java.util.ArrayList;
import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        printCount(countScore(getScoreList()));
    }

    public static ArrayList<Integer> getScoreList() {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            list.add(random.nextInt(101));
        }
        return list;
    }

    public static ArrayList<Integer> countScore(ArrayList<Integer> scoreList) {
        ArrayList<Integer> list = new ArrayList<>();
        int count100 = 0;
        int count79 = 0;
        int count59 = 0;
        int count39 = 0;

        for (int i = 0; i < scoreList.size(); i++) {
            Integer integer = scoreList.get(i);
            if (integer <= 100 && integer >= 80) {
                count100++;
            } else if (integer <= 79 && integer >= 60) {
                count79++;
            } else if (integer <= 59 && integer >= 40) {
                count59++;
            } else {
                count39++;
            }
        }

        list.add(count100);
        list.add(count79);
        list.add(count59);
        list.add(count39);

        return list;

    }


    public static void printCount(ArrayList<Integer> countList){
        for (int i = 0; i < countList.size(); i++) {
            System.out.println(countList.get(i));
        }
    }

}
