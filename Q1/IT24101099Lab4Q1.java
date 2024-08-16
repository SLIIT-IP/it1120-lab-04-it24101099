import java.util.Scanner;
public class IT24101099Lab4Q1{
   public static void main(String[] args){
   
      //declare variable
      int num;

     //creat object
     Scanner input = new Scanner(System.in);
  
     //take input
     System.out.println("Enter the number");
     num = input.nextInt();

     //check positive or negative
     if(num>0){
       System.out.println("positive");
    }else if(num<0){
       System.out.println("Negative");
    }else{
       System.out.println("The number is zero"); 
    }
  }
}
