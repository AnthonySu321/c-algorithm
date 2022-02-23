#include<stdio.h>/*  */
int main(){
	int a[110];
	int n,m,count =0;
	scanf("%d%d",&n, &m);
	m=m%n;
	for(int i=0;i<n;i++){
	scanf("%d",&a[i]);
	}
	
	for(int i=n-m;i<n;i++){
	printf("%d",a[i]); 
		count++;
	if(count!=n) printf(" ");
//	if(count<n) printf(" ");
	}

	
	for(int i=0;i<n-m;i++){
	printf("%d",a[i]);
	count++;
	if(count!=n) printf(" ");
//	if(count<n) printf(" ");
	}
	return 0;

	
}

/* 
输入样例:
6 2
1 2 3 4 5 6

6 1
1 2 3 4 5 6

2 3 4 1
输出样例:
5 6 1 2 3 4
*/
