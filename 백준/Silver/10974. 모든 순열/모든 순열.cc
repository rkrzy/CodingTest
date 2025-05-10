#include <iostream>
#include <vector>
using namespace std;


void solution(bool * visited, vector<int> v, int N){

    if(v.size() == N){
        for(int i = 0; i < N; i++){
            cout << v[i] << " ";
        }
        cout << "\n";
    }
    for(int i = 1; i <= N; i++){
        if(!visited[i]){
            visited[i] = true;
            v.push_back(i);
            solution(visited, v, N);
            v.pop_back();
            visited[i] = false;
        }
    }
}

int main(void){
    int N;
    vector<int> v;
    cin >> N;

    bool visited[N + 1];
    for(int i = 1; i <= N; i++){
        visited[i] = false;
    }
    solution(visited, v, N);

}