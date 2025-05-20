#include <iostream>
#include <climits>

using namespace std;

/*
 * 기준 : 최소 시간
 *
 */
int main()
{
    int N, M, B;
    int time = 0;
    int result_time = INT_MAX;
    int result_height = 0;

    cin >> N >> M >> B;
    int arr[N][M];
    for(int i = 0; i < N; i++){
        for(int j = 0; j < M; j++){
            cin >> arr[i][j];
        }
    }
    for(int i = 0; i <= 256; i++){
        int remove_block = 0;
        int stack_block = 0;
        for(int j = 0; j < N; j++){
            for(int k = 0; k < M; k++){
                if(arr[j][k] > i){
                    remove_block += arr[j][k] - i;
                }else if(arr[j][k] < i){
                    stack_block += i - arr[j][k];
                }
            }
        }
        if(remove_block + B >= stack_block){
            time = remove_block * 2 + stack_block;
            if(result_time >= time){
                result_time = time;
                result_height = i;
            }
        }
    }
    cout << result_time << " " << result_height;

}