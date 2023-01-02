#include <stdio.h>

int main(){

    int i, j, m, n;
    int arr[10][20];

    printf("Enter number of rows : ");
    scanf("%d", &m);
    printf("Enter number of columns : ");
    scanf("%d", &n);

    /* Input data in matrix */
    for (i = 0; i < m; i++)
    {
        for (j = 0; j < n; j++)
        {
            printf("Enter data in [%d][%d]: ", i, j);
            scanf("%d", &arr[i][j]);
        }
    }

    int *p = &arr[3][1];
    int **c = &p;
    

    for(i=0;i<m;i++){
        for (int j=0;j<n;j++){
            printf("%d\t",arr[i][j]);
        }
        printf("\n");
    }

    printf("\n");
    printf("%d\n",p); //address pointer of for (3,1) entry
    printf("%d\n",*p); // value that pointer p is pointing to
    printf("%d\n",*(p-1));// value of the entry preceeding the the address p is pointing
    printf("%d\n",*(c)); // deref. pointer to a pointer
    printf("%d",**c);// deref. pointer of the pointer to the actual value

}