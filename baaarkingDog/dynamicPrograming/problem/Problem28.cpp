#include <iostream>


using namespace std;
/*
 * 1. 홀수일 경우에는 바로 나올 수 있는 해가 없다
 * 2. 짝수의 경우에는 해가 있을 수 있다
 * (1). 4이상으로가면 그 모양에서만 나오는 특별한 조합 2가 나온다 => 따라서 2를 더해줘야 한다.
 */
int main(){
   int N;
   cin >> N;
   long arr[31] = {0};

   arr[0] = 1;
   arr[1] = 0;
   arr[2] = 3;
   for(int i = 3; i <= N; i++){
       if(i % 2 != 0) continue;
       arr[i] = arr[2] * arr[i-2];
       for(int j = 4; j <= i; j = j + 2){
           arr[i] += arr[i - j] * 2;
       }
   }
   cout << arr[N];
}
