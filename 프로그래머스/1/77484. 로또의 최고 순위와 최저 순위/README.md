# [level 1] 로또의 최고 순위와 최저 순위 - 77484 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/77484) 

### 성능 요약

메모리: 73.3 MB, 시간: 0.17 ms

### 구분

코딩테스트 연습 > 2021 Dev－Matching： 웹 백엔드 개발자（상반기）

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 06월 09일 04:21:40

### 문제 설명

<p style="user-select: auto !important;"><code style="user-select: auto !important;">로또 6/45</code>(이하 '로또'로 표기)는 1부터 45까지의 숫자 중 6개를 찍어서 맞히는 대표적인 복권입니다. 아래는 로또의 순위를 정하는 방식입니다. <sup id="fnref1" style="user-select: auto !important;"><a href="#fn1" style="user-select: auto !important;">1</a></sup></p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">순위</th>
<th style="user-select: auto !important;">당첨 내용</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">6개 번호가 모두 일치</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">5개 번호가 일치</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">4개 번호가 일치</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">3개 번호가 일치</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">5</td>
<td style="user-select: auto !important;">2개 번호가 일치</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">6(낙첨)</td>
<td style="user-select: auto !important;">그 외</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;">로또를 구매한 민우는 당첨 번호 발표일을 학수고대하고 있었습니다. 하지만, 민우의 동생이 로또에 낙서를 하여, 일부 번호를 알아볼 수 없게 되었습니다. 당첨 번호 발표 후, 민우는 자신이 구매했던 로또로 당첨이 가능했던 최고 순위와 최저 순위를 알아보고 싶어 졌습니다. <br style="user-select: auto !important;">
알아볼 수 없는 번호를 <code style="user-select: auto !important;">0</code>으로 표기하기로 하고, 민우가 구매한 로또 번호 6개가 <code style="user-select: auto !important;">44, 1, 0, 0, 31 25</code>라고 가정해보겠습니다. 당첨 번호 6개가 <code style="user-select: auto !important;">31, 10, 45, 1, 6, 19</code>라면, 당첨 가능한 최고 순위와 최저 순위의 한 예는 아래와 같습니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">당첨 번호</th>
<th style="user-select: auto !important;">31</th>
<th style="user-select: auto !important;">10</th>
<th style="user-select: auto !important;">45</th>
<th style="user-select: auto !important;">1</th>
<th style="user-select: auto !important;">6</th>
<th style="user-select: auto !important;">19</th>
<th style="user-select: auto !important;">결과</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">최고 순위 번호</td>
<td style="user-select: auto !important;"><u style="user-select: auto !important;"><strong style="user-select: auto !important;">31</strong></u></td>
<td style="user-select: auto !important;">0→<u style="user-select: auto !important;"><strong style="user-select: auto !important;">10</strong></u></td>
<td style="user-select: auto !important;">44</td>
<td style="user-select: auto !important;"><u style="user-select: auto !important;"><strong style="user-select: auto !important;">1</strong></u></td>
<td style="user-select: auto !important;">0→<u style="user-select: auto !important;"><strong style="user-select: auto !important;">6</strong></u></td>
<td style="user-select: auto !important;">25</td>
<td style="user-select: auto !important;">4개 번호 일치, 3등</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">최저 순위 번호</td>
<td style="user-select: auto !important;"><u style="user-select: auto !important;"><strong style="user-select: auto !important;">31</strong></u></td>
<td style="user-select: auto !important;">0→11</td>
<td style="user-select: auto !important;">44</td>
<td style="user-select: auto !important;"><u style="user-select: auto !important;"><strong style="user-select: auto !important;">1</strong></u></td>
<td style="user-select: auto !important;">0→7</td>
<td style="user-select: auto !important;">25</td>
<td style="user-select: auto !important;">2개 번호 일치, 5등</td>
</tr>
</tbody>
      </table>
<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">순서와 상관없이, 구매한 로또에 당첨 번호와 일치하는 번호가 있으면 맞힌 걸로 인정됩니다. </li>
<li style="user-select: auto !important;">알아볼 수 없는 두 개의 번호를 각각 10, 6이라고 가정하면 3등에 당첨될 수 있습니다. 

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">3등을 만드는 다른 방법들도 존재합니다. 하지만, 2등 이상으로 만드는 것은 불가능합니다. </li>
</ul></li>
<li style="user-select: auto !important;">알아볼 수 없는 두 개의 번호를 각각 11, 7이라고 가정하면 5등에 당첨될 수 있습니다. 

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">5등을 만드는 다른 방법들도 존재합니다. 하지만, 6등(낙첨)으로 만드는 것은 불가능합니다.</li>
</ul></li>
</ul>

