#include <string>
#include <vector>
#include <unordered_map>
using namespace std;

bool solution(vector<string> phone_book) {
    bool answer = true;
    unordered_map<string, int> book;
    for(string str : phone_book){
        book[str] = 0;
    }
    for(string phone_number : phone_book){
        string prefix = "";
        for(char ch : phone_number) {
            prefix += ch;
            
            if(prefix != phone_number && book.count(prefix)){
                return false;
            }
        }
    }
    
    
    return true;
}