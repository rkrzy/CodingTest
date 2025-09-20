#include <string>
#include <vector>
#include <stack>
using namespace std;

vector<int> solution(vector<int> prices) {
    int n = prices.size();
    vector<int> answer(n);
    stack<pair<int,int>> st;
    
    for(int i = 0; i < n; i++){
        while(!st.empty() && st.top().second > prices[i]) {
            answer[st.top().first] = i - st.top().first;
            st.pop();
        }
        st.push({i, prices[i]});
    }
    
    while(!st.empty()){
        pair<int, int> top = st.top();
        st.pop();
        answer[top.first] = (n-1) - top.first;
    }
    return answer;
}