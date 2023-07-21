//package LinkedList;
//
//import java.io.*;
//import java.util.*;
//
//import LinkedList.LinkedList.Node;
//
//public class swapLinkedList {
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
//	public static void swapNode(Node head) {
//		// Swap only data insted of node
//		Node temp = head;
//		Node prev = null;
//		int count = 0;
//		while (temp != null) {
//			count++;
//			System.out.println();
//			if (count % 2 != 0) {
//
//				if (temp.next != null) {
//
//					if (temp.data > temp.next.data) {
//
//						Node copy = temp.next;
//						if (prev == null) {
//
//							temp.next = copy.next;
//							copy.next = temp;
//							temp = copy;
//						}
//
//						else {
//							prev.next = copy;
//							temp.next = copy.next;
//							copy.next = temp;
//							temp = copy;
//						}
//
//					}
//
//				}
//			} else {
//				if (temp.next != null) {
//
//					if (temp.data < temp.next.data) {
//
//						Node copy = temp.next;
//						if (prev != null)
//							prev.next = copy;
//						temp.next = copy.next;
//						copy.next = temp;
//						temp = copy;
//					}
//				}
//			}
//			System.out.println(temp.data);
//			prev = temp;
//			temp = temp.next;
//		}
//
//	}
//
//	public static void main(String[] args) throws IOException {
//
//		int T = nextInt();
//		while (T-- > 0) {
//
//			int n = nextInt();
//			int arr[] = nextArr();
//
//			LinkedList<Integer> link = new LinkedList<Integer>();
//
//			for (int i : arr)
//				link.add(arr[i]);
//
//		}
//	}
//
//}
