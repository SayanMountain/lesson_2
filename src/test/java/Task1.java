public class Task1 {
    public boolean check10And20 (int first, int second){
        boolean num_between_condion;
        if (first + second > 10 && first + second >= 20) {
            num_between_condion = true;
        } else {
            num_between_condion = false;
        }
        return (num_between_condion);
    }
}