
BAB 3
Mengenali Lingkup Pemrograman Anda
3.2 Tujuan
Dalam sesi  ini,  kita  akan membahas tentang bagaimana menulis, meng-compile dan
menjalankan(run) program Java. Terdapat 2 cara dalam melakukannya, yang pertama
menggunakan  console  dan  text  editor.  Sedangkan  cara  kedua  adalah  dengan
menggunakan  NetBeans  yang  merupakan  Integrated  Development  Environment
atau yang disebut IDE.
Diakhir pembahasan, para pelajar diharapkan dapat :
• Membuat program Java menggunakan text editor dan console dalam linux (Ubuntu
Dapper)
• Membedakan antara syntax-errors dan runtime-errors
• Membuat program Java menggunakan NetBeans
3.2  Pendahuluan
IDE adalah sebuah peralatan dalam pemrograman yang diintegrasikan kedalam aplikasi
software yang mendukung pembangunan GUI, text atau penulisan kode, compiler dan
debugger.
Tutorial  ini  menggunakan  Ubuntu  Dapper  sebagai   sistem  operasinya.  Sebelum
menggunakan tutorial ini, pastikan bahwa telah menginstal  Java dan NetBeans dalam
sistem yang anda gunakan. Untuk instruksi dalam bagaimana cara menginstal Java dan
NetBeans, dapat dilihat pada Appendix A. Untuk versi Windows Xp dalam sesi ini, dapat
dilihat pada Appendix B.
Sebelum membahas lebih detail, pada awalnya akan kita lihat program Java pertama
yang akan anda tulis.
3.3 Program Java Pertama
public class Hello
{   
    /**
     * My first java program
     */
    public static void main(String[] args) {
//Menampilkan kata "Hello world" dilayar
         System.out.println("Hello world!"); 
    }   
}
Pengenalan Pemrograman  I  1
J.E.N.I.
Sebelum menjelaskan apa arti dari program tersebut, cobalah untuk menulis program
ini didalam file dan kemudian menjalankannya.
3.4 Menggunakan Text editor dan Console
Dalam contoh ini,  kita akan menggunakan text editor untuk mengedit program Java.
Juga membuka terminal window untuk meng-compile dan meng-execute program Java
anda.
Langkah 1: Memulai Text Editor
Untuk memulai text editor di linux , klik pada Applications->Accessories->Text Editor.
Gambar 1: Aplikasi Text Editor di Linux
Pengenalan Pemrograman  I  2
J.E.N.I.
Langkah 2: Membuka Terminal
Untuk membuka terminal di linux, klik pada Applications-> Accessories-> Terminal.
Figure 2: Terminal pada Linux
Langkah 3: Tulislah listing program Java anda dalam text editor.
Gambar 3: Menulis kode program menggunakan text editor
Pengenalan Pemrograman  I  3
J.E.N.I.
Langkah 4: Simpanlah program Java anda
Program ini akan disimpan dalam file yang bernama ''Hello.java'', dan disimpan dalam
sebuah folder yang bernama MYJAVAPROGRAMS.
Untuk membuka Save dialog box, klik pada File menu yang terdapat pada menubar dan
kemudian klik save.
Setelah melakukan instruksi tersebut, dialog box akan tampil seperti gambar dibawah
ini.
Gambar 4: Menyimpan file
Pengenalan Pemrograman  I  4
J.E.N.I.
Klik pada tombol browse, kemudian klik tombol Create Folder.
Pengenalan Pemrograman  I  5
J.E.N.I.
Nama folder  baru, MYJAVAPROGRAMS. Sekarang, klik  pada folder  MYJAVAPROGRAMS
untuk mengetahui  isi  folder  yang ada didalamnya.  Anda akan melihat  gambar yang
ditampilkan  seperti  berikut  ini  setelah  anda klik  pada folder  tersebut.  Untuk saat ini
folder tersebut harus kosong sampai terbuatnya folder baru dan kita akan menyimpan
semuanya didalam folder tersebut.
Saat ini, dalam pilihan textbox, ketiklah nama file dari program anda, yaitu ''Hello.java'',
kemudian klik pada tombol SAVE.
Pengenalan Pemrograman  I  6
J.E.N.I.
Sekarang anda telah menyimpan file anda, ingatlah cara bagaimana nama frame dapat
berubah  dari  ''Untitled  Document  1  (modified)  –  gedit''  menjadi  "Hello.java
(~/MYJAVAPROGRAMS) – gedit". Jika anda ingin melakukan perubahan pada file anda,
anda  hanya  perlu  mengeditnya,  kemudian  menyimpannya  kembali  dengan  mengklik
pada File->Save.
Gambar 5: Window baru setelah penyimpanan
Pengenalan Pemrograman  I  7
J.E.N.I.
Langkah 5: Meng-compile program anda
Langkah berikut ini adalah meng-compile program Anda. Masuklah ke Terminal Window
yang telah kita buka sebelumnya.
Ketika anda membuka terminal window, terminal tersebut menampilkan window yang
disebut sebagai home folder Anda. Untuk melihat isi dari folder tersebut, ketik ls dan
kemudian tekan ENTER. Apa yang akan anda temukan adalah daftar file-file dan folder
didalamnya.
Disinilah Anda dapat melihat folder dengan nama "MYJAVAPROGRAMS" yang telah kita
buat sebelumnya, dan merupakan tempat dimana kita menyimpan program Hello.java
kita. Kemudian masuklah kedalam direktori tersebut.
Untuk  masuk  kedalam  sebuah  direktori,  ketiklah  perintah  :  cd  [directory  name].
Perintah ''cd'' digunakan untuk merubah direktori. Dalam hal ini, nama dari direktori kita
adalah MYJAVAPROGRAM, maka anda harus mengetik : cd MYJAVAPROGRAMS.
Gambar 6: Merubah Direktori
Pengenalan Pemrograman  I  8
J.E.N.I.
Setelah berada didalam folder  yang berisi  program Java Anda, sudah saatnya untuk
memulai meng-compile program Java tersebut. Sebagai catatan, bahwa file yang Anda
maksud  harus  ada  didalam  folder  yang  Anda  pilih.  Periksalah  dengan  menjalankan
perintah ''ls'' lagi untuk melihat bahwa file Anda ada didalam folder tersebut.
 
