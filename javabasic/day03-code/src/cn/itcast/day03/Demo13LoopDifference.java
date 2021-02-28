package cn.itcast.day03;

public class Demo13LoopDifference {
	public static void main(String[] args) {
		for (int i = 1; i < 0; i++) {
			System.out.println("hello");
		}
		System.out.println("===============");
		
		int i = 1;
		do {
			System.out.println("world");
			i++;
		} while (i < 0);
		
	}
}