package RandomAndArrayList;

public class Test7 {
    public static void main(String[] args) {
        MyList myList = new MyList();
        for (int i = 0; i < 3; i++) {
            myList.add(i);
        }

        myList.show();
        System.out.println(myList.remove());
        myList.show();



    }
}
