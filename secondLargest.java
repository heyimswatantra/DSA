class secondLargest {
    public static int getSecondLargest(int[] arr) {
        // code here
        int largest = Integer.MIN_VALUE;
        int secondLargest = largest;

        int n = arr.length;
        for (int i : arr) {
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            } else if (i > secondLargest) {
                secondLargest = i;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        System.out.println(getSecondLargest(new int[]{1,2,3,6,4,7,19}));
    }
}