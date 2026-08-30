class Main {
    public static void main(String args[]) {
        System.out.println("Line A1 - main branch version");
        System.out.println("Line A2 - test-branch version");

        int x = 10;
        int y = 20;
        int z = 30;

        System.out.println("Line B1 - test-branch version");
        System.out.println("Line B2 - test-branch version");

        int sum = x + y + z;
        int product = x * y;

        System.out.println("Line C1 - main branch version");
        System.out.println("Line C2 - test-branch version");
    }
}