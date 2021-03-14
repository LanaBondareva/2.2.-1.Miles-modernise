public class BonusMilesService {
    public long calculate(int price) {
        int miles = price / 20;
        return miles;
    }
}
