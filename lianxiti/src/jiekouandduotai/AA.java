package jiekouandduotai;

public interface AA {
    void showAA();
    public default void show10B(){
        show10("BBBB");
    }

    public default void show10(String s){
        for (int i = 0; i < 10; i++) {
            System.out.println(s+" ");
        }
        System.out.println();
    }

    default void show10C(){
        show10("CCCC");
    }

}
