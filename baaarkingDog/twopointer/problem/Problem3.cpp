#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int N;
    cin >> N;
    int arr[N];
    for(int i = 0; i < N; i++){
        cin >> arr[i];
    }
    long result = 0;
    bool judge[100001] = {false, };
    int start = 0;
    int end = 0;

    while(start < N){
        while(!judge[arr[end]] && end < N) {
            judge[arr[end]] = true;
            end++;
        }
        result += end - start;

        judge[arr[start]] = false;
        start++;
    }
    cout << result;
}
