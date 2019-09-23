import java.util.Scanner;

public class Age{
	public static void main(String[] args){
		
		int a;
		
		System.out.print("please input your age");
		Scanner scan = new Scanner(System.in);
		
		int age = scan.nextInt();
		
		a = age/18;
		if(a > 0){
			a = (age/35)+1;
		}
		
		switch(a){
			case 0:
			    System.out.println("little sister");
				break;
			case 1:
			    System.out.println("order sister");
				break;
			default:
			    System.out.println("madam");
				break;
		}
	}
}