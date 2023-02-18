public class NinjaKnight extends Knight{
    void attack(Ogre ogre) {
        //uberá 70-100 % energie
        ogre.energy = (int) (((Math.random() * (0.3-0.0))+0.0) * ogre.energy); // (int) just casts a float result into an int
        ogre.revenge(this); // this represents a reference to the current knight object
    }
}