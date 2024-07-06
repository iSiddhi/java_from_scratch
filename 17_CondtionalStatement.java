// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number 1");

        double number1= scanner.nextDouble();
        scanner.nextLine();
        
        System.out.println("enter the number 2");

        double number2= scanner.nextDouble();
        scanner.nextLine();
        
        System.out.println("what operations do you want to perform");
        String operation = scanner.nextLine();
        if (operation.equals("sum")){
            System.out.printf("%f+%f=%f", number1, number2, number1+number2);
            
        }else{
            System.out.printf("%s is not a supportive operation",operation);
        }
        
        
        // System.out.println(number1);
        // System.out.println(number2);



        
        System.out.println("Try programiz.pro");
    }
}
