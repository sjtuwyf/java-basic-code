package neibulei;

public interface FightAble {
    void specialFIght();

    public default void commenFight(){
        System.out.println("普通攻击");
    }
}
