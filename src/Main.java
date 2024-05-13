import javax.swing.*;
class Main{
    public static void main(String[] args) {
          String s1 = JOptionPane.showInputDialog("Lütfen Boyunuzu (metre cinsinden) Giriniz: ");
          String s2 = JOptionPane.showInputDialog("Lütfen Kilo Giriniz: ");
          Vücut x = new Vücut();
          x.boycuk = Double.parseDouble(s1);
          x.kilocuk = Double.parseDouble(s2);
          double sonuc = x.vücutHesapla();
          System.out.println("Vücut Kitle İndeksiniz: " + sonuc);
        

    }
}
