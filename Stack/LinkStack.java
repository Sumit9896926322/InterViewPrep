//package GFG.GFG.Stack;
//
//import java.util.*;
//import java.io.*;
//
//public class LinkStack {
//	LinkStack node;
//	int data;
//
//	LinkStack(int data) {
//		this.data = data;
//		this.node = null;
//	}
//
//	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//	public static int nextInt() throws IOException {
//		return Integer.parseInt(br.readLine());
//	}
//
//	public static int[] nextArr() throws IOException {
//		String elements[] = br.readLine().split(" ");
//		int arr[] = new int[elements.length];
//		for (int j = 0; j < elements.length; j++)
//			arr[j] = Integer.parseInt(elements[j]);
//		return arr;
//	}
//
//	public static void printArr(int arr[]) {
//		for (int i = 0; i < arr.length; i++)
//			System.out.print(arr);
//	}
//
//	public static String next() throws IOException {
//		return br.readLine();
//	}
//
//	public static void insert(int s) {
//		LinkStack temp = new LinkStack(s);
//		temp.node = head;
//		head = temp;
//	}
//
//	public static void delete(LinkStack head) {
//		if (head != null) {
//			System.out.println(head.data);
//			head = head.node;
//		} else
//			System.out.println("Linked List empty");
//	}
//
//	public static void main(String[] args) throws IOException {
//
//		int T = nextInt();
//		while (T-- > 0) {
//
//			LinkStack one = new LinkStack(-1);
//
//			insert(one, 12);
//			insert(13);
//			insert(14);
//			delete(one);
//			delete(one);
//
//		}
//	}
//
//}
