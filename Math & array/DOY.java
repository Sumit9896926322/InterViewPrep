package GFG;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DOY {
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

public static int nextInt() throws IOException {return Integer.parseInt(br.readLine());}

public static int[] nextArr() throws IOException {
	String elements[] = br.readLine().split(" ");
	int arr[] = new int[elements.length];
	for (int j = 0; j < elements.length; j++)
		arr[j] = Integer.parseInt(elements[j]);
	return arr;
}
public static void printArr(int arr[]) {
	for(int i=0;i<arr.length;i++) 	System.out.print(arr);
}

public static String next() throws IOException {return br.readLine();}

public static void main(String[] args) throws IOException {
	
	int T = nextInt();
	while (T-- > 0) {
		

			int arr[] = nextArr();
			int d = arr[0];
			int m = arr[1];
			int y = arr[2];

			String weekdays[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturdy" };
		
			GregorianCalendar cal = new GregorianCalendar(y, m - 1, d);
			System.out.println(weekdays[cal.get(Calendar.DAY_OF_WEEK) - 1]);
		
	}
}

}
