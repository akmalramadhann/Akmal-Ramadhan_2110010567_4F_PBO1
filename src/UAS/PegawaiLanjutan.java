package UAS;


public class PegawaiLanjutan extends Pegawai {
      //overriding
    public PegawaiLanjutan (String namapegawai, String nikpegawai) {
        super(namapegawai, nikpegawai);
    }
    
    public int getTahunMasuk(){
        return Integer.parseInt(getNikPegawai().substring(0, 2)) + 2000;
    }
    
    public String getJabatan(){
        String kodeJabatan = getNikPegawai().substring(2, 4);
        //seleksi if
        if(kodeJabatan.equals("10")){
            return "Karyawan";
        }else{
            return "yang lain";
        }
    }
    
    public String getJenisKelamin(){
        String kodeJk = getNikPegawai().substring(4, 6);
         //seleksi switch
         switch(kodeJk){
             case "01":
                 return "Laki-laki";
             case "02":
                 return "Perempuan";
             default:
                 return "Kalo ada yang lain berati aneh";
         }
    }
    
    public int getNoKeanggotaan(){
        return Integer.parseInt(getNikPegawai().substring(7));
    }
    
    //polymorphism (overriding)
    @Override
    public String pegawaiInfo(){
       return super.pegawaiInfo()+
               "\nTahun Masuk: "+getTahunMasuk()+
               "\nJabatan: "+getJabatan()+
               "\nNo Anggota: "+getNoKeanggotaan()+
               "\nJenis Kelamin: "+getJenisKelamin();
    }
}

