public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int BonusMilesService = service.calculate(100000);
        System.out.println("Количество бонусных миль=" + BonusMilesService);


        // int price = 10_000;
        // int miles = service.calculate(price);
        // System.out.println(miles);
    }
}
