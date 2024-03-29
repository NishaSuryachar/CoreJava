package is_A_relationship;

public class WhatsappDriver {

	public static void main(String[] args)
	{
		Whatsapp w=new Whatsapp();
		w.send();
		System.out.println();
		Whatsapp2 w2=new Whatsapp2();
		w2.send();
		w2.audio();
		System.out.println();
		Whatsapp3 w3=new Whatsapp3();
		w3.send();
		w3.audio();
		w3.video();
		System.out.println();
		Whatsapp4 w4=new Whatsapp4();
		w4.send();
		w4.audio();
		w4.video();
		w4.payment();
		System.out.println();
	}

}
