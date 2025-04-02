#include <string>
#include <vector>

using namespace std;

int countNumber(int n){
    int answer = 0;
    while(n > 0){
        if(n & 1){
            answer++;
        }
        n = n >> 1;
    }
    return answer;
}
int solution(int n) {
    int answer = n+1;
    int bitnum = countNumber(n);
    while(countNumber(answer) != bitnum){
        answer++;
    }
    return answer;
}