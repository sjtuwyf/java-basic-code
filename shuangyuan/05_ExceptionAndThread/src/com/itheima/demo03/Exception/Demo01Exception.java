package com.itheima.demo03.Exception;

import java.util.List;

public class Demo01Exception {

    public static void main(String[] args) {




//        try {
//            int[] arr = {1,2,3};
//            System.out.println(arr[3]);
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }
//
//        try {
//            List<Integer> list = List.of(1, 2, 3);
//            System.out.println(list.get(3));
//
//        } catch (IndexOutOfBoundsException e) {
//
//            System.out.println(e);
//        }


//        try {
//            int[] arr = {1,2,3};
//            System.out.println(arr[3]);
//            List<Integer> list = List.of(1, 2, 3);
//            System.out.println(list.get(3));
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        } catch (IndexOutOfBoundsException e){
//            System.out.println(e);
//        }


        try {
            int[] arr = {1,2,3};
            System.out.println(arr[3]);
            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));
        }  catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }




        System.out.println("后续代码");
    }
}
