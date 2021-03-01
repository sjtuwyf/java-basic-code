package neibulei;

public class Player {
    public FightAble selecct(String str){
        if ("法师角色".equals(str)){
            return new FaShi();
        } else  if ("武力角色".equals(str)){
            return new ZhanShi();
        }

        return null;
    }
}
