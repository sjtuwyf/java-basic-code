package cn.itcast.day02;

public class Demo09Logic {
	public static void main(String[] args) {
		System.out.println(true && false);
		System.out.println(3 < 4 && 10 > 5);
		System.out.println("==============");
		System.out.println(true || false);
		System.out.println(true || true);
		System.out.println(false || false);
		System.out.println("=============");
		
		System.out.println(true);
		System.out.println(!true);
		
		int a = 10;
		System.out.println(3 > 4 && ++a < 100);
		System.out.println(a);
		
		 
		
	}
}