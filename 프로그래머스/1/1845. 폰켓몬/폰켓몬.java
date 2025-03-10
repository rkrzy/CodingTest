class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int length = nums.length/2;
        int[] arr = new int[200001];
        for(int i = 0; i < nums.length; i++){
            if(arr[nums[i]] == 0){
                arr[nums[i]] = 1;
                answer++;
                if(answer == length){
                    break;
                }
            }
        }
        return answer;
    }
}