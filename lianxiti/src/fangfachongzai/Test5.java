package fangfachongzai;

public class Test5 {
    public static void main(String[] args) {
        int a = getExtValue("x", 2, 7, 5);
        System.out.println(a);
    }

    public static int getExtValue(String str, int n1, int n2, int n3) {
        switch (str) {
            case "小":
                return getMin(n1, n2, n3);

            case "大":
                return getMax(n1, n2, n3);

            default:
                System.out.println("bug");
                return 0;

        }
    }

    public static int getMin(int n1, int n2, int n3) {
        int min = n1 < n2 ? (n1 < n3 ? n1 : n3) : (n2 < n3 ? n2 : n3);
        return min;
    }

    public static int getMax(int n1, int n2, int n3) {
        int max = n1 > n2 ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
        return max;
    }
}
