# Decorator Pattern
* 데코레이터 패턴은 기본 기능에 추가할 수 있는 많은 수의 부가 기능에 대해서 동적인 조합을 구현할 수 있는 패턴이다.

* 기본 구현 
도로에 길을 그릴때, 기본 도로와 교통량을 나타내는 도로를 그릴때 기본적으로 적용할 수 있는 클래스 다이어그램
![기본 구현](https://github.com/haji8-thehaji/lecture-java/blob/main/download/java-designpattern/11.Decorator%20Pattern/deco-default.png?raw=true)

* 기본 라인, 교통량 표시, 교차로 표시를 다양하게 조합하여 도로에 그릴 수 있다.
![다양한 조합](https://github.com/haji8-thehaji/lecture-java/blob/main/download/java-designpattern/11.Decorator%20Pattern/deco-mix.png?raw=true)

* 데코레이터 패턴을 사용하지 않고 위의 다양한 조합의 도로를 그리는 방법
![nonuse-deco](https://github.com/haji8-thehaji/lecture-java/blob/main/download/java-designpattern/11.Decorator%20Pattern/nonuse-deco.png?raw=true)


* 데코레이터 패턴을 사용하여 다양한 도로를 그리는 방법
![deco](https://github.com/haji8-thehaji/lecture-java/blob/main/download/java-designpattern/11.Decorator%20Pattern/deco.png?raw=true)
