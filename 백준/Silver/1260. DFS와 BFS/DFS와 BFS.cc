#include <iostream>
#include <vector>
#include <algorithm>
#include <queue>
using namespace std;

int vertex_num;
int edge_num;
int num;
void search(bool *check,int num1)
{
    for(int i =1;i<num1;i++)
    {
        if(check[i])
        {
            cout<<i<<" ";
        }
    }
}
void dfs(int start, vector<int> * graph,bool *check)
{
    check[start] = true;
    cout<<start<<" ";
    for(int i =0;i<graph[start].size();i++)
    {
        int next = graph[start][i];
        if(check[next] == false){
            dfs(next,graph,check);
        }
    }
}
void bfs(int start,vector<int> * graph,bool * check)
{
    queue<int>q;
    q.push(start);
    check[start] = true;

    while(!q.empty())
    {
        int tmp = q.front();
        q.pop();
        cout<<tmp<<" ";
        for(int i =0;i<graph[tmp].size();i++)
        {
            if(check[graph[tmp][i]]==false)
            {
                q.push(graph[tmp][i]);
                check[graph[tmp][i]] = true;
            }
        }
    }
}
int main(void)
{
    cin>>vertex_num>>edge_num>>num;
    bool * arr =new bool[vertex_num+1];
    vector<int> * vec = new vector<int>[vertex_num+1];
    fill(arr+1,arr+vertex_num+1,false);

    for(int i =0;i<edge_num;i++)
    {
        int u,v;
        cin>>u>>v;
        vec[u].push_back(v);
        vec[v].push_back(u);
    }

    for(int i =1;i<=vertex_num;i++)
    {
        sort(vec[i].begin(),vec[i].end());
    }
    dfs(num,vec,arr);
 //   search(arr,vertex_num+1);
    fill(arr+1,arr+vertex_num+1,false);
    cout<<endl;
    bfs(num,vec,arr);
   // search(arr,vertex_num+1);
}