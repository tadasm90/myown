package test;

public class GravityCalculator {
	
	public static void main(String[] arguments){
		double gravity =-9.81; // Earth's gravity in m/s^2
		int fallingTime = 10;
		double initialVelocity = 0.0;
		double finalVelocity = sum(multi(gravity, fallingTime), initialVelocity); 
		double initialPosition = 0.0;
		double finalPosition = sum(sum(multi(0.5, multi(gravity, power(fallingTime))), multi(initialVelocity, fallingTime)), initialPosition);
		// Add the formulas for position and velocity
		
		// Add output line for velocity (similar to position)
		outline(finalPosition, finalVelocity, fallingTime);
		}
	
	public static double multi(double first, double second){
		return first*second;
	}
	
	public static double power(double number){
		return number*number;
	}
	
	public static double sum(double first, double second){
		return first+second;
	}
	
	public static void outline(double finalPosition, double finalSpeed, int time){
		System.out.printf("The object's position after %d seconds is %.02f m. \n", time, finalPosition);
		System.out.printf("The object's speed after %d seconds is %.02f m/s.", time, finalSpeed);
		
	}

}
