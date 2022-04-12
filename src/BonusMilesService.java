public class BonusMilesService {
    public int calculate(int cost) {
        int bonusMiles = 10_000;
        int miles = cost / bonusMiles;

        return miles;
    }
}

