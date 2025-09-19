#include <string>
#include <vector>
#include <iostream>
using namespace std;

int solution(string s) {
    int answer = 0;
    int index = 0;
    while(index < s.length()){
    if(s[index] == 'z'){
        index += 4;
        answer = answer * 10;
    }
    else if(s[index] == 'o'){
        index += 3;
        answer = (answer * 10) + 1; 
        cout << answer<<endl;
    }else if(s[index] == 't'){
        if(s.substr(index, 3) == "two"){
            answer = (answer * 10) + 2; 
            index += 3;
            cout << answer<<endl;
        }
        else{
            answer = (answer * 10) + 3; 
            index += 5;
            cout << answer<<endl;
        }
    }else if(s[index] == 'f'){
        if(s.substr(index, 4) == "four"){
            answer = (answer * 10) + 4; 
            index += 4;
        }
        else{
            answer = (answer * 10) + 5; 
            index += 4;
        }
    }
    else if(s[index] == 's'){
        if(s.substr(index, 3) == "six"){
            answer = (answer * 10) + 6; 
            index += 3;
        }else{
            answer = (answer * 10) + 7; 
            index += 5;
        }
    }
    else if(s[index] == 'e'){
        answer = (answer * 10) + 8; 
        index += 5;
    }
    else if(s[index] == 'n'){
        answer = (answer * 10) + 9; 
        index += 4;
    }
    else{
        answer = (answer * 10) + (s[index] - 48);
        index += 1;
    }
    }
    return answer;
}