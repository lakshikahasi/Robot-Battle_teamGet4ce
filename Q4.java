import java.util.Scanner;
public class Q4{
	public static void main(String[] args){
		
		Scanner temperature = new Scanner(System.in);
		System.out.print("Enter the temperature:");
		double t = temperature.nextDouble();
		
		if(t>30)
			System.out.println("Hot");
		else if(t>20 && t<=30)
			System.out.println("warm");
		else if(t>10 && t<=20)
			System.out.println("fine");
		else
			System.out.println("cold");
	}
}
