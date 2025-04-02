#include <iostream>
#include <string>
#include <stack>
using namespace std;

/*
* 제거가 성공하면 뒤로 한칸 이동 1보다 클 경우에
*/
int solution(string s)
{
    int answer = 0;
    stack<char> st;
    for(int i = 0; i < s.size(); i++){
        char ch = st.top();
        if(st.size() > 0&&ch == s[i]){
            st.pop();
        }
        else{
            st.push(s[i]);
        }
    }
    if(st.size() == 0){
        answer = 1;
    }

    return answer;
}