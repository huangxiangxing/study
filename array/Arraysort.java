import java.util.Arrays;
public class Arraysort{
	public static void main(String[] args){
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
	}
}