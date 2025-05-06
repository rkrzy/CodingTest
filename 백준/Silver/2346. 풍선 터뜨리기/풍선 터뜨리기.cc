#include <iostream>
#include <vector>
#include <algorithm>
#include <deque>
using namespace std;


int main() {
    int N;
    int temp;

    deque<pair<int,int> > dq;
    cin >> N;
    for(int i = 1; i <= N; i++){
        cin >> temp;
        dq.push_back(make_pair(i,temp));
    }
    while(!dq.empty()){
        int temp = dq.front().second;
        int index = dq.front().first;
        dq.pop_front();
        cout << index<<" ";

        if(dq.size() != 0){
            if(temp > 0){
                for(int i = 0; i < temp-1; i++){
                    dq.push_back(dq.front());
                    dq.pop_front();
                }
            }
            else {
                temp = -temp;
                for(int i = 0; i < temp; i++){
                    dq.push_front(dq.back());
                    dq.pop_back();
                }
            }
        }
    }
}