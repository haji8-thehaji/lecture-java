# Adapter Pattern

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
예시 : 자바의 I/O 라이브러이의 inputStreamReader 는 바이트 스트림을 문자 스트림으로 변환하는 어댑터 역할을 한다. 

![inputStreamReader](https://github.com/haji8-thehaji/lecture-java/blob/main/download/java-designpattern/02.Adapter%20Pattern/inputStreamReader.png?raw=true)

서로 호환이 되지 않은 단자를 어댑터로 호환시켜 작동시키게끔 하는 것이 어댑터의 역할

이미 구축되어 있는 것을 새로운 어떤것에 사용할때 양 쪽 간의 호환성을 유지해 주기 위해 사용하는 것으로서, 기존 시스템에서 새로운 업체에서 제공하는 기능을 사용하려고 할때 서로 간의 인터페이스를 어댑터로 일치시켜줌으로써 호환성 및 신규 기능 확장을 할수 있다

![어댑터 예시](https://github.com/haji8-thehaji/lecture-java/blob/main/download/java-designpattern/02.Adapter%20Pattern/adapter-ex.png?raw=true)


간단하게 알아보기
# Arrays의 asList()

  
    public static void main(String[] args) {
	  // String 배열 : adaptee 기존 서비스
      String[] s = {"a", "b", "c"};
    
      // List<String> : target 인터페이스
      List<String> list
    
      // Arrays.asList() : adapter 기존 서비스 배열을 리스트로 변환 & 호환하게 해주는 역할
      list = Arrays.asList(s);
    }
