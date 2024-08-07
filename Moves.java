public class Moves{
    public static int minMovesToEvenFollowedByOdd(int[] arr) {
        int moves = 0;
        int totalLength = arr.length;
        for (int i = 0; i <= totalLength / 2; i++) {
            if (arr[i] % 2 != 0) {
                for (int j = totalLength / 2; j < totalLength; j++) {
                    if (arr[j] % 2 == 0) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        moves++;
                        break;
                    } else {
                        continue;
                    }
                }
            } else {
                continue;
            }
        }
        return moves;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6}; // example array
        int moves = minMovesToEvenFollowedByOdd(arr);
        System.out.println("Minimum moves: " + moves);
    }
}