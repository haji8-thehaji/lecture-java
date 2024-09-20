public class DriveState implements CarState {
    @Override
    public CarState gearUp() {
        System.out.println("이미 최대 기어 상태입니다."); // Drive가 최대 상태
        return this;
    }

    @Override
    public CarState gearDown() {
        return new NeutralState(); // 중립 상태로 이동
    }

    @Override
    public void handleGearChange() {
        System.out.println("gogogo"); // Drive 상태에서 출력
    }

    @Override
    public String toString() {
        return "드라이브 상태";
    }
}
