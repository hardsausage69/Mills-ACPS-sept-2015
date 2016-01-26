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
    
    int parChange(String input){
        int space = input.indexOf(' ',3);
        String parStr = input.substring(3,space);
        int par = Integer.parseInt(parStr);
        return par;
    }
    
    int persChange(String input){
        input = input.trim();
        int space = input.indexOf(' ',3);
        String persStr = input.substring(space,input.length());
        int pers = Integer.parseInt(persStr);
        return pers;
    }
}
