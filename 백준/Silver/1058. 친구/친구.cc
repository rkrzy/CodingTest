#include <iostream>
#include <cmath>

using namespace std;


/*
 * 확인을 하면서 1인 값을 찾는다.
 * 만약 1인 값이 나온다면 이 친구의 친구가 몇명 연결되어 있는지 확인한다.
 *
 */


int main(){

    int answer = 0;
    int N;
    string str;
    cin >> N;
    int v[51][51];

    for(int i = 0; i < N; i++){
        cin>>str;
        for(int j = 0; j < N; j++)
        {
            if(str[j] == 'Y'){
                v[i][j] = 1;
            }else{
                v[i][j] = 0;
            }
        }
    }

    for(int i = 0; i < N; i++){
        int num = 0;
        bool vis[51] = {false, };
        for(int j = 0; j <N; j++){
            if(i == j) continue;
            if(v[i][j]){
                num++;
            }else{
                for(int k = 0; k < N; k++){
                    //i가 k의 친구일때 k가 j의 친구이면 가능하다.
                    if(v[i][k] && v[k][j]){
                        num++;
                        break;
                    }
                }
            }
        }
        answer = max(answer ,num);
    }
    cout << answer;




}