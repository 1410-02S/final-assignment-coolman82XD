import java.util.*;

public class Animal extends Creature {
    
    public Animal(int ageOfWorld) {
        super(ageOfWorld);
        this.dieBound = 80;
    }

    @Override
    public List<? extends Creature> reproduce(int ageOfWorld) {
    if(ageOfWorld-yearBorn > 5){
            ArrayList<Animal> babies = new ArrayList<>();
            for(int i=0; i<6; i++){
                babies.add(new Animal(ageOfWorld));
            }
        return babies;
        }
        return Collections.emptyList();
    }
}
