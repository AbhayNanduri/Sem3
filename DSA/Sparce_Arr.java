public  class Sparce_Arr 
{

    static int sparcematrix[][] = {

        {0,0,0,0,9,0},
        {0,8,0,0,0,0},
        {4,0,0,2,0,0},
        {0,0,0,0,0,5},
        {0,0,2,0,0,0}
    };
    
    static int sum =0;
    static void countnz(int sparcematrix[][])
    {
         
        for(int i =0; i<5;i++)
        {
            for(int j = 0;j<6;j++)
            {
                if(sparcematrix[i][j]!=0)
                {
                    sum++;
                }
            }
        }
        System.out.println("Non zero elements: "+sum);
        // return sum;
    }
    
    static int arr[][] = new int[3][sum];
    static void intoarray(int sparcematrix[][])
    {
        
        
        for(int row =0;row<5;row++)
        {   int k=0;
            for(int clm =0 ;clm<6;clm++)
            {
                if(sparcematrix[row][clm]!=0)
                {   
                    arr[0][k] = row;
                    arr[1][k] = clm;
                    arr[2][k] = sparcematrix[row][clm];
                    k++;      
                }
            
            }
        }
    }
    
     static void disp()
     {    
        for(int row=0;row<3;row++)
        {
            for(int clm=0;clm<sum;clm++)
            {
                System.out.print(arr[row][clm]);
            }
            System.out.println();
        }
        // return arr;
    }

    public static void main(String[] args) {
        // Sparce spc = new Sparce();

        countnz(sparcematrix);
        intoarray(sparcematrix);
        disp();
    }
}
