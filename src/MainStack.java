public class MainStack {
    public static void main(String[] args) {
        Stack s = new Stack();

        Stack st = new Stack();
        st.add("1");
        st.add("2");
        st.add("3");
        st.add("4");
        st.add("5");

        while (!st.isEmpty()) {
            System.out.println(st.take());
        }
        System.out.println( );
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("Value");
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        String taken = s.take();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        System.out.println(taken);
    }
}
