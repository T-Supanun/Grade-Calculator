/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4Assign;
import java.util.Scanner;
/**
 *
 * @author supanuntinbaanmai
 */
public class Assignment4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //Create Objesct
        System.out.print("Enter your score : ");
        int score = sc.nextInt();
        
        if(score >= 0 && score <= 100){
            if(score >= 0 && score <= 49){
                System.out.println("Grade F");
            }
            else if(score >= 50 && score <= 59){
                System.out.println("Grade D");
            }
            else if(score >= 60 && score <= 69){
                System.out.println("Grade C");
            }
            else if(score >= 70 && score <= 79){
                System.out.println("Grade B");
            }
            else{
                System.out.println("Grade A");
            }
        }
    }
}
