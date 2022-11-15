/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Manusia {
    public String nama, hobby, pekerjaan;
    public Manusia (String nm, String hobby, String kerja){
        this.nama = nm;
        this.hobby = hobby;
        this.pekerjaan = kerja;
    }
    public String tampilManusia (){
        return ("Nama\t\t: "+ nama + "\n"+"Hobby\t\t:" + hobby + "\n"+"Pekerjaan\t: " +pekerjaan+"\n");
 
    }

}
class programmer extends Manusia {
    public programmer (String nm, String hobby, String kerja){
        super(nm, hobby, kerja);
    }
}
class polisi extends Manusia{
    public polisi(String nm, String hobby, String kerja){
        super(nm,hobby,kerja);
    }
}
class kegiatan {
    public static void main(String args[]) {
        Manusia[] informasi = new Manusia [2];
        informasi[0]= new programmer("Programmer", " Futsal ", "Mengetik Sintak");
        informasi[1]= new polisi("Polisi", " Fusal ", "Operasi keliling");
        for (int i=0; i<2; i++){
            System.out.println("--------------");
            System.out.println(informasi[i].tampilManusia());
        }
        
        
    }
}