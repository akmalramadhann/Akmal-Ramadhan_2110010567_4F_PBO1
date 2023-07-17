package UAS;


public class Pegawai {
    //Atribut
    private String namapegawai;
    private String nikpegawai;
    
    //construktor
    public Pegawai(String namapegawai, String nikpegawai) {
        this.namapegawai = namapegawai;
        this.nikpegawai = nikpegawai;
    }
    
    //mutator (setter)
    public void setNamaPegawai(String namapegawai) {
        this.namapegawai = namapegawai;
    }
    public void setNikPegawai(String nikpegawai) {
        this.nikpegawai = nikpegawai;
    }
    
    //accessor (getter)
    public String getNamaPegawai(){
        return namapegawai;
    }
    public String getNikPegawai(){
        return nikpegawai;
    }
    
    public String pegawaiInfo(){
        return "Nama Pegawai: "+getNamaPegawai()+
                "\nNik: "+getNikPegawai();
    }
    
    //polymorphism (overloading)
    public String pegawaiInfo (String nik){
        return pegawaiInfo() + "\nnik: "+nik;
    }
}
