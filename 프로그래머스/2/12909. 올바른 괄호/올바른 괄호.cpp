#include<string>
#include <iostream>
#include <stack>

using namespace std;

bool solution(string s)
{
    stack<char> stack;
    bool answer = true;
    for(int i = 0; i < s.length(); i++){
        if(s[i] == '('){
            stack.push(s[i]);
        }
        else if(s[i] == ')' && stack.empty()){
            answer = false;
            break;
        }
        else if(s[i] == ')'){
            stack.pop();
        }
    }
    if(!stack.empty()){
        answer = false;
    }

    return answer;
}