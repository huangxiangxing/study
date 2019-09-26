import java.util.Scanner;
public class Arraycopy{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int arr1[] = new int[10];
		for( int i = 0;i < arr1.length;++i ){
			arr1[i] = (int)(Math.random()*100);
		}
		System.out.println("arr1:");
		for ( int value : arr1 ){
			System.out.println(value);
		}
		
	    int arr2[] = new int[10];
		for( int i = 0;i < arr2.length;++i ){
			arr2[i] = (int)(Math.random()*100);
		}
		System.out.println("arr2:");
		for ( int value : arr2 ){
			System.out.println(value);
		}
		
		System.out.println("imput a math what you want to copy srcPos of arr1");
		int a = scan.nextInt()-1;
		System.out.println("imput a math what you want to copy destPos of arr2");
		int b = scan.nextInt()-1;
		System.out.println("imput a length howmany you want to copy");
		int c = scan.nextInt();
		System.arraycopy(arr1,a,arr2,b,c);
		
		for ( int value : arr2 ){
			System.out.println(value);
		}
		
	}
}