import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        Map<Character, Integer> scoreMap = new HashMap<>();
        
        
        for(String key : keymap){
            for(int j = 0; j < key.length(); j++){
                char ch = key.charAt(j);
                int count = j + 1;
                if(!scoreMap.containsKey(ch) || scoreMap.get(ch) > count){
                    scoreMap.put(ch, count);
                }
            }       
        }
        for(int i = 0; i < targets.length; i++){
            int sum = 0;
            for(char ch : targets[i].toCharArray()){
                if(scoreMap.containsKey(ch)) {
                    sum += scoreMap.get(ch);
                }else {
                    sum = -1;
                    break;
                }
            }
            answer[i] = sum;
        }
        return answer;
    }
}