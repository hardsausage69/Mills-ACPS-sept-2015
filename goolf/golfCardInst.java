import java.util.*;

class golfCardInst{
    public static void main(String[] args){
        golfCard g = new golfCard();
        Scanner console = new Scanner(System.in);
        System.out.println("How many holes?");
        int holesIn = console.nextInt();
        System.out.println("Scores per hole? (<hole number>. <par> <your score>)");
        g.calcScore(holesIn);
    }
}