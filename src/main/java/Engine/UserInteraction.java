package Engine;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserInteraction {
    private static Scanner sc = new Scanner(System.in);
    private static GamePlay gameplay;
    private static boolean play = true;
    public static void main(String[] args) throws FileNotFoundException {
        gameplay = new GamePlay();
        while(play){
            playGame(gameplay.getNodes().get(0).getId());
        }
    }
    public static void playGame(String nodeId){
        Node node = gameplay.getNode(nodeId);
        System.out.println(node.getDescription()+ "\n"+node.getQuestion() +"\nPRESS [y:YES] [n:NO] [e:EXIT GAME]");
        switch(sc.nextLine().toLowerCase()){
            case "y": playGame(node.getYesId());
                break;
            case "n": playGame(node.getNoId());
                break;
            case "e": exit();
                break;
            default: playGame(nodeId);
        }
    }

    public static void exit(){
        play = false;
        System.out.println("EXIT!");
    }
}
