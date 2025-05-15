#include <iostream>
#include <queue>
#include <sstream>
#include <algorithm>
#include <list>
using namespace std;

void printing(list<int> * l, bool rev)
{

    cout << "[";
    if(rev){
        for (auto it = l->rbegin(); it != l->rend(); ++it) {
            cout << *it;
            if (next(it) != l->rend()) cout << ",";
        }
    }else{
        for (auto it = l->begin(); it != l->end(); ++it) {
            cout << *it;
            if (next(it) != l->end()) cout << ",";
        }
    }

    cout << "]";
    cout << '\n';
}

int main()
{
    int T;
    cin >> T;
    string command;
    int count;
    string arr_str;

    for(int i = 0; i < T;i ++) {
        list<int> l;
        bool flag = true;
        bool rev = false;
        cin >> command >> count >> arr_str;
        arr_str = arr_str.substr(1, arr_str.size() - 2);
        stringstream ss(arr_str);
        string token;
        while (getline(ss, token, ',')) {
            l.push_back(stoi(token));
        }

        for (char j: command) {
            if (j == 'R') {
                rev = !rev;
            } else {
                if (l.empty()) {
                    cout << "error" << '\n';
                    flag = false;
                    break;
                } else {
                    if(rev){
                        l.pop_back();
                    }else{
                        l.pop_front();
                    }
                }
            }
        }
        if (flag) {
            printing(&l,rev);
        }
    }
}