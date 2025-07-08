#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int solution(vector<vector<int> > land)
{
    int answer = 0;
    int arr[4] = {0,0,0,0};
    int length = land.size();
    for(int i = 1; i < length; i++)
    {
        for(int j = 0; j < 4; j++){
            int temp = -1;
            for(int k = 0; k < 4; k++){
                if(j != k){
                    temp = max(temp, land[i-1][k]);
                }
            }
            land[i][j] += temp;
        }
    }
    for(int i = 0; i < 4; i++){
        answer = max(answer, land[land.size()-1][i]);
    }
    
    
    

    return answer;
}