package cn.itcast.day03;

public class Demo16DeadLoop {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "hello");
		}
		System.out.println("===============");
		while (true) {
			System.out.println("I love Java");
		}
	}
}