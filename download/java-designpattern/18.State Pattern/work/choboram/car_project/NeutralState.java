public class NeutralState implements CarState {
    @Override
    public CarState gearUp() {
        return new DriveState(); // 드라이브 상태로 이동
    }

    @Override
    public CarState gearDown() {
        return new ReverseState(); // 후진 상태로 이동
    }

    @Override
    public void handleGearChange() {
        System.out.println("stop"); // Neutral 상태에서 멈춤을 출력
    }

    @Override
    public String toString() {
        return "중립 상태";
    }
}
