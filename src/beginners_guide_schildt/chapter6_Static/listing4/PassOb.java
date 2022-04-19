package beginners_guide_schildt.chapter6_Static.listing4;

class PassOb {
    public static void main(String args[]) {
        Block ob1 = new Block(10, 2, 5);
        Block ob2 = new Block(10, 2, 5);
        Block ob3 = new Block(4, 5, 5);

        System.out.println("ob1 имеет те же размеры, что и ob2: " +
                ob1.sameBlock(ob2)); //передача объекта
        System.out.println("ob1 имеет те же размеры, что и ob3: " +
                ob1.sameBlock(ob3)); //передача объекта
        System.out.println("ob1 имеет тот же объем, что и иo b3: " +
                ob1.sameVolume(ob3)); //передача объекта
    }
}
