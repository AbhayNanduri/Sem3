class Fw {
    final static int INF = 9999, n = 4; // INF= infinity (a ver high value)      n= No. of vertices
  
    // main fuction for floyd warshall to find all pair shortest path
    void fw(int graph[][]) {
      int a[][] = new int[n][n];
      int i, j, k;
  
      for (i = 0; i < n; i++)
        for (j = 0; j < n; j++)
          a[i][j] = graph[i][j];
  
      // calculating distances iteratively for each vertex
      for (k = 0; k < n; k++) {
        for (i = 0; i < n; i++) {
          for (j = 0; j < n; j++) {
            if (a[i][k] + a[k][j] < a[i][j]){
              a[i][j] = a[i][k] + a[k][j];
            }       
          }
        }
      }
      printa(a);
    }
  
    void printa(int a[][]) {
      for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
          if (a[i][j] == INF)
            System.out.print("INF ");
          else
            System.out.print(a[i][j] + "  ");
        }
        System.out.println();
      }
    }
  
    public static void main(String[] args) {
      int graph[][] = { { 0, 3, INF, 5 },
                         { 2, 0, INF, 4 }, { INF, 1, 0, INF }, { INF, INF, 2, 0 } };
      Fw a = new Fw();
      a.fw(graph);
    }
  }