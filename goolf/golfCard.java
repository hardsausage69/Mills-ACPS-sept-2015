import java.util.*;

class golfCard{
    int persScore = 0;
    int parScore = 0;
    void compareParPers(int hole,int par,int pers){
        int diff = par - pers;
        if (diff == 0){
            System.out.println(hole + ". par");
        } else if (diff == 1){
            System.out.println(hole + ". birdie");
        } else if (diff == 2){
            System.out.println(hole + ". eagle");
        } else if (diff == -1){
            System.out.println(hole + ". bogey");
        } else if (diff == -2){
            System.out.println(hole + ". double bogey");
        } else {
            System.out.println("You're trash. Try harder.");
        }
    }
}

class golfCardInst{

    public static void main(String[] args){
        golfCard g = new golfCard();
        Scanner console = new Scanner(System.in);
        System.out.println("How many holes?");
        int holesIn = console.nextInt();
        System.out.println("Scores per hole? (<hole number>. <par> <your score>)");
        for (int hole = 0; hole < holesIn; hole++){
            String golfIn = console.nextLine();
            int par = parChange(golfIn);
            int pers = persChange(golfIn);
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

    public static int parChange(String input){
        int space = input.indexOf(' ',3);
        String parStr = input.substring(3,space);
        int par = Integer.parseInt(parStr);
        return par;
    }

    public static int persChange(String input){
        input = input.trim();
        int space = input.indexOf(' ',3);
        String persStr = input.substring(space,input.length());
        int pers = Integer.parseInt(persStr);
        return pers;
    }
}