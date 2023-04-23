import java.util.*;

public class World {
    ArrayList<Plant> plants = new ArrayList<>(); 
    ArrayList<Human> humans = new ArrayList<>();
    ArrayList<Animal> animals = new ArrayList<>();
    int age = 0;
    int ageOfWorld = 0;
    int dieBound = 200;
    int bound = 1;
    Random rand = new Random();
    int randomNumber = rand.nextInt(bound);
    int comparison = randomNumber + age;
    boolean notPlaying = true;
    boolean newYear = true;
    int lastReproduced = 0;
    

    void addHuman(Human human) {
        humans.add(human);
    }
    void addPlant(Plant plant) {
        plants.add(plant);
    }
    void addAnimal(Animal animal) {
        animals.add(animal);
    }
    void checkDead() {
        ArrayList<Creature> creatures = new ArrayList<>();
        creatures.addAll(plants);
        creatures.addAll(humans);
        creatures.addAll(animals);
        for(Creature creature: creatures) {
            if(creature.areYouDead(ageOfWorld)) {
                if(creature instanceof Plant) {
                    plants.remove(creature);
                }
                if(creature instanceof Human) {
                    humans.remove(creature);
                }
                if(creature instanceof Animal) {
                    animals.remove(creature);
                }
            }
        }
    }
    public static void main(String[] args) {
        World world = new World();
        world.startWorld();
        world.startGame();
    }

    public void startWorld() {
        System.out.println("Welcome to the world!");
        for(int i=0; i<10; i++) {
            humans.add(new Human(ageOfWorld));
            plants.add(new Plant(ageOfWorld));
            plants.add(new Plant(ageOfWorld));
            plants.add(new Plant(ageOfWorld));
            animals.add(new Animal(ageOfWorld));
        }
    }
    
    public void startGame(){
        System.out.println("Enter \'s\' to start playing or enter \'q\' to quit.");
        Scanner inInput = new Scanner(System.in);
        while (inInput.hasNext()) {
            String play = inInput.next();
            switch(play.toLowerCase()) {
                case "s" : haveADay(); break;
                case "q" : System.exit(0); break;
                default : System.out.println("Invalid Input"); break;
            }
        }
    }

    public void runReproduction() {
        if(humans.size() > 1) {
            if(animals.size() > 3){
                if(plants.size() > 10){
                    for(int i=0; i<(humans.size()/2); i++) {
                        humans.addAll((List<Human>)humans.get(i).reproduce(ageOfWorld));
                    }
                    for(int i=0; i<(animals.size()/2); i++) {
                        animals.addAll((List<Animal>)animals.get(i).reproduce(ageOfWorld));
                    }
                }
            }
        }
        for(int i=0; i<plants.size(); i++) {
            plants.addAll((List<Plant>)plants.get(i).reproduce(ageOfWorld));
        }
    }

    public void haveADay() {
        newYear = false;
        while(newYear == false){
            age ++;
            ageOfWorld ++;
            lastReproduced++;
            if(age >= 10) {
                bound = 195;
            }
            System.out.println("Good day, you have " + humans.size() + " humans, " + animals.size() + " animals and " + plants.size() + " plants.");
            System.out.println("Want to start a new year? \'y\' for Yes \'n\' for No.");
            checkDead();
            runReproduction();
            Scanner yearInput = new Scanner(System.in);
            while (yearInput.hasNext()) {
                String yearString = yearInput.next();
                switch(yearString.toLowerCase()) {
                    case "y" : System.out.println("It's a new year. Year Number : " + ageOfWorld + " Bound : " + bound); haveADay(); break;
                    case "n" : newYear = true; endGame(); break;
                    default : System.out.println("Invalid Input"); break;
                }
            }
        }
    }

    public void endGame(){
        System.out.println("Well Done! You had " + humans.size() + " humans, " + animals.size() + " animals and " + plants.size() + " plants.");
        System.exit(0);
    }
}

