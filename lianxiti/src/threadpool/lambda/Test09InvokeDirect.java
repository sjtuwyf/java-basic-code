package threadpool.lambda;

public class Test09InvokeDirect {
    public static void main(String[] args) {

        invokeDirect(()->
            System.out.println("Make Movie"));


    }

    private static void invokeDirect(Director director) {
        director.makeMovie();
    }
}
