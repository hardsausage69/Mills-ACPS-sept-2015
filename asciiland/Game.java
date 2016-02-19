public class Game{
    private int positionA = 0;
    private int positionB = 0;
    private int lineNum;
    
    public void setLineNum(String input){
        lineNum = input.charAt(6) - '0';
    }
    
    public int getLineNum(){
        return lineNum;
    }

    //cut out the Line # stuff and all the commas
    public void trim(String input){
        input = input.substring(9);
        input = input.replaceAll("," , "");
        setPlayerPos(input);
    }
    
    //assign values to each player
    public void setPlayerPos(String input){
        positionA += input.charAt(0) - '0';
        for(int i = 1; i < input.length(); i++){
            if(i % 2==1){
                positionB += input.charAt(i) - '0';
            } else {
                positionA += input.charAt(i) - '0';
            }
            if(input.charAt(i) == '0'){
                i = input.length();
            }
            if(positionA >= 39 || positionB >= 39){
                i = input.length();
            }

        }
    }
    
    public int getPositionA(){
        return positionA;
    }
    
    public int getPositionB(){
        return positionB;
    }
        
    public void results(int lineNumber, int positionA, int positionB){
        if (positionA >= 39){
            System.out.println("Output #" + lineNumber + ": A-END, B-" + positionB);
        }else if (positionB >= 39){
            System.out.println("Output #" + lineNumber + ": A-" + positionA + ", B-END");  
        } else {
            System.out.println("Output #" + lineNumber + ": A-" + positionA + ", B-" + positionB);
        }
    }
}