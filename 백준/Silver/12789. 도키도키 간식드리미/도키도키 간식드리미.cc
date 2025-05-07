#include <iostream>
#include <stack>
using namespace std;


int main() {
    int N;
    int temp;
    int i = 0;
    int time = 1;
    stack<int> s;
    cin >> N;
    for(i = 0; i < N; i++) {
        cin >> temp;
        if (time != temp)
        {
            s.push(temp);
        }
        else{
            time++;
            if(!s.empty() && time == s.top()){
                while(!s.empty() && s.top() == time){
                    s.pop();
                    time++;
                }
            }
        }
    }

    while(!s.empty() && s.top() == time){
        s.pop();
        time++;
    }
    if(s.empty()){
        cout << "Nice";
    }
    else {
        cout << "Sad";
    }
}