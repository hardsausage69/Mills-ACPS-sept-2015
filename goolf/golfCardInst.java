import java.util.*;

class golfCardInst{
    public static void main(String[] args){
        golfCard g = new golfCard();
        Scanner console = new Scanner(System.in);
        System.out.println("How many holes?");
        int holesIn = console.nextInt();
        System.out.println("Scores per hole? (<hole number>. <par> <your score>)");
        for (int hole = 0; hole < holesIn; hole++){
            String golfIn = console.nextLine();
            int par = g.parChange(golfIn);
            int pers = g.persChange(golfIn);
            g.compareParPers(hole,par,pers);
            g.persScore = g.persScore + pers;
            g.parScore = g.parScore + par;
        }
        int overall = g.parScore - g.persScore;
        if (overall == 0){
            System.out.println(holesIn + ". par");
        } else if (overall > 0){
            System.out.println(holesIn + ". " + overall + "under par");
        } else {
            System.out.println(holesIn + ". " + Math.abs(overall) + "over par");
        }
    }
}