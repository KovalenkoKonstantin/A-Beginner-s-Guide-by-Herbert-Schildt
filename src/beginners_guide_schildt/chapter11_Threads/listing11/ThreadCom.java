package beginners_guide_schildt.chapter11_Threads.listing11;

class ThreadCom {
    public static void main(String args[]) {
        TickTockBad tt = new TickTockBad();
        MyThread mt1 = new MyThread("Tick", tt); //поток запускается при eгo создании
        MyThread mt2 = new MyThread("Tock", tt); //поток запускается при eгo создании
    }
}
