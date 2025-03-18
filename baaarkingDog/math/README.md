# 다이나믹 프로그래밍(Dynamic Programming, DP)관련 내용 정리

## 소수
- 소수 판정법
  - 합성수 N에서 1을 제외한 가장 작은 약수는 루트N 이하이다.
- 범위 내의 소수 판정법
  - 에라토스테네스의 체
## 소인수분해
1. 방법의 정당성
   - 소인수 목록에 적힌 수들을 곱했을 때 N이 되는가?
   - 목록에 있는 수들이 전부 소수인가?
2. 시간복잡도의 개선


## 약수
- 어떤 수를 나누어떨어지게 하는 수

## 최대공약수
- 두 자연수의 공통된 약수 중 가장 큰 약수
- 유클리드호제법
  - 두 수 A, B에 대해 A를 B로 나눈 나머지를 r이라고 하면 GCD(A,B) = GCD(B,r)이다.
  - GCD(20, 12) = GCD(12, 8) = GCD(8,4) = GCD(4,0) = 4

## 최소공배수
- A X B = GCD(A, B) X LCM(A, B)

## 중국인의 나머지 정리

## 이항계수
- 순서를 고려하지 않고 5개에서 3개를 뽑는 경우의 수 : 5!/(3!2!) = 10
- 순서를 고려해서 5개에서 3개를 뽑는 경우의 수 : 5!/2! = 60
- nCk = (n - 1)C(k - 1) + (n - 1)Ck 
## 각자리 배수의 조건 
- 0 의 배수	모든 숫자는 1의 배수
- 2의 배수	마지막 자릿수가 0, 2, 4, 6, 8 중 하나
- 3의 배수	모든 자릿수의 합이 3의 배수
- 4의 배수	마지막 두 자리 숫자가 4의 배수
- 5의 배수	마지막 자릿수가 0 또는 5
- 6의 배수	2의 배수 && 3의 배수 (위 조건 모두 만족)
- 7의 배수	특정 규칙이 있지만 계산이 복잡함 (직접 나눠봐야 함)
- 8의 배수	마지막 세 자리 숫자가 8의 배수
- 9의 배수	모든 자릿수의 합이 9의 배수
- 10의 배수	마지막 자릿수가 0
### 연습 문제 풀이
- Practice1.java = 백준 1978 <a href = "https://www.acmicpc.net/problem/1978">소수찾기</a>
- Practice2.java = 백준 1929 <a href = "https://www.acmicpc.net/problem/1929">소수 구하기</a>
- Practice3.java = 약수 알고리즘
- Practice4.java = 최대공약수, 최소공배수 알고리즘
- Practice5.java = 백준 6064 <a href = "https://www.acmicpc.net/problem/6064">카잉 달력</a>
- Practice6.java = 백준 11050 <a href = "https://www.acmicpc.net/problem/11050">이항 계수 1</a>
- Practice7.java = 백준 11051 <a href = "https://www.acmicpc.net/problem/11051">이항 계수 2</a>
### 응용 문제 풀이
- Problem1.java = 백준 2960 <a href = "https://www.acmicpc.net/problem/2960">에라토스테네스의 체</a>
- Problem2.java = 백준 4948 <a href = "https://www.acmicpc.net/problem/4948">베르트랑 공준</a>
- Problem3.java = 백준 9613 <a href = "https://www.acmicpc.net/problem/9613">GCD 합</a>
- Problem4.java = 백준 10610 <a href = "https://www.acmicpc.net/problem/10610">30</a>
- Problem5.java = 백준 1456 <a href = "https://www.acmicpc.net/problem/1456"> 거의 소수 </a> => <span style="color:red;">혼자서 해결을 못했다.<span>