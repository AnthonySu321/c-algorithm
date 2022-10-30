#include<stdio.h>


int main()
{
	int x;
	int A,B,D;
	scanf("%d%d%d",&A,&B,&D);
	x=A+B;
	int y=0,product=1;
	while(x!=0){
		y=y+(x%10)*product;
		x=x/10;
		product=product*10;
		
	}
	int z[40],num=0;
	do{
		z[num++]=y% D ;
		y=y/D ;
		
	}while(y!=0);
	for(int i=num-1;i>=0;i--){
		printf("%d",z[i]);
	
	}
//	for(int i=num-1;i>=0;i--){
//		printf("%d",z[i]);
//	
//	}
	
	
	
	
	return 0;
	
	
	
}


