import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class newFilm {
    static String getNovFilm()throws Exception {

                List<String> lines= Files.readAllLines(Paths.get("films.txt"), Charset.defaultCharset());

                //Random from list/ size
                int index=(int)(Math.random()*lines.size());

                //Prisvoenie newFilm - random index from list
                String newF=lines.get(index);


        return newF;
    }

}
