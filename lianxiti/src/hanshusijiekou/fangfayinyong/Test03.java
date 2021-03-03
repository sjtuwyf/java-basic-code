package hanshusijiekou.fangfayinyong;

public class Test03 {
    public static void decToHex(int num, NumberToString numberToString) {
        String convert = numberToString.convert(num);
        System.out.println(convert);
    }

    public static void main(String[] args) {
        decToHex(1,Integer::toHexString);
    }
}
