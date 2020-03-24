public class Wypozyczalnia {
    public static void main (String args[]) {
        Books b = new Books();
        b.numer = 5;
        b.dataWydania = "5 marca 2020";
        b.autor = "Henryk Sienkiewicz";
        b.wydawnictwo = "Greg";
        b.cena = "10 zł";
        b.danePrzedmiotu();

        Ebooks eb = new Ebooks();
        eb.numer = 456;
        eb.dataWydania = "6 luty 2020";
        eb.autor = "Adam Mickiewicz";
        eb.wydawnictwo = "Greg";
        eb.cena = "15 zł";
        eb.danePrzedmiotu();

        Audiobooks ab = new Audiobooks();
        ab.numer = 15;
        ab.dataWydania = "5 marca 2020";
        ab.autor = "Stephen King";
        ab.wydawnictwo = "Wydawnictwo Proszynski i S-Ka";
        ab.cena = "20 zł";
        ab.danePrzedmiotu();

        Movies m = new Movies();
        m.numer = 66;
        m.dataWydania = "6 grudzień 2019";
        m.autor = "Mike Flanagan";
        m.wydawnictwo = "Warner Bros.";
        m.cena = "35 zł";
        m.danePrzedmiotu();

        Music mc= new Music();
        mc.numer = 53234;
        mc.dataWydania = "10 styczeń 2020";
        mc.autor = "Rise Against";
        mc.wydawnictwo = "Geffen Records";
        mc.cena = "6.50 zł";
        mc.danePrzedmiotu();

       // System.out.println("numer książki to: " + b.getNumer() + " \n " + "data wydania: " + b.getDataWydania())
    }


}
