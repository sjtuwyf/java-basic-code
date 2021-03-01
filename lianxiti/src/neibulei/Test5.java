package neibulei;

public class Test5 {
    public static void main(String[] args) {
        Player player = new Player();

        String select = "法师角色";
        System.out.println(select);
        FightAble f = player.selecct(select);
        f.specialFIght();
        f.commenFight();

        select = "武力角色";
        System.out.println(select);
        FightAble f2 = player.selecct(select);
        f2.specialFIght();
        f2.commenFight();
    }
}
