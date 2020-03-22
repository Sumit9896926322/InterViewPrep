package DS_ALGO;

import DS_ALGO.check.Encapsulation;

class DS{
	int var = 9;
	DS(Oops o5){
		System.out.println(o5.var+" "+this.var);
	}
}
public class Oops {
	int var = 5;
	Oops(int var){
		this.var = var;
	}
	public void sendRef(int var) {
		DS d1 = new DS(this);
		
	}

	public static void main(String[] args) {
		Encapsulation e1 = new Encapsulation();
		Oops o1 = new Oops(5);
		o1.sendRef(5);
	}

}
