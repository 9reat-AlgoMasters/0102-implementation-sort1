# Topics
1. Bubble Sort
2. Insertion Sort
3. Selection Sort
4. Counting Sort


# Bubble Sort (버블 정렬)
## 특징
- (오름차순의 경우) 배열을 한번 돌 때마다 (바깥쪽 for 문) 가장 큰 수가 정렬된다.
  - 가장 큰 수가 마치 거품처럼 수면 위로 올라간다.

## 시간 복잡도
- 최선 : $O(N^2)$
- 최악 : $O(N^2)$
    - 최악의 경우 : 역순으로 정렬된 경우
      - 모든 안쪽 반복문에서 swap이 일어남
      - ex) (오름차순으로 정렬할 때) N=5 -> 5 4 3 2 1

## Stable 여부
- stable


---

# Insertion Sort (삽입 정렬)
## 특징
- (오름차순의 경우) N번째 배열을 한 번 돌때마다 N번째 원소 이후의 최솟값을 찾고 그 최솟값과 N번째 원소를 swap한다.
- 한번 배열을 돌 때마다 많아야 swap이 한번 일어나므로 평균적인 경우에 swap 횟수가 버블, 선택 정렬에 비해 적다.

## 시간 복잡도
- 최선 : $O(N^2)$
- 최악 : $O(N^2)$
    - 최악의 경우 : 정렬이 된 상태에서 맨 앞의 숫자를 뒤로 보낸 경우
        - 모든 바깥쪽 for 문에서 반드시 swap이 일어난다.
        - ex) (오름차순으로 정렬할 때) N=5 -> 2 3 4 5 1


## Stable
- unstable
- 예시 : 9 3 5 9` 1

---

# Selction Sort
## 특징
- N번 배열을 돌 때마다 원래 배열의 앞에서부터 N+1 개가 정렬된다.
- N+1번 째 배열을 돌 때는 N+2번째 원소가 이미 정렬된 앞의 숫자들 사이에 어디로 들어가야 하는지 비교를 통해 찾는다.
- 앞의 정렬된 원소들 보다 제일 크다면 swap은 일어나지 않고 그 다음 배열 순회로 넘어간다.
  - 따라서 이미 정렬이 되어 있을 경우 O(N) 시간복잡도로 정렬 과정이 끝난다.

## 시간 복잡도
- 최선 : $O(N)$
  - 이미 정렬되어 있을 경우 -> 한번씩 비교만 진행
- 최악 : $O(N^2)$
    - 최악의 경우 : 역순으로 정렬이 되어있는 경우
    - 모든 안쪽 반복문에서 swap이 일어남
    - ex) (오름차순으로 정렬할 때) N=5 -> 5 4 3 2 1


## Stable
- stable

---

# Counting Sort
## 특징

## 시간 복잡도
- 최선 : $O(N+K)$
- 최악 : $O(N+K)$
> N : 원소의 개수, K : 가장 큰 원소

- Counting 정렬을 효율적으로 쓸 수 있는 경우는 $O(N+K)$ ~ $O(N)$ 가 될 때
  - 즉, 원소의 개수와 가장 큰 원소의 값이 비슷할 때

## Stable
- stable
  - 구현 시 누적합 배열에 따라 원소를 알맞은 자리에 넣는 과정에서 원소 순회를 뒤쪽 부터 하면서 알맞은 자리에 넣어야 stable한 정렬이 가능하다.

---

# etc
## `swap` 구현 방법
1. call by reference 활용
```java
public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
```

2. 매개변수를 로직의 일부로 활용 (primitive type에 사용 가능)
```java
arr[i] = swap(arr[j], arr[j] = arr[i]);

public static void swap(int value1, int value2) {
    return value1;
}
```
