package graph;

import java.io.*;
import java.util.*;

import graph.Graph;
public class dfs {
	static Graph g = new Graph();
	static int dis[];
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int nextInt() throws IOException {
		return Integer.parseInt(br.readLine());
	}

	public static long nextLong() throws IOException {
		return Long.parseLong(br.readLine());
	}

	public static String next() throws IOException {
		return br.readLine();
	}

	public static int[] nextArr() throws IOException {
		String elements[] = br.readLine().split(" ");
		int arr[] = new int[elements.length];
		for (int j = 0; j < elements.length; j++)
			arr[j] = Integer.parseInt(elements[j]);
		return arr;
	}

	public static void printArr(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

	public static void dfs(ArrayList<Integer> arr, boolean vis[], int v, int p) {

		for (int i = 0; i < arr.size(); i++) {
			if (!vis[arr.get(i)]) {
				vis[arr.get(i)] = true;
				dfs((ArrayList<Integer>) g.adjVertices.get(arr.get(i)), vis, v, p + 1);
			}
			dis[arr.get(i)] = Math.min(dis[arr.get(i)], p + 1);

		}
	}
	public static void main(String[] args) throws IOException {

		int T = 1;
		T = nextInt();
		while (T-- > 0) {

			g.isDirected = true;
			int input[] = nextArr();

			int vertices = input[0];
			int edge = input[1];

			int edges[] = new int[2 * edge];
			edges = nextArr();

			for (int i = 0; i < vertices; i++)
				g.addVertex(i);

			for (int i = 0; i < edges.length; i += 2)
				g.addEdge(edges[i], edges[i + 1]);

			dis = new int[vertices];
			boolean vis[] = new boolean[vertices];
			vis[0] = true;

			for (int i = 0; i < vertices; i++)
				dis[i] = Integer.MAX_VALUE;
			dis[0] = 0;
			dfs((ArrayList<Integer>) g.adjVertices.get(0), vis, vertices, 0);
			for (int i : dis)
				System.out.println(i + "dis");
		}
	}

}
