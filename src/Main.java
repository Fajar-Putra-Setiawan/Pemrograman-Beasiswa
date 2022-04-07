import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean loopJenisMhs = false;
        boolean loop = false;
        int pil, usia;
        double nilaiEsai,nilaiVisualisasi,nilaiDesign;
        double nilaiJurnal, nilaiData,nilaiProblem;
        Scanner input = new Scanner(System.in);

        System.out.println("+---------------------------------+");
        System.out.println("| Pendaftaran Beasiswa PT. Benang |");
        System.out.println("+---------------------------------+");
        System.out.print("\n");
        System.out.println("Terdapat 2 program beasiswa yang dibuka: ");
        System.out.println("1. Beasiswa Pelajar");
        System.out.println("2. Beasiswa Mahasiswa");
        System.out.println("Pilih beasiswa yang ingin didaftar: ");
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
                System.out.println("Nilai Struktur dan Konten Esai : ");
                nilaiEsai = input.nextDouble();
                System.out.println("Nilai Teknik Visualisasi : ");
                nilaiVisualisasi = input.nextDouble();
                System.out.println("Nilai Kemampuan Design Thinking : ");
                nilaiDesign = input.nextDouble();

                Pelajar pelajar = new Pelajar(namaLengkap, (int) usia,nilaiEsai,nilaiVisualisasi,nilaiDesign);

                System.out.println("\n");
                System.out.println("+------+");
                System.out.println("| MENU |");
                System.out.println("+------+");
                System.out.println("\n");
                System.out.println("\t1. Tampilkan Hasil");
                System.out.println("\t2. Ubah Nilai");
                System.out.println("\t3. Keluar");
                System.out.println("Pilih: ");
                double pilih = input.nextDouble();

                do {
                    if(pilih == 1) {
                        pelajar.display();

                        loop = false;
                    } else if (pilih == 2) {
                        System.out.println("\n");
                        System.out.println("+------+");
                        System.out.println("| EDIT |");
                        System.out.println("+------+");
                        System.out.println("\n");

                        System.out.println("Keterangan: Nilai yang valid berada diantara 0 - 100");
                        System.out.println("\n");
                        System.out.println("Nilai Struktur dan Konten Esai : ");
                        nilaiEsai = input.nextDouble();
                        System.out.println("Nilai Teknik Visualisasi : ");
                        nilaiVisualisasi = input.nextDouble();
                        System.out.println("Nilai Kemampuan Design Thinking : ");
                        nilaiDesign = input.nextDouble();

                        pelajar.totalNilai(nilaiEsai,nilaiVisualisasi,nilaiDesign);

                        loop = false;
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
                System.out.println("Nama Lengkap\t: ");
                String namaLengkap = input.next();
                System.out.println("Usia\t: ");
                usia = input.nextInt();

                System.out.println("\n");
                System.out.println("+----------------+");
                System.out.println("| FORM PENILAIAN |");
                System.out.println("+----------------+");
                System.out.print("\n");
                System.out.println("Keterangan: Nilai yang valid berada diantara 0 - 100");
                System.out.println("\n");
                System.out.println("Nilai Struktur dan Konten Jurnal : ");
                nilaiJurnal = input.nextDouble();
                System.out.println("Nilai Relevansi Data : ");
                nilaiData = input.nextDouble();
                System.out.println("Nilai Kemampuan Problem Solving : ");
                nilaiProblem = input.nextDouble();

                Mahasiswa mahasiswa = new Mahasiswa(namaLengkap,usia,nilaiJurnal,nilaiData,nilaiProblem);

                System.out.println("\n");
                System.out.println("+------+");
                System.out.println("| MENU |");
                System.out.println("+------+");
                System.out.println("\n");
                System.out.println("\t1. Tampilkan Hasil");
                System.out.println("\t2. Ubah Nilai");
                System.out.println("\t3. Keluar");
                System.out.println("Pilih: ");
                double pilih = input.nextDouble();

                do {
                    if(pilih == 1) {
                        mahasiswa.display();

                        loop = false;
                    } else if (pilih == 2) {
                        System.out.println("\n");
                        System.out.println("+------+");
                        System.out.println("| EDIT |");
                        System.out.println("+------+");
                        System.out.println("\n");

                        System.out.println("Keterangan: Nilai yang valid berada diantara 0 - 100");
                        System.out.println("\n");
                        System.out.println("Nilai Struktur dan Konten Jurnal : ");
                        nilaiJurnal = input.nextDouble();
                        System.out.println("Nilai Relevansi Data : ");
                        nilaiData = input.nextDouble();
                        System.out.println("Nilai Kemampuan Problem Solving : ");
                        nilaiProblem = input.nextDouble();

                        mahasiswa.totalNilai(nilaiJurnal,nilaiData,nilaiProblem);

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