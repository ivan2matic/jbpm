package kreditniodjel.isplatastambenogkredita;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Osoba implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Osoba ID")
   private java.lang.Long osoba_ID;
   @org.kie.api.definition.type.Label(value = "OIB")
   private java.lang.String OIB;
   @org.kie.api.definition.type.Label(value = "Ime")
   private java.lang.String ime;
   @org.kie.api.definition.type.Label(value = "Prezime")
   private java.lang.String prezime;
   @org.kie.api.definition.type.Label(value = "Adresa")
   private java.lang.String adresa;

   public Osoba()
   {
   }

   public java.lang.Long getOsoba_ID()
   {
      return this.osoba_ID;
   }

   public void setOsoba_ID(java.lang.Long osoba_ID)
   {
      this.osoba_ID = osoba_ID;
   }

   public java.lang.String getOIB()
   {
      return this.OIB;
   }

   public void setOIB(java.lang.String OIB)
   {
      this.OIB = OIB;
   }

   public java.lang.String getIme()
   {
      return this.ime;
   }

   public void setIme(java.lang.String ime)
   {
      this.ime = ime;
   }

   public java.lang.String getPrezime()
   {
      return this.prezime;
   }

   public void setPrezime(java.lang.String prezime)
   {
      this.prezime = prezime;
   }

   public java.lang.String getAdresa()
   {
      return this.adresa;
   }

   public void setAdresa(java.lang.String adresa)
   {
      this.adresa = adresa;
   }

   public Osoba(java.lang.Long osoba_ID, java.lang.String OIB,
         java.lang.String ime, java.lang.String prezime,
         java.lang.String adresa)
   {
      this.osoba_ID = osoba_ID;
      this.OIB = OIB;
      this.ime = ime;
      this.prezime = prezime;
      this.adresa = adresa;
   }

}