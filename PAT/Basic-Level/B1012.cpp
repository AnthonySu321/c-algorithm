#include<stdio.h>
int main(){
	int count[5]={0};
	int ans[5]={0};
	int n,temp;	
	scanf("%d",&n);
	for(int i=0;i<n;i++){
		scanf("%d",&temp);
		if(temp%5==0){//A1
			if(temp%2==0){
				ans[0]+=temp;
				count[0]++;
				
				}
		}else if(temp%5==1){//A2
			if(count[1]%2==0){
				ans[1]+=temp;
			}else{
				ans[1]-=temp;
			}
			count[1]++;
		}else if(temp%5==2){//A3
				
				count[2]++;
				
		}else if(temp%5==3){//A4
				ans[3]+=temp;
				count[3]++;
		}else{//A5 :è¢«5é™¤åæœ€å¤§çš„æ•°å­—
			if(temp>ans[4]){
				ans[4]=temp;
			}
			count[4]++;
			
		}
	}
	if(count[0]==0) printf("N ");
	else printf("%d ",ans[0]);
	if(count[1]==0) printf("N ");
	else printf("%d ",ans[1]);
	if(count[2]==0) printf("N ");
	else printf("%d ",count[2]);
	if(count[3]==0) printf("N ");
	else printf("%.1f ",(double)ans[3]/count[3]);
	if(count[4]==0) printf("N");
	else printf("%d",ans[4]);
	
	
	
}


/* 
ÊäÈëÑùÀı 1£º
13 1 2 3 4 5 6 7 8 9 10 20 16 18
Êä³öÑùÀı 1£º
30 11 2 9.7 9
ÊäÈëÑùÀı 2£º
8 1 2 4 5 6 7 9 16
Êä³öÑùÀı 2£º
N 11 2 N 9
*/
