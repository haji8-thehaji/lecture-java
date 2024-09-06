# 학생 - 과목


연관 관계 & 직접 연관 관계(Association & Direct Association)

학생과 과목의 관계를 연관 관계로 표현한 것이다.

실선 위에 0..* 은 Multiplicity를 나타내는데, 이는 대상 클래스의 가질 수 있는 인스턴스 개수 범위를 의미한다.

점으로 구분하며 앞에 값은 최소값을 의미하고 뒤에 값은 최대값을 의미한다.

연관 관계의 숫자 표현
1 : 1개
0..1 : 0 또는 1개
* : 0 ~ n개
1..* : 1 ~ n개
n..m : n ~ m개

학생들은 여러 과목을 수강할 수 있고, 각 과목은 수강 신청한 학생들의 목록을 갖고 있도록 표현한 것

![step5](https://github.com/haji8-thehaji/lecture-java/blob/main/download/java-designpattern/00.UML/step5/step5.png)
