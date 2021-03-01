package jiekouandduotai;

public class Sun extends Star implements Universe {

    @Override
    public void doAnything() {
        System.out.println("sun : ");
    }

    @Override
    public void shine() {
        System.out.println("sun             :");
    }
}
