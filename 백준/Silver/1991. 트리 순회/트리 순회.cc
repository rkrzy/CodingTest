#include <iostream>
#include <queue>
using namespace std;

void pre_order(char * lc, char * rc, char root){
    cout << root;
    if(lc[root-'A'] >= 'A' && lc[root-'A'] <= 'Z') pre_order(lc, rc, lc[root-'A']);
    if(rc[root-'A'] >= 'A' && rc[root-'A'] <= 'Z') pre_order(lc, rc, rc[root-'A']);
}
void in_order(char * lc, char * rc, char root){
    if(lc[root-'A'] >= 'A' && lc[root-'A'] <= 'Z') in_order(lc, rc, lc[root-'A']);
    cout << root;
    if(rc[root-'A'] >= 'A' && rc[root-'A'] <= 'Z') in_order(lc, rc, rc[root-'A']);
}
void post_order(char * lc, char * rc, char root){{
    if(lc[root-'A'] >= 'A' && lc[root-'A'] <= 'Z') post_order(lc, rc, lc[root-'A']);
    if(rc[root-'A'] >= 'A' && rc[root-'A'] <= 'Z') post_order(lc, rc, rc[root-'A']);
    cout << root;
}

}


int main(){
    int N;
    char input1, input2, input3;
    char root = 'A';
    cin >> N;

    char lc[N+1];
    char rc[N+1];
    for(int i = 0; i < N; i++){
        cin >> input1 >> input2 >> input3;
        lc[input1 - 'A'] = input2;
        rc[input1 - 'A'] = input3;
    }
    pre_order(lc, rc, root);
    cout << "\n";
    in_order(lc, rc, root);
    cout << "\n";
    post_order(lc, rc, root);

}