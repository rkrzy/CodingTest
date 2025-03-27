# 다이나믹 프로그래밍(Dynamic Programming, DP)관련 내용 정리

다이나믹 프로그래밍 : 여러 개의 하위 문제를 먼저 푼 후 그 결과를 쌓아올려 주어진 문제를 해결하는 알고리즘

DP를 푸는 과정
<ol>
<li>테이블 정의하기</li>
<li>점화식 찾기</li>
<li>초기값 정하기</li>
</ol>





### 연습 문제 풀이
- Practice1.java : 백준 1463 <a href = "https://www.acmicpc.net/problem/1463">1로 만들기</a>
- Practice2.java : 백준 9095 <a href = "https://www.acmicpc.net/problem/9095">1, 2, 3더하기</a>
- Practice3.java : 백준 2579 <a href = "https://www.acmicpc.net/problem/2579">계단 오르기</a>
- Practice4.java : 백준 1149 <a href = "https://www.acmicpc.net/problem/1149">RGB거리</a>
- Practice5.java : 백준 11726 <a href = "https://www.acmicpc.net/problem/11726">2Xn타일링 </a>
- Practice6.java : 백준 11659 <a href = "https://www.acmicpc.net/problem/11659">구간 합 구하기 4</a>
- Practice7.java : 백준 12852 <a href = "https://www.acmicpc.net/problem/12852">1로 만들기 2</a>
### 응용 문제 풀이
- Problem1.java : 백준 1003 <a href = "https://www.acmicpc.net/problem/1003">피보나치 함수</a>
- Problem2.java : 백준 1932 <a href = "https://www.acmicpc.net/problem/1932">정수 삼각형</a>
- Problem3.java : 백준 11727 <a href = "https://www.acmicpc.net/problem/11727">2Xn타일링 2</a>
- Problem4.java : 백준 2193 <a href = "https://www.acmicpc.net/problem/2193">이친수</a>
- Problem5.java : 백준 1912 <a href = "https://www.acmicpc.net/problem/1912">연속합</a> ->  <span style="color:red;">혼자서 해결을 못했다.<span>
- Problem6.java : 백준 11055 <a href = "https://www.acmicpc.net/problem/11055">가장 큰 증가하는 부분 수열</a> ->  <span style="color:red;">혼자서 해결을 못했다.<span>
- Problem7.java : 백준 11053 <a href = "https://www.acmicpc.net/problem/11053">가장 긴 증가하는 부분 수열</a>
- Problem8.java : 백준 9461 <a href = "https://www.acmicpc.net/problem/9461">파도반 수열</a>
- Problem9.java : 백준 10844 <a href = "https://www.acmicpc.net/problem/10844">쉬운 계단 수</a> ->  <span style="color:red;">혼자서 해결을 못했다.<span>
- Problem10.java : 백준 2240 <a href = "https://www.acmicpc.net/problem/2240">자두나무</a> ->  <span style="color:red;">혼자서 해결을 못했다.<span>
- Problem11.java : 백준 2156 <a href = "https://www.acmicpc.net/problem/2156">포도주 시식</a>
- Problem12.java : 백준 15988 <a href = "https://www.acmicpc.net/problem/15988">1, 2, 3 더하기 3</a>
- Problem13.java : 백준 2302 <a href = "https://www.acmicpc.net/problem/2302">극장 좌석</a>
- Problem14.java : 백준 14002 <a href = "https://www.acmicpc.net/problem/14002">가장 긴 증가하는 부분 수열 4</a> ->  <span style="color:red;">혼자서 해결을 못했다.<span>
- Problem15.java : 백준 11052 <a href = "https://www.acmicpc.net/problem/11052">카드 구매하기</a> ->  <span style="color:red;">혼자서 해결을 못했다.<span>
- Problem16.java : 백준 9465 <a href = "https://www.acmicpc.net/problem/9465">스티커</a>
- Problem17.java : 백준 11057 <a href = "https://www.acmicpc.net/problem/11057">오르막 수</a> ->  <span style="color:red;">혼자서 해결을 못했다.<span>
- Problem18.java : 백준 1788 <a href = "https://www.acmicpc.net/problem/1788">피보나치 수의 확장</a>
- Problem19.java : 백준 4883 <a href = "https://www.acmicpc.net/problem/4883">삼각 그래프</a> ->  <span style="color:blue;">30분이상 걸렸다<span>
- Problem20.java : 백준 9251 <a href = "https://www.acmicpc.net/problem/9251">LCS</a> -> <span style="color:red;">이 문제는 알고리즘을 이해할 필요가 있다.<span>
- Problem21.java : 백준 1699 <a href = "https://www.acmicpc.net/problem/1699">제곱수의 합</a> ->  <span style="color:blue;">30분이상 걸렸다<span>
- Problem22.java : 백준 9084 <a href = "https://www.acmicpc.net/problem/9084">동전</a> ->  <span style="color:red;">혼자서 해결을 못했다.<span>
- Problem23.java : 백준 1915 <a href = "https://www.acmicpc.net/problem/1915">가장 큰 정사각형</a>  ->  <span style="color:red;">정말 발상 자체를 못한 문제다.<span>
- Problem24.java : 백준 10942 <a href = "https://www.acmicpc.net/problem/10942">팰린드롬?</a> ->  <span style="color:red;">혼자서 해결을 못했다.<span>
- Problem25.java : 백준 9655 <a href = "https://www.acmicpc.net/problem/9655">돌 게임</a>
- Problem26.java : 백준 2011 <a href = "https://www.acmicpc.net/problem/2011">암호코드</a> ->  <span style="color:blue;">30분이상 걸렸다<span>
- Problem27.java : 백준 2294 <a href = "https://www.acmicpc.net/problem/2294">동전 2</a>

- Problem28.cpp : 백준 2133 <a href = "https://www.acmicpc.net/problem/2133">타일 채우기</a> ->  <span style="color:red;">혼자서 해결을 못했다.<span>
- Problem29.cpp : 백준 11660 <a href = "https://www.acmicpc.net/problem/11660">구간 합 구하기5</a>
- 