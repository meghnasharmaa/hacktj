//Meghna Sharma 2/20/2018
   import java.io.*;      //the File class
   import java.util.*;    //the Scanner class
   import javax.swing.JOptionPane;
    public class Driver08
   {
       public static void main(String[] args) throws Exception
      {
         int s = 0; 
         //puts words.txt in wordList
         Scanner infile = new Scanner( new File("words.txt") );
      	String[] wordList = new String[infile.nextInt()];
      	for(int x = 0; x < wordList.length; x ++)
         {
            wordList[x] = infile.next();
         }         
         infile.close();
         
         while(true)
         {
            String myWord = JOptionPane.showInputDialog("Word? (Type -1 to quit:)");
            if(myWord.equals("-1"))
            {
               System.out.println("Good-bye.");
               break;
            }
            else
            {
               for(int x = 0; x < wordList.length; x ++)
               {
                  if(wordList[x].equals(myWord))
                  {
                     System.out.println("Yes, " + myWord + " is a word, #" + x + 1 + ".");
                     s = 0;
                     break;
                  }                  
                  else 
                  {
                     s = 1;
                  }
               }
               //if (x == (wordList.length - 1))
               if (s == 1)
               {
                      System.out.println("Sorry, " + myWord + " is not a word.");
               }
            }
         }
      }
   }

       

 