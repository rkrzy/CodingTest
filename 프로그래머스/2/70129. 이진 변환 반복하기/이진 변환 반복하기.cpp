#include <string>
#include <vector>
#include <iostream>
using namespace std;

vector<int> solution(string s) {
    vector<int> answer;
    int result = 0;
    int zero = 0;
    int one = 0;
    while(s.length() != 1){
        for(int i = 0; i < s.length(); i++){
            if(s[i] == '0'){
                zero++;
            }
            else{
                one++;
            }
        }
        result ++;
        string str ="";
        while(one != 0){
            if(one % 2 == 1){
                str = "1" + str;
            }
            else{
                str = "0" + str;
            }
            one = one/2;
        }
        cout << str<<endl;
        s = str;
    }
    answer.push_back(result);
    answer.push_back(zero);
    return answer;
}