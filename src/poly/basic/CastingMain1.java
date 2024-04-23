package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        Parent poly = new Child();
//        poly.childMethod();

        // 다운 캐스팅 (부모 타입 -> 자식 타입)
//        Child child = poly; //x001 을 child에 넣어
        Child child = (Child) poly; // 강제 형변환
        child.childMethod();
    }
}
