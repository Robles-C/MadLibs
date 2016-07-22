import java.io.Console;
 
public class madlibs {
    
    public static void main(String[] args) {
        Console console = System.console();
      String ageAsString = console.readLine("How old are you?  ");
      //above, String data type number is entered
      int age = Integer.parseInt(ageAsString);
      //above, Integer.parseInt(ageAsString); changes the String datatype into an int datatype
      if( age < 13){
        console.printf("Sorry you must be 13 or older to use this program \n");
        System.exit(0);
      }
        String name = console.readLine("Enter a name:  ");
String adjective = console.readLine("Enter an adjective:  ");
      String noun;
      boolean isInvalidWord;
      //variable declared above
      do{
        //above, used for repeating while whatever in the while params is happening
noun = console.readLine("Enter a noun:  ");
        //variable used
        isInvalidWord = (noun.equalsIgnoreCase("dork") ||
         noun.equalsIgnoreCase("jerk"));
      if (isInvalidWord){
 console.printf("That language is not allowed.  Try again. \n\n");
        
      };
        }while(isInvalidWord);
String adverb = console.readLine("Enter an adverb:  ");
String verb = console.readLine("Enter a verb ending with -ing:  ");
      
      console.printf("Your TreeStory:\n-----------------\n");
      console.printf("%s is a %s %s.  ", name, adjective, noun);
      console.printf("They are always %s %s.\n", adverb, verb);
    
    }
    
}