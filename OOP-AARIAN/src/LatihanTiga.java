/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class LatihanTiga {
    private String KodeBarang, NamaBarang;
    private int HPP,Stok,JumlahJual,StokSekarang;
    private long hargaJual,TotalBayar, Laba;
    public void inputKodeBarang (String KodeBarang){
        this.KodeBarang     = KodeBarang;
    }
    public void inputNamaBarang (String NamaBarang){
        this.NamaBarang     = NamaBarang;
    }
    public void inputHPP (int HPP){
        this.HPP            = HPP;
    }
    public void inputHargaJual (long hargaJual){
        this.hargaJual      = hargaJual;
    }
    public void inputStok (int Stok){
        this.Stok           = Stok;
    }
    public void inputJumlahJual (int JumlahJual){
        this.JumlahJual     = JumlahJual;
    }
    public void inputStokSekarang (int StokSekarang){
        this.StokSekarang   = StokSekarang;
    }
    public void inputTotalBayar (long TotalBayar){
        this.TotalBayar     = TotalBayar;
    }
    public void inputLaba (long Laba){
        this.Laba           = Laba;
    }
    public String tampilKodeBarang(){
        return KodeBarang;
        
    }
    public String tampilNamaBarang(){
        return NamaBarang;
    }
    
    public int tampilHPP(){
        return HPP;
    }
    public long tampilHargaJual(){
        return hargaJual;
    }
    public int tampilStok(){
        return Stok;
    }
    public int tampilJumlahJual(){
        return JumlahJual;
    }
    public int tampilStokSekarang(){
        return StokSekarang;
    }
    public long tampilTotalBayar(){
        return TotalBayar;
    }
    public Long tampilLaba(){
        return Laba;
    }
    public static void main(String[] args){
        LatihanTiga Barang = new LatihanTiga();
        System.out.println("INPUT:");
        Barang.inputKodeBarang("BOO1");
        Barang.inputNamaBarang("BUKU GAMBAR");
        Barang.inputHPP(2500);
        Barang.inputHargaJual(3000);
        Barang.inputStok(5);
        Barang.inputJumlahJual(2);
        System.out.println("Kode Barang   :" + Barang.tampilKodeBarang());
        System.out.println("Nama Barang   :" + Barang.tampilNamaBarang());
        System.out.println("HPP           :" + Barang.tampilHPP());
        System.out.println("Harga Jual    :" + Barang.tampilHargaJual());
        System.out.println("Stok          :" + Barang.tampilStok());
        System.out.println("JumlahJual    :" + Barang.tampilJumlahJual());
        System.out.println("OUTPUT:");
        Barang.inputStokSekarang(3);
        Barang.inputTotalBayar(6000);
        Barang.inputLaba(1000);
        System.out.println("Stok Sekarang :" + Barang.tampilStokSekarang());
        System.out.println("Total Bayar   :" + Barang.tampilTotalBayar());
        System.out.println("Laba          :" + Barang.tampilLaba());
       
}
}
