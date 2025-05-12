#include <iostream>
#include <queue>
#include <algorithm>

using namespace std;

int m[25][25];
int visited[25][25];
int dir_x[4] = {-1,0,1,0};
int dir_y[4] = {0, -1, 0, 1};
int total;
vector<int> result;
void solution(int N)
{
    for(int i = 0;i < N; i++){
        for(int j = 0; j < N; j++){
            if(m[i][j] == 1 && visited[i][j] == false)
            {
                queue<pair<int,int> > q;
                q.push(make_pair(i,j));
                visited[i][j] = true;
                int count = 1;
                while(!q.empty()){
                    pair<int, int> p = q.front();
                    q.pop();
                    for(int k = 0; k < 4; k++){
                        int num1 = p.first + dir_x[k];
                        int num2 = p.second + dir_y[k];
                        if((num2 >= 0 && num2 < N)&&
                        (num1 >= 0 && num1 < N)&&
                        m[num1][num2] == 1 &&
                        !visited[num1][num2]){
                            count++;
                            visited[num1][num2] = true;
                            q.push(make_pair(num1, num2));
                        }
                    }
                }
                result.push_back(count);
                total++;
            }
        }
    }
}
int main(){
    int N;
    string str;

    cin >> N;

    for(int i = 0; i < N; i++){
        cin >> str;
        for(int j = 0; j < str.size(); j++){
            visited[i][j] = false;
            m[i][j] = str[j] - '0';
        }
    }
    solution(N);
    cout << total << "\n";
    sort(result.begin(),result.end());
    for(int num : result)
    {
        cout << num << "\n";
    }
}
