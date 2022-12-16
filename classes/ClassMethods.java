class Box {
    double width;
    double height;
    double depth;

    void findVolume() {
        System.out.println("Volume: " + width * depth * height);
    }
}

class BoxDemo2 {
    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;
        myBox.findVolume();
    }
}