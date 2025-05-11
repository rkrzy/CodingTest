#include <iostream>
#include <cmath>
using namespace std;



int main(){
    int N;
    int dp[50001];
    cin >> N;
    for(int i = 1;i < sqrt(50001); i++){
        dp[i * i] = 1;
    }
    for(int i = 1; i <= N; i++){
        dp[i] = i;
        for (int j = 1; j * j <= i; j++) {
            dp[i] = min(dp[i], dp[i - j * j] + 1);
        }
    }
    cout << dp[N];
    return 0;

}