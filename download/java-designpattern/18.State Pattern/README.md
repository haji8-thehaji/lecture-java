# State Pattern

상태에 따라 다른 동작을 하는 경우, 스테이트 패턴을 사용하여 해결한다

형광등을 예로 들었을때, 형광등이 On/Off 스위치가 있는 경우도 있고, 하나의 스위치로 on/off가 변경되는 경우도 있다.

![Light-2state.png](https://github.com/haji8-thehaji/lecture-java/blob/main/download/java-designpattern/18.State%20Pattern/Light-2state.png?raw=true)

이럴때 ON, OFF 의 State를 만들어 state가 On 일때는 Off 객체를 매핑하고 Off일때는 On 객체를 매핑하여 해결할 수 있다.asd

이후 상태가 하나 더 추가되어 sleeping mode (취침등) 이 생겼을 때도 쉽게 확장이 가능하다

![3state](https://github.com/haji8-thehaji/lecture-java/blob/main/download/java-designpattern/18.State%20Pattern/Light-3state.png?raw=true)

* 구현 소스
2가지 상태를 가지는 형광등 On/Off 스위치 버전

![sample](https://github.com/haji8-thehaji/lecture-java/blob/main/download/java-designpattern/18.State%20Pattern/sample-code-light-3state.png?raw=true)
