package com.itheima.demo02.ThreadPool.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Demo01Iterator {
    public static void main(String[] args) {


        Collection<String> coll =new ArrayList<>();

        coll.add("afasfs");
        coll.add("sfafassdaffs");
        coll.add("egreafasfs");
        coll.add("weqafasfs");
        coll.add("ergrafasfs");

        Iterator<String> it = coll.iterator();
        

        while (it.hasNext()){
            String s =it.next();
            System.out.println(s);
        }


        for (Iterator<String> it2=coll.iterator(); it.hasNext(); ) {
            String s =it.next();
            System.out.println(s);
        }

//        boolean b = it.hasNext();
//        System.out.println(b);
//        String s = it.next();
//        System.out.println(s);
//
//        b = it.hasNext();
//        System.out.println(b);
//        s = it.next();
//        System.out.println(s);
//
//        b = it.hasNext();
//        System.out.println(b);
//        s = it.next();
//        System.out.println(s);
//
//        b = it.hasNext();
//        System.out.println(b);
//        s = it.next();
//        System.out.println(s);
//
//        b = it.hasNext();
//        System.out.println(b);
//        s = it.next();
//        System.out.println(s);
//
//        b = it.hasNext();
//        System.out.println(b);
//        s = it.next();
//        System.out.println(s);
//
//        b = it.hasNext();
//        System.out.println(b);
//        s = it.next();
//        System.out.println(s);

    }
}
