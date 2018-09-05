
package tarea.pkg9.juego;
import java.util.Scanner;
/**
 *
 * @author Carlos Anthony Cardenas Segovia 1837543
 */
public class Tarea9Juego {


    private static double keepPlaying;
    private static double resp;
    
    public static void main(String[] args){
        StartGame();
    }
    
    public static void StartGame(){
        do{
        System.out.flush();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What you prefer? \n1. Rock\n2. Paper\n3. Scissors");
        setResp(scanner.nextInt());
        scanner.nextLine();
        double compu = Math.ceil(Math.random() * 3);
        System.out.println("**************************************");
        System.out.println("You: " + ChecarOpcion(getResp()) + " ********** A.I.: " + ChecarOpcion(compu));
        WhoWon(getResp(), compu);
        System.out.println("**************************************");
        System.out.println("Would you like to play again? \n1. Yas!\n2. Nope");
        setKeepPlaying(scanner.nextInt());
        }while(getKeepPlaying() == 1);
        System.out.flush();
        System.out.println("Bye!");
    }
    
    public static String ChecarOpcion(double opcion){
        String palabra = "";
        if(opcion == 1){
            palabra = "Rock";
        }
        
        if(opcion == 2){
            palabra = "Paper";
        }
        
        if(opcion == 3){
           palabra = "Scissors";
        }
        return palabra;
    }
    
    public static void WhoWon(double you, double comp){
        
        if(you == comp){
             System.out.println("Tie! :O");
        }
        
        if(you == 1 && comp == 3){
             System.out.println("You won! :D");
        }
        
        if(you == 2 && comp == 1){
             System.out.println("You won! :D");
        }
        
         if(you == 3 && comp == 2){
             System.out.println("You won! :D");
        }
         
          if(you == 3 && comp == 1){
             System.out.println("You lost :C");
        }
        
        if(you == 1 && comp == 2){
             System.out.println("You lost :C");
        }
        
         if(you == 2 && comp == 3){
             System.out.println("You lost :C");
        }
         
    }

    public static double getResp() {
        return resp;
    }

    public static void setResp(double aResp) {
        resp = aResp;
    }

  
    public static double getKeepPlaying() {
        return keepPlaying;
    }


    public static void setKeepPlaying(double aKeepPlaying) {
        keepPlaying = aKeepPlaying;
    }

}
