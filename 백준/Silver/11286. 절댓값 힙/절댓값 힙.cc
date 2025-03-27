#include <iostream>
#include <queue>
using namespace std;

class cmp {
public:
    bool operator() (int a, int b){
        if(abs(a) != abs(b)) return abs(a) > abs(b); // 절대값이 작은 게 먼저 오게 만든다.
        return a > 0 && b < 0; //절대값이 같으면 음수 먼저 오게 만든다.
    }
};

int main() {
    int N;
    cin >> N;
    priority_queue<int, vector<int>, cmp>pq;

    while(N--){
        int num;
        cin >> num;
        if(num == 0){
            if(pq.empty()) cout << "0\n";
            else{
                cout << pq.top() << '\n';
                pq.pop();
            }
        }
        else pq.push(num);
    }
}
