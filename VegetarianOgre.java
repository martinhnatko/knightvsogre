public class VegetarianOgre extends BadOgre{
    void revenge(Knight knight){
        if(hungry){
            hungry = false; //vegetarian ogre spapa bylinky
            energy = 2 * energy;
        }
    }
}
