# 할일목록 만들기

## Checklist - 전체

- [x] 할일 목록 조회
- [ ] 할일 상세 조회
- [ ] 할일 생성
- [ ] 할일 제목수정
- [ ] 할일 삭제

## 할일 목록 조회

### Checklist - 2021.09.04

- [x] GET "/" status 200
- [x] GET "/" Hello World
- [x] 테스트를 시작할때, 서버 시작하기
- [x] 테스트가 끝나면, 서버 종료하기
- [ ] startServer static?
- [x] 할일 - 식별자, 제목, 완료여부, 날짜
- [x] GET "/taskDtos" 무언가 응답
- [x] GET "/taskDtos" 할일 목록 응답
- [x] 할 일 객체 Task
- [x] 객체를 string 으로 - jackson
- [x] getter, setter, 생성자를 간편하게 생성 - lombok

### 의문점

- [ ] executor ?
- [ ] httpExchange ?

### 배운것

- longest matching
  - https://docs.oracle.com/javase/8/docs/jre/api/net/httpserver/spec/com/sun/net/httpserver/HttpServer.html
- jackson, objectMapper
  - https://fasterxml.github.io/jackson-databind/javadoc/2.7/com/fasterxml/jackson/databind/ObjectMapper.html

### Checklist - 2021.09.05

- [x] API 를 조회하는 통합테스트만으로 충분할까?
- [x] Task DTO 만들기
    - [x] lombok annotation 수정 - @AllArgsConstructor, @Setter 지우기
    - [x] DTO builder 패턴
    - [x] 할일 완료 여부를 default false 로 설정
- [ ] 테스트 중복 로직 제거
- [ ] 서버 할 일 데이터를 만들고, 목록 요청시 해당 데이터(DTO 매핑후?)를 반환

### 의문점

- [ ] JPA @Entity 는 도메인 객체에 붙여주는 걸까? 아니면 DB 를 위한 데이터 매핑(스키마) 용 일까?

## 할일 상세 조회

### Checklist - 2021.09.05

- [x] GET tasks/{id} 테스트 추가
- [x] handler - send 추출 => 데이터를 보내주는 low 기술 메서드
- [x] handler - getResponseDataOn 추출 => 경로에 따른 응답데이터 반환 메서드
- [ ] {id} 를 받았을때, '할 일 목록' 에서 해당 id 찾아서 주기

### Checklist - 2021.09.26

- [x] {id} 를 받았을때, '할 일 목록' 에서 해당 id 찾아서 주기
- [x] 테스트 중복 로직 제거
  - [x] client 를 만들고 request 를 보내는 코드 중복 제거
  - [x] list fixture 를 JSON 객체로
  - [x] MockMvc 클래스 파일 생성
- [ ] POST /tasks -> 201, {}
- [ ] json 변환 작업을 object.toJSON 형식으로 추상화
