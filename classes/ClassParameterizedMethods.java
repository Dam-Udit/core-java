class Box {
    double width;
    double height;
    double depth;

    double findVolume() {
        return width * depth * height;
    }

    void setDim(double w, double d, double h) {
        width =  w;
        height = h;
        depth = d;
    }
}

class BoxDemo3 {
    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;

        myBox.setDim(10, 20, 15);
        vol = myBox.findVolume();
        System.out.println("Volume: " + vol);
    }
}