import player.Player;
import boardd.Board;
import dice.Dice;
import jump.Jumper;
import game.Game;
import coordinates.Coordinates;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Dice dice=new Dice();
        System.out.println(dice.diceRoll());
        Coordinates c1=new Coordinates(4,6);
        //System.out.println(c.printCoordinates());
        Coordinates c2=new Coordinates(5,8);
        //System.out.println(c.printCoordinates());
        Jumper j=new Jumper(c1,c2);
        System.out.println(j.getJumperName());
        HashMap<String,Jumper> map=new HashMap<>();
        map.put("6",new Jumper(new Coordinates(9,5),new Coordinates(6,6)));
        map.put("97",new Jumper(new Coordinates(0,1),new Coordinates(9,9)));
        map.put("21",new Jumper(new Coordinates(7,0),new Coordinates(0,9)));
        map.put("64",new Jumper(new Coordinates(3,3),new Coordinates(7,4)));
        Player p1=setplayerDetailsFromUserInput();
        p1.getPlayerDetails();
        Player p2=setplayerDetailsFromUserInput();
        p2.getPlayerDetails();
        Board b=new Board(10,map);
        b.printBoard();
        Game game=new Game(b,new Player[] {p1,p2},new Dice());
        game.play();
    }
    public static Player setplayerDetailsFromUserInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the player details");
        System.out.println("Enter the player name: ");
        String name=sc.nextLine();
        System.out.println("Enter the player contact number: ");
        String contactNo=sc.nextLine();
        System.out.println("Enter the player email: ");
        String email=sc.nextLine();
        System.out.println("Enter the player address: ");
        String address=sc.nextLine();
        System.out.println("Enter the player age: ");
        int age=sc.nextInt();
        Player p=new Player();
        p.setPlayerDetails(name, address, contactNo, email, age);
        return p;
    }
}
