#include <string>
#include <vector>
#include <algorithm>
using namespace std;

bool compare(string str1, string str2){
    return str1 + str2 > str2 + str1;
}
string solution(vector<int> numbers) {
    string answer = "";
    vector<string> save;
    for(int num : numbers){
        save.push_back(to_string(num));
    }
    sort(save.begin(), save.end(), compare);
    
    for(string str : save){
        answer += str;
    }
    if(answer[0] == '0'){
        return "0";
    }
    return answer;
}