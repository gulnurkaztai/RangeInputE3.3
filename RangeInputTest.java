public class RangeInputTest{

    public static void main(String[] args){
        RangeInput rangeInput = new RangeInput(20, 60);
        rangeInput.up();
        rangeInput.up();
        rangeInput.up();
        rangeInput.down();
        System.out.println("Expected value is 42");
        System.out.println(rangeInput.getValue());
    }
}