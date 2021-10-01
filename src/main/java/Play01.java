public class Play01 {
    public static void main(String[] args) {
        Adder adder = new Adder();
        adder.add(3)
                .add(5)
                .inc()
                .add(10);
        System.out.println(adder.value());
    }
}