Gambar 7: Daftar File didalam Direktori yang Baru
Untuk meng-compile program Java, gunakanlah perintah : javac [filename]. Dalam hal
ini, Anda mengetikan perintah : javac Hello.Java.
Gambar 8:Meng-compile File Java
Pengenalan Pemrograman  I  9
J.E.N.I.
Selama  peng-compile-an,  javac  menambah  file  kedalam  disk  yang  disebut
[filename].class, atau dalam hal ini, Hello.class, yang merupakan kode sebenarnya.
Langkah 6 : Menjalakan Program
Selama proses peng-compile-an, javac menambah file baru kedalam disk yang disebut
[filename].class, dalam hal ini,  Hello.class, yang merupakan kode sebenarnya saat
ini,  dengan  perkiraan  tidak  ada permasalahan  pada  saat  proses  compile  (kita  akan
menyelidiki dan membahas permasalahan yang ditemukan selama proses compile, pada
bagian berikutnya), berarti telah siap untuk menjalankan program anda.
Untuk menjalankan program Java Anda, dengan mengetikan perintah : java [filename
without the extension], maka dalam hal ini, Anda mengetikkan perintah : java Hello.
Sekarang  Anda dapat  melihat  dilayar  bahwa  anda  telah  menjalankan  program  Java
pertama Anda, yang menampilkan pesan, ''Hello world!''.
Gambar 9: Menjalankan File Class
Pengenalan Pemrograman  I  10
J.E.N.I.
3.4.1 Errors
Apa yang telah ditunjukan sejauh ini adalah program Java dimana kita tidak menemukan
berbagai  masalah  dalam  proses  compiling  maupun  pada  saat  menjalankannya.
Bagaimanapun juga, hal ini tidak selalu terjadi. Seperti yang telah kita diskusikan pada
bagian  pertama dari  latihan  ini,  biasanya  kita  juga  akan menemukan permasalahan
selama proses berlangsung.
Seperti  yang  telah  didiskusikan  sebelumnya,  ada  2  macam  error.  Pertama  adalah
compile-time error atau yang disebut juga sebagai syntax error. Kedua adalah runtime
errors.
3.4.1.1 Syntax Errors
Syntax errors biasanya terjadi karena kesalahan penulisan. Mungkin Anda kekurangan
sebuah  perintah  di  Java  atau  lupa  untuk  menulis  tanda  titik-koma  pada  akhir
pernyataan. Java mencoba untuk mengisolasi error tersebut dengan cara menunjukkan
baris dari kode dan terlebih dahulu menunjuk karakter yang salah dalam baris tersebut.
Bagaimanapun juga, error belum tentu berada pada titik yang ditunjuk.
Kesalahan umum lainnya adalah dalam kapitalisasi,  ejaan, penggunaan dari karakter
khusus  yang  tidak  benar,  dan  penghilangan  dari  pemberian  tanda  baca  yang
sebenarnya.
Mari kita mengambil contoh, pada program Hello.java kita, dimana dengan sengaja kita
hilangkan titik-koma pada akhir pernyataan dan juga mencoba untuk mengetikkan ejaan
yang salah pada sebuah perintah.
Gambar 10: Listing Program yang Memiliki  Error
Pengenalan Pemrograman  I  11
J.E.N.I.
Lihatlah  pesan  error  yang  ditampilkan  setelah  peng-compile-an  program  dijalankan.
Pesan error  yang pertama memberitahu  bahwa diprogram anda terdapat  error  pada
baris 6. Hal itu menunjuk pada kata setelah  static,  dimana seharusnya dieja sebagai
static.
Pesan error yang kedua memberitahukan bahwa pada program tersebut kehilangan titikkoma
setelah
pernyataan
anda.
Gambar 11: Peng-compile-an listing Program yang Memiliki Error
Jika anda menemukan banyak pesan error, cobalah untuk mengoreksi kesalahan yang
pertama  pada  daftar  error  satu  per  satu,  dan  mencoba  untuk  meng-compile-nya
kembali. Dengan melakukan hal tersebut maka, dapat mengurangi total error yang ada.
3.4.1.2 Run-time Errors
Run-time error merupakan error yang tidak akan ditampilkan sampai anda menjalankan
program anda.  Bahkan program yang dicompile dengan sukses dapat menampilkan
jawaban yang salah jika programmer belum berpikir sampai struktur dan proses logis
dari program tersebut.
Pengenalan Pemrograman  I  12
J.E.N.I.
3.5 Menggunakan NetBeans
Sekarang kita mencoba mengerjakan program kita dengan jalan yang lebih rumit, mari
kita  lihat  bagaimana  mengerjakan  semua proses  yang  telah  dijelaskan  pada  bagian
sebelumnya dengan menggunakan sebuah aplikasi.
Pada  bagian  pelajaran  ini,  kita  akan  menggunakan  NetBeans,  yang  merupakan
Integrated  Development  Environment atau  IDE.  Suatu  IDE  adalah  lingkupan
pemrograman  yang  mengintegrasikan  kedalam  suatu  aplikasi  perangkat  lunak  yang
menyediakan  pembangun  GUI,  suatu  text  atau  kode  editor,  suatu  compiler  atau
enterpreter dan suatu debugger.
Langkah 1 : NetBeans
Ada dua cara untuk menjalankan NetBeans. Pertama menulis perintah menggunakan
terminal, atau hanya dengan mengklik pada tombol shortcut yang dapat ditemukan di
desktop.
Untuk  menjalankan  NetBeans  menggunakan  command-line.  Bukalah  terminal  (lihat
langkahnya pada bagaimana menjalankan terminal didiskusi sebelumnya), dan ketiklah :
netbeans.
Gambar 12: Menjalankan NetBeans Menggunakan Command-Line
Pengenalan Pemrograman  I  13
J.E.N.I.
Cara kedua untuk menjalankan NetBeans, adalah dengan mengklik shortcut icon yang
terdapat pada desktop Anda.
Gambar 13: Menjalankan NetBeans menggunakan shortcut icon di desktop
Pengenalan Pemrograman  I  14
J.E.N.I.
Setelah Anda membuka NetBeans IDE, Anda akan melihat graphical user interface (GUI)
seperti yang ditunjukkan dibawah ini.
Gambar 14:  Window Setelah Membuka NetBeans
Pengenalan Pemrograman  I  15
J.E.N.I.
Langkah 2: Membuat sebuah Project
Pertama,  mari  kita  buat  sebuah  project.  Klik  pada  File->New  Project.  Setelah
melakukannya, akan ditampilkan kotak dialog project yang baru. Kemudian klik pada
Java Application dan klik tombol NEXT.
Gambar 15: Memilih Tipe Project
Pengenalan Pemrograman  I  16
J.E.N.I.
Sekarang, dialog aplikasi yang baru akan ditampilkan.
Gambar 16: Mengatur Informasi Project
Pengenalan Pemrograman  I  17
J.E.N.I.
Cobalah  untuk  mengubah  lokasi  aplikasi,  dengan  mengklik  pada  tombol  BROWSE.
Kemudian dialog lokasi project akan muncul. Klik dua kali pada home folder Anda.
Gambar 17: Mengatur Lokasi Project
Kemudian  isi  dari  folder  root  akan  ditampilkan.  Lalu  klik  dua  kali  pada  folder
MYJAVAPROGRAMS dan klik tombol OPEN.
Pengenalan Pemrograman  I  18
J.E.N.I.
Lihatlah  lokasi  project  dan  folder  project  telah  berubah  menjadi
/home/florence/MYJAVAPROGRAMS.
Yang terakhir,  pada  textfield   Create  Main  Class,  tulislah  Hello  sebagai  nama kelas
utama, dan kemudian klik tombol FINISH.
Gambar 18: Window setelah Mengatur Lokasi Project ke MYJAVAPROGRAMS/Mengatur kelas utama project 
menjadi Hello
Pengenalan Pemrograman  I  19
J.E.N.I.
Langkah 3 : Menulis Program Anda
Sebelum menulis program, pertama akan dijelaskan window utama setelah membuat
project.
Seperti  ditunjukkan  dibawah,  secara  otomatis  NetBeans  membuat kode  dasar  untuk
program Java Anda. Anda hanya dapat menambah pernyataan Anda pada kode yang
dihasilkan itu. Pada sisi kiri window, Anda dapat melihat daftar folder dan file-file yang
dihasilkan NetBeans setelah membuat sebuah project. Semua ini dapat Anda temukan
dalam  folder   MYJAVAPROGRAMS  Anda,  dimana  Anda  menetapkan  lokasi  project
tersebut.
Pengenalan Pemrograman  I  20
J.E.N.I.
Sekarang, mencoba memodifikasi kode yang dihasilkan oleh NetBeans. Untuk saat ini
abaikan bagian-bagian lain dari program, detail dari kode tersebut akan dijelaskan pada
bagian berikutnya. Masukkan kode :
System.out.println("Hello world!");
Setelah pernyataan, //TODO code application logic here.
Gambar20: Memasukkan Kode
Pengenalan Pemrograman  I  21
J.E.N.I.
Langkah 4 : Meng-compile Program Anda
Sekarang, untuk meng-compile program anda, klik pada Build->Buid Main Project. Atau,
anda juga dapat menggunakan tombol shortcut untuk meng-compile kode anda.
Pengenalan Pemrograman  I  22
J.E.N.I.
Jika tidak terdapat error pada program Anda, Anda dapat melihat pesan sukses build
pada window yang dihasilkan.
Gambar 21: Tampilan Setelah sukses melakukan compile
Pengenalan Pemrograman  I  23
J.E.N.I.
Langkah 5 : Menjalankan Program Anda
Untuk menjalankan program Anda, klik pada Run->Run Main Project. Atau Anda juga
dapat menggunakan tombol shortcut untuk menjalankan program Anda.
Gambar 22: Menjalankan dengan  NetBeans
Pengenalan Pemrograman  I  24
J.E.N.I.
Hasil dari program Anda ditampilkan pada window.
Gambar 23: Tampilan Setelah Sukses Menjalankan Program
Pengenalan Pemrograman  I  25
J.E.N.I.
3.6 Latihan
3.6.1 Hello World!
Menggunakan  NetBeans,  membuat  class  dengan  nama  :  [NamaAnda].  Hasil  dari
program yang harus tampil dilayar :
Welcome to Java Programming [NamaAnda]!!!
3.6.2 The Tree
Menggunakan NetBeans,  membuat class dengan nama : TheTree. Hasil dari program
yang harus tampil dilayar :
I think that I shall never see,
a poem as lovely as a tree.
A tree whose hungry mouth is pressed
Against the Earth’s sweet flowing breast. 
Pengenalan Pemrograman  I  26
