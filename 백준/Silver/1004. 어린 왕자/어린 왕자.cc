#include <iostream>
#include <algorithm>
#include <cmath>
using namespace std;

/*
 * 출발점, 도착점의 좌표를 포함하는 원이 몇개인지 구하면 된다.
 */
int main() {

    int T;
    int x1, x2, y1, y2;
    int n;
    int c1, c2, r;

    cin >> T;
    for(int i = 0; i < T; i++){
        int result = 0;
        cin >> x1 >> y1 >> x2 >> y2;
        cin >> n;
        for(int j = 0; j < n; j++){
            cin >> c1 >> c2 >> r;
            if(sqrt(pow(x1 - c1, 2) + pow(y1 - c2, 2)) < r &&
                    sqrt(pow(x2 - c1, 2) + pow(y2 - c2, 2)) < r){
                continue;
            }else if(sqrt(pow(x1 - c1, 2) + pow(y1 - c2, 2)) < r){
                result++;
            }
            else if(sqrt(pow(x2 - c1, 2) + pow(y2 - c2, 2)) < r){
                result++;
            }
        }
        cout << result << "\n";
    }

}