package chapter10_Потоки.listing18;

// Demonstrate the file-based Help system.
class FileHelp {
    public static void main(String args[]) {
        Help hlpobj = new Help("c:/Users/k.kovalenko/Downloads/II/HelloWorld" +
                "/src/beginners_guide_schildt/chapter10/listing17/Help.txt");
        String topic;

        System.out.println("Try the help system.\nEnter'.' to quit. ");
        do {
            topic = hlpobj.getSelection();

            if(!hlpobj.helpOn(topic) & topic == ".")
                System.out.println("Topic not found.\n");

        } while(topic.compareTo(".") != 0);
    }
}
