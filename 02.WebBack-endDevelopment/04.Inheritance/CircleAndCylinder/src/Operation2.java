
public class Operation2 {
    int data = 50;

    void change(Operation2 op) {
        op.data = op.data + 100;
    }

    public static void main(String args[]) {
        Operation2 op1 = new Operation2();

        System.out.println("Trước khi thay đổi: " + op1.data);
        op1.change(op1); // truyền đối tượng
        System.out.println("Sau khi thay đổi: " + op1.data);
    }
}

