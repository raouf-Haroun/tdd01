package fr.p10.miage.rps.model;


public class RockPaperScissors {
    public RockPaperScissors() {
    }

    public Result play(RPSEnum p1, RPSEnum p2){
        if(p1 == RPSEnum.PAPER) {
            if (p2 == RPSEnum.PAPER)
                return null;
            else if (p2 == RPSEnum.ROCK)
                return Result.WIN;
            else
                return Result.LOST;
        }else if(p1 == RPSEnum.ROCK){
            if (p2 == RPSEnum.PAPER)
                return Result.LOST;
            else if (p2 == RPSEnum.ROCK)
                return null;
            else
                return Result.WIN;
        }else{
            if (p2 == RPSEnum.PAPER)
                return Result.WIN;
            else if (p2 == RPSEnum.ROCK)
                return Result.LOST;
            else
                return null;
        }
    }
}
