package jiekouandduotai;

public interface A {

    public abstract void showA();

    public default void showB(){

        System.out.println("BBB");

    }
}












