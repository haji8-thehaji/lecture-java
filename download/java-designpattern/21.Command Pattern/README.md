# Command Pattern

특정 버튼을 눌렀을때, 그에 관련된 작업이 진행된다면 커맨트 패턴으로 구현하기 좋다.

어떠한 명령어 모음을 실행하고자 할때 사용하는데,

커맨트 패턴을 사용할때, 스테이트 패턴을 사용하고자 하는 욕구가 생길 수 있다.

차이점을 알아보자

# 예제
* 알람시계가 있다, 이 알람시계에는 조명 기능과 알람 설정 기능이 있는데, 버튼 하나로 동작한다.
첫번째 버튼 클릭에는 조명이 켜지고, 두번째 버튼 클릭에는 알람이 설정된다.

이떄, 일반 상태, 조명 상태, 알람 상태로 위 기능을 구현하면 스테이트 패턴을 따르는 것과 같다.
```
enum Mode { LAMP, ALARM} ;

public class Button {
	private Lamp theLamp ;
	private Alarm theAlarm ;
	private Mode theMode ;
	
	public Button(Lamp theLamp, Alarm theAlarm) {
		this.theLamp = theLamp ;
		this.theAlarm = theAlarm ;
	}
	public void setMode(Mode mode) {
		this.theMode = mode ;
	}
	public void pressed() {
		switch ( theMode ) {
		case LAMP: theLamp.turnOn() ; break ;
		case ALARM: theAlarm.start() ; break ;
		}
	}
}
```
버튼에는 상태값(Mode)가 지정되어 있으며, 이 모드에 따라 turnOn() 또는 Alarm.start() 가 실행된다

하지만 이는 스테이트 패턴을 잘못 사용하는 것을 이윽고 깨달을 것이다.

기능의 변경 또는 새로운 기능의 추가 때마다 Button 클래스를 수정하여야 하기 때문에 OCP를 위반한다.

이를 커맨트 패턴으로 구현한다면 버튼 클릭후 행동을 분리하여 구현할 수 있게된다.

* 개방-폐쇄 원칙(OCP, Open-Closed Principle)은 '소프트웨어 개체(클래스, 모듈, 함수 등등)는 확장에 대해 열려 있어야 하고, 수정에 대해서는 닫혀 있어야 한다'는 프로그래밍 원칙
