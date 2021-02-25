package cn.day06.itcast.day05.demo04;

public class Demo01ArrayParam {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(array);
        printArray(array);
        System.out.println("================================");
        printArray(array);
        System.out.println("================================");
        printArray(array);

    }

    public static void printArray(int[] array){
        System.out.println(array);
        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
        }
    }
}
