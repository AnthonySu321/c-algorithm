#include<stdio.h> 
//	const int maxn= 100010;
	int school[100010]={0};
int main(){

	int n,schID,score;
	scanf("%d",&n);
	for(int i=0;i<n;i++){
		scanf("%d %d",&schID,&score);
		school[schID]+=score;
	}
	
	//计算最高分
	int k=1,Max=-1;
	for ( int i=1;i<=n;i++){
		if(school[i]>Max){
			Max=school[i];
			k=i;
		}
	}
	
	printf("%d %d\n",k,Max);
	return 0;
}

/*
6
3 65
2 80
1 100
2 70
3 40
3 0
*/

