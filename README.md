# 경성대학교 소프트웨어학과 - 웹프로그래밍(EO304001, EO304002) Term

## 주의사항

* 해당 과목의 경우 'Term'을 완료하지 않으면 학점이 'F'로 처리됨.
  * `syllabus`를 설명하는 과정에서 자세히 설명했음

* 최종 제출 시한은 '2018년 06월 15일 23:55분', `sangkonhan@ks.ac.kr`로 제출
  - 메일함 도착시간 기준
  - `학번_이름_분반.zip`으로 제출할 것
  - github 사용했으면 메일 본문에 github 주소 like 할 것

## 최소 요구 사항(필수)
* `소개` 부분 및 `초기데이터`를 반드시 작성해야 함 (0.1점)
* `경력(experience)` 부분의 경우 `Resume` 모델과 `1:N`을 성립하도록 할 것(6점)
  - experience 모델을 별도로 생성하여 `Resume` 모델과 `1:N` 관계를 형성 할 것 (2)
  - experience 추가(1점)
  - experience 전체 출력(1점)
  - experience 수정(1점)
  - experience 삭제(1점)
  - URL
    - `/register` --> experience create
    - `/{rno}` --> view
    - `/{rno}/update` --> update
    - `/{rno}/delete` --> delete

## 추가 요구 사항(옵션)
* 하나의 `index.html`로 구성된 것은 `resume.html`과 `experience.html` 등으로 분리하여 제출(1점)
* `404`, `500`에러를 별도의 페이지로 작성 (1점)
* `소개`부분의 `Q&A`를 교재의 댓글 부분을 참고해서 완성 (2점)

## CSS 디자인 변경시
* 추가 점수를 제공하지 않으나, 동점처리시 우선순위 부여

## 당부말씀
* 최소 요구사항을 작성하고 나면 반드시 선 제출할 것(시간내 미제출시 F), 예외는 없음
* 동료와 함께 하는건 상관없으나 코드 복사 적발시 이유를 불문하고 관련자 전원 `F`
* 최소 요구 사항 중 `소개` 부분만 작성해서 제출해도 해당 Term 프로젝트 통과는 인정
  - 최대 학점은 `B`이상은 불가(중간/기말 만점기준)
  
## Ref.
* CSS는 [A Bootstrap 4 resume/CV theme created by Start Bootstrap ](https://github.com/technext/resume-bootstrap4)를 참고하였음.