public class TestKaryawan{
	public static void main(String[] args) {
	System.out.println("  ");
	System.out.println("Jabatan PM");
	Pm p = new Pm();
	p.setNama("Kriswantoro");
	p.setAlamat("Lelela");
	p.setGaji(90);
	System.out.println(" ");

	System.out.println("Jabatan Programmer");
	Program pr = new Program();
	pr.setNama("Rama Alfareza");
	p.setAlamat("Indramayu");
	p.setGaji(60);
	System.out.println(" ");

	System.out.println("Jabatan Desainer");
	Desain d = new Desain();
	d.setNama("Wuli Yuliyana");
	d.setAlamat("Karang Ampel");
	d.setGaji(50);
	}
}