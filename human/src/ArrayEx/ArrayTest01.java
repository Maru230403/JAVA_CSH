package ArrayEx;

public class ArrayTest01 {
	public static void main(String[] args) {
		int[] num=new int[5];
		int[] values =  {1,2,3,4,5,6,7,8,9,10};
		//char[]ch = new char[5];
		char[] ch = {'a','b','c','d','e'};
//		ch[0]= 'a';
//		ch[1]= 'b';
//		ch[2]= 'c';
//		ch[3]= 'd';
//		ch[4]= 'e';
		for (int i = 0; i < ch.length; i++) {
			System.out.println("ch["+i+"]="+ch[i]);
		}
		
		num[0]=100;	// int num1= 100;
		num[1]=200;	// int num2 = 200; int sum =num1 + num2;
		num[1]=(int)12.345F;
//		num[2]=300;	// 배열을 크기가 고정이기에 오류가 뜸 ArrayIndexOutOfBoundsException 발생
		System.out.println("num[0]="+num[0]);
		System.out.println("num[1]="+num[1]);
//		System.out.println("num[2]="+num[2]);
		int sum = num[0]+num[1];
		System.out.println("합 =" + sum);
		int add =num[0]+ 100;
		int sub = num[0]-50;
		int mul = num[0]*num[1];
		System.out.println("Add =" + add+",Sub ="+sub+ ",Mul ="+ mul);
		// 배열의 개수
		int len= num.length;
		System.out.println("배열의 개수:" + len);
		for(int i = 0; i < num.length;i++) {
			System.out.println("num:" + num[i]);
		}
	}
}
// Exception : 예외 -> 사용자 부주의로 인한 경우