package ex2og3;

public class ArrayMethods {
    public void printArray(int[] tabel) {
        System.out.print("{");
        for (int i = 0; i < tabel.length; i++) {
            if (i == 0) {
                System.out.print(tabel[i]);
            }
            else {
                System.out.print(", " + tabel[i]);
            }
        }
        System.out.println("}  ");
    }

    /**
     *
     * @return et array med indhold [0,0,0,0,0,0,0,0,0,0]
     */
    public int[] fyldArrayA() {
        int[] result = new int[10];

//        for (int i = 0; i < result.length; i++) {
//            result[i] = 0;
//        }

        return result;
    }

    /**
     *
     * @return et array med indhold [2,44,-23,99,8,-5,7,10,20,30]
     */
    public int[] fyldArrayB() {
        int[] result = new int[10];

        result[0] = 2;
        result[1] = 44;
        result[2] = -23;
        result[3] = 99;
        result[4] = 8;
        result[5] = -5;
        result[6] = 7;
        result[7] = 10;
        result[8] = 20;
        result[9] = 30;
        return result;
    }

    /**
     *
     * @return et array med indhold [0,1,2,3,4,5,6,7,8,9]
     */
    public int[] fyldArrayC() {
        int[] result = new int[10];
        for (int i = 0; i < result.length; i++) {
            result[i] = i;
        }
        return result;
    }

    /**
     *
     * @return et array med indhold [2,4,6,8,10,12,14,16,18,20]
     */
    public int[] fyldArrayD() {
        int[] result = new int[10];
        for (int i = 0; i < result.length; i++) {
            result[i] = (i + 1) * 2;
        }
        return result;
    }

    /**
     *
     * @return et array med indhold [1,4,9,16,25,36,49,64,81,100]
     */
    public int[] fyldArrayE() {
        int[] result = new int[10];
        for (int i = 0; i < result.length; i++) {
            result[i] = (i * 2) +1;
            if (i > 0) {
                result[i] = ((i * 2) + 1) + result[i - 1];
            }
        }
        return result;
    }

    /**
     *
     * @return et array med indhold [0,1,0,1,0,1,0,1,0,1]
     */
    public int[] fyldArrayF() {
        int[] result = new int[10];
        for (int i = 0; i < result.length; i++) {
            if (i % 2 == 0) {
                result[i] = 0;
            } else {
                result [i] = 1;
            }
        }
        return result;
    }

    /**
     *
     * @return et array med indhold [0,1,2,3,4,0,1,2,3,4]
     */
    public int[] fyldArrayG() {
        int[] result = new int[10];
        for (int i = 0; i < result.length; i++) {
            if (i >= 5) {
                result[i] = i % 5;
            } else {
                result[i] = i;
            }
        }
        return result;
    }

    public int findMax(int[] tabel) {
        int max = -1;
        for (int i = 0; i < tabel.length; i++) {
            if (tabel[i] > max) {
                max = tabel[i];
            }
        }
        return max;
    }

    public int sumInt(int[] t) {
        int total = 0;
        for (int i = 0; i < t.length; i++) {
            total = total + t[i];
        }
        return total;
    }

    public double sumDouble(double[] t) {
        double total = 0;
        for (int i = 0; i < t.length; i++) {
            total += t[i];
        }
        return total;
    }

    public int[] makeSum(int[] a, int[] b){
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
        }
        return c;
    }

    public boolean hasUneven(int[] t) {
        boolean uneven = false;
        for (int i = 0; i < t.length; i++) {
            if (t[i] % 2 != 0) {
                uneven = true;
            }
        }
        return uneven;
    }
}
