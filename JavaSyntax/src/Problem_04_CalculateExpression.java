import java.util.Scanner;

public class Problem_04_CalculateExpression {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double tokensAverage = (a + b + c) / 3;
        double formulaeAverage = ((firstFormulaCalculation(a, b, c) + secondFormulaCalculation(a, b, c)) / 2);
        double averagesDifference = tokensAverage - formulaeAverage;

        String formatted = String.format("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",
                firstFormulaCalculation(a,b,c),
                secondFormulaCalculation(a,b,c),
                Math.abs(averagesDifference));

        System.out.println(formatted);
    }

    private static double secondFormulaCalculation(double a, double b, double c) {

        double base = (a*a + b*b - c*c*c);
        double exponent = a - b;
        double result  = Math.pow(base, exponent);

        return result;
    }

    private static double firstFormulaCalculation(double a, double b, double c) {

        double base = (a*a + b*b) / (a*a - b*b);
        double exponent = (a + b + c) / Math.sqrt(c);
        double result = Math.pow(base, exponent);

        return result;
    }
}
