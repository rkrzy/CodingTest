#include <string>
#include <vector>
#include <algorithm>

using namespace std;


int solution(int n, vector<int> lost, vector<int> reserve) {
    
    vector<int> save_lost;
    vector<int> save_reserve;
    
    sort(reserve.begin(), reserve.end());
    sort(lost.begin(), lost.end());
    
    for(int i : lost){
        auto it = find(reserve.begin(), reserve.end(), i);
        if(it ==reserve.end()){
            save_lost.push_back(i);
        }
    }
    for(int i : reserve){
        auto it = find(lost.begin(), lost.end(), i);
        if(it == lost.end()){
            save_reserve.push_back(i);
        }
        
    }
    
    
    int answer = n - save_lost.size(); 
    
    for(int i : save_lost){
        auto it = find(save_reserve.begin(), save_reserve.end(), i-1);
        if(it != save_reserve.end()){
            answer++;
            *it = -1;
            continue;
        }
        it = find(save_reserve.begin(), save_reserve.end(), i+1);
        if(it != save_reserve.end()){
            answer++;
            *it = -1;
        }
    }
     
   
        
    return answer;
}