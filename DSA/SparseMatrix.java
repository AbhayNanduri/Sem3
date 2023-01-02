public class SparseMatrix {
    static int spM[][]={
        {0,0,0,0,9,0},
        {0,8,0,0,0,0},
        {4,0,0,2,0,0},
        {0,0,0,0,0,5},
        {0,0,2,0,0,0}
    };

    public static void main(String[] args) {
        int size=0;
        for (int i=0;i<5;i++)
            for(int j=0;j<6;j++)
                if(spM[i][j]!=0)
                    size++;
        
        int arr[][]=new int [3][size];
        int k=0;
        
        for(int row =0;row<5;row++)
        {
            for(int clm =0 ;clm<6;clm++)
            {
                if(spM[row][clm]!=0)
                {   
                    arr[0][k] = row;
                    arr[1][k] = clm;
                    arr[2][k] = spM[row][clm];
                    k++;      
                }
            
            }
        }
        
        for(int i =0;i<3;i++)
        {
            for(int j =0 ;j<size;j++)
            {
                System.out.printf("%d \t",arr[i][j]);
            }

            System.out.println("\n");
        }
        
    }
}
