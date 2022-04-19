package beginners_guide_schildt.chapter13_Generics.listing21;
class GenArrays {
    public static void main(String args[]) {
        Integer n[] = { 1, 2, 3, 4, 5 };

        Gen<Integer> iOb = new Gen<>(50, n);

        // Can't create an array of type-specific generic references.
         //Gen<Integer> gens[] = new Gen<Integer>[10]; // Wrong!

        // This is OK.
        Gen<?> gens[] = new Gen<?>[10]; // OK
        System.out.println(gens);
        for (int i = 0; i < 5; i++){
            System.out.println(n[i]);
        }
    }
}
