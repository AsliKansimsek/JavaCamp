package intro;

public class Main {

	public static void main(String[] args) {
		
		//camelCase
		//Don't repeat yourself
		String internetSubeButonu = "İnternet Şubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.18;
		int vade = 36;
		boolean dustuMu = false;
		
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun < dolarDun) {
			System.out.println("Dolar düştü resmi");
		}
		else if(dolarBugun > dolarDun) {
			System.out.println("Dolar yükseldi resmi");
		}
		else {
			System.out.println("Dolar eşittir resmi");
		}
		
		String kredi1 ="Hızlı kredi";
		String kredi2 ="Mutlu emekli kredisi";
		String kredi3 ="Konut kredisi";
		String kredi4 ="Çiftçi kredisi";
		String kredi5 ="Msb kredisi";
		
		/*
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		*/
		
		//dizi,Array
		String[] krediler = 
			{
				"Hızlı kredi",
				"Mutlu emekli kredisi",
				"Konut kredisi",
				"Çiftçi kredisi",
				"Msb kredisi"
			};
		
		//foreach
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		for(int i =0;i<krediler.length;i++) { //start;şart;adım
			System.out.println(krediler[i]);
		}
		
		
		//integer veri tipinde atamalarda değer tipi tutulur
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1); //
		
		//array referans tiptir.
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] =100;
		System.out.println(sayilar1[0]); //100 olur
		
		//Stringler char arrayleri olmasına rağmen değer tip gibi çalışır.
		String sehir1 = "Ankara";
		String sehir2 = "İstanbul";
		sehir1 = sehir2;
		sehir2 = "İzmir";
		System.out.println(sehir1); //İstanbul olur.
	}

}