<p style="user-select: auto !important;">민우가 구매한 로또 번호를 담은 배열 lottos, 당첨 번호를 담은 배열 win_nums가 매개변수로 주어집니다. 이때, 당첨 가능한 최고 순위와 최저 순위를 차례대로 배열에 담아서 return 하도록 solution 함수를 완성해주세요. </p>

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">lottos는 길이 6인 정수 배열입니다.</li>
<li style="user-select: auto !important;">lottos의 모든 원소는 0 이상 45 이하인 정수입니다.

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">0은 알아볼 수 없는 숫자를 의미합니다.</li>
<li style="user-select: auto !important;">0을 제외한 다른 숫자들은 lottos에 2개 이상 담겨있지 않습니다.</li>
<li style="user-select: auto !important;">lottos의 원소들은 정렬되어 있지 않을 수도 있습니다.</li>
</ul></li>
<li style="user-select: auto !important;">win_nums은 길이 6인 정수 배열입니다.</li>
<li style="user-select: auto !important;">win_nums의 모든 원소는 1 이상 45 이하인 정수입니다.

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">win_nums에는 같은 숫자가 2개 이상 담겨있지 않습니다.</li>
<li style="user-select: auto !important;">win_nums의 원소들은 정렬되어 있지 않을 수도 있습니다.</li>
</ul></li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">lottos</th>
<th style="user-select: auto !important;">win_nums</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[44, 1, 0, 0, 31, 25]</td>
<td style="user-select: auto !important;">[31, 10, 45, 1, 6, 19]</td>
<td style="user-select: auto !important;">[3, 5]</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[0, 0, 0, 0, 0, 0]</td>
<td style="user-select: auto !important;">[38, 19, 20, 40, 15, 25]</td>
<td style="user-select: auto !important;">[1, 6]</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[45, 4, 35, 20, 3, 9]</td>
<td style="user-select: auto !important;">[20, 9, 3, 45, 4, 35]</td>
<td style="user-select: auto !important;">[1, 1]</td>
</tr>
</tbody>
      </table>
<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1<br style="user-select: auto !important;">
문제 예시와 같습니다.</p>

<p style="user-select: auto !important;">입출력 예 #2<br style="user-select: auto !important;">
알아볼 수 없는 번호들이 아래와 같았다면, 1등과 6등에 당첨될 수 있습니다. </p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">당첨 번호</th>
<th style="user-select: auto !important;">38</th>
<th style="user-select: auto !important;">19</th>
<th style="user-select: auto !important;">20</th>
<th style="user-select: auto !important;">40</th>
<th style="user-select: auto !important;">15</th>
<th style="user-select: auto !important;">25</th>
<th style="user-select: auto !important;">결과</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">최고 순위 번호</td>
<td style="user-select: auto !important;">0→<u style="user-select: auto !important;"><strong style="user-select: auto !important;">38</strong></u></td>
<td style="user-select: auto !important;">0→<u style="user-select: auto !important;"><strong style="user-select: auto !important;">19</strong></u></td>
<td style="user-select: auto !important;">0→<u style="user-select: auto !important;"><strong style="user-select: auto !important;">20</strong></u></td>
<td style="user-select: auto !important;">0→<u style="user-select: auto !important;"><strong style="user-select: auto !important;">40</strong></u></td>
<td style="user-select: auto !important;">0→<u style="user-select: auto !important;"><strong style="user-select: auto !important;">15</strong></u></td>
<td style="user-select: auto !important;">0→<u style="user-select: auto !important;"><strong style="user-select: auto !important;">25</strong></u></td>
<td style="user-select: auto !important;">6개 번호 일치, 1등</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">최저 순위 번호</td>
<td style="user-select: auto !important;">0→21</td>
<td style="user-select: auto !important;">0→22</td>
<td style="user-select: auto !important;">0→23</td>
<td style="user-select: auto !important;">0→24</td>
<td style="user-select: auto !important;">0→26</td>
<td style="user-select: auto !important;">0→27</td>
<td style="user-select: auto !important;">0개 번호 일치, 6등</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;">입출력 예 #3<br style="user-select: auto !important;">
민우가 구매한 로또의 번호와 당첨 번호가 모두 일치하므로, 최고 순위와 최저 순위는 모두 1등입니다. </p>

<div class="footnotes" style="user-select: auto !important;">
<hr style="user-select: auto !important;">
<ol style="user-select: auto !important;">

<li id="fn1" style="user-select: auto !important;">
<p style="user-select: auto !important;">실제로 사용되는 로또 순위의 결정 방식과는 약간 다르지만, 이 문제에서는 지문에 명시된 대로 로또 순위를 결정하도록 합니다. &nbsp;<a href="#fnref1" style="user-select: auto !important;">↩</a></p>
</li>

</ol>
</div>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges