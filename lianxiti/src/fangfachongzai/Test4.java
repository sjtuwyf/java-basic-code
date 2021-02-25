package fangfachongzai;

public class Test4 {
    public static void main(String[] args) {
        showColor("blue");
    }

    public static void showColor(String color) {
        switch (color){
            case "red":
                System.out.println("红色");
                break;
            case "yellow":
                System.out.println("黄色");
                break;
            case "blue":
                System.out.println("蓝色");
                break;
            default:
                System.out.println("未知");
        }
    }
}
