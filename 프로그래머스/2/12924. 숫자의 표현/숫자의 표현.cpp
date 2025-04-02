#include <string>
#include <vector>

using namespace std;
/*
* DP[1] = 1
* DP[2] = 1
* DP[3] = 2
* DP[4] = 1
* DP[5] = 2
* DP[6] = 2
* DP[7] = 2
* DP[8] = 1
* DP[9] = 
*/

int solution(int n) {
    int answer = 0;
    for(int i = 1; i <= n; i++){
        int temp = i;
        for(int j = i + 1; j <= n; j++){
            if(temp >= n){
                break;
            }
            temp += j;
        }
        if(temp == n){
            answer++;
        }
    }
    
    return answer;
}