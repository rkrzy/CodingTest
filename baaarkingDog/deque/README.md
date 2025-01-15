# Deque(덱) 관련 내용 정리


### 성질
- 양쪽 끝에서 삽입과 삭제가 가능하다.
- 원소의 추가가 O(1)
- 원소의 제거가 O(1)
- 제일 앞/뒤의 원소 확인이 O(1)
- 제일 앞/뒤가 아닌 나머지 원소들의 확인/변경이 원칙적으로 불가능
- 배열의 크기는 2*MX+1 -> 양쪽으로 삽입/삭제가 가능하기 때문에 

큐와 다르게 양쪽으로 모두 삽입/삭제가 가능하다.

Deque.java = 강의 내용에서 구현한 Deque

### 연습 문제 풀이
- Practice1.java : 덱 <a href = "https://www.acmicpc.net/problem/10866">덱</a>

### 응용 문제 풀이
- Problem1.java : 회전하는 큐 <a href = "https://www.acmicpc.net/problem/1021">회전하는 큐</a>