package cn.itcast.day03;

public class Demo11DoWhile{
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i+"ԭ������");
		}
		System.out.println("===============");
		
		int i = 1;
		do {
			System.out.println(i+"ԭ������");
			i++;
		} while (i <= 10);
		
	}
}