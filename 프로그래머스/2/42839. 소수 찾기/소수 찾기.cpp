#include <string>
#include <vector>
#include <cmath>
#include <algorithm>
#include <set>
using namespace std;

bool is_prime(int n){
    if(n <= 1){
        return false;
    }
    for(int i = 2; i <= sqrt(n); i++){
        if(n % i == 0){
            return false;
        }
    }
    return true;
}
int solution(string numbers) {
    vector<char> save;
    set<int> result;
    //모든 문자를 하나하나쪼개서 char형태로 저장한다.
    for(int i = 0; i < numbers.length(); i++){
        save.push_back(numbers[i]);
    }
    sort(save.begin(), save.end());
    
    //순열로 문자열을 만들어내서 중복되는 값을 제거하는 
    do{
        string str = "";
        for(char i : save){
            str += i;
            int num = stoi(str);
            if(is_prime(num)){
                result.insert(num);
            }
        }
    }while(next_permutation(save.begin(), save.end()));
    
    return result.size();
}