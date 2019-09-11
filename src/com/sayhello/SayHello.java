public class SayHello{
	pubilc static void main (String[] args){
		System.out.println("Below is the functionof sayhello");
		sayHello(sum());
		//HelloWorld helloworld = new HelloWorld();
		//helloworld.sayHello(helloworld.sum());
	}
	
	pubilc static void sayHello(int sum){
		System.out.println("say hello!"+sum);
	}
	
	pubilc static int sum(){
		int a,sum=0;
		for(a=0;a<=100;a++){
			sum+=a;
		}
		return sum;
	}
}

    