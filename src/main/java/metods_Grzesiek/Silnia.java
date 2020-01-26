package metods_Grzesiek;

public class Silnia {

    public static void main(String[] args) {

        System.out.println("Silnia 6 = " + silnia(10));
        System.out.println("Silnia 6 = " + silnia(6));

    }

    public static long silnia(long arg){
        long silnia = 1;
        while (arg > 1)
        {
            silnia = silnia * arg;
            arg--;
        }
        return silnia;
    }

    public static int silniaRecursive(int arg){
        return arg > 1
        ? silniaRecursive(arg - 1) * arg
                : 1;
    }

    public static void nowa(){
        System.out.println("Nowa metoda");
        System.out.println("Zmiany na nowym branchu");
    }

}
