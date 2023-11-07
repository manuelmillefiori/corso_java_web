package esercizio_01;

class Amministratore extends Utente
{
   /**
    * @brief
    * Costruttore che invoca il costruttore
    * dell'utente
    */
   public Amministratore(int id, String nome, String email)
   {
      // Invoco il costruttore della superclasse
      // per inizializzare i vari campi
      super(id, nome, email);
   }
}
