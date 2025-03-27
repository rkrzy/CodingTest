#include <iostream>
#include <algorithm>
#include <climits>
using namespace std;


int solution(int * arr, int N, int M){
    int result = 0;
    int start = 0;
    int end = 0;
    int total = arr[0];
    while(start <= N && end < N){
        if(total < M){
            total += arr[++end];
        }
        else if(total == M){
            result++;
            total += arr[++end];
        }
        else if(total > M){
            total -= arr[start++];
            if(start > end){
                end = start;
                total = arr[start];
            }
        }
    }
    return result;
}

int main(){
    int N;
    int M;
    cin >> N >> M;
    int arr[N];
    for(int i = 0; i < N; i++){
        cin >> arr[i];
    }
    cout << solution(arr, N, M);
}
