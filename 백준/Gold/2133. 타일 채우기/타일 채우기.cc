#include <iostream>


using namespace std;

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
