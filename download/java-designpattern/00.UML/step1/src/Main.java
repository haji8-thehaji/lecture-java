
public class Main {

    public static void main(String[] args) throws Exception {
        Animal a1 = new Duck(3,"female");
        Animal b1 = new Fish(2, "male", 5);


        ((Duck)a1).introduce();
        b1.introduce("물괴기");

        a1.isMamal();
        b1.isMamal();
        ((Duck)a1).isMamal();
        //((Duck)b1).isMamal(); // 런타임 에러
        ((Fish)b1).isMamal();

        Animal[] list = new Animal[2];
        list[0] = a1;
        list[1] = b1;
        for(Animal a : list){
            a.isMamal();
            // a.introduce();
        }
        Animal[] list2 = {a1,b1};
        for (Animal b : list2) {
            b.introduce("동물");
            b.isMamal();
            if(b instanceof Duck){
                Duck c = (Duck)b;
                c.introduce();
                c.swim();
            }else if(b instanceof Fish){
                Fish d = (Fish)b;
                d.introduce();
                d.swim();
            }
        }
        

    }
}
