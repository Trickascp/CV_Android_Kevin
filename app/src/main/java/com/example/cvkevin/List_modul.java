package com.example.cvkevin;

import java.util.ArrayList;

public class List_modul {

    public static String[][] data = new String[][]{

            {"Recycler View", "RecyclerView adalah versi ListView yang lebih canggih dan fleksibel. Widget ini adalah kontainer untuk menampilkan rangkaian data besar yang bisa digulir secara sangat efisien dengan mempertahankan tampilan dalam jumlah terbatas."},
            {"Intent","Intent adalah sebuah kelas dalam programming Android yang berfungsi untuk perpindahan halaman.\n" +
                    "\n" +
                    "Intent juga merupakan suatu objek yang terdapat dalam suatu activity dimana objek tersebut dapat komunikasi dengan activity yang lain, baik activity pada fungsi internal android misal seperti memanggil activity dalam satu package atau beda package yang masih berada dalam satu project.\n" +
                    "\n" +
                    "Intent merupakan objek tipe android.content.Intent."},
            {"Cardview","CardView merupakan view paketan dari Material Design — diperkenalkan pada Android Versi Lolipop. Bentuk view ini biasa digunakan untuk pembungkusan data (sepaket data — beberapa view) yang ditandai dengan tampilan view nya yang memiliki drop shadow (elevation) dan corner radius."},
            {"Fragment"," Fragment adalah sebuah bagian dari user interface atau perilaku sebuah aplikasi yang dapat ditempatkan pada activity yang memungkinkan untuk mendesain activity yang modular. atau bisa dikatakan fragment semacam sub-activity."},
            {"TabLayout","TabLayout adalah salah satu elemen utama dan paling sering digunakan sebagai menu navigasi pada aplikasi Android. Biasanya TabLayout dikombinasikan dengan Fragment, Fragment tersebut akan berganti sesuai dengan menu Tab yang diklik."},
            {"RelativeLayout","Relative Layout merupakan layout yang berfungsi untuk mengatur tata letak komponen atau widget aplikasi android dengan cara relative (secara bebas) tidak hanya vertikal atau horisontal saja seperti pada Linear Layout."},
            {"LinearLayout","LinearLayout adalah sekelompok tampilan yang menyejajarkan semua anak dalam satu arah, secara vertikal atau horizontal. Anda bisa menetapkan arah layout dengan atribut android:orientation. \n Semua anak LinearLayout akan ditumpuk satu sama lain, jadi daftar vertikal hanya akan memiliki satu anak per baris, seberapa pun lebarnya, dan daftar horizontal hanya akan setinggi satu baris (tinggi anak yang tertinggi, ditambah pengisi). LinearLayout akan mengikuti margin antara anak dan gravity (sejajar kanan, tengah, atau kiri) setiap anak."},
            {"FrameLayout","FrameLayout adalah layout yang paling tepat  untuk membuat beberapa UI saling tumpang tindih."},
    };


    public static ArrayList<Modul> getListData(){
        ArrayList<Modul> list = new ArrayList<>();
        for (String[] aData: data){
            Modul modul = new Modul();
            modul.setJudul(aData[0]);
            modul.setDeskripsi(aData[1]);
            list.add(modul);
        }
        return list;
    }


}
