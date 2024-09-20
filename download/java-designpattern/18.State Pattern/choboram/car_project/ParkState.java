public class ParkState implements CarState {
    @Override
    public void handleGearChange(Car car) {
        System.out.println("자동차가 주차 모드로 전환되었습니다.");
        // 자동차의 상태를 Park로 변경
        car.setState(this);
    }

    @Override
    public String toString() {
        return "주차 상태";
    }
}
