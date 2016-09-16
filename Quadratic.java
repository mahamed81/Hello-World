package L1_P_five;

public class Quadratic {
	
	private  int a;
	private int b;
	private int c;

	public Quadratic(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	
	public Quadratic(){
		this.a=0;
		this.b=0;
		this.c=0;
	}
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	
	
	public void change(int set){
		setA(a);
		setB(b);
		setC(c);
	}
	
	public int cal(int x){
	
		return (int) (a*Math.sqrt(x)) + b*x + c;
	}
	
	public static Quadratic sum(Quadratic q1, Quadratic q2 ){
		
		return  new  Quadratic (q1.getA() +q2.getA(), q1.getB() + q2.getB() , q1.getC() + q2.getC());
	}

	@Override
	public String toString() {
		return a + "x^2 + " + b + "x + " + c ;
	}
	
	
	

}
