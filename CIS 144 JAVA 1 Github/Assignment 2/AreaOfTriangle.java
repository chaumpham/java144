import java.util.Scanner; 

public class AreaOfTriangle {
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Receive the input point 1 and point 2
    System.out.print(
      "Enter the coordinates of three points separated by spaces like x1 y1 x2 y2 x3 y3:");
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();
    double x3 = input.nextDouble();
    double y3 = input.nextDouble();

    // Calculate each side of the triangle
    double side1 = Math.pow(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2), 0.5);
    double side2 = Math.pow(Math.pow(x3-x1, 2)+Math.pow(y3-y1, 2), 0.5);
    double side3 = Math.pow(Math.pow(x2-x3, 2)+Math.pow(y2-y3, 2), 0.5);

    // Calculate the area of the triangle
    double s = (side1 + side2 + side3)/2;
    double area = Math.pow(s*(s-side1)*(s-side2)*(s-side3), 0.5);
    area = Math.round(area*10);

    System.out.print(
      "The area of the triangle is" + " " + area/10);
  }
}