#include <string>
#include <vector>
#include <stack>

using namespace std;
/*
* [,{,(가 들어오면 스택에 넣고 ],},)를 만나면 비교해서 같으면 pop
* 만약 다르면 실패
*/
int solution(string s) {
    int answer = 0;
    
    for(int i = 0 ;i < s.length(); i++){
        stack<char> stack;
        for(int j = 0; j < s.length(); j++){
            if(s[j] == '{' || s[j] == '[' || s[j] == '('){
                stack.push(s[j]);
            }else if(!stack.empty()&&
                    ((s[j] == '}' && stack.top() == '{') ||
                    (s[j] == ']' && stack.top() == '[') ||
                    (s[j] == ')' && stack.top() == '('))){
                stack.pop();
            }else if(stack.empty() &&
                     (s[j] == '}' || 
                      s[j] == ']' || 
                      s[j] == ')')){
                stack.push('0');
                break;
            }
        }
        if(stack.empty()){
            answer++;
        }
        char str = s[0];
        s = s.substr(1);
        s = s + str;
    }
    return answer;
}