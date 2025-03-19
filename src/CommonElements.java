class CommonElements {
    private double pedestrianGateWidth;
    private double vehicleGateWidth;

    public CommonElements(double pedestrianGateWidth, double vehicleGateWidth) {
        this.pedestrianGateWidth = pedestrianGateWidth;
        this.vehicleGateWidth = vehicleGateWidth;
    }

    public void displayInfo() {
        System.out.println("공통 요소 (Common Elements):");
        System.out.println("- 보행자 출입문 너비: " + pedestrianGateWidth + "m");
        System.out.println("- 차량 출입문 너비: " + vehicleGateWidth + "m");
    }
}