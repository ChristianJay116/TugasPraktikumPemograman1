package Praktikum.Praktikum08.bin;

public class TestMobil{
public static void main (String[] args){
	Mobil mobil = new Mobil(){
public void injakPedalGas(){
	System.out.println("Mobil Berjalan...");
}
};
Kijang kijang = new Kijang();
BMW bmw = new BMW();
mobil.injakPedalGas();
mobil = kijang;
mobil.injakPedalGas();
mobil = bmw;
mobil.injakPedalGas();
}
}