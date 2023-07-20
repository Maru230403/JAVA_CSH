package ArrayEx;

public class ArrayTest09 {
	// 배열크기 10개 선언하고 배열에 값을 1씩 증가값을 대입후 출력
	public static void main(String[] args) {
		
	int[] arr =new int[10];
	int v= 1;
	for(int i = 0; i < arr.length; i++)
		arr[i]= v++;
	
	for(int i=0; i < arr.length; i++)
		System.out.println(arr[i]+"\t");
	

}

}