package esercizio_01;

public class Cliente
{
   private int id;
   private String nome;
   private String email;

   /**
    * @brief
    * Costruttore per registrare un cliente
    * 
    * @param id
    * Id del cliente
    * 
    * @param nome
    * Nome del cliente
    * 
    * @param email
    * Indirizzo email del cliente
    */
   public Cliente(int id, String nome, String email)
   {
      // Inizializzo i vari campi
      this.id = id;
      this.nome = nome;
      this.email = email;
   }

   public int getId()
   {
      return this.id;
   }

   public void setId(int id)
   {
      this.id = id;
   }

   public String getNome()
   {
      return this.nome;
   }

   public void setNome(String nome) 
   {
      this.nome = nome;
   }

   public String getEmail() 
   {
      return this.email;
   }

   public void setEmail(String email) 
   {
      this.email = email;
   }

}
