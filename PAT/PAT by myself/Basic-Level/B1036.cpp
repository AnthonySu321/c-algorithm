#include<stdio.h> 
int main(){
	int N;
	char C;
	int col,row;
	scanf("%d %c",&N,&C);
	col=N;
	if(col%2==1){
		row=col/2+1;
	}else{
		row=col/2;
	}
	for(int i=1;i<=col;i++){
		printf("%c",C);
	}
	printf("\n"); // first row 
	
	for(int i=2;i<=row-1;i++){//second part
		printf("%c",C); 
		for(int j=1;j<=col-2;j++){
			printf(" ");
		}
		printf("%c",C);
		printf("\n");
		
	}
	
	
	for(int i=1;i<=col;i++){//last part 
		printf("%c",C);
	}
	return 0;
	
	

	
}
