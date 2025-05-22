#include <iostream>
#include <set>
#include <string>
#include <algorithm>
using namespace std;

/*
 * 데이터를 삭제할 때 연산 명령에 따라 우선순위가 가장 높은, 가장 낮은 데이터 중 하나 삭제
 * 동일한 정수 삽입 가능
 * D 1은 Q에서 최댓값을 삭제
 * D-1은 Q에서 최솟값을 삭제
 * 동일한 최댓값, 최솟값이 두개 이상일 때 하나만 삭제된다.
 */
int main()
{
    int T; // 테스트 개수
    int K; // 연산의 개수
    string command;
    int num;
    cin >> T;
    for(int i = 0; i < T; i++){
        cin >> K;
        multiset<int> ms;
        for(int j = 0; j < K; j++){
            cin >> command >> num;
            if(command == "I")
            {
                ms.insert(num);
            }
            else{
                if(!ms.empty()){
                    if (num == 1) {
                        auto it = prev(ms.end());
                        ms.erase(it);
                    } else {
                        ms.erase(ms.begin());
                    }
                }
            }
        }
        if(ms.empty()){
            cout << "EMPTY"<<"\n";

        }
        else{
            cout << *prev(ms.end()) << " " << *ms.begin() << "\n";
        }
    }
}