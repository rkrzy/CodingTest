#include <iostream>
#include <queue>
#include <vector>
#include <algorithm>
using namespace std;

/*
 * 원하는 문서 = M -> 중요도가 더 높은게 있는지 확인 -> 없으면 종료 및 출력
 * 중요도가 더 높은게 있다면
 */

int main(){
    int T;
    int N,M;
    int val;

    cin >> T;
    for(int i = 0; i < T; i++){
        queue<pair<int, int> > q;
        vector<int> values;
        int count =0;
        cin >> N >> M;
        for(int j = 0; j < N; j++){
            cin >> val;
            q.push(make_pair(j, val));
            values.push_back(val);
        }
        sort(values.begin(), values.end());
        while(!q.empty()){
            if(q.front().second == values.back()){
                if(q.front().first == M){
                    count++;
                    cout << count << "\n";
                    break;
                }
                else
                {
                    count++;
                    values.pop_back();
                    q.pop();
                }
            }else
            {
                pair<int, int>  temp = q.front();
                q.push(temp);
                q.pop();
            }
        }
    }
}