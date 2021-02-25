package shuzu;

public class Test2 {
    public static void main(String[] args) {
        printCard();
    }

    public static void printCard(){
        for (int i = 0; i < 4; i++) {
            for (int i1 = 0; i1 < 13; i1++) {
                switch (i){
                    case 0:
                        System.out.print("黑桃");
                        break;
                    case 1:
                        System.out.print("红桃");
                        break;
                    case 2:
                        System.out.print("梅花");
                        break;
                    case 3:
                        System.out.print("方片");
                        break;
                    default:
                        break;
                }

                switch (i1){
                    case 0:
                        System.out.print('A');
                        break;
                    case 1:
                        System.out.print('2');
                        break;
                    case 2:
                        System.out.print('3');
                        break;
                    case 3:
                        System.out.print('4');
                        break;
                    case 4:
                        System.out.print('5');
                        break;
                    case 5:
                        System.out.print('6');
                        break;
                    case 6:
                        System.out.print('7');
                        break;
                    case 7:
                        System.out.print('8');
                        break;
                    case 8:
                        System.out.print('9');
                        break;
                    case 9:
                        System.out.print("10");
                        break;
                    case 10:
                        System.out.print('J');
                        break;
                    case 11:
                        System.out.print('Q');
                        break;
                    case 12:
                        System.out.print('K');
                        break;
                    default:
                        break;
                }

                if(i1!=12){
                    System.out.print(' ');
                }else {
                    System.out.println();
                }
            }
        }
    }
}
