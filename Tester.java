package L1_P_five;

public class Tester {

	public static void main(String[] args) {
		
		Quadratic q1  = new Quadratic ( 0, 0 , 0);
		Quadratic q2 = new Quadratic (1,4,3);
		
		q1.setA(1);
		q1.setB(2);
		q1.setC(3);
		
		q2.setA(5);
		q2.setB(2);
		q2.setC(6);
		
		
		System.out.println(" With x = 3, the Quadratic 1x^2 + 2x + 3 is " + q1.cal(3));
		
		
		
		
		System.out.println(  (" With x = 3, the Quadratic 4x^2 + 2x + 6 is  " + q2.cal(6)));
		
		System.out.println( (" The calculation for the sum of the Quadratics = " + q1.sum(q1, q2)));
		
	}

}
 