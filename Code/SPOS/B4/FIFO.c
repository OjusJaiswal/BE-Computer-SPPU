package B4;

#include <stdio.h>
#include<conio.h>

using namespace std;

int main()
{


int i,j,k,f, pf=0, count=0,rs[25],m[10],n;

printf("\nEnterthelength ofreferencestring--");
scanf("%d",&n);
printf("\nEnterthereferencestring--");
for(i=0;i<n;i++)
scanf("%d",&rs[i]);
printf("\nEnterno. offrames-- ");
scanf("%d",&f);
for(i=0;i<f;i++)
m[i]=-1;
printf("\nThePageReplacementProcessis--\n");
for(i=0;i<n;i++)
{
for(k=0;k<f;k++)
{
}
if(k==f)
{
}
if(m[k]==rs[i])
break;
m[count++]=rs[i];
pf++;
for(j=0;j<f;j++)
printf("\t%d",m[j]);
if(k==f)
printf("\tPF No. %d",pf);
printf("\n");
if(count==f)
count=0;
}
printf("\nThenumber ofPageFaultsusingFIFOare %d",pf);
getch();
}
