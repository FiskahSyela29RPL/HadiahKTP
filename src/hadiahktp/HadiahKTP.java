package hadiahktp;

import java.util.Scanner;

/**
 @author Fiskah Syela 29 RPL
 */
public class HadiahKTP {

    public static void main(String[] args) {
        //membuat variabel
        String  provinsi,nik,nama,ttl,kelamin,goldar;
        String  kelurahan,desa,kecamatan,agama,status,pekerjaan,warga;
        int     rt,rw;
        
        System.out.println("|          KARTU TANDA PENDUDUK          |");
        System.out.println("==========================================");
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Provinsi Anda                  : " );
        provinsi = input.next();
        System.out.print("Masukkan NIK Anda                       : " );
        nik = input.next();
        System.out.print("Masukkan Nama Anda                      : " );
        nama = input.next();
        System.out.print("Masukkan Tempat dan Lahir Anda          : " );
        ttl = input.next();
        System.out.print("Masukkan Jenis Kelamin Anda             : " );
        kelamin = input.next();
        System.out.print("Masukkan Jenis Golongan Darah Anda      : " );
        goldar = input.next();
        System.out.print("Masukkan RT Tempat Tinggal Anda         : " );
        rt = input.nextInt();
        System.out.print("Masukkan RW Tempat Tinggal Anda         : " );
        rw = input.nextInt();
        System.out.print("Masukkan Kelurahan Tempat Tinggal Anda  : " );
        kelurahan = input.next();
        System.out.print("Masukkan Desa Tempat Tinggal Anda       : " );
        desa = input.next();
        System.out.print("Masukkan Kecamatan Tempat Tinggal Anda  : " );
        kecamatan = input.next();
        System.out.print("Masukkan Agama Anda                     : " );
        agama = input.next();
        System.out.print("Masukkan Status Perkawinan Anda         : " );
        status = input.next();
        System.out.print("Masukkan Pekerjaan Anda                 : " );
        pekerjaan = input.next();
        System.out.print("Masukkan Kewarganegraan Anda            : " );
        warga = input.next();
        
        System.out.println("|          KARTU TANDA PENDUDUK          |");
        System.out.println("\t\t"+provinsi+"\t\t\t");
        System.out.println("\t"+nik);
        System.out.println(nama);
        System.out.println(ttl);
        System.out.println(kelamin+"\t"+goldar);
        System.out.println("Alamat");
        System.out.println(ttl);
        System.out.println("\t"+rt+"\t"+rw);
        System.out.println("\t"+kelurahan+"\t"+desa);
        System.out.println("\t"+kecamatan);
        System.out.println(agama);
        System.out.println(status);
        System.out.println(pekerjaan);
        System.out.println(warga);
    }
}