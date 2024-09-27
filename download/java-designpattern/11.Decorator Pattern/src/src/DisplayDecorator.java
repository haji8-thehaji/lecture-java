// DisplayDecorator 추상 클래스
public abstract class DisplayDecorator implements Display {
    protected Display display;

    public DisplayDecorator(Display display) {
        this.display = display;
    }

    @Override
    public void draw() {
        display.draw(); // 기본 도로 그리기
    }
}