/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Buku {
    private String  KodeBarang;
    private String  NamaBarang, OUTPUT;
    private int     HPP; 
    private long    HargaJual; 
    private long    Stok;
    private long    JumlahJual;
    
public Buku (String KodeBarang,String NamaBarang, int HPP, long HargaJual, long Stok, long JumlahJual, String OUTPUT){
    this.KodeBarang = KodeBarang;
    this.NamaBarang = NamaBarang;
    this.HPP        = HPP;
    this.HargaJual  = HargaJual;
    this.Stok       = Stok;
    this.JumlahJual = JumlahJual;
    this.OUTPUT     = OUTPUT;
}
public String tampilBuku(){
   return ("Kode Barang\t:" + KodeBarang + "\nNama Barang\t:" + NamaBarang + "\nHPP\t\t:" + HPP + "\nHarga Jual\t:" + HargaJual + "\nStok\t\t:" + Stok + "\nJumlah Jual\t:" + JumlahJual + "\nOUTPUT:" + OUTPUT); 
}
    
}
class gambar extends Buku {
    private long StokSekarang, TotalBayar;
    private long Laba;

    public gambar(String KodeBarang, String NamaBarang, int HPP, long HargaJual, long Stok, long JumlahJual, String OUTPUT, long StokSekarang, long TotalBayar, long Laba) {
        super(KodeBarang, NamaBarang, HPP, HargaJual, Stok, JumlahJual, OUTPUT);
        this.StokSekarang   = StokSekarang;
        this.TotalBayar     = TotalBayar;
        this.Laba           = Laba;
    }   
    public String tampilgambar(){
        return (super.tampilBuku()+"\nStok Sekarang\t:" + StokSekarang + "\nTotal Bayar\t:" + TotalBayar + "\nLaba\t\t:" + Laba );
    }
    
}
class pensil{
    public static void main(String[] args){
        System.out.println("INPUT:");
        gambar f = new gambar ("B001","BUKU GAMBAR",2500,3000,5,2," ",3,6000,1000);
        System.out.println(f.tampilgambar());
        
       
      
        
    }
    
}
