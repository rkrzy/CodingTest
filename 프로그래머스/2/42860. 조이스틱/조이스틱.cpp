#include <string>
#include <vector>

using namespace std;
//만약 A면 건너 뛴다.
//알파벳 순서를 생각해서 가깝게 갈 수 있는 경로를 생각한다.

int solution(string name) {
    int answer = 0;
    int a_number = 0;
    int n = name.length();
    int min_move = n - 1;

    //각 자리를 맞출 때 최소의 수를 구한다.
    for(char ch : name){
        int chance = min(ch - 'A', 'Z' - ch + 1);
        answer += chance;
    }
    for(int i = 0; i < name.length(); i++){
        int next_idx = i + 1;
        while(next_idx < n && name[next_idx] == 'A'){
            next_idx++;
        }
        min_move = min(min_move, i + (n - next_idx) + min(i, n - next_idx));
    }
    answer += min_move;
    return answer;
}