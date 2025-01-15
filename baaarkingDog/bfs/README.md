# BFS(Breadth First Search)관련 내용 정리

BFS : 다차원 배열에서 각 칸을 방문할 때 너비를 우선으로 방문하는 알고리즘

### BFS에서 많이 실수하는 부분
- 시작점을 방문했다는 표시를 남기지 않는다.
- 큐에 넣을 때 방문했다는 표시를 하는 대신 큐에서 빼낼 때 방문했다는 표시를 남겼다.
- 이웃한 원소가 범위를 벗어났는지에 대한 체크를 잘못했다

### 구현
- BFS.java : BFS자바로 구현 (바킹독 깃허브의 C코드를 자바로 재구성함)

### 연습 문제 풀이
- Practice1.java = 백준 1926 <a href = "https://www.acmicpc.net/problem/1926">그림</a>
- Practice2.java = 백준 2178 <a href = "https://www.acmicpc.net/problem/2178">미로 탐색</a>
- Practice3.java = 백준 7576 <a href = "https://www.acmicpc.net/problem/7576">토마토</a>
- Practice4.java = 백준 4179 <a href = "https://www.acmicpc.net/problem/4179">불!</a> -> 많이 어려웠다.
- Practice5.java = 백준 1697 <a href = "https://www.acmicpc.net/problem/1697">숨바꼭질</a>

### 응용 문제 풀이


