#include <string>
#include <vector>

using namespace std;

//작은값이 지갑의 작은값보다 작아야 한다.
//큰값이 지갑의 큰값보다 작아야 한다.
int solution(vector<int> wallet, vector<int> bill) {
    int answer = 0;
    int max_value = max(bill[0], bill[1]);
    int min_value = min(bill[0], bill[1]);
    int wallet_min = min(wallet[0], wallet[1]);
    int wallet_max = max(wallet[0], wallet[1]);
    while(min_value > wallet_min || max_value > wallet_max)
    {
        if(bill[0] > bill[1]){
            bill[0] = bill[0]/2;
        }
        else{
            bill[1] = bill[1]/2;
        }
        max_value = max(bill[0], bill[1]);
        min_value = min(bill[0], bill[1]);
        answer++;
    }
    return answer;
}