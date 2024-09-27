// 차선을 추가하는 LaneDecorator 클래스
public class LaneDecorator extends DisplayDecorator {
    public LaneDecorator(Display display) {
        super(display);
    }

    @Override
    public void draw() {
        super.draw(); // 기본 도로 그리기
        drawLanes(); // 차선 그리기
    }

    private void drawLanes() {
        System.out.println("차선을 그립니다.");
    }
}
