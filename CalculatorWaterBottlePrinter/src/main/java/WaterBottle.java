public class WaterBottle {
    private int volume = 100;

    public WaterBottle(){
        this.volume = volume;
    }

    public int getVolume(){
        return volume;
    }

    public void drinkWater(){
        volume -= 10;
    }

    public void emptyBottle(){
        volume = 0;
    }

    public void fillWaterBottle(){
        volume = 100;
    }
}

