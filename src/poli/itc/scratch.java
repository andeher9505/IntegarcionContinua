public class Scratch {
    public static void main(String[] args) {

        int v1, v2;
        int res=0;

        Scanner reader = new Scanner(System.in);

        System.out.println("Numero 1");
        v1 = reader.nextInt();

        System.out.println("Numero 2:");
        v2 = reader.nextInt();

        res=v1+v2;

        System.out.println("La suma es " + v1 + " + " + v2 + " = " + res);

    }
}