package RandomAndArrayList;

import java.util.ArrayList;

public class MyList {
    ArrayList<Integer> ml = new ArrayList<>();

    public void add(Integer i){
        ml.add(i);
    }

    public Integer remove(){
        return ml.remove(ml.size()-1);
    }

    public void show(){
        System.out.println(ml);
    }



}
