import java.io.Console;

	public class TreeStory {

		public static void main(String[] args){
			Console console = System.console();
			/* This is how you can enter multiple lines of comments
			   Now you can start enetering code here

			*/

			String ageAsString = console.readLine("How old are you?  ");   
			int age = Integer.parseInt(ageAsString);
			if (age < 13) {
				//Insert exit code
				console.printf("Sorry you must be at least 13 to use this program.\n");
				System.exit(0);
			}   
			String name = console.readLine("Enter your name:  ");
			String whereAreYouFrom = console.readLine("whereAreYouFrom:  ");
			if (whereAreYouFrom.equals("North Korea")) {	
				console.printf("That is not the correct country.  Exiting.  \n \n");
				System.exit(0);
			}
			String work = console.readLine("Where do you work:  ");
			String learning = console.readLine("What are you learning:  "); 
			String team = console.readLine("What is the name of your team:  ");

			console.printf("\n");
			console.printf("Your TreeStory:\n---------------\n");
			console.printf("%s is very smart and he is from %s. \nHe Works at %s and he is currently learning %s in order to help his team %s.\n ", name, whereAreYouFrom, work, learning, team);
			console.printf("\n");

		}
	}
