public class Pm extends Karyawan{
	public void setGaji(int gaji){
		if(gaji<=100){
			System.out.println("Selamat Gaji Anda Sekarang  = "+gaji);
		}else{
			System.out.println("Maaf Yaa :(");
		}
	}
}