#include <iostream>

using namespace std;

/*
 * 짝수일때 : num / 2
 * 홀수일때 : (num + 1) / 2
 *
 * 성공하는 조건 : 두 수가 인접해서 있다 && 큰 수가 짝수
 */

int main() {

   int N;
   int imNum, kimNum;
   int result = 0;

   cin >> N >> imNum >> kimNum;
   while(imNum != kimNum){
        imNum = (imNum+1)/2;
        kimNum = (kimNum+1)/2;
        result++;
   }
cout << result;


}