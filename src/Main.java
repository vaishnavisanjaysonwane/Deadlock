//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class myThread extends Thread{
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println("child Thread" + " "+ Thread.currentThread().getPriority());
            Thread.yield();
        }
    }
}
public class Main{
    public static void main(String[] args) throws InterruptedException {
        myThread m = new myThread();
        m.start();
        for(int i=1;i<=3;i++){
            System.out.println("main Thread"+ " "+ Thread.currentThread().getPriority());
            Thread.currentThread().join();
        }
        //System.out.println("MAin thread : "+Thread.currentThread().getPriority());
    }
}