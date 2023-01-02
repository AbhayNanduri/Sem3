import java.util.*;

public class bfs 
{
    public int v;
    public LinkedList<Integer> adj[];

    bfs(int v)
    {
        this.v =v;
        adj = new LinkedList[v];
        for(int i =0 ; i< v;i++)
        {
            adj[i] = new LinkedList();
        }
    }


    public void addedge(int v, int w)
    {
        adj[v].add(w);
    }

    public void bfs_iter(int src)
    {
        boolean visited[] = new boolean[v];

        LinkedList <Integer> queue = new LinkedList<Integer>();

        visited[src] = true;

        queue.add(src);

        while(queue.size() != 0)
        {
            int a = queue.poll();
            System.out.println(a + "\n");

            Iterator<Integer> i = adj[src].listIterator();

            while(i.hasNext())
            {
                int n = i.next();
                if(!visited[n])
                {
                    System.out.println( a +"->" + n + "\n");
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args) 
    {
        bfs g = new bfs(3);
       g.addedge(0, 0);
       g.addedge(1, 0);
       g.addedge(2, 1);
       g.bfs_iter(0);
    }
}

