public class Animal{
    int age;
    String gender;
    Animal( int age, String gender){
        this.age = age;
        this.gender = gender;
    }
    void isMamal(){
        System.out.println("포유류인지 모릅니다.");
    }
    void introduce(String text){
        System.out.println("안녕하세요. 저는 "+text+"입니다.");
    }
}