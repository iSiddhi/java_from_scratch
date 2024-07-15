// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
import java.util.Arrays;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Try programiz.pro");
        int[][] arr= new int[3][3];
        System.out.println(arr.length);
        
        //number of rows input
        for(int row =0; row<arr.length;row++){
            //for each colums in every row
            for(int col = 0;col < arr[row].length;col++){
                //every array at that row that will be equal to lenght of array
                arr[row][col]=sc.nextInt();
                
            }
        }
        //output
        for(int row =0; row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
           
            
        }
    }
}
