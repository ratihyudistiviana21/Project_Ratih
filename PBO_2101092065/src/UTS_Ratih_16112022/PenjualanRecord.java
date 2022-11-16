/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_Ratih_16112022;

/**
 *
 * @author user
 */
public class PenjualanRecord {
    private String nomorfaktur;
    private String namapelanggan;
    private String kodebarang;
    private double hargabarang;
    private double jumlahbarang;
    private double total;
    private double diskon;
    private double bayar;
    public static int penjualanCount;
    
    public PenjualanRecord(){
  
    }
      
    public PenjualanRecord(String faktur, String pelanggan, String kode, double harga){
        //penjualanCount++;
        this.nomorfaktur = faktur;
        this.namapelanggan = pelanggan;
        this.kodebarang = kode;
        this.hargabarang = harga;
    }
    
    public String getnomorFaktur() {
        return nomorfaktur;
    }
    
    public void setnomorFaktur (String faktur){
        this.nomorfaktur = faktur;
    }
    
    public String getnamaPelanggan() {
        return namapelanggan;
    }
    
    public void setnamaPelanggan (String pelanggan){
        this.namapelanggan = pelanggan;
    }
    
    public String getKodebarang() {
        return kodebarang;
    }
    
    public void setKodebarang (String kode){
        this.kodebarang = kode;
    }
    
    public double getHargabarang() {
        return hargabarang;
    }
    
    public void setHargabarang (double harga){
        this.hargabarang = harga;
    }
    
    public double getJumlahbarang() {
        return jumlahbarang;
    }
    
    public void setJumlahbarang (double jumlah){
        this.jumlahbarang = jumlah;
    }
    ///=================================================
    
    public double getTotal(){
        
        total = hargabarang * jumlahbarang;
        return total;
    }
    
     public double getDiskon(){
         
         if(total>500000){
             diskon = hargabarang * 0.02;
         }
         else if(total>1000000){
             diskon = hargabarang * 0.05;
         }
         
        return diskon;
    }
     
     public double getBayar(){
         bayar = total - diskon;
        return bayar;
    }
    
    
    
    

}
