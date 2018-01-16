package mor;

import java.util.Scanner;

/**
 *
 * @author Bartosz Gajewski
 */

public class Morse {
public static void main(String[] args) 
{
    System.out.println("Type 1 for text to morse, 0 from morse to text.");
    Scanner input = new Scanner(System.in); 
    String myChoice = input.nextLine(); 
    
    System.out.println("Type what you want to decode/encode ");
    String userMessage = input.nextLine();
    System.out.println("");

if("1".equals(myChoice)){
 System.out.println(toMorse(userMessage));}
else if ("0".equals(myChoice)){
     System.out.println(fromMorse(userMessage));
}
else{
    System.out.println("Wrong choice");
}

}

public static String fromMorse(String userMessage)
{
   String s = userMessage;
        System.out.printf("Message: %s\n", s);
        // string with decoded message
        String message = "";

        // sample alphabet string
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] morseAlphabet = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",  
        "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", 
        "...-", ".--", "-..-", "-.--", "--.."};

        // separate on string letters
        String[] letters = s.split(" ");

        // iteration morse letters
        for (String morseAlph : letters)
        {
            char alphabetLetter = '?';

            int index = -1;
            for (int i = 0; i < morseAlphabet.length; i++)
            {
                if (morseAlphabet[i].equals(morseAlph))
                    index = i;
            }

            if (index >= 0) // letter found
                alphabetLetter = alphabet.charAt(index);
            message += alphabetLetter;
        }

    return message;




}

public static String toMorse(String userMessage)
{
    String s = userMessage;
        System.out.printf("Message: %s\n", s);

        String message = "";



        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] morseAlphabet = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",  
        "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", 
        "...-", ".--", "-..-", "-.--", "--.."};


        for (char alphabetLetter : userMessage.toCharArray())
        {
           int index = -1;
           String letter = " ";
            for (int i = 0; i < alphabet.length(); i++)
                {
                    if (alphabet.charAt(i) == alphabetLetter)
                        {
                        index = i;
                        }
                }
            if (index >=0)
                {
                    letter = morseAlphabet[index];
                }
            message += letter + " ";
        }
       System.out.printf("Message: %s\n", message);

    return message;


}
}