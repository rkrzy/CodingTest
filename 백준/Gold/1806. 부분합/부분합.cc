#include <iostream>
#include <algorithm>
#include <climits>
using namespace std;

/*
 * 1. N(10 <= N < 100000) => int로 입력받아도 허용 가능
 * 2. S(0 < S <= 100,000,000) => int로 입력받아도 허용 가능
 * 3. 각 원소는 공백으로 구분되어 받아짐
 * 4. 각 원소 > 10,000이하의 자연수
 */

/*
 * 문제 조건 : 가장 짧은 길이의 부분합을 구하기
 * 합을 만드는게 불가능이면 ? : 0출력
 */

int solution(int * arr, int n, int s){
    int end = 0;
    int result = INT_MAX;
    int total = arr[0];

    for(int start = 0; start < n; start++){
        //만약 end가 n보다 작고 total이 s보다 작아야만 조건이 성립한다.
        while(end < n && total < s) {
            end++;
            if(end != n) total += arr[end];
        }
        if(end == n)break;
        result = min(result, end - start + 1);
        total -= arr[start];
    }
    if(result == INT_MAX) return 0;
    return result;
}
int main(){
    ios::sync_with_stdio(0);
    cin.tie(0);
    int n;
    int s;
    cin >> n >> s;
    int arr[n];

    for(int i = 0; i < n; i++){
        cin >> arr[i];
    }
    cout<<solution(arr, n, s);
}
