#include <iostream>
#include <string>
#include <map>
using namespace std;


/*
 * 절반을 초과하는 숫자가 없다면 = SYJKGW
 * 절반을 초과하는 숫자가 있다면 = result출력
 */
int main() {

    ios::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);
    int N = 0;
    int T = 0;
    long long temp = 0;


    cin >> N;


    for(int i = 0; i < N; i++){
        cin >> T;
        bool flag = false;
        int half = T/2 + 1;
        long long result = 0;
        map<long long, int> m;
        for(int j = 0; j < T; j++){
            cin >> temp;
            if(m.count(temp)){
                m[temp]++;
            }
            else{
                m[temp] = 1;
            }
        }
        for(auto it = m.begin(); it != m.end(); it++){
            if(it->second >= half){
                flag = true;
                result = it->first;
                break;
            }
        }

        if(!flag){
            cout << "SYJKGW" << "\n";
        }else{
            cout << result << "\n";
        }
    }
}