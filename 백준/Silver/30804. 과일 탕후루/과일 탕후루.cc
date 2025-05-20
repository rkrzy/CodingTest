#include <iostream>
#include <deque>
#include <cmath>

using namespace std;

int fruit[200000];
int mp[10] = {0,};
int N = 0;
bool success(const int * arr)
{
    int count = 0;
    for(int i = 1; i <= 9; i++){
        if(arr[i] > 0){
            count++;
        }
    }
    return count <= 2;
}

int solve() {
    int left = 0;
    int right = 0;
    int result = 0;
    while(left < N){
        while(right < N){
            mp[fruit[right++]]++;
            if(!success(mp)){
                right--;
                mp[fruit[right]]--;
                break;
            }

        }
//        cout << left <<" "<< right;
        result = max(result, right - left);
        mp[fruit[left++]]--;
    }
    return result;
}

int main()
{
    cin >> N;
    for(int i = 0; i < N; i++){
        cin >> fruit[i];
    }

    cout << solve();


}