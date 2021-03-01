package neibulei;

public class Test1 {
    public static void main(String[] args) {
        String string = "23.23456789";
        System.out.println(string);

        HandleAble s1 = new HandleAble() {
            @Override
            public String HandleString(String num) {
                return string.substring(0, string.indexOf("."));

            }
        };

        String str = s1.HandleString(string);

        System.out.println(str);

        int num = 4;

        HandleAble s2 = new HandleAble() {
            @Override
            public String HandleString(String str) {
                int i = str.indexOf(".") + num + 1;
                char c = str.charAt(i);

                if (c<='4'){
                    return str.substring(0,i).toString();

                } else {
                    char c1 = (char) (str.charAt(str.indexOf(".") + num) + 1);
                    return str.substring(0,i-1)+c1;
                }
            }
        };

        String sss = s2.HandleString(string);

        System.out.println(sss);


    }
}
