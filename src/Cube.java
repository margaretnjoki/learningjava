public class Cube {
    private int edgeLength;

    public Cube (int edgeLength){
            this.edgeLength=edgeLength;
    }

    public int volume(){
        return this.edgeLength * this.edgeLength * this.edgeLength;
    }

    public String toString() {
        return "The length of the edge is " + this.edgeLength + " and the volume " + this.volume();

    }
}
class CubeMain{
    public static void main(String[] args) {
        Cube cube= new Cube(2);

        System.out.println(cube.volume());
        System.out.println(cube);
    }
}
