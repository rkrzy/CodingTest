class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int len = photo.length;
        int nameLen = name.length;
        for(int i = 0; i < len; i++){
            int len2 = photo[i].length;
            for(int j = 0; j < len2; j++){
                for(int k = 0; k < nameLen; k++){
                    if(photo[i][j].equals(name[k])){
                        answer[i] += yearning[k];
                    }
                }
            }
        }
        return answer;
    }
}