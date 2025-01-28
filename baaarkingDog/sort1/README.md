# Sort1 관련 내용 정리

## 기초 정렬

### Merge Sort
<ul>
    <li>재귀적으로 수열을 나눠 정렬한 후 합치는 정렬법이다.</li>
    <li>O(NlogN)의 시간복잡도를 가진다.</li>
    <li>분할하는 과정의 시간 : O(N)</li>
    <li>합치는 과정의 시간 : O(NlogN)</li>
    <li>따라서 O(N) < O(NlogN)이므로 O(NlogN)이다.</li>
    <li>추가적인 공간으 O(N)만큼 필요하다.</li>
    <li>Stable Sort</li>
    <ul>
        <li>우선순위가 갔을때는 여러개로 정렬될 수 있다.</li>
        <li>우선순위가 같은 원소들끼리는 원래의 순서를 따라가도록 하는 정렬</li>
        <li>조건을 여러가지를 적용해서 정렬을 하는게 가능하다.</li>
    </ul>
    <li>UnStable Sort</li>
    <ul>
        <li>첫번째로 무조건 정렬이 된다고 보장할 수 없다.</li>
    </ul>
    <li><b>구현</b></li>
    <ul>
        <li>MergeSort.java</li>
    </ul>
</ul>

### Quick Sort
- 재귀적으로 구현되는 정렬
- Pivot을 이용해서 구현된다.
- 추가적인 공간을 사용하지 않는 In-Place-Sort다.
- cache hit rate가 높아서 속도가 빠르다.
- 전체 속도는 O(NlogN)
- 치명적인 단점은 : 순서대로 정렬되어 있는데 QuickSort가 발생하면 O(N^2)가 될 수 있다.
- 최악의 속도는 O(NlogN)이다.
- 평균적으로는 Merge Sort보다 빠르다.
- Stable Sort가 아니다.
- <b>구현</b>
  - QuickSort.java
### 연습 문제 풀이
- Practice1.java : 백준 11728 <a href = "https://www.acmicpc.net/problem/11728">배열 합치기</a>

### 응용 문제 풀이
- Problem1.java : 백준 2750 <a href = "https://www.acmicpc.net/problem/2750">수 정렬하기</a>
- Problem2.java : 백준 2751 <a href = "https://www.acmicpc.net/problem/2751">수 정렬하기 2</a>
- Problem3.java : 백준 10989 <a href = "https://www.acmicpc.net/problem/10989">수 정렬하기 3</a> -> 푸는게 오래 걸렸다. 앞으로 문제를 볼 때 조건을 제대로 확인하자.
- Problem4.java : 백준 11931 <a href = "https://www.acmicpc.net/problem/11931">수 정렬하기 4</a>
- Problem5.java : 백준 15688 <a href = "https://www.acmicpc.net/problem/15688">수 정렬하기 5</a>
- Problem6.java : 백준 10814 <a href = "https://www.acmicpc.net/problem/10814">나이순 정렬</a>
- Problem7.java : 백준 11650 <a href = "https://www.acmicpc.net/problem/11650">좌표 정렬하기</a>
- Problem8.java : 백준 11651 <a href = "https://www.acmicpc.net/problem/11651">좌표 정렬하기 2</a>

### 새롭게 알게 된 부분
- 만약 조건이 여러가지가 있다면 Merge Sort를 이용해서 풀이를 하는게 가능하다.