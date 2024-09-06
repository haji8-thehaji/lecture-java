
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        
        Animal a1 = new Animal("홍길동", "남자");
        // a1.printInfo();

        
        People p1 = new People("하지양", "여자", "한국인");
        // p1.printInfo();

        
        Horse h1 = new Horse("세퍼드", "남자", 20);
        // h1.printInfo();

        List<Animal> l1 =  new ArrayList<Animal>();
        l1.add(a1);
        l1.add(p1);
        l1.add(h1);

        for (Animal ani : l1) {
            //ani.printInfo();
        }

        Car c1 = new Car(100);
        
        List<Info> l2 =  new ArrayList<Info>();
        l2.add(a1);
        l2.add(p1);
        l2.add(h1);
        l2.add(c1);

        for (Info info : l2) {
            //info.printInfo();
            if (info instanceof People) {
                People tempPeople = (People)info;
                tempPeople.study();
            }
            if (info instanceof Horse){
                ((Horse) info).yell();
            }
        }
    }
}
