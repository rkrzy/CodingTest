#include <string>
#include <vector>

using namespace std;
enum DAY_OF_THE_WEEK{FRI,SAT,SUN,MON,TUE,WED,THU};
string toString(DAY_OF_THE_WEEK day){
    switch(day){
        case FRI: return "FRI";
        case SAT: return "SAT";
        case SUN: return "SUN";
        case MON: return "MON";
        case TUE: return "TUE";
        case WED: return "WED";
        case THU: return "THU";
    }
}
string solution(int a, int b) {
    vector<int> month(13);
    month[1] = 31;
    month[2] = 29;
    month[3] = 31;
    month[4] = 30;
    month[5] = 31;
    month[6] = 30;
    month[7] = 31;
    month[8] = 31;
    month[9] = 30;
    month[10] = 31;
    month[11] = 30;
    month[12] = 31;
    int days = 0;
    for(int i = 1; i < a;i++){
        days += month[i];
    }
    days += b;
    int day_week = (days-1) % 7;
    string answer = toString(static_cast<DAY_OF_THE_WEEK>(day_week));
    
    return answer;
}