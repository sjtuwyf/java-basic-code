package jichengAndChouxianglei;

public class SUV extends Auto {

    private int mini =4295;
    private int midle = 5070;

    public SUV( double length, double price) {
        super("SUV", length, price);
    }

    public boolean miniSUV(){
        return getLength()<=mini;
    }

    public boolean midleSUV(){
        return getLength()>mini&&getLength()<=midle;
    }

    public boolean largeSUV(){
        return getLength()>midle;
    }
}
