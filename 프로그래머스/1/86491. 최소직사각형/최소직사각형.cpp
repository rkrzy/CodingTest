#include <string>
#include <vector>

using namespace std;
//두 값중에 큰값이 저장된 큰값보다 작아야함
//두 값중에 작은값이 저장된 작은값보다 작아야함
int solution(vector<vector<int>> sizes) {
    int answer = 0;
    int min_value = sizes[0][0] > sizes[0][1]? sizes[0][1] : sizes[0][0];
    int max_value = sizes[0][0] < sizes[0][1]? sizes[0][1] : sizes[0][0];
    for(int i = 1; i < sizes.size(); i++){
        int min_temp = sizes[i][0] > sizes[i][1] ? sizes[i][1] : sizes[i][0];
        int max_temp = sizes[i][0] < sizes[i][1] ? sizes[i][1] : sizes[i][0];
        if(max_temp > max_value){
            max_value = max_temp;
        }
        if(min_temp > min_value){
            min_value = min_temp;
        }
    }
    answer = max_value * min_value;
    return answer;
}