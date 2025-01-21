# 재귀(Recursion)관련 내용 정리

재귀 : 하나의 함수에서 자기 자신을 다시 호출해 작업을 수행하는 알고리즘


## 예시
### 절차지향적인 사고 
3출력 -> func1(2) 호출 -> 2출력 -> func1(1) 호출 -> 1출력 -> func1(0)

### 귀납적 사고
func1(1) -> func1(k)가 k-1, k-2, --- 1을 출력하면 func1(k+1)은 k+1, k, k-1 ---1을 출력한다.

## 재귀 함수의 조건
- 특정 입력에 대해서는 자기 자신을 호출하지 않고 종료되어야 한다(Base condition)
- 모든 입력은 base condition으로 수렴해야 한다.

## 재귀에 대한 정보 1
- 함수의 인자로 어떤 것을 받고 어디까지 계산한 후 자시 자신에게 넘겨줄지 명확하게 정해야 한다.
- 모든 재귀 함수는 반복문으로 동일한 동작을 하는 함수를 만들 수 있다.
- 재귀는 반복문으로 구현했을 때에 비해 코드가 간결하지만 메모리/시간에서는 손해를 본다.

## 재귀에 대한 정보 2
- 한 함수가 자시 자신을 여러 번 호출하게 되면 비효율적일 수 있다.

## 재귀에 대한 정보 3
- 재귀함수가 자기 자신을 부를 때 스택 영역에 계속 누적이 된다.


## 연습 문제 풀이
- Practice1.java : 백준 1629 <a href = "https://www.acmicpc.net/problem/1629">곱셈</a> 
- Practice2.java : 백준 11729 <a href = "https://www.acmicpc.net/problem/11729">하노이 탑 이동 순서</a>
- Practice3.java : 백준 1074 <a href = "https://www.acmicpc.net/problem/1074">Z</a>

## 문제 풀이
- Problem1.java : 백준 17478 <a href = "https://www.acmicpc.net/problem/17478">재귀함수가 뭔가요?</a>
- Problem2.java : 백준 1780 <a href = "https://www.acmicpc.net/status?user_id=wnstlr9891&problem_id=1780&from_mine=1">종이의 개수</a>
  - 좀 더 간단하게 할 수 있는 방법을 생각해보면 좋을 거 같다. -> 오래 걸렸음
- Problem3.java : 백준 2630 <a href = "https://www.acmicpc.net/problem/2630">색종이 만들기</a>