#include <iostream>
#include <algorithm>

using namespace std;

/*
 * 만약 글의 길이가 홀수 일때 = 문자 1개 존재가 가능
 * 만약 글의 길이가 짝수 일때 = 문자 1개인거 존재 못함
 *
 * 안되는 조건
 * - 알파벳 하나가 홀수 일 때 && 문자열 전체 길이가 짝수
 * - 알파벳 두개가 홀수 일 때
 */
int main() {
    string str;

    cin >> str;
    int strLen = str.length();
    int arr[26] = {0,};
    char newStr[strLen];
    int count = 0;
    for(int i = 0; i < str.length(); i++){
        arr[str[i] - 65]++;
    }
    for(int i = 0; i < 26; i++){
        if(arr[i] % 2 != 0){
            count++;
        }
    }
    if(count >= 2 || (count == 1 && str.length()%2 == 0))
    {
        cout<<"I'm Sorry Hansoo";
        return 0;
    }
    int num = 0;
    strLen -= 1;
    for(int i = 0; i < 26; i++){
        if(arr[i] == 1){
            newStr[strLen / 2] = 65 + i;
        }
        else if(arr[i] % 2 == 0){
            while(arr[i]){
                newStr[num] = 65 + i;
                arr[i]--;
                newStr[strLen - num] = 65 + i;
                arr[i]--;
                num++;
            }
        }
        else if(arr[i] % 2 == 1){
            while(arr[i]){
                if(arr[i] == 1){
                    newStr[strLen / 2] = 65 + i;
                    arr[i]--;
                    break;
                }
                newStr[num] = 65 + i;
                arr[i]--;
                newStr[strLen - num] = 65 + i;
                arr[i]--;
                num++;

            }

        }
    }
    for(int i = 0; i < strLen + 1; i++){
        cout<<newStr[i];
    }
}