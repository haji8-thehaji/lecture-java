# Strategy Pattern(전략패턴)

자신에게 맞는 전략(Strategy)을 취사선택하여 로직을 수행할 수 있게하는 방법입니다. 
게임을 예로들면 캐릭터는 공격이라는 작업을 수행함에 있어 무기를 상황에 맞게 선택해서 공격을 위임할 수 있습니다.

![step4](https://github.com/haji8-thehaji/lecture-java/blob/main/download/java-designpattern/01.Strategy%20Pattern/strategy.png)


게임 캐릭터를 기준으로 스트레티지 패턴을 적용한다면, 
마법사, 검사, 사제 의 3가지 종류를 가지는 게임 캐릭터가 있고
마법사는 걷기, 마법(파이어, 워터볼) 이 있고
검사는 걷기, 방어하기, 공격하기 가 있다,

게임 캐릭터 클래스와 공격, 방어 기능을 구현한다.

참고 자료로는 
* ![step4](https://github.com/haji8-thehaji/lecture-java/blob/main/download/java-designpattern/01.Strategy%20Pattern/strategy-ex1.png)
