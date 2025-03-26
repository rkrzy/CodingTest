#include <iostream>
#include <stack>
#include <queue>

using namespace std;

class element {
private:
    int depth;
    long value;
public :
    int getDepth()const {return depth;}
    long getValue()const {return value;}
    element(int depth, long value){
        this->depth = depth;
        this->value = value;
    }
};

int solution(long num, long B){
    queue<element> q;
    q.push(element(1, num));
    while(!q.empty()){

        element e = q.front();
        if(e.getValue() == B){
            return e.getDepth();
        }
        q.pop();
        if(e.getValue() * 2 <= B){
            q.push(element(e.getDepth()+1, e.getValue() * 2));
        }
        if((e.getValue() * 10) + 1 <= B){
            q.push(element(e.getDepth()+1, (e.getValue() * 10) + 1));
        }
    }
    return -1;

}

int main() {

    cout.tie(NULL);
    cin.tie(NULL);
    stack<int> s1;
    stack<int> s2;

    long A;
    long B;
    cin >> A >> B;
    cout << solution(A, B);
}
