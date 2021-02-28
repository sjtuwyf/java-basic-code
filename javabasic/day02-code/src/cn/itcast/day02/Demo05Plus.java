package cn.itcast.day02;

public class Demo05Plus {
	public static void main(String[] args){
		String str1 = "Hello";
		System.out.println(str1);
		
		System.out.println("Hello" + "World");
		
		String str2 = "Java";
		System.out.println("Hello" + 20);
		System.out.println("Hello" + 20 + 30);
		System.out.println(20 + "Hello" );
		System.out.println("Hello" + (20 + 30));
	}
}