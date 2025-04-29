#include <iostream>
using namespace std;


int main() {
    int N,M;
    cin >> N >> M;
    int result = 1;
    string num;
    int arr[51][51];
    for(int i = 0; i < N; i++){
        cin >> num;
        for(int j = 0; j < M; j++){
            arr[i][j] = (num[j] - 48);
        }
    }
    for(int i = 0; i < N; i++){
        for(int j = 0; j < M; j++){
            for(int k = j+1; k < M; k++){
                if(arr[i][j] == arr[i][k]){
                    int len = k - j;
                    if(i+len < N &&
                    arr[i+len][j] == arr[i][j] &&
                    arr[i+len][k] == arr[i][k]){
                        if(result < (len + 1) * (len + 1)){
                            result = (len + 1) * (len + 1);
                        }
                    }
                }
            }
        }
    }
    cout << result;
}