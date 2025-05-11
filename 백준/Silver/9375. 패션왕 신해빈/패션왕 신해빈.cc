#include <iostream>
#include <map>
using namespace std;

int main(){
    int T;
    cin >> T;

    while (T--) {
        int N;
        cin >> N;
        map<string, int> m;
        string cloth, kind;
        for (int i = 0; i < N; i++) {
            cin >> cloth >> kind;
            m[kind]++;
        }
        int result = 1;
        for (auto& p : m) {
            result *= (p.second + 1);  
        }
        result -= 1;  
        cout << result << '\n';
    }

    return 0;
}
