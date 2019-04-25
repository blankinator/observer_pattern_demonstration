package concrete_implementations.v2.displays;

public class PrecipitationDisplayV2 extends DisplayV2 {

    @Override
    public void update(int value) {
        System.out.println(value + "mm precipitation");
    }
}
