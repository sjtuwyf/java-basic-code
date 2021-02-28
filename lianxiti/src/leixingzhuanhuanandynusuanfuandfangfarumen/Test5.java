package leixingzhuanhuanandynusuanfuandfangfarumen;

public class Test5{
	
	public static void main(String[] args){
		
		int a = 20;
		int b = 20;
		
		boolean bo = (++a%3 == 0) && (a++ % 7 == 0);
		
		
		System.out.println(a);
		System.out.println(bo);
		
		boolean bo2 = (b++ %3 == 0) && (++b % 7 == 0);
		
		System.out.println(b);
		System.out.println(bo2);
		
		
	}
}