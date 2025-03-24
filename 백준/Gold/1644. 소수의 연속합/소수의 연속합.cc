#include <iostream>
#include <vector>

using namespace std;



int solution(vector<int> arr, int N){
    if(arr.empty())return 0;
    int result = 0;
    int start = 0;
    int end = 0;
    int total = arr[0];
    while(start < arr.size() && end < arr.size()){
        if(total < N){
            if (++end >= arr.size()) break;
            total += arr[end];
        }
        else if(total == N){
            result++;
            if (++end >= arr.size()) break;
            total += arr[end];
        }
        else{
            total -= arr[start++];
            if(start > end){
                end = start;
                if(start < arr.size()){
                    total = arr[start];
                }
            }
        }
    }
    return result;
}
int main(){
    int N;
    cin >> N;
    vector<int> v;
    vector<bool> arr(N + 1, false);

    for(int i = 2; i * i <= N; i++){
        if(!arr[i]){
            for(int j = i * i; j <= N; j += i){
                arr[j] = true;
            }
        }
    }

    for(int i = 2; i <= N; i++){
        if(!arr[i]){
            v.push_back(i);
        }
    }
    cout<<solution(v, N);
}
