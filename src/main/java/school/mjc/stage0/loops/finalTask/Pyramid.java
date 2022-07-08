package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printHalfPyramid(int cathetusLength) {
        int count;
        for (int i = 1; i <= cathetusLength; i++) {
            count = cathetusLength + 1;
            for (int a = 1; a <= cathetusLength; a++) {
                if (count > i) System.out.print(" ");
                count--;
                if (count <= i) System.out.print(count);
            }
            count = 2;
            if (i != 1)
            for (int a = 1; a <= cathetusLength-1; a++) {
                if (count <= i) System.out.print(count);
                count++ ;
                if (count > i && count <cathetusLength) System.out.print(" ");
                if (a == cathetusLength-1) System.out.println();
            } else
                for (int a = 1; a <= cathetusLength; a++) {
                    if (a < cathetusLength) System.out.print(" ");
                    if (a == cathetusLength) System.out.println();
                }

}
    }

    public static void main(String[] args) {
        new Pyramid().printHalfPyramid(7);
    }
}
