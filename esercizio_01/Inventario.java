package esercizio_01;

import java.util.List;
import java.util.ArrayList;

class Inventario
{
   // Lista contenente tutti i giocattoli
   List<Giocattolo> giocattoli = new ArrayList<>();

   // Override del toString
   @Override
   public String toString()
   {
      // String da formulare e restituire
      String strToReturn = "";

      // Ciclo per formulare la stringa
      for (Giocattolo giocattolo : giocattoli)
      {
         // Formulo la stringa
         strToReturn += giocattolo + "\n";
      }

      // Restituisco la stringa
      return strToReturn;
   }

   /**
    * @brief
    * Metodo per aggiungere un determinato giocattolo
    * all'inventario
    * 
    * @param giocattolo
    * Giocattolo da aggiungere all'inventario
    * 
    * @return
    * true = Giocattolo aggiunto correttamente
    * false = Inserimento giocattolo fallito
    */
   public boolean addGiocattolo(Giocattolo giocattolo)
   {
      return giocattoli.add(giocattolo);
   }

   /**
    * @brief
    * Metodo per ottenere il numero di giocattoli
    * registrati nell'inventario
    * 
    * @return
    * Numero di giocattoli contenuti nell'inventario
    */
   public int numeroGiocattoli()
   {
      return giocattoli.size();
   }
}
