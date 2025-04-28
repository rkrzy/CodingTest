#include <iostream>
#include <climits>

using namespace std;


int main() {
    int N;
    int M;
    int a, b;
    int result = INT_MAX;
    cin >> N >> M;
    int multi = INT_MAX;
    int each = INT_MAX;
    for(int i = 0; i < M; i++){
        cin >> a >> b;
        if(multi > a){
            multi = a;
        }
        if(each > b){
            each = b;
        }
    }
    if((N % 6) * each > multi){
        result = ((N / 6)+1) * multi;
    }
    else{
        if(multi < 6 * each){
            result = ((N / 6) * multi) + ((N%6) * each);
        }
        else{
            result = N * each;
        }

    }

    cout << result;
}