import java.util.*;
public class SR13 {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int y =m/525600;
		int d = (m-(y*525600))/1440;
		System.out.println(m +" minutes is approximately "+y+" years and "+d+" days");
		
	}

}
