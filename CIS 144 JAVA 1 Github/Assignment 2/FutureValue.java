import java.util.Scanner; 

public class FutureValue {
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Obtain input values
    System.out.print(
      "Enter investment amount: ");
    double investmentAmount = input.nextDouble();
    
    System.out.print(
      "Enter annual interest rate in percentage: ");
    double annualInterestRate = input.nextDouble();
    double monthlyInterestRate = annualInterestRate/1200;

    System.out.print(
      "Enter number of years: ");
    int numberOfYears = input.nextInt();

    // Calculate Future Investment Value
    double futureInvestmentValue = investmentAmount*Math.pow(1+monthlyInterestRate, numberOfYears*12);
    futureInvestmentValue = Math.round(futureInvestmentValue*100);
    
    System.out.print(
      "Future value is" + " " + futureInvestmentValue/100);
  }
}