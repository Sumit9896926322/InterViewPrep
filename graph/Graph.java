//package graph;
//
//import java.util.*;
//
//public class Graph<T> {
//	T name;
//	HashMap
//
//	<T, ArrayList<T>> adjVertices;
//	boolean isDirected = false;
//
//	Graph() {
//		Vertex v = new Vertex(name);
//		adjVertices = new HashMap<T, ArrayList<T>>();
//	}
//
//	// Adjacency list representation of graph
//	public void addVertex(T name)
//	{
//		adjVertices.put(name, new ArrayList<T>());
//	}
//
//	public void removeVertex(T v) {
//		adjVertices.remove(v);
//
//		for (Map.Entry<T, ArrayList<T>> vertex : adjVertices.entrySet()) {
//			ArrayList<T> neighbour = vertex.getValue();
//
//			if (neighbour.contains(v)) {
//				neighbour.remove(v);
//			}
//
//		}
//	}
//
//
//	public void removeEdge(T src, T dest) {
//		adjVertices.get(src).remove(dest);
//	}
//
//	public void addEdge(T source, T destination) {
//		adjVertices.get(source).add(destination);
//		// In case of undirected graph
//		if (!isDirected)
//			adjVertices.get(destination).add(source);
//	}
//
//	public void countNeighbours(T node) {
//		if (adjVertices.get(node) != null) {
//			System.out.println(adjVertices.get(node).size());
//		}
//	}
//
//	public void printGraph() {
//		for (Map.Entry<T, ArrayList<T>> vertex : adjVertices.entrySet()) {
//
//			ArrayList<T> neighbour = vertex.getValue();
//			System.out.print(vertex.getKey()+"->");
//			for (T nodes : neighbour)
//				System.out.print(nodes + " ");
//			System.out.println();
//
//		}
//	}
//
//	public void bfs() {
//
//	}
//
//	public void dfs(ArrayList<Integer> arr, boolean visited[], ArrayList<Integer> dis) {
//		// call for every node in graph
//		// dfs(g.get(i),vis,g);
//		for (int i = 0; i < arr.size(); i++) {
//			if (!visited[arr.get(i)]) {
//				System.out.println();
//				visited[arr.get(i)] = true;
//				dfs(adjVertices.get(arr.get(i)), visited, g);
//			}
//		}
//	}
//
//	public static void main(String args[]) {
//		Graph graph = new Graph();
//		graph.addVertex("Bob");
//		graph.addVertex("Alice");
//		graph.addVertex("Mark");
//		graph.addVertex("Rob");
//		graph.addVertex("Maria");
//		graph.addEdge("Bob", "Alice");
//		graph.addEdge("Bob", "Rob");
//		graph.addEdge("Alice", "Mark");
//		graph.addEdge("Rob", "Mark");
//		graph.addEdge("Alice", "Maria");
//		graph.addEdge("Rob", "Maria");
//		graph.printGraph();
//		graph.removeEdge("Alice", "Bob");
//		System.out.println("After deleting bob");
//		graph.printGraph();
//		graph.countNeighbours("Alice");
//		System.out.println(graph.adjVertices);
//
//	}
//
//}
//
//class Vertex<T> {
//	T name;
//
//	Vertex(T name) {
//		this.name = name;
//	}
//}
