# array(배열)관련 내용 정리


<hr>
배열 : 메모리 상에 원소를 연속하게 배치한 자료구조

### 배열의 성질
- O(1)에 k번째 원소를 확인/변경 가능
- 추가적으로 소모되는 메모리의 양(=overhead)가 거의 없음
- Cache hit rate가 높음
- 메모리 상에 연속한 구간을 잡아야 해서 할당에 제약이 걸림


### 상황
- O(1)
    - 임의의 위치에 있는 원소를 확인/변경
    - 원소를 끝에 추가
    - 마지막 원소를 제거
- O(N)
    - 임의의 위치에 원소를 추가하는 과정 -> 중간에 책을 넣기 위해서는 뒤쪽의 원소들을 다 밀어야 한다.
    - 임의의 위치에 있는 원소를 제거 -> 지우고나면 빈칸을 채우기 위해서 뒤쪽의 값들을 앞으로 끌고 와야한다.

### 연습 문제 풀이
- Insert_Erase.Java = 배열의 중간에 Insert, Erase 동작을 수행하는 함수 구현
- Practice1.Java = 백준 10808 <a href = "https://www.acmicpc.net/problem/10808">알파벳 개수 </a>
- Practice2.Java = 배열중에 합이 100이 되는 수가 있는지 찾는 문제
  - O(N^2) => O(N)으로 시간복잡도를 계산한 문제

### 응용 문제 풀이
- Problem1.java = 백준 2577 <a href = "https://www.acmicpc.net/problem/2577">숫자의 개수 </a>
- Problem2.java = 백준 1475 <a href = "https://www.acmicpc.net/problem/1475">방 번호 </a>
- Problem3.java = 백준 3273 <a href = "https://www.acmicpc.net/problem/3273">두 수의 합</a> -> 푸는데 오래 걸렸다!
- Problem4.java = 백준 10807 <a href = "https://www.acmicpc.net/problem/10807">개수 세기</a>
- Problem5.java = 백준 13300 <a href = "https://www.acmicpc.net/problem/13300">방 배정</a>
- Problem6.java = 백준 11328 <a href = "https://www.acmicpc.net/problem/11328">Strfry</a> -> 푸는데 오래 걸렸다!
- Problem7.java = 백준 1919 <a href = "https://www.acmicpc.net/problem/1919">에너그램 만들기</a> 