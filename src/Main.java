import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean loopJenisMhs = false;
        boolean loop = false;
        int pil, usia;
        Scanner input = new Scanner(System.in);

        System.out.println("+---------------------------------+");
        System.out.println("| Pendaftaran Beasiswa PT. Benang |");
        System.out.println("+---------------------------------+");
        System.out.println("Terdapat 2 program beasiswa yang dibuka: ");
        System.out.println("1. Beasiswa Pelajar");
        System.out.println("2. Beasiswa Mahasiswa");
        System.out.print("Pilih beasiswa yang ingin didaftar: ");
        pil = input.nextInt();

        do {
            if(pil == 1) {
                System.out.println("\n");
                System.out.println("+--------------------------+");
                System.out.println("| FORM PENDAFTARAN PELAJAR |");
                System.out.println("+--------------------------+");
                System.out.print("\n");
                System.out.print("Nama Lengkap\t: ");
                String namaLengkap = input.next();
                System.out.print("Usia\t: ");
                usia = input.nextInt();

                System.out.println("\n");
                System.out.println("+----------------+");
                System.out.println("| FORM PENILAIAN |");
                System.out.println("+----------------+");
                System.out.print("\n");
                System.out.println("Keterangan: Nilai yang valid berada diantara 0 - 100");
                System.out.println("\n");
                System.out.print("Nilai Struktur dan Konten Esai : ");
                double nilaiEsai = input.nextDouble();
                System.out.print("Nilai Teknik Visualisasi : ");
                double nilaiVisualisasi = input.nextDouble();
                System.out.print("Nilai Kemampuan Design Thinking : ");
                double nilaiDesign = input.nextDouble();

                Pelajar pelajar = new Pelajar(namaLengkap, (int) usia,nilaiEsai,nilaiVisualisasi,nilaiDesign);
                do {
                System.out.println("\n");
                System.out.println("+------------------------+");
                System.out.println("|           MENU         |");
                System.out.println("+------------------------+");
                System.out.println("\n");
                System.out.println("\t1. Tampilkan Hasil");
                System.out.println("\t2. Ubah Nilai");
                System.out.println("\t3. Keluar");
                System.out.print("Pilih: ");
                double pilih = input.nextDouble();


                    if(pilih == 1) {
                        pelajar.display();
                        loop = false;
                    } else if (pilih == 2) {
                        System.out.println("\n");
                        System.out.println("+----------------+");
                        System.out.println("|       EDIT     |");
                        System.out.println("+----------------+");
                        System.out.println("\n");

                        System.out.println("Keterangan: Nilai yang valid berada diantara 0 - 100");
                        System.out.print("\n");
                        System.out.print("Nilai Struktur dan Konten Esai : ");
                        double tempPelajar1 = input.nextDouble();
                        System.out.print("Nilai Teknik Visualisasi : ");
                        double tempPelajar2 = input.nextDouble();
                        System.out.print("Nilai Kemampuan Design Thinking : ");
                        double tempPelajar3 = input.nextDouble();

                        pelajar.totalNilai(tempPelajar1,tempPelajar2,tempPelajar3);

                        loop = true;
                    } else if (pilih == 3) {
                        System.exit(0);
                    } else {
                        System.out.println("Input yang anda masukkan salah, silakan masukkan kembali!");
                        loop = true;
                    }
                } while(loop == true);

                loopJenisMhs = false;
            } else if (pil == 2) {
                System.out.println("\n");
                System.out.println("+----------------------------+");
                System.out.println("| FORM PENDAFTARAN MAHASISWA |");
                System.out.println("+----------------------------+");
                System.out.print("\n");
                System.out.print("Nama Lengkap\t: ");
                String namaLengkap = input.next();
                System.out.print("Usia\t: ");
                usia = input.nextInt();


                System.out.println("\n");
                System.out.println("+---------------------------------+");
                System.out.println("|         FORM PENILAIAN |");
                System.out.println("+---------------------------------+");
                System.out.print("\n");
                System.out.println("Keterangan: Nilai yang valid berada diantara 0 - 100");
                System.out.println("\n");
                System.out.print("Nilai Struktur dan Konten Jurnal : ");
                double nilaiJurnal = input.nextDouble();
                System.out.print("Nilai Relevansi Data : ");
                double nilaiRelevasi = input.nextDouble();
                System.out.print("Nilai Kemampuan Problem Solving : ");
                double nilaiProblem = input.nextDouble();

                Mahasiswa mahasiswa = new Mahasiswa(namaLengkap, (int) usia,nilaiJurnal,nilaiRelevasi,nilaiProblem);

                System.out.println("\n");
                System.out.println("+---------------------------+");
                System.out.println("|             MENU          |");
                System.out.println("+---------------------------+");
                System.out.println("\n");
                System.out.println("\t1. Tampilkan Hasil");
                System.out.println("\t2. Ubah Nilai");
                System.out.println("\t3. Keluar");
                System.out.print("Pilih: ");
                double pilih = input.nextDouble();

                do {
                    if(pilih == 1) {
                        mahasiswa.display();

                        loop = false;
                    } else if (pilih == 2) {
                        System.out.println("\n");
                        System.out.println("+-------------------+");
                        System.out.println("|        EDIT       |");
                        System.out.println("+-------------------+");
                        System.out.println("\n");

                        System.out.println("Keterangan: Nilai yang valid berada diantara 0 - 100");
                        System.out.println("\n");
                        System.out.print("Nilai Struktur dan Konten Esai : ");
                        double tempNilai1 = input.nextDouble();
                        System.out.print("Nilai Teknik Visualisasi : ");
                        double tempNilai2 = input.nextDouble();
                        System.out.print("Nilai Kemampuan Design Thinking : ");
                        double tempNilai3 = input.nextDouble();

                        mahasiswa.totalNilai(tempNilai1,tempNilai2,tempNilai3);

                        loop = false;
                    } else if (pilih == 3) {
                        System.exit(0);
                    } else {
                        System.out.println("Input yang anda masukkan salah, silakan masukkan kembali!");
                        loop = true;
                    }
                } while(loop == true);

                loopJenisMhs = false;
            } else {
                System.out.println("Input yang anda masukkan salah, silakan masukkan kembali!");

                loopJenisMhs = true;
            }
        } while (loopJenisMhs == true);
    }
}