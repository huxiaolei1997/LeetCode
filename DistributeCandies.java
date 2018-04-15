import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public int distributeCandies(int[] candies) {
        Set<Integer> candiesNew = new HashSet<>();
        for (int candy : candies) {
            candiesNew.add(candy);
        }
        // 如果此时妹妹获得的糖果种类大于等于总的糖果数目的二分之一，那么妹妹能分到糖果数的一半，否则就分到此时的糖果种类数目
        return candiesNew.size() >= candies.length / 2 ? candies.length / 2 : candiesNew.size();
    }

    public static void main(String[] args) {
        int[] candies = {1, 1, 2, 3};
        DistributeCandies distributeCandies = new DistributeCandies();
        int result = distributeCandies.distributeCandies(candies);
        System.out.println(result);
    }
}
