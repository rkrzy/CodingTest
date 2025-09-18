#include <string>
#include <vector>
#include <unordered_map>

using namespace std;

string solution(vector<string> participant, vector<string> completion) {
    string answer = "";
    unordered_map<string, int> people_list;
    for(string str : participant) {
        people_list[str]++;
    }
    for(string str : completion) {
        people_list[str]--;
        if(people_list[str] == 0){
            people_list.erase(str);
        }
    }
    
    vector<pair<string, int>>arr(people_list.begin(), people_list.end());
    answer = arr[0].first;
    return answer;
}