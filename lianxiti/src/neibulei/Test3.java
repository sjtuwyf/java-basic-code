package neibulei;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            users.add(new User(i));

        }

        System.out.println("未分组");
        System.out.println(users);

        Reception reception1 = new Reception();
        Reception reception2 = new Reception();
        Reception reception3 = new Reception();

        reception1.setF(new Filter() {
            @Override
            public void filterUser(User u) {
                if (u.getId()>=10 && u.getId()<20){
                    u.setType("v1");

                }
            }
        });

        reception2.setF(new Filter() {
            @Override
            public void filterUser(User u) {
                if (u.getId()>=20 && u.getId()<30){
                    u.setType("v2");

                }
            }
        });

        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            reception1.recept(user);
            reception2.recept(user);
            reception3.recept(user);
        }

        System.out.println("已分组：");

        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if(i%9==0){
                System.out.println();
            }

            System.out.println(user+" ");
        }
    }
}
