package oops.Encapsulation.Mirzapur;

public class Mirzapur {

	private Boolean seat;

	// seat can be only shared by kalin bhaiya..
	Boolean havingPower;

	// People residing in mirzapur only can feel power...
	public Boolean isCitizen;

	public Mirzapur() {
		isCitizen = true;
		havingPower = true;
		seat = false;
	}

	public Boolean getSeat(String name) {
		if (name.equals("kaleen") || name.equals("munna"))
			seat = true;
		else
			System.out.println("Only kaleen bhaiya can access this...");
		return seat;

	}

}

