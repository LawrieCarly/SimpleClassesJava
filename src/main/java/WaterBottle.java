public class WaterBottle {

    private int volume;
    private int drink;

    public WaterBottle(int volume, int drink){
        this.volume = volume;
        this.drink = drink;
    }

    public int getVolume(){
        return this.volume;
    }

    public int afterDrink(){
        this.volume = volume - drink;
        return volume;
    }

    public int empty() {
        return volume - volume;
    }

    public boolean needsFilled() {
        boolean needsWater = false;
        if (volume < 100) {
            needsWater = true;
        } else needsWater = false;
        return needsWater;

    };

//    public int fill(){
//        if (needsFilled()==true){
//            volume++;
//        }
//        return volume;
//    }

    public int fill(){
        int amount = volume;
        int full = 100;
        if (needsFilled()==true){
            for(amount = volume; amount < full; amount++);
    }
        return amount;
    }
}


//Create a water bottle class with a volume property.
//The volume should start at 100.
//Add a drink function that takes 10 from the volume each time it is called.
//Create an empty function that brings the volume down to 0.
//Create a fill function that fills the volume back to 100.