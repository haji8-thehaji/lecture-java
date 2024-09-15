# Observer


* 관찰 대상의 상태가 변화하면 관찰자에게 알려주는 패턴.
  
  객체 사이에 일 대 다의 의존 관계를 정의해 두어,

  어떤 객체의 상태가 변할 때 그 객체에 의존성을 가진 다른 객체들이 그 변화를 통지받고 자동으로 갱신될 수 있게 만듭니다. 

* 옵저버 패턴은 통보대상 객체의 관리를 subject 객체와 obsever 인터페이스로 일반화한다.

  그러면 데이터 변경을 통보하는 클래스는 통보대상 클래스/객체에 대한 의존성을 제거할 수 있다.
  
  결과적으로 옵저버 패턴은 통보 대상 클래스나, 대상 객체의 변경에도 subject 클래스를 변경없이 그대로 사용할 수 있다.

  ![observer-pattern](https://github.com/haji8-thehaji/lecture-java/blob/main/download/java-designpattern/16.Observer/observer-pattern.png?raw=true)
