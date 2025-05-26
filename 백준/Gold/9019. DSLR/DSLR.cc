#include <iostream>
#include <queue>
using namespace std;

int shiftRight(const int num){
    int right_num = (num % 10) * 1000;
    int left_num = (num/10);
    return right_num + left_num;
}
int shiftLeft(const int num){
    int right_num = (num/1000);
    int left_num = (num%1000) * 10;
    return left_num + right_num;
}
int minusOne(const int num){
    int temp = num - 1;
    if(temp == -1){
        return 9999;
    }
    return temp;
}
int multiple(const int num){
    return (num*2) % 10000;
}
int main()
{
    int T;
    cin >> T;
    int start, distance;

    for(int i = 0; i < T; i++){
        cin >> start >> distance;
        bool visited[10001] = {false,};
        queue<pair<int,string> > q;
        q.push(make_pair(start, ""));
        visited[start] = true;
        while(!q.empty()){
            int fir = q.front().first;
            string sec = q.front().second;
            q.pop();
            if(fir == distance){
                cout << sec << "\n";
                break;
            }
            int firD = multiple(fir);
            int firS = minusOne(fir);
            int firL = shiftLeft(fir);
            int firR = shiftRight(fir);
            if(!visited[firD]){
                q.push(make_pair(firD, sec+"D"));
                visited[firD] = true;
            }
            if(!visited[firS]){
                q.push(make_pair(firS, sec+"S"));
                visited[firS] = true;
            }
            if(!visited[firL]){
                q.push(make_pair(firL, sec+"L"));
                visited[firL] = true;
            }
            if(!visited[firR]){
                q.push(make_pair(firR, sec+"R"));
                visited[firR] = true;
            }
        }
    }
}