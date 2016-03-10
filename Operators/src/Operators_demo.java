
public class Operators_demo {

	
	public static void main(String[] args) {
		
		System.out.println("Give me permission to enter Next Class" );
		
		arthmetic math=new arthmetic();
		math.sum(10, 20);
		math.sub(20, 40);
		math.mul(10,20,1);
		math.div(70, 35,0);
		math.mod(31,15,0);

	}
}

class arthmetic{
	public void sum(int a,int b) {	
		int sum=a+b;
		System.out.println("Sum=" + sum );
		
	
}
	public void sub(int a,int b) {
		int sub=a-b;
		System.out.println("Sub=" + sub );

	}
	public void mul(int a,int b,int mul) {
	mul=a*b;
	System.out.println("Mul="+ mul);
	}
	public void div(int a,int b,int div) {
		div=a/b;
		System.out.println("Div="+div);
	}
	public void mod(int a,int b,int mod) {
		mod=a%b;
		System.out.println("Mod="+mod);
	}

}

