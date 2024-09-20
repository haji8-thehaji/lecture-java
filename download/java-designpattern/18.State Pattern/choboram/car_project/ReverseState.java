public class ReverseState implements CarState {
    @Override
    public CarState gearUp() {
        return new NeutralState(); // 중립 상태로 이동
    }

    @Override
    public CarState gearDown() {
        System.out.println("이미 최소 기어 상태입니다."); // Reverse가 최소 상태
        return this;
    }

    @Override
    public void handleGearChange() {
        System.out.println("go back"); // Reverse 상태에서 출력
    }

    @Override
    public String toString() {
        return "후진 상태";
    }
}
