#include<stdio.h>


int main()
{
	int N=54;
	char mp[5]={'S','H','C','D','J'};
	int start[N+1],end[N+1],next[N+1];  //54
	
	int K;
	scanf("%d",&K);
	for(int i=1;i<=N;i++){ //start=  36 52 37 38 3 39 40 53 54 41 11 12 13 42 43 44 2 4 23 24 25 26 27 6 7 8 48 49 50 51 9 10 14 15 16 5 17 18 19 1 20 21 22 28 29 30 31 32 33 34 35 45 46 47

		start[i]=i;			
		}
	for(int i=1;i<=N;i++){
		scanf("%d",&next[i]);
		
		
	}
	for(int step=0;step<K;step++){
		for(int i=1;i<=N;i++){
			end[next[i]]=start[i];
			
		}
		for(int i=1;i<=N;i++){
			start[i]=end[i];
			
		}
		
	}
	for(int i=1;i<=N;i++){
		if(i!=0) printf(" ");
		start[i]=start[i]-1;
		printf("%c%d",mp[start[i]/13],start[i]%13+1);
	}
	return 0;
	
	
	
}


