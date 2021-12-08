import java.util.Scanner; 

public class Acceleration {
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Receive the input starting and ending velocity
    System.out.print(
      "Enter a starting velocity in double:");
    double v0 = input.nextDouble();
    System.out.print(
      "Enter an ending velocity in double:");
    double v1 = input.nextDouble();
    System.out.print(
      "Enter a time span in double:");
    double t = input.nextDouble();

    // Calculate average acceleration
    double a = (v1-v0)/t;
    a = Math.round(a*10000);

    System.out.print(
      "The average acceleration is" + " " + a/10000);
  }
}