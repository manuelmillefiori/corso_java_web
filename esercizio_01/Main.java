package esercizio_01;

class Main
{
   public static void main(String[] args)
   {
      Giocattolo g1 = new Giocattolo(1, "Barbie", 39.99f, (short) 3);
      Giocattolo g2 = new Giocattolo(2, "Superman", 19.99f, (short) 5);

      Utente c1 = new Cliente(1, "Manuel", "manuel.millefiori05@gmail.com");
      Utente c2 = new Amministratore(1, "Geppo", "geppetto@gmail.com");

      Vendita v = new Vendita(1, 1, 1);

      System.out.println(c1);
      System.out.println(c2);

      Inventario i = new Inventario();

      i.addGiocattolo(g1);
      i.addGiocattolo(g2);

      System.out.println(i);
   }
}
