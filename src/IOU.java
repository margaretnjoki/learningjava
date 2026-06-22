import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> iou;

    public IOU() {
        this.iou = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.iou.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        if (this.iou.containsKey(toWhom)) {
            return this.iou.get(toWhom);
        }
        return 0;
    }
}

 class MainIou{

public static void main(String[] args) {
    IOU mattsIOU = new IOU();
    mattsIOU.setSum("Arthur", 51.5);
    mattsIOU.setSum("Michael", 30);

    System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
    System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));

}
}