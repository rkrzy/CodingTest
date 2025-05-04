#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

/*
 * 삼각형의 성립 조건 : 세변의 길이 중 두개의 변을 더했을 때 나머지 한변의 길이보다 길어야 한다.
 */

bool isTriangle(int a, int b, int c){
    return (a + b > c) && (b + c > a) && (a + c > b);
}

int main() {
    int N;
    cin >> N;
    int temp;
    vector<int> v;
    int result = -1;
    for(int i = 0; i < N; i++){
        cin >> temp;
        v.push_back(temp);
    }
    std::sort(v.begin(), v.end(), greater<int>());
    for(int i = 0; i < v.size() - 2; i++){
        for(int j = i+1; j < v.size() - 1; j++){
            if(isTriangle(v[i], v[j], v[j+1]) && result < v[i] + v[j] + v[j+1]){
                result = v[i] + v[j] + v[j+1];
                cout << result;
                return 0;
            }
        }
    }
    cout << -1;
}