public class Caculate{
	public static void main(String[] args){
		System.out.printf("34 + 30 = %d\n", 30 + 40);
		
		int a = 3;
		int b = 5;
		double res1 = (double)a/b;
		
		System.out.printf(" result = %.2f\n",res1);
		
		int count = 10;
        count *= count + 2;
        count /= 100;
        count++;

        System.out.printf(" count = %d\n",count);
		
		int res = 0;
		int n1 = 12;
		int n2 = 24;
		int n3 = 16;
		int n4 = 3;
		double d = 0.0;
		double v1 = 10.0;
		double v2 = 3.1414;
		res = n1/n4;
		System.out.printf(" res = %d\n",res);
		
		d = n1/n4;
		System.out.printf(" d = %.2f\n",d);
		
		res = n3/n4;
		System.out.printf(" res = %d\n",res);
		
		d = n3/n4;
		System.out.printf(" d = %.2f\n",d);
		
		d = v1/n4;
		System.out.printf(" d = %.2f\n",d);
		
		d = v1/v2;
		System.out.printf(" d = %.2f\n",d);
		
		res = n1/n2;
		System.out.printf(" res = %d\n",res);
		
		d = (double)n1/n2;
		System.out.printf(" d = %.2f\n",d);
		
		d = n1/(double)n2;
		System.out.printf(" d = %.2f\n",d);
		
		d = (double)(n1/n2);
		System.out.printf(" d = %.2f\n",d);
	}
}