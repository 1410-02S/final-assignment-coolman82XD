import java.util.*;

public abstract class Creature {
    boolean Nourished = true;
    int dieBound = 120;
    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    int yearBorn;

    public Creature(int ageOfWorld) {
        yearBorn = ageOfWorld;
    }

    public abstract List<? extends Creature> reproduce(int ageOfWorld);
    
    public boolean areYouDead(int ageOfWorld) {
        if(ageOfWorld - yearBorn + getRandomNumber(0, dieBound) > dieBound){
            return true;
        }else{return false;}
    }
}
