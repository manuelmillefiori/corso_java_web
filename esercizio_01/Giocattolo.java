package esercizio_01;

public class Giocattolo
{
   private int id;
   private String nome;
   private String cognome;
   private short etaConsigliata;

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

   public String getCognome()
   {
      return this.cognome;
   }

   public void setCognome(String cognome)
   {
      this.cognome = cognome;
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
