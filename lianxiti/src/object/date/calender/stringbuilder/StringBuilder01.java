package object.date.calender.stringbuilder;

public class StringBuilder01 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        testString();
        long end = System.currentTimeMillis();
        System.out.println(end-start);

        start = System.currentTimeMillis();
        testStringBuilder();

        end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    public static void testString(){
        String str = "Hello";
        for (int i = 0; i < 10000; i++) {
            str+="world";
        }
    }

    private static void testStringBuilder() {
        StringBuilder str = new StringBuilder("Hello");
        for (int i = 0; i < 10000; i++) {
            str.append("Hello");
        }

        String string = str.toString();

    }
}
