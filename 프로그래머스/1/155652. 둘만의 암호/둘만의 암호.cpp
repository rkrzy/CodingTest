#include <string>
#include <vector>
#include <algorithm>
using namespace std;
// 그냥 index만큼 더하면 사이에 있는 skip적용이 안됨
// s+index기준 으로 skip에 존재하는걸 제외하고 바로 더해주면 index가 추가되면서
// 포함되는 skip이 있을수도 있음.

string solution(string s, string skip, int index) {
    string answer = "";
    vector<int> alpha;
    //알파벳 요소 등록
    for(int i = 97; i <= 122; i++){
        alpha.push_back(i);
    }
    //skip에 포함된 값 제거
    for(int i = 0 ;i < skip.length(); i++){
        alpha.erase(remove(alpha.begin(), alpha.end(), skip[i]),alpha.end());    
    }
    int alpha_length = alpha.size();
    for(char ch : s){
        int alpha_num = ch;
        auto it = find(alpha.begin(), alpha.end(), alpha_num);
        int alpha_index = distance(alpha.begin(), it);
        
        char temp = alpha[(alpha_index + index) % alpha_length];
        answer += temp;
    }
    
    return answer;
}