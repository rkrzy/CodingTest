class Solution {
    public int solution(String s) {
        int answer = 0;
        char first = ' ';
        int num1 = 0;
        int num2 = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(num1 == num2){
                first = s.charAt(i);
                num1 = 1;
                num2 = 0;
                answer++;
            }
            else{
                char c = s.charAt(i);
                if(c == first){
                    num1++;
                }else{
                    num2++;
                }
            }
            
        }
        return answer;
    }
}