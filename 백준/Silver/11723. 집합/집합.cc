#include <iostream>
#include <bitset>
#include <sstream>
using namespace std;


void addRequest(bool * arr, int x){
    if(!arr[x]){
        arr[x] = true;
    }
}

void removeRequest(bool * arr, int x){
    if(arr[x]){
        arr[x] = false;
    }
}
int checkRequest(bool * arr, int x){
    if(!arr[x]){
        return 0;
    }else{
        return 1;
    }
}
void toggleRequest(bool * arr, int x){
    if(!arr[x]){
        arr[x] = true;
    }else{
        arr[x] = false;
    }
}
void allRequest(bool * arr){
    for(int i = 0; i < 21; i++){
        arr[i] = true;
    }
}
void emptyRequest(bool * arr){
    for(int i = 0; i < 21; i++){
        arr[i] = false;
    }
}

int main() {

    ios::sync_with_stdio(false);
    cin.tie(0);

    int m;
    string request = "";
    int number = 0;
    bool arr[21] = {false,};

    cin >> m;
    cin.ignore();
    for(int i = 0; i < m; i++){
        string cmd;
        cin>>cmd;
        int num = -1;

        if(cmd == "add"){
            cin >> num;
            addRequest(arr, num);
        }
        else if(cmd == "remove")
        {
            cin >> num;
            removeRequest(arr,num);
        }
        else if(cmd == "check")
        {
            cin >> num;
            cout << checkRequest(arr, num)<<"\n";
        }
        else if(cmd == "toggle")
        {
            cin >> num;
            toggleRequest(arr, num);
        }
        else if(cmd == "all")
        {
            allRequest(arr);
        }
        else{
            emptyRequest(arr);
        }

    }
}