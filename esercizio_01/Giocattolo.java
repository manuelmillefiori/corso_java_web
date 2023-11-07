package esercizio_01;

class Giocattolo
{
   private int id;
   private String nome;
   private float prezzo;
   private short etaConsigliata;

   /**
    * @brief
    * Costruttore per inizializzare un giocattolo
    * 
    * @param id
    * Id del giocattolo
    * 
    * @param nome
    * Nome del giocattolo
    * 
    * @param prezzo
    * Prezzo del giocattolo
    * 
    * @param etaConsigliata
    * Età consigliata per l'utilizzo del giocattolo
    */
   public Giocattolo(int id, String nome, float prezzo, short etaConsigliata)
   {
      // Inizializzo i vari campi
      this.id = id;
      this.nome = nome;
      this.prezzo = prezzo;
      this.etaConsigliata = etaConsigliata;
   }

   // Override del toString
   @Override
   public String toString()
   {
      return "ID: " + this.id + "\nNome: " + this.nome + "\nPrezzo: " + this.prezzo + "\nEtà consigliata: " + this.etaConsigliata;
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

   public float getPrezzo()
   {
      return this.prezzo;
   }

   public void setPrezzo(float prezzo)
   {
      this.prezzo = prezzo;
   }

   public short getEtaConsigliata()
   {
      return this.etaConsigliata;
   }

   public void setEtaConsigliata(short etaConsigliata)
   {
      this.etaConsigliata = etaConsigliata;
   }
}
