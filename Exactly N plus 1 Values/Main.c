// Exactly N plus 1 Values; complete: n
// date: 27.10.2021

#include<stdio.h>
#include<math.h>

int main()
{
	void N1VALUES(int );
	int t, n;

	scanf("%d", &t);

	while(t != 0) {
		scanf("%d", &n);
		N1VALUES(n);
		t -= 1;
	}
	return 0;
}

void N1VALUES(int n) {

	int m = n+1;

	long long int A[m];

	for(int i=0; i<m; i++) {
		A[i] = (long long int) pow(2, i);
	}

	A[n-1] = A[n-2];
	A[n] = A[n-1] + 1; 

	for(int i=0; i<m; i++) {
		printf("%lld ", A[i]);
	}

	printf("\n");
}	