#include<stdio.h> 
int main(){
	int failA=0,failB=0;
	int n,a1,a2,b1,b2;
	scanf("%d",&n);
	for(int i=0;i<n;i++){
		scanf("%d %d %d %d",&a1,&a2,&b1,&b2);
		if(a1+b1==a2&&a1+b1!=b2){failB+=1;}//¼×Ó®
		else if(a1+b1!=a2&&a1+b1==b2){failA+=1;}//ÒÒÓ®
		else  {failA+=0;failB+=0;}//Æ½¾Ö
	}
	printf("%d %d",failA,failB);
	return 0;
	

}
/*
5
8 10 9 12
5 10 5 10
3 8  5 12
12 18 1 13
4 16 12 15
*/
