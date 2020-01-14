// MAGIC 8-BALL PROJECT
//Created as part of Codecademy - Java Projects
//Outputs your fortune in the console.

//E.Cope (Jan. 2020)

import java.util.Random;

public class Magic8 {
  
  public static void main(String args[]){
    
    System.out.println("----- Welcome to the Magic 8 Ball! -----\n");
    System.out.println("Ask me anything! Your fortune is . . . \n");
     
    Random randy = new Random();
    String result = "";
  
    //answer determining number
    int roll = randy.nextInt(10); //generates nums btw 0-9
    
    switch(roll){ 
            
          case 0:
            result = "Without a doubt.";
            break;
          case 1: 
            result = "It is decidedly so."; 
            break; 
          case 2: 
            result = "It is certain."; 
            break; 
          case 3: 
            result = "Yes - definitely."; 
            break; 
          case 4: 
            result = "Reply hazy, try again.";
            break; 
          case 5: 
            result = "Concentrate and ask again.";
            break; 
          case 6: 
            result = "Outlook not so good.";
            break; 
          case 7: 
            result = "Very doubtful."; 
            break;
          case 8: 
            result = "Ask again later."; 
            break; 
          case 9: 
            result = "Don't count on it."; 
            break; 
        }//end switch
    
        System.out.println(result); 
    
    }//end main
    
}//end Magic8 class
  
