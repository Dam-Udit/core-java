class Box {
    double width, height, depth;
    
    Box() {
        System.out.println("Constructor Invoked.");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;

        vol = myBox.volume();
        System.out.println("Volume: " + vol);
    }
}
