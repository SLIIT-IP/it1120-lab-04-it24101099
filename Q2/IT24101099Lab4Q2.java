import java.util.Scanner;
public class IT24101099Lab4Q2{
    public static void main(String[]args){
       double examMarks, labMarks, examPercentage, labPercentage,finalMarks,addPerc;

       //create an object called inputto the scanner class
       Scanner input = new Scanner(System.in);

      //input all exam marks
      System.out.println("Please enter exam marks (out of 100):");
      examMarks = input.nextDouble();
      System.out.println("please enter lab submission marks(out of 100):");
      labMarks = input.nextDouble();
      System.out.println("please enter the percentage given for the lab submission:");
      examPercentage = input.nextDouble();
      System.out.println("please enter the percentage given for the lab submission:");
      labPercentage = input.nextDouble();

      addPerc = examPercentage + labPercentage;

      if((labMarks <= 100 || labMarks >= 0) && (examMarks <= 100 || examMarks <= 100 || examMarks >= 0) && addPerc == 100){
    
          //Calculation
          finalMarks =((examMarks*examPercentage/100) + (labMarks*labPercentage/100));
          //Display final marks
          System.out.println("The finalMarks is:"+finalMarks);
      }

      else if (examMarks < 0 || examMarks > 100)
      {
          System.out.println("Invalid input for exam marks. terminating program.");
      }
      else if (labMarks < 0 || labMarks > 100)
      {
          System.out.println("Invalid input for lab subbmission marks. terminating program.");
      }
      else if (addPerc > 100)
      {
          System.out.println("The perecentages must add up to 100. terminating program.");
      } 
   }
}
          
          
        
      
      
      
            
      
     