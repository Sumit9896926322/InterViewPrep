package DS_ALGO.check;

public class Encapsulation {
  public static void showmood(mood m1) {
	  m1.behaviour();
  }
  public static void main(String []args) {
	  Sumit user1 = new Sumit();
	  showmood(user1);
  }
}
