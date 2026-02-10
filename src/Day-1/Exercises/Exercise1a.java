class Exercise1a {
    public static void main(String[] args) {
        int x = 1;
        while (x < 10) {
            if (x > 3) {
                System.out.println("big x");
            }
            x = x + 1; // <-- Add this line
        }
    }
}

// Will it compile? Yes, it compiles fine.

// The problem:It's
// an infinite loop!
// x is
// never incremented, so x<10
// is always true(x stays at 1 forever).

// Fix:
// Add x = x + 1;(or x++)
// inside the loop
