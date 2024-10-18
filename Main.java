import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

class Main{

    private static Scanner sc = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        
        while(true){

            System.out.println("_________ Rock Paper Scissor game _________\n");

            String [] choice = {"Rock", "Paper", "Scissors"};

            String userInput = getUserInput(choice);

            int randomIndex = random.nextInt(choice.length);
            String computerChoice = choice[randomIndex];

            System.out.println("Computer Answer : " + computerChoice);

            System.out.println("\n");
            if(userInput.equals("Rock") && computerChoice.equals("Scissors")){
                System.out.println("\tYou Win!");
            }
            else if(userInput.equals("Paper")&& computerChoice.equals("Rock")){
                System.out.println("\tYou Win!");
            }
            else if(userInput.equals("Scissors") && computerChoice.equals("Paper")){
                System.out.println("\tYou Win!");
            }
            else if(userInput.equals("Rock") && computerChoice.equals("Paper")){
                System.out.println("\tComputer Win!");
            }
            else if(userInput.equals("Paper") && computerChoice.equals("Scissors")){
                System.out.println("\tComputer Win!");
            }
            else if(userInput.equals("Scissors") && computerChoice.equals("Rock")){
                System.out.println("\tComputer Win!");
            }
            else{
                System.out.println("\tTie!");
            }
            System.out.println("\n");

            System.out.println("Want to play more? (y/n) : ");
            String askUserWannaPlayAgain = sc.nextLine().trim().toLowerCase();

            if (askUserWannaPlayAgain == "n"){
                break;
            }

        }

    }

    public static String getUserInput(String [] choice){
        while (true) {
                
            try{

                System.out.print("Enter your choice \n 1 - Rock \n 2 - Paper \n 3 - Scissors\n\nAnswer : ");
                String userInput = sc.nextLine().trim();

                if(!Arrays.asList(choice).contains(userInput)){
                    System.out.println("The answer must be Rock, Paper, or Scissors.");
                }
                else{
                    return userInput;
                }

            }
            catch(Exception e){
                e.printStackTrace();
            }

        }
    }

}