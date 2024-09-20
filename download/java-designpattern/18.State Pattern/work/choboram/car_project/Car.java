public class Car {
    private CarState state;

    public Car() {
        this.state = new NeutralState(); // 기본 상태는 중립
    }

    public void gearUp() {
        state = state.gearUp(); // 상태를 업
    }

    public void gearDown() {
        state = state.gearDown(); // 상태를 다운
    }

    public void showCurrentState() {
        System.out.println("현재 상태: " + state.toString());
        state.handleGearChange(); // 상태에 따른 동작 출력
    }
}
