public class ifelse {
    public static void main(String[] args) {
        int x = 0;
        int a = 1;
        switch (a) {
            case 1:
                x += 5;
                break;
            case 2:
                x += 10;
                break;
            case 3:
                x += 16;
                break;
            case 4:
                x += 34;
                break;
            default:
                System.out.println("Invalid case");
                break;
        }

    }
}