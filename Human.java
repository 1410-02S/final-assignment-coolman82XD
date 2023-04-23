import java.util.*;

public class Human extends Creature {

    public Human(int ageOfWorld) {
        super(ageOfWorld);
        this.dieBound = 120;
    }

    @Override
    public List<? extends Creature> reproduce(int ageOfWorld) {
        if(ageOfWorld-yearBorn > 5){
                ArrayList<Human> babies = new ArrayList<>();
                for(int i=0; i<1; i++){
                    babies.add(new Human(ageOfWorld));
                }
            return babies;
        }
        return Collections.emptyList();
    }

    Random rand = new Random();
    int randomNum = rand.nextInt();
    
    String Name = "name";
    int Happiness = 0;
    
String[] ListedNames = {"Christopher Stewart","Elizabeth Mcdaniel","Crystal Gonzales","David Singleton","Jesse Flores","Sandra Stewart","Gene Robles","James Collins","Joshua Moses","Sherry Snyder","Paul Johnson","Shelley Warren","David Curtis","Tyler George","Deanna Garcia","Pamela Hansen","Jeremy Vasquez","Amy Wells","Allison Santana","Teresa Reyes","Matthew Bell","Jennifer Short","Deborah Duran","Margaret Wells","Melissa Osborne","Erica Taylor","Margaret Ruiz","Robert Norman","Ryan Patterson","Julie Jackson","Maria Richards","Matthew Hernandez","Adam Rodgers","Tara Knight","Toni Evans","Albert Simpson","Roger Hill","James Williams","Ashley Craig","Daniel Miller","Adrian Perez","Angela Hunter","Robert Miller","David Rodriguez","Phillip Shaw","Kyle Henderson","Mr. Daniel Munoz","Tara Meyer","Robert Singleton","Thomas Moore","Jeremy Wilson","Gregory Morgan","Karina Thompson","Rachel Pitts","Jonathan Maxwell","John Calderon","Angela Lopez","Nicholas Cannon","Luis Mccarthy","James Johnson","Jackson Kelly","Joshua Guerra","Anne Reid","Christina Gonzalez","Craig Hernandez","Danielle Brady","Donna Spence","Michael Lyons","David Owen","Edward Roberts","Shannon Garcia","Angela Collins","Connie Jones","William Jones","Justin Holland","Paul Hammond","Sara Navarro","Kelly Page","Mrs. Monica Sparks","Brandon Mccoy","Kimberly Haynes","Robert Johnson","Pamela Yang","Kevin Willis","David Hart","Craig Mcintosh","Amy Macdonald","Nathaniel Adkins","James Hernandez","Tiffany Young","Darlene Pratt","Matthew Ramirez","Brian Bowen","Henry Salazar","Juan Jefferson","Anna Mckenzie","Lori Morris","Eric Robertson","Russell Ballard","Jacob Johnson"};
}