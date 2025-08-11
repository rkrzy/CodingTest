#include <string>
#include <vector>

using namespace std;

int solution(int number, int limit, int power) {
    int answer = 0;
    vector<int> v;
    for(int i = 1; i <= number; i++)
    {
        int count = 0;
        for(int j = 1; j<=i; j++){
            if(i % j == 0){
                count++;
            }
        }
        v.push_back(count);
    }
    for(int num : v){
        if(num <= limit){
            answer += num;
        }else{
            answer += power;
        }
    }
    return answer;
}