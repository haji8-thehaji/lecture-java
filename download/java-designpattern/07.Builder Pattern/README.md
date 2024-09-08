# Builder Pattern

```
public class MailBuilder {
    public MailBuilder from(String address) {...; return this;}
    public MailBuilder to(String address) {...; return this;}
    public MailBuilder subject(String line) {...; return this;}
    public MailBuilder body(String message) {...; return this;}
    public void send() {...}
}

public void main(String[] args) {
    MailBuilder mailBuilder = new MailBuilder ();
    mailBuilder.from(a@a.com)
               .to(b@b.com)
               .subject("without builder)
               .body("This is still sucks..")
               .send()
}
```

new foo(a,b,c,d,e,f…,z) 하기 귀찮습니다. 또 생성자의 parameter 가 길어지면 실수나 오타를 발견하기도 어렵습니다.

* 복잡한 객체의 생성 과정과 표현 방법을 분리하여 다양한 구성의 인스턴스를 만드는 생성 패턴이다. 생성자에 들어갈 매개 변수를 메서드로 하나하나 받아들이고 마지막에 통합 빌드해서 객체를 생성하는 방식, 클래스의 선택적 매개변수가 많은 상황에서 유용하게 사용된다.

![빌더패턴](https://github.com/haji8-thehaji/lecture-java/blob/main/download/java-designpattern/07.Builder%20Pattern/Builder%20Pattern.png?raw=true)


초기화가 필수인 멤버는 빌더의 생성자로 받게 하여 필수 멤버를 설정해주어야 빌더 객체가 생성되도록 유도하고, 선택적인 멤버는 빌더의 메서드로 받도록 하면, 사용자로 하여금 필수 멤버와 선택 멤버를 구분하여 객체 생성을 유도할 수 있다.
