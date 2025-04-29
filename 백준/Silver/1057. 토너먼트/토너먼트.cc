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
   int result = 1;
   int maxNum, minNum;
   cin >> N >> imNum >> kimNum;
   maxNum = max(imNum, kimNum);
   minNum = min(imNum, kimNum);
   while(true){
       if(maxNum-1 == minNum && maxNum % 2 == 0){
           break;
       }
       if(maxNum % 2 == 0){
           maxNum /= 2;
       }else
       {
           maxNum = (maxNum+1) / 2;
       }
       if(minNum % 2 == 0){
           minNum /= 2;
       }else{
           minNum = (minNum+1) / 2;
       }
//       cout << maxNum << minNum << "\n";
       result++;
   }
cout << result;


}