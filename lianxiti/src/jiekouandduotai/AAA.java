package jiekouandduotai;

public interface AAA {

    void showA();

    static void showB(){
        System.out.println("static BBBBB");

        show10("BBBB");
    }

    private static void show10(String s) {
        for (int i = 0; i < 10; i++) {
            System.out.println(s+" ");
        }

        System.out.println();
    }

    static void showC(){
        System.out.println("static CCCC");
        show10("CCCC");
    }
}
