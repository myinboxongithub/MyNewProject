public class T {
    public static void main(String[] args) {
        Runnable tr=()->System.out.println("Thread with Lambda");
        Thread th1=new Thread(tr);
        System.out.println("======== > "+th1.getPriority());
        th1.start();
    }
}
