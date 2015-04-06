import java.io.Console;
 
public class Introductions {
  
    public static void main(String[] args) {
        Console console = System.console();
        // Welcome to the Introductions program!  Your code goes below here
        String firstName = console.readLine("What is your name?  ");
        String lastName = console.readLine("What is your last name?  ");
        //thisIsAnExampleOfCamelCasing
        console.printf("Hello, my name is %s\n", firstName);
        console.printf("%s is learning how to write Java\n", firstName);

        console.printf("Hello, my last name is %s\n", lastName);
        
  }
}
