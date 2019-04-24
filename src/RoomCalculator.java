import java.util.Scanner;

public class RoomCalculator {

	public static void main(String[] args) {
		
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		float length, width, height = 0, area, perimeter, volume;

		// Create scanner class object
		Scanner in = new Scanner(System.in);
		// while (some condition is happening) {
		// Input length and width of rectangle
		System.out.print("Enter length of Snug Room: ");
		length = in.nextFloat();

		System.out.print("Enter width of Snug Room: ");
		width = in.nextFloat();

		System.out.print("Enter height of Snug Room: ");
		height = in.nextFloat();

		// Calculate perimeter of rectangle
		perimeter = 2 * (length + width);

		// Calculate area of rectangle
		area = length * width;

		// Calculate volume of rectangle
		volume = length * width * height;

		// Print perimeter and area of rectangle
		System.out.println("Perimeter of Snug Room is " + perimeter + " feet.");
		System.out.println("Area of Snug Room is " + area + " sq. feet.");
		System.out.println("Volume of Snug Room is " + volume + " cubic feet.");
		
		// 
		}
		
	}
	

}
