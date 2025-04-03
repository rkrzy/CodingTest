#include <iostream>
#include <queue>
using namespace std;


int main() {
    ios::sync_with_stdio(false);
    cin.tie();
    cout.tie();
    priority_queue<int, vector<int>, greater<int> > pq;
    int N;
    int answer;
    cin >> N;
    for(int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            cin >> answer;
            pq.push(answer);
            if (pq.size() > N) pq.pop();
        }
    }
    cout << pq.top();
}
