class Yard {
    private String material;
    private double houseArea;
    private double yardArea;
    private int fishCount;
    private double pondDepth;
    private double pondDistanceFromWindow;
    private double pineTreeDistanceFromGate;

    public Yard(String material, double houseArea, double yardArea, int fishCount, double pondDepth, double pondDistanceFromWindow, double pineTreeDistanceFromGate) {
        this.material = material;
        this.houseArea = houseArea;
        this.yardArea = yardArea;
        this.fishCount = fishCount;
        this.pondDepth = pondDepth;
        this.pondDistanceFromWindow = pondDistanceFromWindow;
        this.pineTreeDistanceFromGate = pineTreeDistanceFromGate;
    }

    public void displayInfo() {
        System.out.println("마당 (Yard) 정보:");
        System.out.println("- 전체 소재: " + material);
        System.out.println("- 총 면적: 집(" + houseArea + "평) + 마당(" + yardArea + "평)");
        System.out.println("- 연못: 금붕어 " + fishCount + "마리, 깊이 " + pondDepth + "m, 창문으로부터 " + pondDistanceFromWindow + "m 떨어진 위치");
        System.out.println("- 소나무 위치: 출입문 오른쪽 옆, " + pineTreeDistanceFromGate + "m 뒤");
    }
}