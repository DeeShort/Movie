import java.util.Scanner;
public class movie {
    public static void main(String[] args)throws Exception{

        //newfilm class + getNovFilm Method
        newFilm gn = new newFilm();
        String kino = gn.getNovFilm();
        //System.out.println(kino);

        char[] original = kino.toCharArray();
        char[] bukvi = kino.toCharArray();;

        /* System.out.println(newFA[1]);
        Typetester t = new Typetester();
        t.printType( newFA[1] );*/

        String guess="";
        for(int i=0;i<(bukvi.length);i++){
            if (bukvi[i]==' '){
                bukvi[i]=bukvi[i];
            } else {
                bukvi[i]='_';
            }
            guess+=bukvi[i];
        } System.out.println(guess);

        System.out.println("Hello, can You guess the Movie?\nEnter a letter:");
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);

        int y=0;
        String guess2 = "";
        while(y<11) {
            for (int x = 0; x < (original.length); x++) {

                if (original[x] == input) {
                    bukvi[x] = input;
                    } else {
                    bukvi[x] = bukvi[x];
                    //System.out.println("Nope, its wrong, you have "+(10-n)+" attempts left");
                }
                guess2 += bukvi[x];
            }
            System.out.println(guess2);
            guess2 = "";
            y++;
            System.out.println("Ok, You have another "+(10-y)+" attempts:");
            sc = new Scanner(System.in);
            input = sc.next().charAt(0);
        }
    }
}


