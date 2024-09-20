public interface CarState {
    CarState gearUp();   // 기어를 위로
    CarState gearDown(); // 기어를 아래로
    void handleGearChange(); // 상태에 따른 동작 출력
}
