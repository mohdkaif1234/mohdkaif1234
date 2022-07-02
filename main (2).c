/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
   int arr[50],s,i,sum=0;
   printf("enter array size\n");
   scanf("%d",&s);
   printf("Enter arry element\n");
   for(i=0;i<s;i++)
   scanf("%d",&arr[i]);
   for(i=0;i<s;i++)
    sum=sum+arr[i];
    printf("sum of the array=%d\n",sum);
    return 0;
}
