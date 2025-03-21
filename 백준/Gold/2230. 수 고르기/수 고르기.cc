#include <iostream>
#include <algorithm>
#include <climits>
using namespace std;

/*
 * M : 두수의 차이가 M이상이 나와야 한다.
 * A[] : 배열
 */

int solution(int * a, int size,int M){
    int end = 0;
    int result = INT_MAX;
    for(int start = 0;start < size; start++){
        //a[end] - a[start] < M 이어야 문제의 조건을 만족한다.
        //end == size : ++이이미 되어서 end가 size와 같아지는 경우가 발생할 수 있다. 따라서 같으면 break로 종료를 해준다.
        while(end < size && a[end] - a[start] < M) end++;
        if(end == size) break;
        //그중에서 가장 작은 값을 찾아낸다.
        result = min(result, a[end] - a[start]);
    }
    return result;
}

int main(){
    int N;
    int M;
    cin >>N >> M;
    int a[N];
    for(int i = 0; i < N; i++){
        cin >> a[i];
    }
    sort(a, a+N);

    cout << solution(a, N, M);
}
