//package graph;
//
//import java.io.*;
//import java.util.*;
//
//import graph.Graph;
//
//public class detectCycle {
//	static Graph g = new Graph();
//	static int dis[];
//	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//	public static int nextInt() throws IOException {
//		return Integer.parseInt(br.readLine());
//	}
//
//	public static long nextLong() throws IOException {
//		return Long.parseLong(br.readLine());
//	}
//
//	public static String next() throws IOException {
//		return br.readLine();
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
//			System.out.println(arr[i]);
//	}
//
//	public static void dfs() {
//
//	}
//
//	public static boolean detectCycle() {
//
//	}
//
//	public static void main(String[] args) throws IOException {
//
//		int T = 1;
//		T = nextInt();
//		while (T-- > 0) {
//
//			int input[] = nextArr();
//
//			int vertices = input[0];
//			int edge = input[1];
//
//			int edges[] = new int[2 * edge];
//			edges = nextArr();
//
//			for (int i = 0; i < vertices; i++)
//				g.addVertex(i);
//
//			for (int i = 0; i < edges.length; i += 2)
//				g.addEdge(edges[i], edges[i + 1]);
//
//		}
//	}
//
//}
