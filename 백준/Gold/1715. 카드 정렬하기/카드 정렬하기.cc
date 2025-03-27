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

    int N;
    int answer = 0;
    cin >> N;
    priority_queue<int, vector<int>, cmp> pq;

    for(int i = 0; i < N; i++){
        int num;
        cin >> num;
        pq.push(num);
    }
    while(pq.size() != 1){
        int num1 = pq.top();
        pq.pop();
        int num2 = pq.top();
        pq.pop();
        int result = num1 + num2;
        answer += result;
        pq.push(result);
    }
    cout << answer;
}
