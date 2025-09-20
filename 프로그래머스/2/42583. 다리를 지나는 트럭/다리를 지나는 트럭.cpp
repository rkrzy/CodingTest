#include <string>
#include <vector>
#include <queue>
using namespace std;

int solution(int bridge_length, int weight, vector<int> truck_weights) {
    int time = 0;
    int current_weight = 0;
    
    queue<int> bridge;
    int truck_index = 0;
    
    while(truck_index < truck_weights.size()){
        time++;
        
        if(bridge.size() == bridge_length){
            current_weight -= bridge.front();
            bridge.pop();
        }
        
        if(current_weight + truck_weights[truck_index] <= weight){
            int next_truck = truck_weights[truck_index];
            bridge.push(next_truck);
            current_weight += next_truck;
            truck_index++;
        }
        else{
            bridge.push(0);
        }
    }
    return time + bridge_length;
}