public class Main {
    public static void main(String[] args) {
        Fence fence = new Fence("조약돌", 1.5, 0.5);
        CommonElements common = new CommonElements(3.5, 6.5);
        Yard yard = new Yard("인조 잔디", 30, 20, 4, 1.5, 5, 3);

        fence.displayInfo();
        System.out.println();
        common.displayInfo();
        System.out.println();
        yard.displayInfo();
    }
}