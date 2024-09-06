
public class Fish extends Animal{
    
    int sizeInFt;
    
    Fish(int age, String gender, int sizeInFt){
        super(age, gender);
        this.sizeInFt = sizeInFt;
    }
    void swim(){
        System.out.println("헤엄칩니다");
    }
    void isMamal(){
        System.out.println("포유류가 아닙니다.");
    }
    void introduce(){
        super.introduce("물고기");
    }
}