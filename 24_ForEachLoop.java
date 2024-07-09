// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
public class Input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int[] Fruits= new int[3];
    //   System.out.println("which fruits you want to buy");
       
    //   input using for loops
    for(int i =0;i<Fruits.length;i++){
    Fruits[i]= sc.nextInt();
    
        
    }
    for(int j: Fruits){
        // for every element in array print the element
        System.out.println(j+ " ");
        // here j represents elements of the array}
    }
        
        
        
        
        
    }
}
