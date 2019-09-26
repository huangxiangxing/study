import java.util.Scanner;
public class Arraychang{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int array[] = new int[20];
		for( int i = 0;i < array.length;++i ){
			array[i] = (int)(Math.random()*100);
		}
		for ( int value : array ){
			System.out.println(value);
		}
		while(true){
        	System.out.print("imput the math what you want to chang");
		    int a = scan.nextInt();
			int i;
			int b = 0;
			for( i = 0;i < array.length;++i ){
				if( array[i] == a ){
					b = 1;
					break;
				}
			}
			if(b != 1){
				System.out.print("can not found, please imput again");
				break;
			}
			System.out.print("imput you math");
			int c = scan.nextInt();
			array[i] = c;
			for ( int value : array ){
			System.out.println(value);
		    }
			System.out.print("if you continue on, imput 1 or 0");
			int d = scan.nextInt();
			if( d == 0){
				break;
			}
		}
		
	}
}
