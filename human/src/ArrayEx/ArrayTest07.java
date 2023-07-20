package ArrayEx;

import java.util.Arrays;

public class ArrayTest07 {
	public static void main(String[] args) {
		int[] num = {34,56,78,99,23,46,21,46,76,55};
		int temp = 0;
//		int[] resultArr = Arrays.stream(num).distinct().toArray(int[]::new);
//		System.out.println(resultArr.length);
//		System.out.println(Arrays.toInt(resultArr));
			System.out.println("정렬 전 배열값");
			for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+"\t");
		}
			for (int i = 0; i < num.length; i++) {
				for (int j = i+1; j < num.length; j++) {
					if (num[i]>num[j]) {
						temp = num[i];
						num[i] = num[j];
						num[j]= temp;
					}
				}
			}
					System.out.println("\n정렬 후 배열값");
					for (int i = 0; i < num.length; i++) {
						System.out.print(num[i]+"\t");	
					}
				
				}
			}
	


