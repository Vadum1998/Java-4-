public class BonusMilesService {
    public int calculate(int price, int bonusMiles) {
        int miles = price / bonusMiles;
        return miles;

    }
}