import java.util.*;
public class SR14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner re=new Scanner(System.in);
		double  ib=re.nextDouble();
		double i=re.nextDouble();
//		double kg= ib/0.453592374495299;
//		double m=i*0.025400000025908;
//		double bmi= kg/(m*m);
		double bmi=703*ib/(i*i);
		System.out.println(bmi);

	}

}
