#include <iostream>
#include <algorithm>
#include <climits>
using namespace std;


int main() {
    long long X; //게임 횟수
    long long Y; //이긴 게임
    cin >> X >> Y;
    int currentPer = (Y*100) / X;
    if(currentPer >= 99){
        cout << -1;
        return 0;
    }
    int left = 0;
    int right = 1000000000;
    int mid = 0;

    while(left <= right){
        mid = (left + right) / 2;
        long long temp = (long long)(Y + mid) * 100 / (X+mid);
        if(temp > currentPer){
            right = mid - 1;
        }
        else{
            left = mid + 1;
        }

    }
    cout << left;
}