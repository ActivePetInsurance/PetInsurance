package com.servlet;

import com.dao.VeterinarianDao;
import com.model.Veterinarian;

public class insertVets {
	
	public static VeterinarianDao vd = new VeterinarianDao();
	
	public static void insertVeternarians() {
		Veterinarian v1 = new Veterinarian("Jonathan"	,"A",	"Abbott",	310000050,	"12/31/2019",	"9/6/2018",	true	,"Blacksburg",	24061);
		Veterinarian v2 = new Veterinarian("Adams",	"N", "Morton",	310000041,	"12/31/2019",	"8/16/2018", true ,	"Bluemont",	20135);
		Veterinarian v3 = new Veterinarian("Avril","U","Arendse",310000036,"12/31/2019","8/15/2018",true,"Blacksburg",24061);
		Veterinarian v4 = new Veterinarian("Athanasiadi","Iiektra",310000069,"12/31/2020","3/15/2019",true,"Blacksburg",24061);
		Veterinarian v5 = new Veterinarian("Orsolya","Balogh",310000090,"12/31/2020","8/23/2019",true,"Blacksburg",24060);
		Veterinarian v6 = new Veterinarian("Jennifer","G","Barrett",310000029,"12/31/2019","7/17/2018",true,"Leesburg",20176);
		Veterinarian v7 = new Veterinarian("Sarah","H","Barrett",310000019,"12/31/2019","7/9/2018",true,"Blacksburg",24061);
		Veterinarian v8 = new Veterinarian("Sabrina","L","Barry",310000040,"12/31/2019","8/15/2018",true,"Blacksburg",24060);
		Veterinarian v9 = new Veterinarian("Katie","M","Boes",310000065,"12/31/2020","1/10/2019",true,"Blacksburg",24061);
		Veterinarian v10 = new Veterinarian("Sophie","H","Bogers",310000042,"12/31/2019","8/16/2018",true,"Blacksburg",24061);
		
		Veterinarian v11 = new Veterinarian("Timothy","A","Bolton",310000005,"12/31/2019","6/22/2018",true,"Blacksburg",24061);
		Veterinarian v12= new Veterinarian("Michele","Borgarelli",310000003,"12/31/2019","6/22/2018",true,"Blacksburg",24061);
		Veterinarian v13= new Veterinarian("Meghan","E","Brookhart",310000018,"12/31/2019","7/9/2018",true,"Blacksburg",24061);
		Veterinarian v14 = new Veterinarian("Virginia","A","Buechner-Maxwell",310000038,"12/31/2019","8/15/2018",true,"Blacksburg",24061);
		Veterinarian v15 = new Veterinarian("Lauren","T","Burns",310000082,"12/31/2020","7/19/2019",true,"Blacksburg",24061);
		Veterinarian v16= new Veterinarian("Susan","V","Carr",310000063,"12/31/2019","11/2/2019",true,"Blacksburg",24061);
		Veterinarian v17= new Veterinarian("Francisco","R","Carvallo",310000092,"12/31/2020","9/10/2019",true,"Blacksburg",24061);
		Veterinarian v18= new Veterinarian("Julie","T","Cecere",310000002,"12/31/2019","6/22/2018",true,"Blacksburg",24061);
		Veterinarian v19= new Veterinarian("Thomas","E","Cecere",310000009,"12/31/2019","7/3/2018",true,"Blacksburg",24061);
		Veterinarian v20= new Veterinarian("Thomas","Chen",310000079,"12/31/2020","6/7/2019",true,"Blacksburg",24061);
		
		Veterinarian v21 = new Veterinarian("Undine","Christmann",310000072,"12/31/2020","5/3/2019",true,"Ewing",24248);
		Veterinarian v22 = new Veterinarian("Kemba","S","Clapp",310000020,"12/31/2019","7/9/2018",true,"Christiansburg",24073);
		Veterinarian v23 = new Veterinarian("John","F","Currin",310000017,"12/31/2019","7/9/2018",true,"Abingdon",24212);
		Veterinarian v24 = new Veterinarian("Linda","A","Dahlgren",310000048,"12/31/2019","8/21/2018",true,"Blacksburg",24061);
		Veterinarian v25 = new Veterinarian("Nickolaos","Davis",310000035,"12/31/2019","7/31/2018",true,"Blacksburg",24061);
		Veterinarian v26 = new Veterinarian("Kristin","B","Eden",310000016,"12/31/2019","7/9/2018",true,"Blacksburg",24060);
		Veterinarian v27 = new Veterinarian("Krista","E","Estell",310000043,"12/31/2019","8/16/2018",true,"Leesburg",20176);
		Veterinarian v28 = new Veterinarian("Ana Cristina","B","Figueiredo",310000071,"12/31/2020","4/22/2019",true,"Blacksburg",24061);
		Veterinarian v29 = new Veterinarian("Rebecca","A","Funk",310000032,"12/31/2019","7/25/2018",true,"Blacksburg",24061);
		Veterinarian v30 = new Veterinarian("David","C","Grant",310000011,"12/31/2019","7/3/2018",true,"Blacksburg",24061);
		
		Veterinarian v31 = new Veterinarian("Ashley","N","Hartley",310000061,"12/31/2019","10/5/2018",true,"Blacksburg",24061);
		Veterinarian v32 = new Veterinarian("Piedad","N","Henao-Guerrero",310000006,"12/31/2019","6/25/2018",true,"Blacksburg",24061);
		Veterinarian v33 = new Veterinarian("Ian","P","Herring",310000021,"12/31/2019","7/16/2018",true,"Blacksburg",24061);
		Veterinarian v34 = new Veterinarian("Karen","D","Inzana",310000004,"12/31/2019","6/22/2018",true,"Blacksburg",2406);
		Veterinarian v35 = new Veterinarian("Shawna","L","Klahn",310000039,"12/31/2019","8/15/2018",true,"Blacksburg",24061);
		Veterinarian v36 = new Veterinarian("Kevin","K","Lahmers",310000015,"12/31/2019","7/9/2019",true,"Blacksburg",24061);
		Veterinarian v37 = new Veterinarian("Sunshine","M","Lahmers",310000026,"12/31/2019","7/16/2018",true,"Catawba",24070);
		Veterinarian v38 = new Veterinarian("Otto","I","Lanz",310000022,"12/31/2019","7/16/2018",true,"Blacksburg",24061);
		Veterinarian v39 = new Veterinarian("Elizabeth","S","MacDonald",310000008,"12/31/2019","7/3/2018",true,"Leesburg",20175);
		Veterinarian v40 = new Veterinarian("Brad","M","Matz",310000027,"12/31/2019","7/17/2018",true,"Blacksburg",24061);

		Veterinarian v41 = new Veterinarian("William","E","Monroe",310000033,"12/31/2018","7/25/2018",true,"Blacksburg",24061);
		Veterinarian v42 = new Veterinarian("Noelle","M","Muro",310000012,"12/31/2019","7/3/2018",true,"Blacksburg",24061);
		Veterinarian v43 = new Veterinarian("David","L","Panciera",310000051,"12/31/2019","9/6/2018",true,"Blacksburg",24060);
		Veterinarian v44 = new Veterinarian("Kevin","D","Pelzer",310000044,"12/31/2019","8/16/2018",true,"Blacksburg",24061);
		Veterinarian v45 = new Veterinarian("Jamie","M","Perkins",310000076,"12/31/2020","5/16/2019",true,"Rose Hill",24281);
		Veterinarian v46 = new Veterinarian("Rebecca","L","Pierce",310000075,"12/31/2020","5/16/2019",true,"Ewing",24248);
		Veterinarian v47 = new Veterinarian("Robert","S","Pleasant",310000014,"12/31/2019","7/9/2018",true,"Blacksburg",24060);
		Veterinarian v48 = new Veterinarian("Jerry","R","Roberson",310000086,"12/31/2020","8/2/2019",true,"Ewing",24248);
		Veterinarian v49 = new Veterinarian("Vitor Rodrigues","Gomes Mercadante",310000073,"12/31/2020","5/15/2019",true,"Blacksburg",24061);
		
		vd.insert(v1);
		vd.insert(v2);
		vd.insert(v3);
		vd.insert(v4);
		vd.insert(v5);
		vd.insert(v6);
		vd.insert(v7);
		vd.insert(v8);
		vd.insert(v9);
		vd.insert(v10);
		
		vd.insert(v11);
		vd.insert(v12);
		vd.insert(v13);
		vd.insert(v14);
		vd.insert(v15);
		vd.insert(v16);
		vd.insert(v17);
		vd.insert(v18);
		vd.insert(v19);
		vd.insert(v20);
		
		vd.insert(v20);
		vd.insert(v21);
		vd.insert(v22);
		vd.insert(v23);
		vd.insert(v24);
		vd.insert(v25);
		vd.insert(v26);
		vd.insert(v27);
		vd.insert(v28);
		vd.insert(v29);
		vd.insert(v30);
		
		vd.insert(v31);
		vd.insert(v32);
		vd.insert(v33);
		vd.insert(v34);
		vd.insert(v35);
		vd.insert(v36);
		vd.insert(v37);
		vd.insert(v38);
		vd.insert(v39);
		vd.insert(v40);
		
		vd.insert(v41);
		vd.insert(v42);
		vd.insert(v43);
		vd.insert(v44);
		vd.insert(v45);
		vd.insert(v46);
		vd.insert(v47);
		vd.insert(v48);
		vd.insert(v49);
		
		
		
	}


}
