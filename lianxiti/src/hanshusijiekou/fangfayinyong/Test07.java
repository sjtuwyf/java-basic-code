package hanshusijiekou.fangfayinyong;

public class Test07 {
    public static void getIntegerArray(int length, ArrayBuilder<Integer> builder) {
        Integer[] integers = builder.buildArray(length);
        System.out.println(integers);
    }

    public static void main(String[] args) {
        getIntegerArray(5,Integer[]::new);
    }
}
