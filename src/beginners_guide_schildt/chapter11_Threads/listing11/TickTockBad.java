package beginners_guide_schildt.chapter11_Threads.listing11;
// No calls to wait() or notify().
class TickTockBad {

    String state; // contains the state of the clock

    synchronized void tick(boolean running) {
        if(!running) { // stop the clock
            state = "ticked";
            return;
        }

        System.out.print("Tick ");

        state = "ticked"; // set the current state to ticked
    }

    synchronized void tock(boolean running) {
        if(!running) { // stop the clock
            state = "tocked";
            return;
        }

        System.out.println("Tock");

        state = "tocked"; // set the current state to tocked
    }
}
