//#include<cstdio>
//#include<math.h>
//int main(){
//	long long A,B;
//	int m;//��������
//	int n;
//	int A1[1000000];
//	int B1[1000000];
//	long long Pa=0;
//	long long Pb=0;
//	long long Da,Db;
//	scanf("%lld %lld %lld %lld",&A,&Da,&B,&Db);
///*��һ������ÿһλ
//���ĸ�λ��=x mod 10
//����ʮλ��=(x/10) mod 10
//����ǧλ��=(x/100) mod 10
//������λ��=(x/1000) mod 10
//*/
//	while(A){//��Aװ��A1��
//		A1[m++]=A%10;
//		A/=10;
//		
//	}
//	for(int i=0;i<=m;i++){
//		while(A1[i]=Da){
//			Pa=Pa*pow(10,i)+Da;
//		}
//	}
//	//��B
//	while(B){//��Aװ��A1��
//		B1[n++]=B%10;
//		B/=10;
//		
//	}
//	for(int i=0;i<=n;i++){
//		while(B1[i]=Da){
//			Pb=Pb*pow(10,i)+Db;
//		}
//	}
//	
//	printf("%lld\n",(Pa+Pb));
//	
//	
//	
//	
//	return 0;
//
//}


//3862767 6 13530293 3
//399
//3862767 1 13530293 8
//0
#include<stdio.h>
int main(){
	long long a,b,da,db;
	scanf("%lld%lld%lld%lld",&a,&da,&b,&db);
	long long pa=0,pb=0;
	while(a){
		if(a%10==da) pa=pa*10+da;
		a=a/10;
		
	}
	while(b){
		if(b%10==db) pb=pb*10+db;
		b=b/10;
	}
	printf("%lld\n",pa+pb);
	return 0;


}




