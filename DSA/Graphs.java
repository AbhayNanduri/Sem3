import java.util.*;

// This class represents a directed Graphs using adjacency lists

class Graphs{
	private int V; // No. of vertices
	private LinkedList<Integer> adj[]; //Adjacency Lists

	// Constructor
	Graphs(int v){
		V = v;
		adj = new LinkedList[v];
		for (int i=0; i<v; ++i)
			adj[i] = new LinkedList();
	}

	// Function to add an edge into the Graphs
	void addEdge(int v,int w){
		adj[v].add(w);
	}

	

	// prints BFS traversal from a given source s
	void BFS_iter(int s){   
		// no vertices are visited... false by default
		boolean visited[] = new boolean[V];
		// Create a queue for BFS
		LinkedList<Integer> queue = new LinkedList<Integer>();

		// Mark the current node as visited and enqueue it
		visited[s]=true;
		queue.add(s);

		while (queue.size() != 0)
		{	
			
			// Dequeue a vertex from queue and print it
			s = queue.poll();
			System.out.print(s+"\n");

			// Get all adjacent vertices of the dequeued vertex s
			// If a adjacent has not been visited, then mark it
			// visit and enqueue it
			Iterator<Integer> i = adj[s].listIterator();
			while (i.hasNext())
			{
				int n = i.next();
				
				if (!visited[n])
				{
					System.out.println(s+"->"+n+"\n");
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}


	void DFS_iter(int s){	
		// no vertices are visited... false by default
		boolean visited[] = new boolean[V];
		//Define a stack
		Stack <Integer> stack = new Stack<>();

		// Mark vertex as true and and push to stack
		visited[s]=true;
		stack.push(s);

		while (stack.size()!=0){
			//Pop the vertex and print it;
			s=stack.pop();
			System.out.println(s+" ");
			
			//Visit all adjacent Verticesof the popped Vertex s
			// if it is not visited then mark it
			// visit and push
			Iterator<Integer> j = adj[s].listIterator();
			while(j.hasNext())
			{
				int n = j.next();
				
				if(!visited[n])
				{	
					System.out.println(s+"->"+n+"\n");
					visited[n]=true;
					stack.push(n);
				}
			}

		}

	}
	
	void DFS(int s,boolean marked[]){
		// mark current node as visited and print it
		marked[s]=true;
		System.out.println(s+" ");
		
		// Recur for all the vertices adjecent to this vertex.
		Iterator<Integer> j = adj[s].listIterator();
		while(j.hasNext())
		{
			int n = j.next();
			
			if(!marked[n])
			{	
				System.out.println(s+"->"+n+"\n");
				DFS(n,marked);
			}
		}

	}

	void DFS_rec(int s){
		// no vertices are visited... false by default
		boolean marked[] = new boolean[V];
		DFS(s,marked);
	}
	
	

	// Driver method to
	public static void main(String args[]){
		Graphs g = new Graphs(7);

		g.addEdge(0, 1);
		g.addEdge(1, 0);
        g.addEdge(2, 1);
		g.addEdge(1, 2);
        g.addEdge(2, 4);
		g.addEdge(4, 2);
        g.addEdge(0, 3);
		g.addEdge(3, 0);
        g.addEdge(1, 4);
		g.addEdge(4, 1);
		g.addEdge(4, 0);
		g.addEdge(0, 4);
		g.addEdge(3, 4);
		g.addEdge(4, 3);
		g.addEdge(4, 5);
		g.addEdge(5, 4);
		g.addEdge(2, 5);
		g.addEdge(5, 2);
		g.addEdge(2, 6);
		g.addEdge(6, 2);
		g.addEdge(5, 6);
		g.addEdge(6, 5);

		System.out.println("Following is Breadth First Traversal "+
						"(starting from vertex 2)");

		g.BFS_iter(2);

		System.out.println("Following is Depth First Traversal "+
						"(starting from vertex 2)");
		g.DFS_iter(0);
		
		System.out.println("Following is Depth First Traversal using recursion "+
						"(starting from vertex 2)");
		g.DFS_rec(0);

	}
}

