package cn.itcast.day03;

public class Demo12HundredsSum{
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		
		System.out.println(sum);
		
		sum = 0;
		int i = 1;
		while (i <= 100) {
			if (i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		
		System.out.println(sum);
		
		sum = 0;
		i = 1;
		do {
			if (i % 2 == 0) {
				sum +=i;
			}
			i++;
		} while (i <= 100);
		
		System.out.println(sum);
	}
}