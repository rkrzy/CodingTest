# 이분탐색
- 이분탐색 - 정렬되어 있는 배열에서 특정 데이터를 찾기 위해 모든 데이터를 순차적으로 확인하는 대신 탐색 범위를 절반으로 줄여가며 찾는 법
- 선형탐색 - 처음부터 하나씩 다 찾아보는방법

# Parametric Search
- 조건을 만족하는 최소/최댓값을 구하는 문제를 결정 문제로 변환해 이분탐색을 수행하는 방법


## 주의 사항
1. 이분탐색을 하고자 한다면 주어진 배열은 정렬되어 있어야 한다.
2. 무한 루프에 빠지지 않게 mid 값을 정해야 한다.
### 연습 문제 풀이
- Practice1.java : 백준 1920 <a href = "https://www.acmicpc.net/problem/1920">수 찾기</a>
- Practice2.java : 백준 10816 <a href = "https://www.acmicpc.net/problem/10816">숫자 카드 2</a>
- Practice3.java : 백준 18870 <a href = "https://www.acmicpc.net/problem/18870">좌표 압축</a>
- Practice4.java : 백준 2295 <a href = "https://www.acmicpc.net/problem/2295">세 수의 합</a>
- Practice5.java : 백준 1654 <a href = "https://www.acmicpc.net/problem/1654">랜선 자르기</a>
### 응용 문제 풀이
- Problem1.java : 백준 1822 <a href = "https://www.acmicpc.net/problem/1822">차집합</a>
- Problem2.java : 백준 16401 <a href = "https://www.acmicpc.net/problem/16401">과자 나눠주기</a> => <span style="color:red;">혼자서 해결을 못했다.<span>
- Problem3.java