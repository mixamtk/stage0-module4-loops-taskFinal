package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        int count = cathetusLength;
        for (int i = 1; i <= cathetusLength; i++) {
            for (int a = 1; a <= cathetusLength; a++) {
                if (cathetusLength-count<a) System.out.print("*");
                else System.out.print(" ");
                if (a == cathetusLength) System.out.println();
            }
            count--;
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
