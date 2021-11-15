// minimize digit sum; codechef : 07.09.21; complete : y

#include<stdio.h>
#include<limits.h>
int main(void)
{
	int mindigsum(int , int , int );
	int q, n, l, r;
	scanf("%d", &q);

	while(q != 0) {
		scanf("%d %d %d", &n, &l, &r);
		printf("%d\n", mindigsum(n, l, r));
		q -= 1;
	}
	return 0;
}

int mindigsum(int n, int l, int r) {
	int min, sum, sum2, number;

	if(l <= n && r>= n) return n;
	if(l > n) return l;

	sum2 = INT_MAX;
	min = 0;

	while(l < r && n/r < r) {

		int lvalue = n/r, rvalue = n % r;

		if(sum2 > lvalue + rvalue) {
			sum2 = lvalue + rvalue;
			min = r;
		}
		r = n/(lvalue+1);
	}

	while(l <= r) {
		number = n;
		sum = 0;

		while(1) {
			if(number < l) {
				sum += number;

				if(sum < sum2) {
					min = l;
					sum2 = sum;
				}
				break;
			}

			sum += number % l;
			number /= l;
			if(sum >= sum2) break;
		}

		l += 1;
	}

	return min;
}