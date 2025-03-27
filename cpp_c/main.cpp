#include <iostream>
#include <queue>
using namespace std;

class cmp{
public:
    bool operator() (int a, int b){
        return a > b;
    }
};
int main() {

    cin.tie(NULL);
    cout.tie(NULL);
    priority_queue<int, vector<int>, cmp> pq;
    int N;

    cin >> N;

    for(int i = 0; i < N; i++){
        int num = 0;
        cin >> num;
        if(num == 0){
            if(pq.empty()){
                cout << "0" << '\n';
            }
            else{
                cout << pq.top() << '\n';
                pq.pop();
            }
        }
        else{
            pq.push(num);
        }
    }
}
