import java.util.Scanner;
import java.util.Arrays;
public class binarySearch{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[10];
		for( int i = 0;i < arr.length;++i ){
			arr[i] = (int)(Math.random()*100);
		}
		System.out.println("arr:");
		for ( int value : arr ){
			System.out.println(value);
		}
		
		Arrays.sort(arr);
		System.out.println("\n");
		for ( int value : arr ){
			System.out.println(value);
		}
		
		while(true){
        	System.out.print("input the fromIndex");
		    int fromIndex = scan.nextInt();
	        System.out.print("input the endIndex");
		    int endIndex = scan.nextInt();
			System.out.print("input the key");
		    int key = scan.nextInt();
			int x = Arrays.binarySearch(arr, fromIndex, endIndex, key);
			System.out.println("result:" + x);
			System.out.print("if you continue import 1 or 0");
			int d = scan.nextInt();
			if( d == 0){
				break;
			}
		}
	}
}