#include <iostream>
#include <map>
#include <algorithm>
using namespace std;

int main(){
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

    int N = 0;
    int M = 0;
    string site;
    string pwd;
    string f;
    cin >> N >> M;
    map<string, string> m;

    for(int i = 0; i < N; i++)
    {
        cin >> site >> pwd;
        m[site] = pwd;
    }
    for(int i = 0;i < M; i++){
        cin >> f;
        cout << m[f] << "\n";
    }
}
