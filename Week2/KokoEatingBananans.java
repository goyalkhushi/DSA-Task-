public class KokoEatingBananans{
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1; 
        int high = Integer.MIN_VALUE; 
        for (int pile : piles)
            high = Math.max(high, pile);
        int result = -1; 
        while (low <= high) {
            int mid = low + (high - low) / 2; 
            if (isPossible(piles, mid, h)) {
                result = mid; 
                high = mid - 1;
            } else {
                low = mid + 1; 
            }
        }

        return result;
    }
    private boolean isPossible(int[] piles, int possK, int h) {
        int totTime = 0;
        for (int i = 0; i < piles.length; i++)
            totTime += Math.ceil(piles[i] * 1d / possK); 
        return totTime <= h; 
    }

}