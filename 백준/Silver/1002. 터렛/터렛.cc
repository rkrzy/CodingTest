#include <iostream>
#include <cmath>
using namespace std;



int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int T;

    cin >> T;

    int x1, x2;
    int y1, y2;
    int r1, r2;

    for(int i = 0; i < T; i++){
        cin >> x1 >> y1 >> r1 >> x2 >> y2 >> r2;

        double distance = sqrt(pow(x1 - x2,2) + pow(y1 - y2, 2));
        double distance2 = r1 > r2 ? r1 -r2 : r2 - r1;

        if(distance == 0 && r1 == r2)
        {
            cout << "-1" <<"\n";
        }
        else if(r1 + r2 == distance || distance2 == distance){
            cout << "1" << "\n";
        }
        else if(r1 + r2 > distance && distance2 < distance){
            cout << "2" << "\n";
        }else {
            cout << "0" << "\n";
        }
    }


}