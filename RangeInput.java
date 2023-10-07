public class RangeInput {
    private int minValue;
    private int maxValue;
    private int currentValue;

    public RangeInput(int minValue, int maxValue){
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.currentValue = (this.minValue+this.maxValue)/2;
    }



    public void up(){
        this.currentValue++;
        this.currentValue = Math.min(this.maxValue,this.currentValue);
    }

    public void down(){
        this.currentValue--;
        this.currentValue = Math.max(this.minValue, this.currentValue);
    }
    
    public int getValue(){
        return this.currentValue;
    }

}