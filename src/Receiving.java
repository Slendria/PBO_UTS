import java.util.ArrayList;
import java.util.Scanner;

import javax.naming.InitialContext;

import model.Employee;
import model.Item;
import model.Payment;
import model.Receiving_Item;
import model.Supplier;

public class Receiving 
{
    public static ArrayList <Employee> initEmployees(ArrayList <Employee> employees)
    {   
        Employee emp1 = new Employee("01F0001", "Felicia", " Jalan Hati no 69 ");
        employees.add(emp1);
        Employee emp2 = new Employee("01F0002", "Vania", " Jalan Kolong no 1B ");
        employees.add(emp2);
        Employee emp3 = new Employee("01M0003", "Samuel", " Jalan Jomblo no 0 ");
        employees.add(emp3);
        Employee emp4 = new Employee("01M0004", "Kepin", " Jalan Sekip 20 ");
        employees.add(emp4);
        Employee emp5 = new Employee("01F0005", "Kaori", " Jalan Cicak no 01 ");
        employees.add(emp5);
        Employee emp6 = new Employee("01M0006", "Ace", " Jalan Donat no 30 ");
        employees.add(emp6);
        Employee emp7 = new Employee("01M0007", "Justin", " Jalan Kodok no 44 ");
        employees.add(emp7);
        Employee emp8 = new Employee("01F0008", "Shinobu", " Jalan Mayat no 9 ");
        employees.add(emp8);
        Employee emp9 = new Employee("01F0009", "Zakaria", " Jalan Kesedihan no 82 ");
        employees.add(emp9);
        Employee emp10 = new Employee("01M0010", "Nico", " Jalan Lombok no 55 ");
        employees.add(emp10);
        return employees;
    }
    public static ArrayList <Item> initItems(ArrayList <Item> item)
    { 
        Item itm1 = new Item("itm001", "Sapu", "Alat rumah tangga", 1000);
        item.add(itm1);
        Item itm2 = new Item("itm002", "Ember", "Alat rumah tangga", 2000);
        item.add(itm2);
        Item itm3 = new Item("itm003", "Mobil", "Kendaraan", 100);
        item.add(itm3);
        Item itm4 = new Item("itm004", "Truk", "Kendaraan", 50);
        item.add(itm4);
        Item itm5 = new Item("itm005", "Panadol", "Obat-obatan", 10000);
        item.add(itm5);
        Item itm6 = new Item("itm006", "TV", "Elektronik", 300);
        item.add(itm6);
        Item itm7 = new Item("itm007", "Pel", "Alat rumah tangga", 1000);
        item.add(itm7);
        Item itm8 = new Item("itm008", "Handphone", "Elektronik", 400);
        item.add(itm8);
        Item itm9 = new Item("itm009", "Piano", "Alat musik", 70);
        item.add(itm9);
        Item itm10 = new Item("itm010", "Gitar", "Alat musik", 100);
        item.add(itm10);
        return item;
    }
    public static ArrayList <Payment> initPayments(ArrayList <Payment> payment)
    {   
        Payment pmt1 = new Payment(101, 10000000, "Sapu", "00100S"); //
        payment.add(pmt1);
        Payment pmt2 = new Payment(202, 1000000, "Ember", "00200E");
        payment.add(pmt2);
        Payment pmt3 = new Payment(303, 500000, "Sapu", "00100");
        payment.add(pmt3);
        Payment pmt4 = new Payment(404, 2000000, "Ember", "00100");
        payment.add(pmt4);
        Payment pmt5 = new Payment(505, 10000000, "Sapu", "00100S");
        payment.add(pmt5);
        Payment pmt6 = new Payment(606, 1000000, "Ember", "00200E");
        payment.add(pmt6);
        Payment pmt7 = new Payment(707, 500000, "Sapu", "00100");
        payment.add(pmt7);
        Payment pmt8 = new Payment(808, 2000000, "Ember", "00100");
        payment.add(pmt8);
        Payment pmt9 = new Payment(909, 10000000, "Sapu", "00100S");
        payment.add(pmt9);
        Payment pmt10 = new Payment(10010, 1000000, "Ember", "00200E");
        payment.add(pmt10);
        return payment;
    }
    public static ArrayList <Receiving_Item> initReceiving_Items(ArrayList <Receiving_Item> receiving_Items)
    { 
        Receiving_Item rcv1 = new Receiving_Item("001", 100000, 15000, 1000000);
        receiving_Items.add(rcv1);
        Receiving_Item rcv2 = new Receiving_Item("002", 150000, 15000, 1000000);
        receiving_Items.add(rcv2);
        Receiving_Item rcv3 = new Receiving_Item("003", 10000, 250000000, 100);
        receiving_Items.add(rcv3);
        Receiving_Item rcv4 = new Receiving_Item("004", 10000, 15000, 50);
        receiving_Items.add(rcv4);
        Receiving_Item rcv5 = new Receiving_Item("005", 5000000, 15000, 10000);
        receiving_Items.add(rcv5);
        Receiving_Item rcv6 = new Receiving_Item("006", 10000, 15000, 300);
        receiving_Items.add(rcv6);
        Receiving_Item rcv7 = new Receiving_Item("007", 10000, 15000, 1000);
        receiving_Items.add(rcv7);
        Receiving_Item rcv8 = new Receiving_Item("008", 10000, 15000, 400);
        receiving_Items.add(rcv8);
        Receiving_Item rcv9 = new Receiving_Item("009", 70, 15000, 70);
        receiving_Items.add(rcv9);
        Receiving_Item rcv10 = new Receiving_Item("010", 1000, 1500000, 100);
        receiving_Items.add(rcv10);
        return receiving_Items;
    }
    public static ArrayList <Supplier> initSuppliers(ArrayList <Supplier> supplier)
    {
        Supplier spl1 = new Supplier (" SPL001 ", " ShadowLuar ", " Jalan Kuda 201 ", " 0819982030 ");
        supplier.add(spl1);
        Supplier spl2 = new Supplier(" SPL002 ", " Salted Egg ", " Jalan Tikus 23 ", "0816665332");
        supplier.add(spl2);
        Supplier spl3 = new Supplier (" SPL003 ", " Slenderman ", " Jalan Hantu 111 ", " 0812184261 ");
        supplier.add(spl3);
        Supplier spl4 = new Supplier (" SPL004 ", " Ayap ", " Jalan Harimau 45 ", " 0813123561 ");
        supplier.add(spl4);
        Supplier spl5 = new Supplier (" SPL005 ", " Minato ", " Jalan Pokemon 99 ", " 0811319657 ");
        supplier.add(spl5);
        Supplier spl6 = new Supplier (" SPL006 ", " Bayu ", " Jalan Wibu 1112 ", " 0819214004 ");
        supplier.add(spl6);
        Supplier spl7 = new Supplier (" SPL007 ", " Rexo ", " Jalan Kodok 6 ", " 0818215592 ");
        supplier.add(spl7);
        Supplier spl8 = new Supplier (" SPL008 ", " Kana ", " Jalan Jerapah 190 ", " 0812131268 ");
        supplier.add(spl8);
        Supplier spl9 = new Supplier (" SPL009 ", " Acai ", " Jalan Jones 75 ", " 0812112781 ");
        supplier.add(spl9);
        Supplier spl10 = new Supplier (" SPL0010 ", " Cap Cai ", " Jalan Kenyang 61 ", " 0812577829 ");
        supplier.add(spl10);
        return supplier;
    }    

