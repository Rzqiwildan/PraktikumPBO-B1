package main;

import buku.Buku;
import bukuFiksi.bukuFiksi;
import bukuFiksi.bukuNovel;
import bukunonFiksi.bukuAkademik;
import bukunonFiksi.bukuNonFiksi;

public class MBuku {
        public static void main(String[] args) {
                // Object buku
                Buku buku = new Buku("Habis gelap terbitlah terang", "Raden Adjeng Kartini ", "1992");
                Buku bukuCerpen = new Buku("The Lottery", "Shirley Jackson", "1948");
                Buku bukuNovel = new Buku("The Lord of the Rings - The Fellowship of the Ring", "J.R.R. Tolkien",
                                "1954");
                Buku bukuAkademik = new Buku("Pengantar Psikologi", "Sarlito Wirawan Sarwono", "2020");
                Buku bukuAutobiografi = new Buku("the story of my life", "Hellen Keller", "1903");

                // Object bukuFiksi
                bukuNovel novel = new bukuNovel(bukuNovel.getJudul(), bukuNovel.getPenulis(),
                                bukuNovel.getTahunTerbit(), "Fantasy", 423, 150000);
                bukuFiksi bukuFiksi = new bukuFiksi(bukuCerpen.getJudul(), bukuCerpen.getPenulis(),
                                bukuCerpen.getTahunTerbit(),
                                "horor", 16, 30000);
                // Buku NonFiksi
                bukuNonFiksi autobiografi = new bukuNonFiksi(bukuAutobiografi.getJudul(), bukuAutobiografi.getPenulis(),
                                bukuAutobiografi.getTahunTerbit(), "Autobiografy", 500, 150000);
                // buku Akademik
                bukuNovel akademik = new bukuNovel(bukuAkademik.getJudul(), bukuAkademik.getPenulis(),
                                bukuAkademik.getTahunTerbit(),
                                "Psikologi", 640, 132000);

                // Informasi semua buku
                System.out.println("-------------------- \n| Informasi Buku : |\n--------------------");
                buku.view();
                System.out.println();
                bukuCerpen.view();
                System.out.println();
                bukuNovel.view();
                System.out.println();
                bukuAkademik.view();
                System.out.println();
                bukuAutobiografi.view();

                System.out.println("---------------- \n| Buku Fiksi : |\n----------------");
                System.out.println("Buku Novel :");
                bukuNovel.view();
                novel.view();
                System.out.println();
                System.out.println("Buku Cerpen :");
                bukuCerpen.view();
                bukuFiksi.view();
                System.out.println();

                System.out.println("-------------------- \n| Buku Non Fiksi : |\n--------------------");
                System.out.println("Buku Autobigrafi :");
                autobiografi.view();
                System.out.println();
                System.out.println("Buku Akademik :");
                bukuAkademik.view();
                akademik.view();
        }
}
