package encode;

import java.util.Scanner;

public class run{
    public static void main(String[] args) {
        //Initate Variables
        String input;
        String output; 
        String lang;
        Character yn;
        Boolean cont = false;
        final Scanner in = new Scanner(System.in);
        
        do{
          //Ask for Language
          System.out.println("What language do you want to use? NL, EN");
          lang = in.nextLine();

          //Check if they want to use the language they chose
          System.out.println("Are you sure you wish to use " + lang + " as your language? Y or N");
          yn = in.nextLine().charAt(0);

          if(yn.equals('Y')){
            cont = true;
          }else if(yn.equals('N')){
            System.out.println("Try again.");
          }else{
            System.out.println("You have not entered a correct input. Try again");
          }
        }while(cont == false);
        

        in.close();
      }
}