    public static void main(String[] args) throws Exception 
    {
        ArrayList <Employee> employees = new ArrayList <Employee>();
        ArrayList <Receiving_Item> receiving_Items = new ArrayList <Receiving_Item>();
        ArrayList <Supplier> supplier = new ArrayList <Supplier>();
        ArrayList <Item> item = new ArrayList <Item>();
        ArrayList <Payment> payment = new ArrayList <Payment>();
    

        initEmployees(employees);
        initItems(item);
        initPayments(payment);
        initReceiving_Items(receiving_Items);
        initSuppliers(supplier);

        Scanner input = new Scanner(System.in);
        String yn="y";
        do{
            menu();
    
            int pilihan = 0;
            pilihan = input.nextInt();
    
            if(pilihan==1)
            {
                
                do{
                    menuPegawai();
    
                    int pilihanpgw = 0;
                    pilihan = input.nextInt();
    
                    if(pilihanpgw==1)//tambah data pegawai
                    {
                        String kode_pegawai;
                        String nama_pegawai;
                        String alamat;
    
                        System.out.print("Kode pegawai \t:\t");
                        kode_pegawai=input.next();
                        System.out.print("Nama pegawai \t:\t");
                        nama_pegawai=input.next();
                        System.out.print("alamat \t:\t");
                        alamat=input.next();
    
                        employees.add(new Employee(kode_pegawai, nama_pegawai, alamat));
                    }
    
                    else if(pilihan==2)//tampilkan data pegawai
                    {
                        cetakDataPegawai();
                    }
    
                    else if(pilihan==3)//hapus data pegawai
                    {
    
                    }
    
                    else if(pilihan==4)//keluar
                    {
                        menu();
                   }
    
                    else{
                        continue;
                    }
    
                    System.out.print("Apakah anda ingin kembali ke menu utama (y/n): ");
                    yn=input.next();
    
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
    
                }while(yn.equalsIgnoreCase("y"));
                
            }
    
            else if(pilihan==2)
            {
                String yn ="y";
                do{
                    menuPenerimaan();
    
                    int pilihan = 0;
                    pilihan = input.nextInt();
    
                    if(pilihan==1)//tambah data penerimaan
                    {
                        String kode_receiving;
                        Supplier supplier;
                        date Tanggal;
                        String pembayaran;
                        Employee penerima;
    
                        System.out.print("Kode penerimaan \t:\t");
                        kode_receiving=input.next();
                        System.out.print("Nama supplier \t:\t");
                        supplier =input.next();
                        System.out.print("Tanggal \t:\t");
                        Tanggal =input.next();
                        System.out.print("pembayaran \t:\t");
                        pembayaran=input.next();
                        System.out.print("penerima \t:\t");
                        penerima=input.next();
    
                        receiving.add(new Receiving(kode_receiving, supplier, Tanggal, pembayaran, penerima));
                    }
    
                    else if(pilihan==2)//tampilkan data penerimaan
                    {
                        cetakBuktiTerimaBarang();
                    }
    
                    else if(pilihan==3)//hapus data penerimaan
                    {
    
                    }
    
                    else if(pilihan==4)//histori penerimaan
                    {
                        
                    }
    
                    else if(pilihan==5)//keluar
                    {
                        menu();
                    }
    
                    else{
                        continue;
                    }
    
                    System.out.print("Apakah anda ingin kembali ke menu utama (y/n): ");
                    yn=input.next();
    
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
    
                }while(yn.equalsIgnoreCase("y"));
                
            }
    
            else if(pilihan==3)//barang
            {
                String yn="y";
                do{
                    menuBarang();
    
                    int pilihan = 0;
                    pilihan = input.nextInt();
    
                    if(pilihan==1)//tambah data barang
                    {
                        String kode_item;
                        String nama_item;
                        String kategori;
                        int stock;
    
                        System.out.print("Kode barang \t:\t");
                        kode_item=input.next();
                        System.out.print("Nama barang \t:\t");
                        nama_item =input.next();
                        System.out.print("kategori barang \t:\t");
                        kategori=input.next();
                        System.out.print("penerima \t:\t");
                        stock=input.nextInt();
    
                        item.add(new Item(kode_item, nama_item, kategori, stock));
                    }
    
                    else if(pilihan==2)//tampilkan data barang
                    {
                        cetakDataBarang();
                    }
    
                    else if(pilihan==3)//hapus data barang
                    {
    
                    }
    
                    else if(pilihan==4)//histori barang
                    {
                        
                    }
    
                    else if(pilihan==5)//keluar
                    {
                        menu();
                    }
    
                    else{
                        continue;
                    }
    
                    System.out.print("Apakah anda ingin kembali ke menu utama (y/n): ");
                    yn=input.next();
    
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
    
                }while(yn.equalsIgnoreCase("y"));
            }
    
            else if(pilihan==4)//barang yang diterima
            {
                String yn="y";
                do{
                    menuBarangyangDiterima();
    
                    int pilihan = 0;
                    pilihan = input.nextInt();
    
                    if(pilihan==1)//barang yang diterima
                    {
                        String kode_receiving_item;
                        item barang;
                        int kuantiti_terima;
                        long harga_satuan; 
                        long total;
    
                        System.out.print("Kode barang yang diterima \t:\t");
                        kode_receiving_item=input.next();
                        System.out.print("Nama barang \t:\t");
                        barang =input.next();
                        System.out.print("kuantiti barang yang diterima \t:\t");
                        kuantiti_terima=input.nextInt();
                        System.out.print("harga satuan dari barang yang diterima \t:\t");
                        harga_satuan=input.nextlong();
                        System.out.print("total \t:\t");
                        total=input.nextlong();
    
                        receiving_item.add(new Receiving_Item(kode_receiving_item, barang, kuantiti_terima, harga_satuan, total));
                    }
    
                    else if(pilihan==2)//tampilkan data barang yang diterima
                    {
                        cetakDataBarangyangDiterima();
                    }
    
                    else if(pilihan==3)//hapus data barang yang diterima
                    {
    
                    }
    
                    else if(pilihan==4)//histori barang yang diterima
                    {
                        
                    }
    
                    else if(pilihan==5)//keluar
                    {
                        menu();
                    }
    
                    else{
                        continue;
                    }
    
                    System.out.print("Apakah anda ingin kembali ke menu utama (y/n): ");
                    yn=input.next();
    
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
    
                }while(yn.equalsIgnoreCase("y"));
            }
    
            else if(pilihan==5)//supplier
            {
                String yn="y";
                do{
                    menuSupplier();
    
                    int pilihan = 0;
                    pilihan = input.nextInt();
    
                    if(pilihan==1)//tambah data supplier
                    {
                        String kode_supplier;
                        String nama;
                        String alamat;
                        String no_telp;
    
                        System.out.print("Kode supplier \t:\t");
                        kode_supplier=input.next();
                        System.out.print("Nama supplier \t:\t");
                        nama=input.next();
                        System.out.print("alamat supplier \t:\t");
                        alamat=input.next();
                        System.out.print("Nomor telepon \t:\t");
                        no_telp=input.next();
    
                        supplier.add(new Supplier(kode_supplier, nama, alamat, no_telp));
                    }
                    
    
                    else if(pilihan==2)//tampilkan data supplier
                    {
                        cetakDataSupplier();
                    }
    
                    else if(pilihan==3)//hapus data supplier
                    {
    
                    }
    
                    else if(pilihan==4)//keluar
                    {
                        menu();
                    }
    
                    else{
                        continue;
                    }
    
                    System.out.print("Apakah anda ingin kembali ke menu utama (y/n): ");
                    yn=input.next();
    
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
    
                }while(yn.equalsIgnoreCase("y"));
            }
    
            else if(pilihan==6)//pembayaran
            {
                String yn="y";
                do{
                    menuPembayaran();
    
                    int pilihan = 0;
                    pilihan = input.nextInt();
    
                    if(pilihan==1)//tambah data pembayaran
                    {
                        String kode_pembayaran;
                        long harga;
                        String item_name;
    
                        System.out.print("Kode pembayaran \t:\t");
                        kode_pembayaran=input.next();
                        System.out.print("harga barang \t:\t");
                        harga=input.nextLong();
                        System.out.print("nama barang \t:\t");
                        item_name=input.next();
    
                        payment.add(new Payment(kode_pembayaran, harga, item_name));
                    }
    
                    else if(pilihan==2)//tampilkan data pembayaran
                    {
                        cetakDataPembayaran();
                    }
    
                    else if(pilihan==3)//hapus data pembayaran
                    {
    
                    }
    
                    else if(pilihan==4)//histori pembayaran
                    {
                        
                    }
    
                    else if(pilihan==5)//keluar
                    {
                        menu();
                    }
    
                    else{
                        continue;
                    }
    
                    System.out.print("Apakah anda ingin kembali ke menu utama (y/n): ");
                    yn=input.next();
    
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
    
                }while(yn.equalsIgnoreCase("y"));
            }
    
            else if(pilihan==7)//keluar
            {
                break;
            }
    
            else{
                continue;
            }
    
            System.out.print("Apakah anda ingin kembali ke menu utama (y/n): ");
            yn=input.next();
    
            System.out.print("\033[H\033[2J");
            System.out.flush();
    
        }while(yn.equalsIgnoreCase("y"));
}
        







public static void menu(){
    System.out.println("Penerimaan Barang");
    System.out.println("1. Data pegawai");
    System.out.println("2. Data penerimaan");
    System.out.println("3. Data barang");
    System.out.println("4. Data barang yang diterima");
    System.out.println("5. Data supplier");
    System.out.println("6. Data pembayaran");
    System.out.println("7. Keluar");
    System.out.print("Masukkan Pilihan Anda: ");
}

public static void menuPegawai(){
    System.out.println("Data pegawai");
    System.out.println("1. tambah data pegawai");
    System.out.println("2. tampilkan data pegawai");
    System.out.println("3. hapus data pegawai");
    System.out.println("4. Keluar");
    System.out.print("Masukkan Pilihan Anda: ");
}

public static void menuPenerimaan(){
    System.out.println("Data penerimaan");
    System.out.println("1. tambah data penerimaan");
    System.out.println("2. tampilkan data penerimaan");
    System.out.println("3. hapus data histori penerimaan");
    System.out.println("4. histori penerimaan");
    System.out.println("5. Keluar");
    System.out.print("Masukkan Pilihan Anda: ");
}

public static void menuBarang(){
    System.out.println("Data barang");
    System.out.println("1. tambah data barang");
    System.out.println("2. tampilkan data barang");
    System.out.println("3. hapus data barang");
    System.out.println("4. histori pemasukan barang");
    System.out.println("5. Keluar");
    System.out.print("Masukkan Pilihan Anda: ");
}

public static void menuBarangyangDiterima(){
    System.out.println("Data barang yang diterima");
    System.out.println("1. tambah data barang yang diterima");
    System.out.println("2. tampilkan data barang yang diterima");
    System.out.println("3. hapus data barang yang diterima");
    System.out.println("4. histori pemasukan barang yang diterima");
    System.out.println("5. Keluar");
    System.out.print("Masukkan Pilihan Anda: ");
}

public static void menuSupplier(){
    System.out.println("Data supplier");
    System.out.println("1. tambah data supplier");
    System.out.println("2. tampilkan data supplier");
    System.out.println("3. hapus data supplier");
    System.out.println("4. Keluar");
    System.out.print("Masukkan Pilihan Anda: ");
}

public static void menuPembayaran(){
    System.out.println("Data pembayaran");
    System.out.println("1. tambah data pembayaran");
    System.out.println("2. tampilkan data pembayaran");
    System.out.println("3. hapus data pembayaran");
    System.out.println("4. histori pembayaran");
    System.out.println("5. Keluar");
    System.out.print("Masukkan Pilihan Anda: ");
}
}