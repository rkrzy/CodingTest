#include <iostream>
#include <cmath>
using namespace std;


int main() {
    long long X, Y, W, S;
    long long result = 0;
    cin >> X >> Y >> W >> S;

    int minNum = min(X, Y);
    int maxNum = max(X, Y);

    if(2 * W < S){
        result = (X * W) + (Y * W);
    }
    else{
        result += minNum * S;
        if(2 * W < 2 * S){
            result += (maxNum - minNum) * W;
        }else{

            if(((maxNum - minNum)  % 2) == 1){
                result += (maxNum - minNum - 1) * S;
                result += W;
            }
            else{
                result += (maxNum - minNum) * S;
            }

        }
    }
    cout << result;
}