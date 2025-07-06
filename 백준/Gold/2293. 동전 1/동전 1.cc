#include <iostream>
#include <algorithm>
using namespace std;

int main(){

    int n, k;
    cin >> n >> k;
    int arr[n + 1];
    long long dp[k + 1];
    dp[0] = 1;
    for(int i = 1; i <= k; i++){
        dp[i] = 0;
    }
    for(int i = 1; i <= n; i++){
        cin >> arr[i];
    }
    sort(arr + 1, arr + n + 1);

    for(int i = 1; i <= n; i++){
        for(int j = arr[i]; j <= k; j++){
            dp[j] = dp[j] + dp[j-arr[i]];
        }
    }

    cout << dp[k];


}