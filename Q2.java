import java.util.Scanner;
public class Q2{
	public static void main(String[] args){
		int i,j,k;
		
		Scanner p = new Scanner(System.in);
		System.out.print("Enter number of rows for * phyramid:");
		int x=p.nextInt();
		
		for(i=1;i<x+1;i++){
			for(j=x-i;j>0;j--){
				System.out.print(" ");
			}
			for(k=i;k>0;k--){
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
}

