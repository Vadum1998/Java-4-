public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int bonusMiles = 20;
        int price = 10_000;
        int miles = service.calculate(price, bonusMiles);
        System.out.println("Ваш бонус составляет=" + miles + " рублей");
    }
}