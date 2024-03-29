# 자동차 경주 게임 [RacingCar]

## 📋 기능 목록
- 시도할 횟수 입력받기
  - 입력값이 숫자인지 확인
- 경주할 자동차 이름 입력받기 
   - 쉼표(,)를 기준으로 입력했는지 확인
   - 이름이 5자 이하인지 확인
   - 경주할 자동차의 수 확인
- 자동차 경주 진행
  - 랜덤수 추출 및 전진여부 판단
  - 각 경주 차량별 이동 상황 출력
  - 공백 출력 
- 최종 우승자 판단 및 출력
- 예외 상황 시 에러 문구 출력

## 📂 디렉토리 구조 
```
├─main/java/racingcar
│  │
│  ├─controller
│  │      GameCotroller
│  ├─domain
│  │      Car
│  │      Cars
│  │      Result
│  │      Round
│  ├─utils
│  │      RandomUtils
│  └─view
│         inputView
│         outputView
│
├─test/java/racingcar
│  │  CarTest
│  │  CarsTest
│  │  ResultTest
│  └─ RoundTest
│
└─README.md
```
## 💻 입출력 예시
- 경주할 자동차 이름, 시도할 횟수 입력 
```
자동차 이름을 ,로 구분해서 입력하시오
juhi,tom,lisa
```
- 실행결과 출력
```
실행 결과
juhi : ------
tom : -----
lisa : ---
최종 우승자 : juhi
```
