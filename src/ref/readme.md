## 기본형과 참조형

<br>

- 기본형: 변수에 사용할 값을 직접 넣을 수 있는 데이터 타입(`int`, `long`, `double`, `boolean`)
- 참조형: 데이터에 접근하기 위한 참조(주소)를 저장(`Student student`, `int[] students`)

<br>

> String은 사실 클래스다. 따라서 참조형이다. 그런데 기본형처럼 문자 값을 바로 대입할 수 있다.

<br>

### 기본형 vs 참조형
- 기본형은 들어있는 값을 그대로 계산할 수 있다
- 참조형은 들어있는 참조값을 그대로 사용할 수 없다
- 기본형, 참조형 모두 항상 **변수에 있는 값을 복사해서 대입**한다.
- 기본형 변수는 null을 할당할 수 없지만, 참조형 변수는 null을 할당할 수 있다.

### 변수의 종류
- 멤버 변수(필드): 클래스에 선언
- 지역 변수: 메서드에 선언

### 변수의 값 초기화
- 멤버 변수: 초기화
    - 인스턴스의 멤버 변수는 인스턴스를 생성할 때 자동으로 초기화
    - 숫자(int)=0, boolean = false, 참조형=null
    - 개발자가 초기값을 직접 지정할 수 있다
- 지역 변수: 수동 초기화

### Null
- 참조형 변수에서 아직 가리키는 대상이 없다면 null이라는 특별한 값을 넣을 수 있다.
- 만약 참조값 주소를 잃어서 메모리 누수가 발생한다면, JVM의 GC(가비지 컬렉션)가 인스턴스를 자동으로 메모리에서 제거한다

### NullPointerException
- 참조값이 없는데 객체를 찾으려고 할때 발생하는 문제