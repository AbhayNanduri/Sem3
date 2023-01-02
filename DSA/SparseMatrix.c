#include <stdio.h>

int main(){
    
    int SpM[5][6]={
        {0,0,0,0,9,0},
        {0,8,0,0,0,0},
        {4,0,0,2,0,0},
        {0,0,0,0,0,5},
        {0,0,2,0,0,0}
    };

    int size=0;

    for (int i=0;i<5;i++)
        for(int j=0;j<6;j++)
            if(SpM[i][j]!=0)
                size++;
            

        
    int resM[3][size];

    int k = 0;
    
    for (int i=0;i<5;i++)
        for(int j=0;j<6;j++)
            if(SpM[i][j]!=0){
                resM[0][k]=i;
                resM[1][k]=j;
                resM[2][k]=SpM[i][j];

                k++;
            }
        

    printf("Triplet Representation\n");

    for (int i=0; i<3; i++)
	{
		for (int j=0; j<size; j++)
			printf("%d ", resM[i][j]);

		printf("\n");
	}
	return 0;
}