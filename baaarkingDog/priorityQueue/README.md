# priorityQueue(우선순위 큐)정리

- 우선순위 큐 : pop을 할 때 가장 먼저 들어온 원소가 나오는 대신 우선순위가 가장 높은 원소가 나오는 큐
- 원소의 추가가 O(logN)
- 우선순위가 가장 높은 원소의 확인이 O(1)
- 우선순위가 가장 높은 원소의 제거 O(logN)

- 힙 : 균형트리다.
  - 이진검색 트리 처럼 몇번째 작은 값을 찾는 연산은 할 수 없다.

- 힙을 배열로 구현한다면
  - x번지의 왼쪽, 오른쪽 자식 : 2x, 2x+1
  - x번지의 부모 : x/2
  - 이진 검색 트리는 배열로 표현하는게 불가능하다
    - 이진 검색 트리는 완전히 채워진 형태를 보장하지 않기 때문이다. 
    - 삽입 순서에 따라 트리가 한쪽으로 치우치면 -> 배열로 표현할 때 중간 인덱스가 다 비게 된다.
- 이진 검색 트리
  - 왼쪽 자식 < 부모 < 오른쪽 자식

- implement.cpp = 최소힙을 구현
### 굳이 priority_queue를 써야하나?? set을 쓰면 안되나?
- priority_queue는 set보다 수행 속도가 빠르고, 공간도 적게 차지한다.

### 연습 문제 풀이 
- practice1.cpp : 백준 11286 <a href = "https://www.acmicpc.net/problem/11286">절댓값 힙</a>
- practice2.cpp : 백준 1715 <a href = "https://www.acmicpc.net/problem/1715">카드 정렬하기</a>

### 응용 문제 풀이
- Problem1.cpp : 백준 2075 <a href = "https://www.acmicpc.net/problem/2075">N번째 큰 수</a>
- 