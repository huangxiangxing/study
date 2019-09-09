public class SayHello{
	pubilc static void main (String[] args){
		System.out.println("Below is the functionof sayhello");
		sayHello(0);
	}
	
	pubilc static void sayHello(int sum){
		System.out.println("say hello!"+sum);
	}
	
	pubilc static int sum(){
		int a,b=0;
		for(a=0;a>=100;a++){
			b+=a;
		}
		return b;
	}
}

    