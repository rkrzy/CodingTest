import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int top = arr[0];
        int an_leng = 1;
        for(int i =0;i<arr.length;i++)
        {
            if(top != arr[i])
            {
                an_leng++;
                top = arr[i];
            }
        }
        int[] answer = new int[an_leng];
        top = arr[0];
        answer[0] = top;
        int j =1;
        for(int i =1;i<arr.length;i++)
        {
            if(arr[i] != top)
            {
                top = arr[i];
                answer[j] = top;
                j++;
            }
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(an_leng);

        return answer;
    }
}