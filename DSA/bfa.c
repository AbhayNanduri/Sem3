#include <stdio.h>
#include <string.h>
 
void search(char* pat, char* txt)
{
    int M = strlen(pat);
    int N = strlen(txt);
 
   /*outer loop is for moving the index one by one in the string */
    for (int i = 0; i < N - M+1; i++) {
        int j;
        /* The inner loop is for checking  */
        for (int j = 0; j < M; j++)
            if (txt[i + j] != pat[j])
                break;
 
        if (j== M) // if pat[0...M-1] = txt[i, i+1, ...i+M-1]
            printf("Pattern found at index %d \n", i);
    }
}
 
int main()
{
    char txt[] = "Jayant Toleti";
    char pat[] = "i";
   
      // Function call
    search(pat, txt);
    return 0;
}