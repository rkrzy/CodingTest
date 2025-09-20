#include <string>
#include <vector>

using namespace std;
//먼저 기존에 있는 번호중에 가능한 양을 검색한다.
vector<int> solution(vector<int> lottos, vector<int> win_nums) {
    vector<int> answer;
    bool correct[6];
    int min_value = 0;
    int zero_value = 0;
    
    int min_rate = 0;
    int max_rate = 0;
    //기존에 있는 번호중에 가능한 부분을 탐색 그리고 이게 최소 값이라고 생각하면 된다.
    //그리고 0일때는 따로 숫자를 계산해놓는다.
    for(int i = 0; i < 6; i++){
        for(int j = 0; j < 6; j++){
            if(win_nums[j] == lottos[i]){
                correct[j] = true;
                min_value++;
            }
        }
        if(lottos[i] == 0){
            zero_value++;
        }
    }
    if(min_value == 0){
        min_rate = 6;
    }else{
        min_rate = 7 - min_value;
    }
    max_rate = 7 - min_value - zero_value;
    if(max_rate == 7){
        max_rate = 6;
    }
    answer.push_back(max_rate);
    answer.push_back(min_rate);
    
    return answer;
}