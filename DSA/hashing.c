/*
get size of hash table
create array 1D of size
get number of keys check keysnum < size
define the hash function
pass the keys
and place the the keys
*/
#include <stdio.h>
int main(){
    int n; // size
    printf("Enter hash table size: ");
    scanf(" %d",&n);

    int hashtable[n]; // Hash table

    for(int i=0;i<n;i++){hashtable[i]=-1;}

    int k; // number of keys
    printf("Enter number of keys: ");
    scanf("%d",&k);

// insertion
    for(int i=0;i<k;i++){

        int key;
        printf("Enter key value: ");
        scanf("%d",&key);
        int hash_value= key%n;
        // check if the number is present at key if number is present probe or else continue.
        if(hashtable[hash_value]!=-1){
            printf("Collision \n");
            int probe=0;
            int a = hash_value;
            int new_value= (a+1)%n;
            
            if(hashtable[new_value]==-1){
                int temp =key;
                
                hashtable[new_value]=temp;
                probe++;
                printf("Probes: %d\n",probe);
            }
            }
            else{
                printf("%d\n",hash_value);
                hashtable[hash_value]=key;
            }
        
        
    }

    for (int j=0;j<n;j++){
        printf("key:%d value:%d \n",j,hashtable[j]);
    }
//search
    printf("%d",hashtable[3]);
}