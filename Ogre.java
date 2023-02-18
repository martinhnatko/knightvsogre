
public class Ogre {
	boolean hungry;
	int energy;
	
	void revenge(Knight knight) {
		if (energy > knight.energy)
			//uberá 0-20 % energie
			knight.energy = (int) (((Math.random() * (0.8-0.1))+0.1) * knight.energy);
	}
}
