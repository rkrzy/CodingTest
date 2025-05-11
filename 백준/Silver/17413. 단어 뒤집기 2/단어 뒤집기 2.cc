#include <iostream>
#include <stack>
using namespace std;

int main(){

    string str;
    getline(cin, str);
    int i = 0;
    bool flag = false;
    stack<char> s;
    while(str[i] != '\0')
    {
        if(str[i] == '<')
        {
            flag = true;
            while(!s.empty()){
                cout << s.top();
                s.pop();
            }
        }
        else if(str[i] == '>')
        {
            flag = false;
            cout << str[i];
        }

        if(!flag){
            if((str[i] >= 97 && str[i] <= 122) || (str[i] >= 48 && str[i] <= 57))
            {
                s.push(str[i]);
            }
            else if(str[i] == ' '){
                while(!s.empty()){
                    cout << s.top();
                    s.pop();
                }
                cout << str[i];
            }
        }
        else{
            cout << str[i];
        }
        i++;
    }

    while(!s.empty()){
        cout << s.top();
        s.pop();
    }
    return 0;
}
