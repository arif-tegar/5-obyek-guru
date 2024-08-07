//Driver Class
public class TesGuru {

    public static void main(String[] args) {
      //membuat obyek
      Guru aulia = new Guru();
      Guru pasha = new Guru();
      Guru feni = new Guru();
      Guru munif = new Guru();
      Guru bidin = new Guru();
        
    aulia.id =1;
    aulia.nama ="Bu aul";
    aulia.mapel ="Rpl";
    aulia.alamat ="Malang";
    
    pasha.id =2;
    pasha.nama ="Bu Pasha";
    pasha.mapel ="Rpl";
    pasha.alamat ="Malang";
    
    feni.id =3;
    feni.nama ="Bu feni";
    feni.mapel ="Mtk";
    feni.alamat ="Malang";
    
    munif.id =4;
    munif.nama ="Pak munif";
    munif.mapel ="Agama";
    munif.alamat ="Malang";

    bidin.id =5;
    bidin.nama ="Pak bidin";
    bidin.mapel ="Mtk";
    bidin.alamat ="Malang";
    
    System.out.println("Ini Data Bu Aulia");
    System.out.println(aulia.id);
    System.out.println(aulia.nama);
    System.out.println(aulia.alamat);
    
    System.out.println("Ini Data Bu Pasha");
    System.out.println(pasha.id);
    System.out.println(pasha.nama);
    System.out.println(pasha.alamat);

    System.out.println("Ini Data Bu feni");
    System.out.println(feni.id);
    System.out.println(feni.nama);
    System.out.println(feni.alamat);

    System.out.println("Ini Data Pak Munif");
    System.out.println(munif.id);
    System.out.println(munif.nama);
    System.out.println(munif.alamat);

    System.out.println("Ini Data Pak bidin");
    System.out.println(bidin.id);
    System.out.println(bidin.nama);
    System.out.println(bidin.alamat);

    }
}
