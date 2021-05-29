/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trax
 */
public class DoraMiniInt implements RobotInt, Doraemon{
    private String nama;
    private String pemilik;
    int tahun;
    public String getPemilik(){
        return this.pemilik;
    }
    public void setPemilik(String pemilik){
        this.pemilik = pemilik;
    }
    @Override
    public void setNama(String nama){
        this.nama = nama;
    }
    @Override
    public void setTahunPembuatan(int tahun){
        this.tahun = tahun;
    }
    @Override
    public void displayData(){
        System.out.println("Nama:"+this.nama);
        System.out.println("Pemilik:"+this.pemilik);
        System.out.println("Tahun Produksi:"+this.tahun);
    }
    @Override
    public void sayDora(){
        System.out.println("Say Dora");
    }
    @Override
    public void displayKantongAjaib(){
        System.out.println("Kantong Ajaib");
    }
}
