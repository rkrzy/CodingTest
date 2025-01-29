# Stack(스택)관련 내용 정리



### Counting Sort
- 배열에 숫자가 나온 횟수를 저장해서 처음부터 자례대로 출력하는 방법이다.
- 정렬하는 수의 크기가 작을 경우에 사용하면 편리하다.
- 수의 크기가 너무 크다면 배열의 범위가 너무 커짐.

### Radix Sort
- 자릿수를 이용해서 정렬하는 알고리즘
- 1의자리부터 올라가면서 크기 순으로 정렬을 한다.
- 자릿수의 초대가 D개라면 정렬을 D번 수행해야 한다.
- 시간복잡도 : O(DN)
- 구현 : RadixSort.java

### Comparison Sort
- 원소들끼리 크기를 비교
- 버블 소트
- 머지 소트
- 퀵 소트

### Non-comparison Sort
- 원소들간의 크기를 비교 안한다.
- 카운팅 소트
- 라딕스 소트


### 연습 문제 풀이
- Practice1.java : 백준 1431 <a href = "https://www.acmicpc.net/problem/1431">시리얼 번호</a>
- Practice2.java : 백준 11652 <a href = "https://www.acmicpc.net/problem/11652">카드</a>

### 응용 문제 풀이
- Problem1.java : 백준 5648 <a href = "https://www.acmicpc.net/problem/5648">역원소 정렬</a>
  - 오래 걸렸다. "" + int = String
- Problem2.java : 백준 1181 <a href = "https://www.acmicpc.net/problem/1181">단어 정렬</a>
- Problem3.java : 백준 2910 <a href = "https://www.acmicpc.net/problem/2910">빈도 정렬</a>
  - HashMap을 LinkedHashMap으로 변경하니까 같을 경우 순서 문제가 해결됨.
- Problem4.java : 백준 10814 <a href = "https://www.acmicpc.net/problem/10814">나이순 정렬</a>
- Problem5.java : 백준 11656 <a href = "https://www.acmicpc.net/problem/11656">접미사 배열</a>
- Problem6.java : 백준 10825 <a href = "https://www.acmicpc.net/problem/10825">국영수</a>
  - Arrays.sort함수를 사용해서 Comparator를 이용한 정렬 방식을 유용하게 사용해보자.
- Problem7.java : 백준 7795 <a href = "https://www.acmicpc.net/problem/7795">먹을 것인가 먹힐 것인가</a>