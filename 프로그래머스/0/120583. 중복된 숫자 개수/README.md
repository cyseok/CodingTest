# [level 0] 중복된 숫자 개수 - 120583 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120583) 

### 성능 요약

메모리: 73.8 MB, 시간: 0.02 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 04월 19일 21:15:32

### 문제 설명

<p style="user-select: auto !important;">정수가 담긴 배열 <code style="user-select: auto !important;">array</code>와 정수 <code style="user-select: auto !important;">n</code>이 매개변수로 주어질 때, <code style="user-select: auto !important;">array</code>에 <code style="user-select: auto !important;">n</code>이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">array</code>의 길이 ≤ 100</li>
<li style="user-select: auto !important;">0 ≤ <code style="user-select: auto !important;">array</code>의 원소 ≤ 1,000</li>
<li style="user-select: auto !important;">0 ≤ <code style="user-select: auto !important;">n</code> ≤ 1,000</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">array</th>
<th style="user-select: auto !important;">n</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[1, 1, 2, 3, 4, 5]</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">2</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[0, 2, 3, 4]</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">0</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">[1, 1, 2, 3, 4, 5] 에는 1이 2개 있습니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">[0, 2, 3, 4] 에는 1이 0개 있습니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges