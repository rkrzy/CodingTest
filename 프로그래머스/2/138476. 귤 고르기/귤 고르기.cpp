#include <string>
#include <vector>
#include <map>
#include <algorithm>
#include <iostream>
using namespace std;
//동일한 크기의 귤이 가장 많은 숫자의 귤을 담는다. => 갯수 기준으로 정렬 필요
//
int solution(int k, vector<int> tangerine) {
    int answer = 0;
    map<int, int> m;
    
    for(int i = 0; i < tangerine.size(); i++){
            m[tangerine[i]]++;
    }
    vector<pair<int,int>> vec(m.begin(), m.end());
    
    sort(vec.begin(), vec.end(), [] (const auto& a, const auto& b){
        return a.second > b.second;
    });
    
    int num = k;
    
    for(pair<int, int> temp : vec){
        num = num - temp.second;
        if(num <= 0){
            answer++;
            break;
        }
        else{
            answer++;
        }
    }
    
    return answer;
}