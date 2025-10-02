public class Dolphin implements Animal{
    @Override
    public String getAnimalArt() {
        return "             ,\r\n" + 
                "           __)\\_  \r\n" + 
                "     (\\_.-'    a`-.\r\n" + 
                "jgs  (/~~````(/~^^`";
    }

    // https://www.asciiart.eu/animals/dolphins
    @Override
    public String toString(){
        return "dolphin";
    }
}
