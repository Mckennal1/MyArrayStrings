import java.util.Scanner;

/*
 * Author: Luisa McKenna
 * Problem by: HackerRank
 * 
 * User provides an integer, n, for which the pyramid will grow with a height n 
 */
public class MyGrowingPyramid {
	
	public static void growingPyramid(int n){
		for(int i = 1; i<=n; i++){//loops through the height of n
			for(int j= 0; j<i; j++){//loops through and prints the appropriate number of *
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String []args){
		System.out.println("Please provide an integer n to which will output a pyramid with height n");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
		growingPyramid(a);
	}
}
