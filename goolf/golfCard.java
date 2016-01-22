class golfCard{
    int cumScore = 0;
    int parScore = 0;
}

class golfCardInst{
    golfCard g = new golfCard();
    void acumScore(){
        g.cumScore = g.cumScore; 
    }
}