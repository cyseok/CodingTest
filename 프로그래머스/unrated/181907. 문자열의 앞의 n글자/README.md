# [level unrated] 문자열의 앞의 n글자 - 181907 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181907) 

### 성능 요약

메모리: 74.7 MB, 시간: 1.49 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2023년 11월 2일 21:46:8

### 문제 설명

<p style="user-select: auto;">문자열 <code style="user-select: auto;">my_string</code>과 정수 <code style="user-select: auto;">n</code>이 매개변수로 주어질 때, <code style="user-select: auto;">my_string</code>의 앞의 <code style="user-select: auto;">n</code>글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.</p>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">제한사항</h5>

<ul style="user-select: auto;">
<li style="user-select: auto;"><code style="user-select: auto;">my_string</code>은 숫자와 알파벳으로 이루어져 있습니다.</li>
<li style="user-select: auto;">1 ≤ <code style="user-select: auto;">my_string</code>의 길이 ≤ 1,000</li>
<li style="user-select: auto;">1 ≤ <code style="user-select: auto;">n</code> ≤ <code style="user-select: auto;">my_string</code>의 길이</li>
</ul>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">입출력 예</h5>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">my_string</th>
<th style="user-select: auto;">n</th>
<th style="user-select: auto;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">"ProgrammerS123"</td>
<td style="user-select: auto;">11</td>
<td style="user-select: auto;">"ProgrammerS"</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">"He110W0r1d"</td>
<td style="user-select: auto;">5</td>
<td style="user-select: auto;">"He110"</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto;">

<h5 style="user-select: auto;">입출력 예</h5>

<p style="user-select: auto;">입출력 예 #1</p>

<ul style="user-select: auto;">
<li style="user-select: auto;">예제 1번의 <code style="user-select: auto;">my_string</code>에서 앞의 11글자는 "ProgrammerS"이므로 이 문자열을 return 합니다.</li>
</ul>

<p style="user-select: auto;">입출력 예 #2</p>

<ul style="user-select: auto;">
<li style="user-select: auto;">예제 2번의 <code style="user-select: auto;">my_string</code>에서 앞의 5글자는 "He110"이므로 이 문자열을 return 합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges