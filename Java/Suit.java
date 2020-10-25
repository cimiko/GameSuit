import java.util.Random;

public class Suit {
    public static void main(String[] args) {
        
        String player = "batu";

        String[] suit = {"batu","gunting","kertas"};
        int rd = new Random().nextInt(suit.length);
        String computer = suit[rd];
    
        if(player == "batu" && computer == "gunting"){
            System.out.println("\nPlayer is: BATU");
            System.out.println("Computer is: " + computer + "\n");

            System.out.println("Player is WINNER!\n");
        }else if(player == "batu" && computer == "kertas"){
            System.out.println("\nPlayer is: BATU");
            System.out.println("Computer is: " + computer + "\n");

            System.out.println("Computer is WINNER!\n");
        }else if(player == "batu" && computer == "batu"){
            System.out.println("\nPlayer is: BATU");
            System.out.println("Computer is: " + computer + "\n");

            System.out.println("Player and Computer is DRAW!\n");
        }else if(player == "gunting" && computer == "kertas"){
            System.out.println("\nPlayer is: Gunting");
            System.out.println("Computer is: " + computer + "\n");

            System.out.println("Player is WINNER!\n");
        }else if(player == "gunting" && computer == "batu"){
            System.out.println("\nPlayer is: Gunting");
            System.out.println("Computer is: " + computer + "\n");

            System.out.println("Computer is WINNER!\n");
        }else if(player == "gunting" && computer == "gunting"){
            System.out.println("\nPlayer is: Gunting");
            System.out.println("Computer is: " + computer + "\n");

            System.out.println("Player and Computer is DRAW!\n");
        }else if(player == "kertas" && computer == "kertas"){
            System.out.println("\nPlayer is: Kertas");
            System.out.println("Computer is: " + computer + "\n");

            System.out.println("Player and Computer is DRAW!\n");
        }else if(player == "kertas" && computer == "gunting"){
            System.out.println("\nPlayer is: Kertas");
            System.out.println("Computer is: " + computer + "\n");

            System.out.println("Computer is WINNER!\n");
        }else if(player == "kertas" && computer == "batu"){
            System.out.println("\nPlayer is: Kertas");
            System.out.println("Computer is: " + computer + "\n");

            System.out.println("Player is WINNER!\n");
        }else{
            System.out.println("Please Input your Choice!!");
        }
        

    }
}