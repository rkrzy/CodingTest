#include <iostream>


using namespace std;

int main(){

    ios::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);
   int N;
   int M;
   cin >> N >> M;

   int arr[N+1][N+1];

   for(int i = 1; i <= N; i++){
       for(int j = 1; j <= N; j++){
           cin >> arr[i][j];
           arr[i][j] = arr[i][j] + arr[i][j -1];
       }
   }
   int x1, x2, y1, y2;
   for(int i = 0; i < M; i++){
       int result = 0;
       cin >> x1 >> y1 >> x2 >> y2;
       for(int j = x1; j <= x2; j++){
           result += arr[j][y2] - arr[j][y1 - 1];
       }
       cout<< result << '\n';
   }
}
