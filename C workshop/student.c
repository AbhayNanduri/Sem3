#include <stdio.h>
#include <string.h>
struct student
{
    /* data */
    int rno;
    int class12marks;
    char specialization[10];
    
}s1;

void main(){
    s1.rno=13;
    s1.class12marks=986;
    strcpy(s1.specialization,"AIE");
    printf("%d\n",s1.rno);
    printf("%d\n",s1.class12marks);
    printf("%s",s1.specialization);

}
