#include <iostream>
#include <string>
#include <set>
using namespace std;


int main() {
    set<string> s;

    string str;
    string temp;
    cin >> str;
    for(int i = 0; i < str.length(); i++){
        for(int j = 0; j < str.length() - i; j++){
            temp = str.substr(j, i + 1);
            s.insert(temp);
        }
    }
    cout << s.size();

}