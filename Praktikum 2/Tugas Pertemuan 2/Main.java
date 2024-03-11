public class Main {
    public static void main(String[] args) {
        BankAccount akunBank = new BankAccount();
        System.out.println("Saldo sebelum transaksi: " + akunBank.getBalance());
        System.out.println("Deposit sejumlah " + akunBank.deposit(500) + " Berhasil. Saldo saat ini " + akunBank.getBalance());
        System.out.println("Penarikan sejumlah " + akunBank.withdraw(200) + " Berhasil. Saldo saat ini " + akunBank.getBalance());
        System.err.println("Saldo setelah anda melakukan transaksi: " + akunBank.getBalance());
    }
}
