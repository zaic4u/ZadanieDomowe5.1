public class ProstaTablica {

    public static void main(String[] args) {
        String[] names = new String[3];
        int ref;
        names[0] = "Jan";
        names[1] = "Kasia";
        names[2] = "Tomek";

        for (ref = 0; ref < names.length; ref++) {
            System.out.print(names[ref] + " ");
        }
    }
}
