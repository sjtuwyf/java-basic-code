package cn.itcast.day11.demo07;

public class DemoGame {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("艾希");

//        hero.setSkill(new SkilImpl());
//        Skill skill = new Skill() {
//            @Override
//            public void use() {
//                System.out.println("piapiapia");
//            }
//        };
//        hero.setSkill(skill);
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("biu pia biu pia");
            }
        });



        hero.attack();
    }
}
