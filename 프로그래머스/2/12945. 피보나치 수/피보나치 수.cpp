#include <string>
#include <vector>

using namespace std;

int dp[100001];

int solution(int n) {
    dp[1] = 1;
    dp[2] = 1;
    dp[3] = 2;
    for(int i = 4; i<= n; i++){
        dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
    }
    return dp[n];
}