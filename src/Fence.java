class Fence {
    private String material;
    private double height;
    private double thickness;

    public Fence(String material, double height, double thickness) {
        this.material = material;
        this.height = height;
        this.thickness = thickness;
    }

    public void displayInfo() {
        System.out.println("울타리 (Fence) 정보:");
        System.out.println("- 재질: " + material);
        System.out.println("- 높이: " + height + "m");
        System.out.println("- 두께: " + thickness + "m");
    }
}