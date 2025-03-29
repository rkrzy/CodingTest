#include <iostream>
#include <queue>
using namespace std;


int main() {

    int T;
    cin >> T;

    for(int i = 0; i < T; i++){
        priority_queue<long long, vector<long long>, greater<long long> > pq;
        int N;
        long long answer = 0;
        cin >> N;
        int temp = 0;
        for(int j = 0; j < N; j++){
            cin >> temp;
            pq.push(temp);
        }
        while(pq.size() > 1){
            long long result = 0;
            result += pq.top();
            pq.pop();
            result += pq.top();
            pq.pop();
            pq.push(result);
            answer += result;
        }
        cout << answer  << '\n';
    }

}
