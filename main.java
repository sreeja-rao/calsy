import java.util.Scanner;

public class Calsy {

    static int a;
    static int b;


    private static void Addition() {
        int add= Math.addExact(a, b);
        System.out.println("Addition: " + add);
    }

    private static void Subtraction() {
        int sub = Math.subtractExact(a, b);
        System.out.println("Subtraction: "+sub); 
    }

    private static void Multiplication() {
        int mul = Math.multiplyExact(a, b);
            System.out.println("Multiplication: "+mul);
        
    }

    private static void Division() {
        double div = Math.floorDiv(a, b);
            System.out.println("Division: "+div);
        
    }

    private static void Modulo() {
        int mod = Math.floorMod(a, b);
            System.out.println("Modulo: "+mod);
        
    }

    private static void Power() {
        double power = Math.pow(a, b);
            System.out.println("Power: "+power);
        
    }

    private static void Square_or_cuberoot() {
        double sqa = Math.sqrt(a);
        double cub = Math.cbrt(b);
        System.out.println("Sq root of a: "+sqa +"Cube root of b: "+cub);
    }

    private static void odd_or_even() {
        String num1 = (a % 2 == 0) ? " a is even" : "a is odd";
        System.out.println(num1); //expression condition

        String num2 = (b % 2 == 0) ? "b is even" : "b is odd";
        System.out.println(num2); 
        
    }

   

    public static void main(String[] args) {
       
        System.out.println("Welcome, I am Calsy");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        a = sc.nextInt(); //input

        System.out.println("Enter 2nd number: ");
        b = sc.nextInt(); 
        
       
        System.out.println("0. Exit" +"\n"+ "1. Addition" +"\n"+ "2. Subtraction" +"\n"+
        "3. Multiplication" +"\n"+ "4. Division" +"\n"+ "5. Modulo" +"\n"+
        "6. Power" +"\n"+ "7. Square root/Cube root" +"\n"+ "8. Odd/Even");

        System.out.println("Enter ur choice >>>");
        int sw = sc.nextInt();

        switch(sw) {
            case 0:
                    System.exit(0);
                    break;
            case 1:
                    Addition();
                    break;
            case 2:
                    Subtraction(); 
                    break;
            case 3:
                    Multiplication();
                    break;
            case 4:
                    Division();
                    break;
            case 5:
                    Modulo();
                    break;
            case 6:
                    Power();
                    break;
            case 7:
                    Square_or_cuberoot();
                    break;
            case 8:
                    odd_or_even();
                    break;
            default:
                    System.out.println("invalid choice");
                    break;
        
        }

        
       sc.close();
    }

    
}
