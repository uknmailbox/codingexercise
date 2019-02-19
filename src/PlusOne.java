public class PlusOne {
    public static void main(String[] args) {
        int[] result = new PlusOne().plusOne(new int[]{1,2,9});

        for(int i : result) {
            System.out.println(i);
        }

    }

    private int[] plusOne(int[] digits) {
        int[] newArr = new int[digits.length + 1];

        int index=1;

        for(int num : digits) {
            newArr[index++] = num;
        }

        if (newArr[newArr.length - 1] + 1 >= 10) {
            recursive(newArr, newArr.length - 1);

            if(newArr[0] == 0) {
                int[] result = new int[newArr.length-1];

                int idx=0;

                for(int i=1; i<newArr.length; i++) {
                    result[idx++] = newArr[i];
                }

                newArr = result;
            }
        } else {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            newArr = digits;
        }

        return newArr;
    }

    private int[] recursive(int[] newArr, int index) {
        for (int i = index; i >= 0; i--) {
            if (newArr[i] + 1 >= 10) {
                newArr[i] = 0;
                recursive(newArr, i-1);
                break;
            } else {
                newArr[i] = newArr[i] + 1;
                break;
            }
        }

        return newArr;
    }

}
