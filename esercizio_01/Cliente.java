package esercizio_01;

class Cliente extends Utente
{
   /**
    * @brief
    * Costruttore che invoca il costruttore
    * dell'utente
    */
   public Cliente(int id, String nome, String email)
   {
      // Invoco il costruttore della superclasse
      // per inizializzare i vari campi
      super(id, nome, email);
   }
}
