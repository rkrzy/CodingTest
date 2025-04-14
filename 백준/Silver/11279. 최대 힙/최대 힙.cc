#include <iostream>
#include <vector>
#include <queue>
using namespace std;


int main() {
    cin.tie(NULL);
    cout.tie(NULL);
    int N;
    int num;
    priority_queue<int> q;
    cin >> N;

    for (int i = 0; i < N; i++) {
        cin >> num;
        if(num == 0){
            if(q.empty()){
                cout << 0 << "\n";
            }
            else{
                cout << q.top() <<"\n";
                q.pop();
            }
        }else{
            q.push(num);
        }
    }
}