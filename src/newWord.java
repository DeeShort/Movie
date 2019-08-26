public class newWord {
    public static String replace(char bukvi[]){
        String guess="";
        for(int i=0;i<(bukvi.length);i++){
            if (bukvi[i]==' '){
                bukvi[i]=bukvi[i];
            } else {
                bukvi[i]='_';
            }
            guess+=bukvi[i];
        }
        return guess;
    }
}
