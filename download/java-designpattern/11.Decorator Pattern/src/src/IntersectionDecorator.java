// 교차로를 추가하는 IntersectionDecorator 클래스
public class IntersectionDecorator extends DisplayDecorator {
    public IntersectionDecorator(Display display) {
        super(display);
    }

    @Override
    public void draw() {
        drawIntersection(); // 교차로 그리기
        super.draw(); // 기본 도로 그리기
    }

    private void drawIntersection() {
        System.out.println("교차로를 그립니다.");
    }
}