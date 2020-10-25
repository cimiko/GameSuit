import java.util.Random;

public class SuitCml {
    public static void main(String[] args) {
        String[] suit = {"batu","gunting","kertas"};
        int rd = new Random().nextInt(suit.length);
        String computer = suit[rd];

        System.out.println("\nMohon isi (batu,gunting,kertas) dengan menggunakan huruf kecil. thx!!");
        System.out.println("Contoh: java SuitCml batu \n");


        switch (args[0]) {
            case "batu":
                if(computer == "gunting"){
                    System.out.println("\nPlayer is: BATU");
                    System.out.println("Computer is: " + computer + "\n");

                    System.out.println("Player is WINNER!\n");
                }else if(computer == "kertas"){
                    System.out.println("\nPlayer is: BATU");
                    System.out.println("Computer is: " + computer + "\n");

                    System.out.println("Computer is WINNER!\n");
                }else if(computer == "batu"){
                    System.out.println("\nPlayer is: BATU");
                    System.out.println("Computer is: " + computer + "\n");

                    System.out.println("Player and Computer is DRAW!\n");
                }
                break;
            case "gunting":
                if(computer == "kertas"){
                    System.out.println("\nPlayer is: Gunting");
                    System.out.println("Computer is: " + computer + "\n");

                    System.out.println("Player is WINNER!\n");
                }else if(computer == "batu"){
                    System.out.println("\nPlayer is: Gunting");
                    System.out.println("Computer is: " + computer + "\n");

                    System.out.println("Computer is WINNER!\n");
                }else if(computer == "gunting"){
                    System.out.println("\nPlayer is: Gunting");
                    System.out.println("Computer is: " + computer + "\n");

                    System.out.println("Player and Computer is DRAW!\n");
                }
                break;
            case "kertas":
                if(computer == "batu"){
                    System.out.println("\nPlayer is: Kertas");
                    System.out.println("Computer is: " + computer + "\n");

                    System.out.println("Player is WINNER!\n");
                }else if(computer == "gunting"){
                    System.out.println("\nPlayer is: Kertas");
                    System.out.println("Computer is: " + computer + "\n");

                    System.out.println("Computer is WINNER!\n");
                }else if(computer == "kertas"){
                    System.out.println("\nPlayer is: Kertas");
                    System.out.println("Computer is: " + computer + "\n");

                    System.out.println("Player and Computer is DRAW!\n");
                }
                break;
        
            default:
                System.out.println("Mohon isi (batu,gunting,kertas) dengan menggunakan huruf kecil. thx!!");
                break;
        }
    }
}