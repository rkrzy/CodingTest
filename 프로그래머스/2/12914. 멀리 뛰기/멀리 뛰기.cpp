#include <string>
#include <vector>

using namespace std;
//1 = [1]
//2 = [1,1], [2]
//3 = [2,1], [1,2], [1,1,1]
//4 = [1,1,1,1], [1,2,1], [1,1,2], [2,1,1], [2,2]
//5 = [1,1,1,1,1], [1,1,1,2], [1,1,2,1], [1,2,1,1], [2,1,1,1]
//    [2,1,2], [2,2,1], [1,2,2],
long long solution(int n) {
    long long answer = 0;
    long long dp[n+1];
    
    dp[1] = 1;
    if(n >= 2){
        dp[2] = 2;    
    }
    for(int i = 3; i <= n; i++){
        dp[i] = ((dp[i-1]%1234567) + (dp[i-2]%1234567)) % 1234567;
    }
    
    answer = dp[n];
    
    return answer;
}