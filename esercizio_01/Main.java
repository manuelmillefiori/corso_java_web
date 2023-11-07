package esercizio_01;

class Main
{
   public static void main(String[] args)
   {
      Giocattolo g = new Giocattolo(1, "Barbie", 39.99f, (short) 3);

      Cliente c = new Cliente(1, "Manuel", "manuel.millefiori05@gmail.com");

      Vendita v = new Vendita(1, 1, 1);
   }
}
