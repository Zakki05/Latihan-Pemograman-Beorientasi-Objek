/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools5 | Templates
 * and open the template in the editor.
 */
package UTS_AhmadFarisAlmuzakki_161122;

/**
 *
 * @author LENOVO
 */
public class GajiRecordExample {
    public static void main(String[] args) {
        GajiRecord gaji1 = new GajiRecord();
    
        gaji1.setKodeSlip("001");
        gaji1.setTanggal("16 November 2022");
        gaji1.setNamaPegawai("Zakki");
        gaji1.setGolongan(1);
        gaji1.setTunjanganAnak(500000);
        gaji1.setTunjanganIstri(700000);
        
        System.out.println("\t== PEGAWAI 1 ==\n");
        System.out.println("Kode Slip : "+gaji1.getKodeSlip());
        System.out.println("Tanggal : "+gaji1.getTanggal());
        System.out.println("Nama Pegawai : "+gaji1.getNamaPegawai());
        System.out.println("Golongan : "+gaji1.getGolongan());
        System.out.println("Gaji Pokok : "+gaji1.getGajiPokok());
        System.out.println("Tunjangan Anak : "+gaji1.getTunjanganAnak());
        System.out.println("Tunjangan Istri : "+gaji1.getTunjanganIstri());
        System.out.println("Total Gaji : "+gaji1.getTotalGaji());
       
        System.out.print("\n");
        
        GajiRecord gaji2 = new GajiRecord();
    
        gaji2.setKodeSlip("002");
        gaji2.setTanggal("10 November 2022");
        gaji2.setNamaPegawai("Fajri");
        gaji2.setGolongan(2);
        gaji2.setTunjanganAnak(1000000);
        gaji2.setTunjanganIstri(500000);
        
        System.out.println("\t==PEGAWAI 2==\n");
        System.out.println("Kode Slip : "+gaji2.getKodeSlip());
        System.out.println("Tanggal : "+gaji2.getTanggal());
        System.out.println("Nama Pegawai : "+gaji2.getNamaPegawai());
        System.out.println("Golongan : "+gaji2.getGolongan());
        System.out.println("Gaji Pokok : "+gaji2.getGajiPokok());
        System.out.println("Tunjangan Anak : "+gaji2.getTunjanganAnak());
        System.out.println("Tunjangan Istri : "+gaji2.getTunjanganIstri());
        System.out.println("Total Gaji : "+gaji2.getTotalGaji());
    }
}
