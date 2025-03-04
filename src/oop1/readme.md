## 객체 지향 프로그래밍

<br>

### 절차 지향 프로그래밍
- 실행 순서를 중요하게 생각하는 방식
- 프로그램의 **흐름을 순차적으로 따르며 처리**하는 방식, `어떻게`를 중심으로 프로그래밍

### 객체
- 세상의 모든 사물을 추상화하면 속성(데이터)과 기능 2가지로 되어 있다

**동물**
- 속성: 색상, 키, 온도
- 기능: 먹는다, 걷는다

**자동차**
- 속성: 차량 색상, 현재 속도
- 기능: 엑셀, 브레이크, 문 열기, 문 닫기

<br>

> 객체 지향 프로그래밍은 모든 사물을 속성과 기능을 가진 객체로 생각하는 것

<br>

### 객체 지향 프로그래밍
- 객체를 중요하게 생각하는 방식
- 실제 세계의 사물이나 사건을 객체로 보고, 이러한 **객체들 간의 상호작용을 중심**으로 프로그래밍하는 방식, `무엇을`을 중심으로 프로그래밍

### 둘의 차이점
- 절차 지향은 데이터와 해당 데이터에 대한 처리 방식이 분리되어 있다.
- 반면 객체 지향에서는 데이터와 그 데이터에 대한 행동이 하나의 '객체'안에 포함되어 있다.

### 절차 지향 프로그램의 한계
- 데이터와 그 데이터의 기능은 밀접한 연관이 있는데, 데이터와 데이터의 기능이 분리되어 있다
- 유지보수 관점에서 관리 포인트가 2곳으로 늘어난다

### 인스턴스의 메서드 호출
- 객체는 자신의 메서드를 통해 자신의 멤버 변수에 접근할 수 있다
    - 객체의 메서드 내부에서 접근하는 멤버 변수는 객체 자신의 멤버 변수이다.

### 캡슐화
- 속성과 기능을 하나로 묶어서 필요한 기능을 메서드를 통해 외부에 제공하는 것