import java.util.*;
public class kalender {

    public static void main(String[] args) {
        int detik, menit, jam, hari, bulan, tahun;
        GregorianCalendar date = new GregorianCalendar();
        String namabulan[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        detik = date.get(Calendar.SECOND);
        menit = date.get(Calendar.MINUTE);
        jam = date.get(Calendar.HOUR_OF_DAY);
        hari = date.get(Calendar.DAY_OF_MONTH);
        bulan = date.get(Calendar.MONTH);
        tahun = date.get(Calendar.YEAR);
        System.out.println("Hari Ini Tanggal : " + hari + " " + namabulan[bulan] + " " + tahun);
        System.out.println("Jam : " + jam + " " + menit + " " + detik);
    }
}