public class Main {
    public static void main(String[] args) {
        // --- CASE 1 ---
        double num1 = 25;
        double num2 = 15;
        String op1 = "Add";

        System.out.println("Case 1");
        System.out.println("-----------------------------------------");
        System.out.println("              Simple Calculator");
        System.out.println("-----------------------------------------");
        System.out.println("First Number : " + (int)num1);
        System.out.println("Second Number : " + (int)num2);
        System.out.println("Click : " + op1);

        calculateAndDisplay(num1, num2, op1);

        System.out.println(); // Space between cases

        // --- CASE 2 ---
        double num3 = 18;
        double num4 = 6;
        String op2 = "Divide";

        System.out.println("Case 2");
        System.out.println("-----------------------------------------");
        System.out.println("              Simple Calculator");
        System.out.println("-----------------------------------------");
        System.out.println("First Number : " + (int)num3);
        System.out.println("Second Number : " + (int)num4);
        System.out.println("Click : " + op2);

        calculateAndDisplay(num3, num4, op2);
    }

    private static void calculateAndDisplay(double a, double b, String operation) {
        double result = 0;
        boolean valid = true;

        switch (operation.trim().toLowerCase()) {
            case "add":
                result = a + b;
                break;
            case "sub":
            case "subtract":
                result = a - b;
                break;
            case "mul":
            case "multiply":
                result = a * b;
                break;
            case "div":
            case "divide":
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("\nResult : Cannot divide by zero");
                    valid = false;
                }
                break;
            default:
                System.out.println("\nResult : Invalid Operation");
                valid = false;
        }

        if (valid) {
            System.out.println("\nResult : " + result);
        }
    }
}
