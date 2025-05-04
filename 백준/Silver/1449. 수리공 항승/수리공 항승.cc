#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;




int main() {
    int N;
    int L;
    float temp = 0;
    float minNum = 0;
    float maxNum = 0;
    int result = 0;
    vector<float> v;

    cin >> N >> L;

    for(int i = 0; i < N; i++){
        cin >> temp;
        v.push_back(temp);
    }
    sort(v.begin(), v.end());

    for(float num : v){
        if(minNum <= num && maxNum >= num){
            continue;
        }else
        {
            minNum = num - 0.5;
            maxNum = minNum + L;
            result++;
        }
    }
    cout << result;
}