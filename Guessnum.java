import java.io.*;
import java.util.Scanner;
public class Guessnum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int mynum=(int)(Math.random()*100);
        int usernum=0;
        do{
            System.out.println("Guess the number......:");
            usernum=sc.nextInt();
            if(usernum == mynum)
            {
                System.out.println("Yahoo You guessed it correctly.....");
                break;
            }
            else if(usernum > mynum)
            {
                System.out.println("Your number is too large");
            }
            else
            {
                System.out.println("Your number is too small");
            }
        }
            while(usernum >=0);
            System.out.println("My number Was:" +mynum);
    }
}