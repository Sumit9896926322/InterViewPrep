package recursion.recursionAV;

public class TOH {
  public static void Toh(String src,String helper,String target,int n) {
	  if(n == 0)
		  return;
	  Toh(src,target,helper,n-1);
	  System.out.println("Move"+n+"th disk from "+ src + " to " +target);
	  Toh(helper,src,target,n-1);
  }
  public static void main(String[] args) {
	 Toh("source","helper","destination",2);
  }
}
