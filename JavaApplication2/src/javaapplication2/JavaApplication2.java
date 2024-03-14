/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author 27672
 */
import java.util.Scanner;
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner phathu=new Scanner(System.in);
        System.out.println("Enter the first number");
        int Num1=phathu.nextInt();
        
        System.out.println("Enter the second number");
        int Num2=phathu.nextInt();
        
        int difference=Num1-Num2;
        
        System.out.println("The total is " +difference);
        
        
        
        
        
    }
    
}
