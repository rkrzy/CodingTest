#include <iostream>

using namespace std;

/*
 * N = x + (x+1) + (x+2) + ---- + (x + (L-1))
 * N = (L * x) + (1+2+3+ ---- +(L-1))
 * N = (L * x) + t (t = 1+2+3---+(L-1))
 * t = (L+(L-1) / 2
 */

int main(){

    int N;
    int L;

    cin >> N >> L;

    int start = -1;
    int count = 0;

    for(int i = L; i <= 100; i++){
        int t = i * (i-1) /2;

        if((N - t) % i == 0 && (N - t) / i >= 0){
            start = (N - t) / i;
            count = i;
            break;
        }
    }
    if(start < 0){
        cout << start;
        return 0;
    }
    for(int i = 0 ;i < count; i++){
        cout << start + i << " ";
    }

}