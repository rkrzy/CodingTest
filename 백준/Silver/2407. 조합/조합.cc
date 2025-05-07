#include <iostream>
#include <string>
#include <set>
using namespace std;

string string_plus(string str1, string str2){
    string result = "";
    int i = str1.size() - 1, j = str2.size() - 1;
    int carry = 0;

    while (i >= 0 || j >= 0 || carry) {
        int a = (i >= 0) ? str1[i--] - '0' : 0;
        int b = (j >= 0) ? str2[j--] - '0' : 0;
        int sum = a + b + carry;
        carry = sum / 10;
        result = char((sum % 10) + '0') + result;
    }

    return result;
}

int main() {
    int n, m;
    string arr[101][101];

    cin >> n >> m;
    for(int i = 0; i <= 100; i++){
        arr[i][0] = "1";
    }

    for(int i = 1; i <= 100; i++){
        for(int j = i; j <= 100; j++){
            if(i == j){
                arr[i][j] = '1';
            }
            else{
                arr[j][i] = string_plus(arr[j-1][i-1], arr[j-1][i]);
            }
        }
    }
    cout << arr[n][m];
}