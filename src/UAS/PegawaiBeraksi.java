package UAS;


import java.util.Scanner;

public class PegawaiBeraksi {
    public static void main(String[] args) {
        //objek
        //Pegawai pgw = new Pegawai("Akmal Ramadhan","CEO");
        
        //System.out.println(pgw.pegawaiInfo());
        //System.out.println(mhs.pegawaiInfo("123456789"));
        
        //error handling
        try{
            //io sedehana
            Scanner scanner = new Scanner(System.in);
            
            //array
            PegawaiLanjutan[] pgw = new PegawaiLanjutan[2];
            
            //perulangan
            for (int i=0; i<pgw.length; i++){
                System.out.print("Masukkan Nama Pegawai "+(i+1)+": ");
                String namapegawai = scanner.nextLine();
                System.out.print("Masukkan NIK Pegawai "+(i+1)+": ");
                String nikpegawai = scanner.nextLine();
                
                //objek  pgw[i] = new PegawaiLanjutan(namapegaw
                pgw[i] = new PegawaiLanjutan(namapegawai, nikpegawai);
            }
            
            //perulangan
            for (PegawaiLanjutan data: pgw){
                System.out.println("=============");
                System.out.println("Data Pegawai: ");
                System.out.println(data.pegawaiInfo());
            }
        } catch (NumberFormatException e){
            System.out.println("Terjadi Kesalahan dalam memasukkan nomor: "+e.getMessage());
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Terjadi Kesalahan dalam dalam memasukkan nik: "+e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan umum: "+e.getMessage());
        }
    }
}
