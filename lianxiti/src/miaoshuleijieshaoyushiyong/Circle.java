package miaoshuleijieshaoyushiyong;

public class Circle {
    private int r;

    public Circle() {
    }

    public Circle(int r) {

        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void showArea(){
        System.out.println(Math.PI *r*r);
    }

    public void showPerimeter(){
        System.out.println(2*Math.PI*r);
    }
}
