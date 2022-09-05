public class Runner {

    public static void main(String[] args) {

        WaterBottle myWaterBottle;
        myWaterBottle = new WaterBottle(100, 10);
        System.out.println(myWaterBottle.afterDrink());
        System.out.println(myWaterBottle.afterDrink());
        System.out.println(myWaterBottle.afterDrink());
        System.out.println(myWaterBottle.afterDrink());
        System.out.println(myWaterBottle.getVolume());
        System.out.println(myWaterBottle.needsFilled());
        System.out.println(myWaterBottle.fill());
    }
}
