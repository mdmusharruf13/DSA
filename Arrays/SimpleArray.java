import java.util.Scanner;
public class SimpleArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		int array[]  = new int[size];

		System.out.println("Enter array elements : ");
		for(int m=0; m<size; m++){
			array[m] = sc.nextInt();
		}

		System.out.println("The array elements are : ");
		for(int m=0; m<size; m++){
			System.out.println(array[m]);
		}
	}
}
