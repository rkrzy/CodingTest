#include <iostream>
#include <string>
#include <cmath>
using namespace std;

int main() {
    string str;
    cin >> str;

    int index = 0;
    int num = 1;
    while(index != str.length())
    {
        string numStr = to_string(num);

        for(int i = 0; i < numStr.length(); i++){
            if(str[index] == numStr[i]){
                index++;
                if(index == str.length()){
                    cout << num;
                    return 0;
                }
            }
        }
        num++;
    }


}