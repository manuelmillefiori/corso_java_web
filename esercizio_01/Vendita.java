package esercizio_01;

public class Vendita
{
   private int id;
   private int idGiocattolo;
   private int idCliente;

   /**
    * @brief
    * Costruttore per registrare una vendita
    * 
    * @param id
    * Id della vendita
    * 
    * @param idGiocattolo
    * Id del giocattolo venduto
    * 
    * @param idCliente
    * Id del cliente che ha comprato il giocattolo
    */
   public Vendita(int id, int idGiocattolo, int idCliente)
   {
      // Inizializzo i vari campi
      this.id = id;
      this.idGiocattolo = idGiocattolo;
      this.idCliente = idCliente;
   }

   public int getId()
   {
      return this.id;
   }

   public void setId(int id)
   {
      this.id = id;
   }

   public int getIdGiocattolo()
   {
      return this.idGiocattolo;
   }

   public void setIdGiocattolo(int idGiocattolo)
   {
      this.idGiocattolo = idGiocattolo;
   }

   public int getIdCliente()
   {
      return this.idCliente;
   }

   public void setIdCliente(int idCliente)
   {
      this.idCliente = idCliente;
   }
}
