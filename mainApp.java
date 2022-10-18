

public class mainApp {
    public static void main(String[] args){
        karyawan karyawan=new karyawan("efa", "penujak", "087754436633");

        penggajian penggajian=new penggajian("Rp.7.500.000", "Rp.5.000.00", "Rp.4.000.000");

        status_pendidikan status_pendidikan=new status_pendidikan("Aktif");

        jabatan jabatan=new jabatan("manajer");

        karyawan.cetakkaryawan(karyawan.no_hp);
        penggajian.cetakpenggajian(penggajian.gajiPokok);
        jabatan.cetakjabatan(jabatan.jabatan);
        status_pendidikan.cetakstatus_pendidikan(status_pendidikan.status);
    }


}
