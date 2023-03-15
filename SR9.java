
public class SR9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(101+0);
		int b= 3;
		int c= a/b;
		System.out.println(a+"/"+b+"->"+c);
		
		double d= 3.0e-6*10000000.1;
		System.out.println("3.0e-6*10000000.1 ->"+d);
		
		boolean e= true;
		boolean f= false;
		System.out.println("(true && true)->"+ (e && e));
    	System.out.println("(false && true)->"+(f && e));
    	System.out.println("(false && false)||(true && true)->"+((f&&f)|| (e&&e)));
    	System.out.println("(false || false)&&(true && true) ->"+((f||f)&&(e&&e)));
    	
		

	}

}
