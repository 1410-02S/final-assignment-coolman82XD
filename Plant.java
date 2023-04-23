import java.util.*;

public class Plant extends Creature {

    public Plant(int ageOfWorld) {
        super(ageOfWorld);
        this.dieBound = 200;
    }

    @Override
    public List<? extends Creature> reproduce(int ageOfWorld) {
        if(ageOfWorld-yearBorn > 5){
            ArrayList<Plant> babies = new ArrayList<>();
            for(int i=0; i<12; i++){
                babies.add(new Plant(ageOfWorld));
            }
        return babies;
        }
        return Collections.emptyList();
    }
    
}
