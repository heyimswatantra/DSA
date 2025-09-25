class secondLargest {
    public static int getSecondLargest(int[] arr) {
        // code here
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        int n = arr.length;
        for (int i=1; i<n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        System.out.println(getSecondLargest(new int[]{10,5,10}));
    }
}