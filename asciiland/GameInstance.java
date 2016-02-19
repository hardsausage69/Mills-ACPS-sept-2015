import java.util.*;

public class GameInstance{
    public static void main(String args[]){
        Game g = new Game();
        Scanner console = new Scanner(System.in);
        System.out.println("Input?");
        String input = console.nextLine();
        g.setLineNum(input);
        int lineNum = g.getLineNum();
        g.trim(input);
        int positionA = g.getPositionA();
        int positionB = g.getPositionB();
        g.results(lineNum, positionA, positionB);
    }
}
    