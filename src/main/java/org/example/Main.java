class Division {
    public static double divide(double a, double b) {
        return a / b;
    }
}
class Multiplication {
    public static double multiply(double a, double b) {
        return a * b;
    }
}
public class Main {
    public static void main(String[] args) {
        double a = 10;
        double b = 5;
        double result1 = Division.divide(a, b);
        System.out.println("Результат деления: " + result1);
        double result2 = Multiplication.multiply(a, b);
        System.out.println("Результат умножения: " + result2);
    }
}
