import extanal.DrawLine;

public class Main {
    public static void main(String[] args) {
        Display road = new RoadDisplay(); // 기본 도로 생성

        road.draw();
        System.out.println("#####");
        // 차선과 교차로를 함께 표시하는 경우
        Display laneDecoratedRoad = new LaneDecorator(road);

        
        laneDecoratedRoad.draw();
        System.out.println("#####");

        Display intersectionDecoratedRoad = new IntersectionDecorator(laneDecoratedRoad);

        // 최종 도로 그리기
        intersectionDecoratedRoad.draw();
        System.out.println("#####");

        DrawLine drawLine = new DrawLine();

        Display road6 = new AdapterDisplay(drawLine); // 기본 도로 생성

        // 차선과 교차로를 함께 표시하는 경우
        Display laneDecoratedRoad6 = new LaneDecorator(road6);
        road6.draw();
        System.out.println("#####");
        laneDecoratedRoad6.draw();
        
    }
}