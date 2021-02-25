package Math;

import java.util.ArrayList;
import java.util.Scanner;

public class Test10 {

    static ArrayList<User> users = new ArrayList<>();
    static {
        users.add(new User("a","123"));
        users.add(new User("b","231"));
        users.add(new User("c","312"));
        users.add(new User("d","123"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        String next1 = scanner.next();
        User user = new User(next, next1);
        String login = login(user);
        System.out.println(login);

    }

    public static String login(User user){
        String s = "";
        String name = user.getName();
        String pwd = user.getPwd();
        for (int i = 0; i < users.size(); i++) {
            User user1 = users.get(i);
            String name1 = user1.getName();
            String pwd1 = user1.getPwd();
            if(name.equals(name1)){
                if (pwd.equals(pwd1)){
                    return "登录成功";
                }else {
                    return "密码错误";
                }

            }else {
                s="用户名不存在";
                continue;
            }

        }
        return s;
    }


}
