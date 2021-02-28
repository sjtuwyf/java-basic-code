package cn.itcast.day02;

public class Demo02DataType {
	public static void main(String[] args){
		int num = (int)100L;
		System.out.println(num);
		
		int num2 = (int)6000000000000L;
		System.out.println(num2);
		
		int num3 = (int)3.5;
		System.out.println(num3);
		
		char zifu1 = 'A';
		System.out.println(zifu1+1);
		
		byte num4 = 40;
		byte num5 = 50;
		int result1 = num4 + num5;
		System.out.println(result1);
		
		short num6 = 60;
		short result2 = (short)(num4 + num6);
		System.out.println(result2);
	}
}