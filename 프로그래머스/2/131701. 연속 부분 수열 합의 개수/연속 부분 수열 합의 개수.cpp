#include <string>
#include <vector>
#include <set>
using namespace std;
int elementAdd(vector<int> elements, int i, int j){
    int result = 0;
    int len = elements.size();
    for(int k = i; k <= j; k++){
        result += elements[k%len];
    }
    return result;
}
int solution(vector<int> elements) {
    int answer = 0;
    int len = elements.size();
    set<int> s;
    
    for(int i = 0; i < len; i++){
        for(int j = 0; j < len; j++){
            s.insert(elementAdd(elements,j , j + i));
        }
    }
    return s.size();
}