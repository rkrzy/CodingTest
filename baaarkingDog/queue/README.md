# Queue(큐)관련 내용 정리

Queue(큐) : FIFO(First In First Out)선입선출 구조의 자료구조 

### 큐의 성질
- 원소의 추가가 O(1)
- 원소의 제거가 O(1)
- 제일 앞/뒤의 원소 확인이 O(1)
- 제일 앞/뒤가 아닌 나머지 원소들의 확인/변경이 원칙적으로 불가능
- tail과 head가 존재한다.
- tail과 head는 배열로 표현했을 때 가장 처음 0번지에 존재한다.
- 배열로 표현하면 head ~ tail-1번지가 원소들이 들어있는 위치다.

### 구현
- 원형의 배열을 가정하고 구현하면 원형큐로 만들 수 있다.

### 연습 문제 풀이
- Practice1.java : 백준 10845 <a href ="https://www.acmicpc.net/problem/10845">큐</a> 


### 응용 문제 풀이
- Practical1.java : 백준 18258 <a href = "https://www.acmicpc.net/problem/18258">큐2</a>
- Practical2.java : 백준 2164 <a href = "https://www.acmicpc.net/problem/2164">카드2</a>

큐, 큐2 문제의 차이는 명령어의 차이였다. 배열의 크기를 늘려줘서 해결했다.
