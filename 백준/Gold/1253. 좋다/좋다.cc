#include <iostream>
#include <algorithm>
using namespace std;

/*
 * 1. 배열을 만들어서 arr[index] + arr[N-index] = N인지 찾는건 불가능 => 숫자의 수 40억개
 * 2. 음수가 나올 수 있다.
 */

int main(){

    int N;
    int result = 0;
    cin >> N;

    int arr[N];

    for(int i = 0; i < N; i++){
        cin >> arr[i];
    }
    sort(arr, arr + N); //먼저 정렬 수행
    for(int i = 0; i < N; i++){
        int low = 0;
        int high = N - 1;
        while(low < high) {
            if(low == i) low++;
            else if(high == i) high--;
            else if(arr[low] + arr[high] < arr[i]) low++;
            else if(arr[low] + arr[high] > arr[i]) high--;
            else{
                result++;
                break;
            }
        }
    }
    cout << result;
}