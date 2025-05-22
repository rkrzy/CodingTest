#include <iostream>
#include <map>
#include <string>
using namespace std;

bool isNumber(string * s){
    try{
        stoi(*s);
        return true;
    }catch (...){
        return false;
    }
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(0);

    int N, M;
    int cnt = 1;
    string temp;
    cin >> N>> M;
    map<string, int> mapStr;
    map<int, string> mapInt;

    for(int i = 1; i <= N; i++){
        cin >> temp;
        mapStr[temp] = i;
        mapInt[i] = temp;
    }
    for(int i = 0; i < M; i++){
        cin >> temp;
        if(isNumber(&temp)){
            cout << mapInt[stoi(temp)] << "\n";
        }else{
            cout << mapStr[temp] << "\n";
        }
    }
}