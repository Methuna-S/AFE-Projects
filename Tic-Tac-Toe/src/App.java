import board.Board;
import player.Player1;
import game.Game;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("TIC TAC TOE");
        Board b=new Board(4,'-');
        //b.setDefaultSymbol('#');
        b.printBoardCoding();
        Scanner sc=new Scanner(System.in);
        //System.out.println("Please enter the name of the player: ");
       // String n=sc.nextLine();
       // System.out.println("Please enter the age of the player: ");
        //int age=sc.nextInt();
        Player1 p1=new Player1();
        p1.setPlayerNameAndSymbol("Asha",'X');
        p1.getPlayerNameAndSymbol();
    //    p1.setPlayerDetails("Ravi",'x',"Karnataka","9898878776","ravi@gmail.com",20);
    //     p1.setPlayerDetails(n,'x',"Karnataka","9898878776","ravi@gmail.com",age);
    //     p1.changeSymbol('0');
    //     p1.getPlayerDetail();
        Player1 p2=new Player1();
        p2.setPlayerNameAndSymbol("Ravi",'O');
        p2.getPlayerNameAndSymbol();
        Game g=new Game(new Player1[] {p1,p2},b);
        g.play();
        sc.close();
    }
}
