//#include<stdio.h>
////#include<cmath>
//#define N 3
//int main(){   //T行3列的矩阵 
//	int T;
//	scanf("%d",&T);
//	long  a[T][N];
//	for(int i=1;i<=T;i++){
//		for(int j=1;j<=3;j++){
//			
//		scanf("%lld",&a[i][j]);
//		}
//	}
//	for(int k=1;k<=T;k++){
//		if(a[k][1]+a[k][2]>a[k][3]) printf("Case #%d: true\n",k);
//		else printf("Case #%d: false\n",k);
//		 
//	}
//	
//	return 0;
//	
//	
//}
//
///*
//4
//1 2 3
//2 3 4
//4 5 6 
//1 1 1
//*/
//

#include<stdio.h>
int main(){
	int T,tcase=1;
	scanf("%d",&T);//输入数据组数
	double a,b,c;
	while(T--){ //循环T次
		
		scanf("%lf%lf%lf",&a,&b,&c);
		if(a+b>c){
			printf("Case #%d: true\n",tcase++);
		}else{
			printf("Case #%d: false\n",tcase++);
		} 
	}
	
	
	
//	return 0;
}




 
