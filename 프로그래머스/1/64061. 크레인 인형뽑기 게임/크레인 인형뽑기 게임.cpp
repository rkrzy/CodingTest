#include <string>
#include <vector>
#include <stack>
#include <iostream>
using namespace std;
//만약 moves에 들어있는 수가 i라고 했을 때
//[j][i-1] 여기서 j는 0이 아닌 값이 나올때까지
//줄에 아무것도 없다는 판단 조건 j == board[i-1].size() 일때
//만약 사라지는 조건 : st.top() == current일때 => st.pop()
//만약 일치하지 않다면 :st.top() == current || st.empty() => st.push(current)
int solution(vector<vector<int>> board, vector<int> moves) {
    stack<int> st;
    int answer = 0;
    int leng = board.size();
    
    for(int i : moves){
        int j = 0;
        //땅에 도달하지 않으면서 0이 아닌수를 찾을 때 까지 계속 내려간다.
        while(j < leng && board[j][i-1] == 0){
            j++;
        }
        //만약 숫자가 아무것도 없는 칸이라면
        if(j == leng)continue;
        
        int current = board[j][i-1];
        board[j][i-1] = 0;
        
        if(!st.empty()&& st.top() == current){
            st.pop();
            answer += 2;
        }
        else{
            st.push(current);
        }
    }
    
    return answer;
}