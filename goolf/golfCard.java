import java.util.*;

class golfCard{
    int persScore = 0;
    int parScore = 0;
    
    void calcScore(int holesIn){
        Scanner console = new Scanner(System.in);
        for (int hole = 0; hole < holesIn; hole++){
            String golfIn = console.nextLine();
            int par = parChange(golfIn);
            int pers = persChange(golfIn);
            compareParPers(hole, par, pers);
            persScore = persScore + pers;
            parScore = parScore + par;
        }
        int overall = parScore - persScore;
        endResult(overall, holesIn);
    }
    
    void compareParPers(int hole,int par,int pers){
        int diff = par - pers;
        if (diff == 0){
            System.out.println("par");
        } else if (diff == 1){
            System.out.println("birdie");
        } else if (diff == 2){
            System.out.println("eagle");
        } else if (diff == -1){
            System.out.println("bogey");
        } else if (diff == -2){
            System.out.println("double bogey");
        } else {
            System.out.println("You're trash. Try harder.");
        }
    }
    
    int parChange(String input){
        int space = input.indexOf(' ',3);
        String parStr = input.substring(3, space);
        int par = Integer.parseInt(parStr);
        return par;
    }
    
    int persChange(String input){
        input = input.trim();
        int space = input.indexOf(' ',3);
        String persStr = input.substring(space + 1);
        int pers = Integer.parseInt(persStr);
        return pers;
    }
    
    void endResult(int overall, int holesIn){
        if (overall == 0){
            System.out.println("par");
        } else if (overall > 0){
            System.out.println(overall + " under par");
        } else {
            System.out.println(Math.abs(overall) + " over par");
        }
    }
}
