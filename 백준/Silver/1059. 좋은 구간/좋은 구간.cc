#include <iostream>
#include <algorithm>
using namespace std;

/*
 * S의 원소를 포함하지 않는다.
 * N을 포함하는 구간을 구하면 된다.
 */
int main() {

    int L = 0;
    int N = 0;
    cin >> L;
    int arr[51] = {0,};
    int minNum = 0;
    int maxNum = 0;
    int result = 0;
    for(int i = 0; i < L; i++){
        cin >> arr[i];
    }
    cin >> N;
    if(find(arr, arr + L, N) != arr + L){
        cout << 0;
        return 0;
    }
    sort(arr, arr + L);
    for(int i = 0; i < L-1; i++){
        if(arr[i] < N && arr[i+1] > N){
            minNum = arr[i];
            maxNum = arr[i+1];
        }
    }
    if(N < arr[0]){
        minNum = 1;
        maxNum = arr[0];
        result = (N-minNum) + (maxNum - N-1) + ((N-minNum) * (maxNum -N-1));
    }
    else if(N > arr[L-1]){
        minNum = arr[L-1];
        maxNum = 1000;
        result = (N-minNum-1) + (maxNum - N) + ((N-minNum-1) * (maxNum -N));
    }
    else
    {
        result = (N - minNum - 1) + (maxNum - N - 1) + ((N-minNum - 1) * (maxNum - N -1));
    }

    cout << result;
}