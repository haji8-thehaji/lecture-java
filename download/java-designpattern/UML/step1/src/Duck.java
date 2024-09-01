
public class Duck extends Animal{
    String beakColor = "yellow";
    Duck(int age, String gender, String beakColor){
        super(age, gender);
        this.beakColor = beakColor;
    }
    Duck(int age, String gender){
        super(age, gender);
    }
    void swim(){
        System.out.println("헤엄칩니다");
    }
    void quak(){
        System.out.println("오리 꽥꽥");
    }
    void introduce()
    {
        super.introduce("오리");
    }
    void isMamal(){
        System.out.println("포유류입니다.");
    }

}