package cn.itcast.day03;

public class Demo15Continue {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			if (i == 4) {
				continue;
			}
			System.out.println(i + "�㵽�ˡ�");
		}
		System.out.println("===============");
	}
}