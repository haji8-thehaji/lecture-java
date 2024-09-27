import extanal.DrawLine;

public class AdapterDisplay implements Display {
    public DrawLine drawLine;

    public AdapterDisplay(DrawLine drawLine)    {
        this.drawLine = drawLine;
    }
    @Override
    public void draw() {
        drawLine.draw();
    }



}
