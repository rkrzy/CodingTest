#include <string>
#include <vector>
#include <algorithm>
using namespace std;

vector<int> solution(vector<int> array, vector<vector<int>> commands) {
    vector<int> answer;
    for(vector<int> v : commands){
        int i = v[0];
        int j = v[1];
        int k = v[2];
        vector<int> temp;
        for(int a = i-1; a < j; a++){
            temp.push_back(array[a]);
        }
        sort(temp.begin(), temp.end());
        int ans = temp[k-1];
        answer.push_back(ans);
    }
    return answer;
}