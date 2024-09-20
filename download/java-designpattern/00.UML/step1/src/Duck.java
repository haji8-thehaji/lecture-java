
public class Duck extends Animal{
    public String beakColor = "yellow";

    Duck(int age, String gender, String beakColor){
        super(age, gender);
        this.beakColor = beakColor;
    }
    Duck(int age, String gender){
        super(age, gender);
    }
    public void swim(){
        System.out.println("헤엄칩니다");
    }
    public void quak(){
        System.out.println("오리 꽥꽥");
    }

    @Override
    public void introduce(String test)
    {
        super.introduce(test);
    }

    @Override
    public void isMamal(){
        System.out.println("포유류입니다.");
    }

}