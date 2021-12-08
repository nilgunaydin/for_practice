package _10_List;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {
    @SuppressWarnings({ "serial", "unused" })
	public static void main(String[] args) {
    /*
     Array List genel Tanimi:

            ArrayList<Type> arrayListName = new ArrayList<Type>();
            List<Type> arrayListName = new ArrayList<>();

             1. Type : String, Integer, Double, Long, Byte, Short, Boolean, Object, .... seklinde olmalidir
                - ArrayList<int> hatali bir tanimlamadir. wrapper class dedigimiz object türünden olmalidir
                - primitivelerin wrapper classlari Büyük harflar baslayan isimleridir
                - int'n wrapper class'i        --> Integer'dir
                - double'un wrapper class'i    --> Double'dir. vs...

            2.  - Arrayler tanimlanirken sabit bir .length;'de tanimlanir ve bu length degistirilemez
                - ArrayList'ler tanimlamada .size(); belirmeme zorunlulugu yoktur degistirilebilir.
            3.  Intellij sonda bos biralikan <> yerine <~> seklinde ifade yazabilir bu ifade tanimdaki tür ile ayni anlamindadir.

    List declarations(tanýmlama) :
    Array den farki boyut esnekleðidir.Array'lerde length sabittir, degistirilemez. ArrayList'lerde (List) length esnektir.
          Siz eleman ekledikce List length'ini artirir, siz eleman sildikce List length'ini azaltir.


    key word: List<wrapper Class> name=

    List'e assaign etme(atama) :
    List'ler data type olarak primitive'leri kabul etmez. Primitive'lerde data type'ini non-primitive yapmak icin wrapper class'lari kullaniriz.
    List<wrapper Class> name = new List<>()      *****yanlýþþþþþþþ (<> :jenerik wrapper Class dan parametre alýr.)
    List<wrapper Class> name = new ArrayList<>() *****doðru
    List<wrapper Class> name = new ArrayList<Wrapper Class>() *****doðru
    ArrayList<wrapper Class> name = new ArrayList<>()  *****yanlýþþþþþþþ

    List'e ilk deðer atama (initialize):....
    1.yol : asList();
    ArrayList<Integer> sayý= new ArrayList<>(Arrays.asList(1,2,3)) demek 1,2,3 elemanlarini array olarak al demektir.
    2.yol : Listof();
    ArrayList<String> ulkeler= new ArrayList<String>( List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya") );

    ArrayList ler array'lerin aksine direkt olarak ekrana yazdirilabilirler-->  print için:  System.out.println(name);
    Array'ler Arrayy.toString(arrayAdi); ile yazdirilabilir.


    Collections ==> Bir araya getirilmis parcalar anlamýna gelir. ArrayList, Set, Map ler java collections sýnýfý nesneleridir.

 */
        System.out.println("******** List tanýmlama ilk dðer atama(initialize)*********");
        //1. yol :
        List<Integer> listSayilar = new ArrayList<>();
        listSayilar.add(1);
        listSayilar.add(23);
        listSayilar.add(35);
        listSayilar.add(17);

        //2.yol :
        List<String> listIsimler = new ArrayList<>(Arrays.asList("Reha", "hakan", "haluk", "ahsen", "ZEHRA", "CEMAL"));// daha pratik

        //3. yol :
        ArrayList<String> listUlkeler = new ArrayList<>(List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya"));

        System.out.println("listIsimler : " + listIsimler);
        System.out.println("listSayilar :" + listSayilar);
        System.out.println("listUlkeler : " + listUlkeler + "\n");

        System.out.println("******** List'e eleman ekleme : add() *********");

        //List e eleman ekleme metodu: name.add(eleman);ekleme yapýlan eleman list in sürekli sonuna eklenir. list elemanlarýnda tekrar olabir.

        listSayilar.add(-123);
        System.out.println(listSayilar);
        //index (yer) belirterek eleman ekleme :name.add(index,eleman);
        listSayilar.add(2, 33);// git þuraya ÞU elemaný koy: 2. index e 33 koy.2. index ten sonrakilerin sýrasý bir ilerledi.
        System.out.println("2. index'e 33 eklendi " + listSayilar + "\n");

        System.out.println("******** Özel bir metod:Collections nCopies kullanimi... *********");
        // Özel bir metod:Collections nCopies kullanimi...
        // nCopies(int n, Object o);  n elemanli nums arrayi olusturur ve hepsini o ile doldurur
        // Collection.fill(List, o); ise tanimlanmis ve deger atanmis arrayList'in tüm elemanlarini o ile doldurur
        ArrayList<Integer> nums = new ArrayList<>(Collections.nCopies(10, 5));
        System.out.println("nums : 10 tane 5 den oluþan arrayList :" + nums + "\n");//[5,5,5,5,5,5,5,5,5,5] 10 tane 5 den oluþan arrayList

        System.out.println("******** Özel bir metod: addAll(Collection C) *********");/*
            addAll(Collection C)
            # ArrayList'e verilen C yi (ArrayList ya da Collections'un diger arrayleri (daha sonra görülecek)) sona ekler

            addAll(int index, Collection C)
            # ArrayList'e verilen C yi (ArrayList ya da Collections'un diger arrayleri)  belirtilen indexten itibaren ekler
            # arrayin kalan elemanlarini kaydirir
         */

        // ArrayList listRakam tanimlanip, initialize ediliyor. Arrays.asList() ile
        ArrayList<Integer> listRakam = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        // ArrayList listIkiBasamakli tanimlanip, initialize ediliyor. Arrays.asList() ile
        ArrayList<Integer> listIkiBasamakli = new ArrayList<>(List.of(10, 20, 30, 40, 50));

        // ArrayList listRakam2 tanimlanip, initializer icinde initialize ediliyor
        ArrayList<Integer> listRakam2 = new ArrayList<>() {
            {
                for (int i = 0; i < 10; i++) {
                    add(i);
                }
            }
        };

        // listRakam yazdirliliyor
        System.out.println("listRakam : " + listRakam);

        // listIkiBasamakli elemanlari listRakam'e ekleniyor
        listRakam.addAll(listIkiBasamakli);

        // ArrayList ekrana yazdiriliyor
        System.out.println("listIkiBasamakli'nin sona eklenmis hali");
        System.out.println("listRakam ListIkiBasamaklý eklenmiþ hali : " + listRakam);


        // listIkiBasamakli elemanlari listRakam'e 3. index ten sonra ekleniyor.
        listRakam.addAll(3, listIkiBasamakli);

        // ArrayList ekrana yazdiriliyor
        System.out.println("listIkiBasamakli'nýn 3.indexten itibaren listRakam'a eklenmis hali" + listRakam + "\n");

        System.out.println("******** List'in içinden istenen index'teki elemaný alma : get() *********");
        listIsimler.get(2);//listIsimler içinde 2. index teki eleman haluk alýndý.
        System.out.println("listIsimler'den 2. index teki eleman haluk alýndý : " + listIsimler.get(2) + "\n");

        System.out.println("******** List'in boyutunu bulma : size() *********");
        //List in boyutu: size: name.size();--> listedeki  eleman sayýsýný verir.
        System.out.println("listSayilar'in eleman sayýsý : " + listSayilar.size() + "\n");// 6

        System.out.println("******** List'in istenen elemanýný silme : remove() *********");

        //List  ten istenen bir elemaný silme : name.remove();--> þu elemaný sil kaldýr.
        listSayilar.remove(3);//3. index teki elemaný sil
        listIsimler.remove("haluk");//isimler list inden haluk sil
        System.out.println("listSayilar 3. index teki elemaný silindi : " + listSayilar);
        System.out.println(listSayilar.remove("-123"));// false:
        System.out.println(listIsimler);
        System.out.println(listIsimler.remove("haluk"));//false


        //tekrarlý eleman varsa ilk index dekini siler...
        listIsimler.add("Reha");
        System.out.println("listIsimler'in sonuna Reha eklanmiþ hali : " + listIsimler);//sona Reha eklenmiþ hali
        listIsimler.remove("Reha");
        System.out.println("listIsimler'de bulduðu ilk reha'yý silindi : " + listIsimler);//bulduðu ilk Reha yý silmiþ hali.

        //olmayan elemaný silmek için eror vermez...kod çalýþýr....
        listIsimler.remove("haluk");//haluk varsa siler yoksa hata vermeden kod devam eder.
        System.out.println(listIsimler.remove("haluk"));// isimler obj haluk kaldýrmaya gider olmayan elemandan dolayý false verir.
        System.out.println(listIsimler + "\n");

        System.out.println("******** List'te herhangi bir elemanýn index(yerini) bulma : indexOf() *********");
        System.out.println("indexOf ZEHRA sonrasý :" + listIsimler.indexOf("ZEHRA"));//3 -->ZEHRA 3. index te
        System.out.println("indexOf haluk sonrasý :" + listIsimler.indexOf("haluk"));//-1 -->haluk isimler list inde olmadýðý için.olmayan elemanýn index i sorguladýðýnda error vermez run:-1 verir

        Collections.sort(listSayilar);   //list elemanlarýný sýraladýk
        System.out.println("listSayilar'da 48'in indexOf sonrasý :" + listSayilar.indexOf(48) + "\n");//list içinde 48 elemanýnýn index i soruldu 48 elemsný listte olmadýðý için -1 verdi

        System.out.println("******** List'te herhangi bir elemanýn son bulma index(yerini) bulma : lastIndexOf() *********");
        // lastIndexOf(Object O):Belirtilen elemanin son bulunma index'ini verir, eleman yoksa -1 döner.
        ArrayList<Integer> tekrarlilist = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 2, 7, 8, 9));
        System.out.println("2 elemanýnýn listede son bulunduðu yerin index'i :" + tekrarlilist.lastIndexOf(2) + "\n");//5 : 2 den ikincisinin yani sonuncusunun baþtan index'i


        System.out.println("******** list teki istenen hehangi bir  elemaný update etme :set() *********");


        //list teki istenen hehabgi bir  elemaný update (set) etme: name.set(index,eleman);--> þu index deki elemaný þu eleman ile deðiþtir.
        listIsimler.set(0, "ahmet");
        System.out.println("listIsimler'de 0. inex' ahmet set edildi : " + listIsimler + "\n");
        //listIsimler.set(0,"ahmet",1,"ali");-->list te çoklu set metodu çalýþmaz.buz gibi ÝNTERVÝEW sorusu....

        System.out.println("******** list teki istenen hehangi bir parçasýný alma :subList(int fromIndex, int toIndex) *********");
        /*
            subList(int fromIndex, int toIndex)
            Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.

         */
        // ArrayList list tanimlanip, initialize ediliyor. Arrays.toList() ile
        ArrayList<Integer> listParcasi = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        System.out.println(listParcasi);

        // list.subList(2,5); 2. index dahil, 5. index haric
        System.out.println("2. index dahil, 5. index haric parcasý alýndu : " + listParcasi.subList(2, 5));//2. 3. 4. elemaný alýr. 5 . eleman alýnmaz

        // yeni bir yeniList arrayList'i list.subList() ile de tanimlanabilir
        ArrayList<Integer> yeniList = new ArrayList<>(listParcasi.subList(4, 8));

        System.out.println("list.subList(4,8) ile yeniList tanimlandi : " + yeniList + "\n");


        System.out.println("******** list'in boþ dolu olduðunu öðreneme : isEmpty() *********");
        //list in boþ-dolu sorgusu: isEmpty :name.isempty(); --> name listi boþ mu deðil mi? true-false verir.
        System.out.println(listIsimler.isEmpty() + "\n");//false


        System.out.println("******** List te istenen eleman var mý yok mu?öðrenme : contains() *********");

        // List'te istenen eleman var mý yok mu?: contains: name.contains(eleman); -->true-false
        System.out.println("listIsimler'de ipek elamaný var mý? : " + listIsimler.contains("ipek") + "\n");//false ipek yok

        System.out.println("******** List'teki elemanlarý düzenli sýralama : Collections.sort() *********");

        // List  teki elemanlarý düzenli sýralama :String:alfabetik(Natural Order), int:küçükten büyüðe...Collections.sort(name);

        Collections.sort(listIsimler);//String sýrasý
        System.out.println("listIsimler'de harf sýrasý  : " + listIsimler);

        Collections.sort(listSayilar);//int sýrasý
        System.out.println("listSayilar'da küçükten büyüge elemanlarýn sýrasý : " + listSayilar + "\n");

        //***Önemli*** System.out.println( Collections.sort(list)); -->þeklinde metod print içinde çalýþmaz

        System.out.println("******** List'teki elemanlarý düzenli tersten sýralama : Collections.reverse() *********");
        Collections.reverse(listSayilar);
        System.out.println("listSayilar'daki elemanlarý düzenli tersten sýralamasý  = " + listSayilar + "\n");

        ArrayList<Integer> ipek = new ArrayList<>(Arrays.asList(45, 23, 67, -100, 1, 0));
        System.out.println("ilk hali: reverse olmadan : "+ipek);
        Collections.reverse(ipek);
        System.out.println("reverse hali : "+ipek);

        //****ÇOOOK ÖNEMLÝ Collections.reverse()--> methodu listteki elemanlarý index sýrasýna göre tersten sýralar.

        System.out.println("******** List'teki elemanlarý max min elemanýný bulma : Collections.max/min() *********");
        System.out.println("listSayilar deki en büyük sayý = " + Collections.max(listSayilar));
        System.out.println("listSayilar deki en küçük sayý = " + Collections.min(listSayilar) + "\n");

        System.out.println("******** List'teki belli bir deðerdeki elemanlara , baþka bir deðer atama : Collections.replaceAll() *********");
        // belli bir deðerdeki elemanlarý , baþka bir deðer atar
        Collections.replaceAll(listSayilar, 33, 9);
        System.out.println("listSayilar'da 33 deðerindeki elemanlara 9 deðeri atandý  = " + listSayilar + "\n");

        System.out.println("******** List'teki elemanlara ayný deðeri atama : Collections.fill() *********");
        Collections.fill(listSayilar, 8);
        System.out.println("listSayilar'a tüm elemanlara 8 atanadý = " + listSayilar + "\n");


        System.out.println("******** iki list'in eþitliðini bulma : equals() *********");
        //Equals :eþit mi deðil mi: name1.equals(name2);--> name1 name2 týpatýp ayný mý? list teki elemanlarýn hem index hem de içeriðini ayný olmalý

        List<String> name1 = new ArrayList<>(Arrays.asList("a", "b"));
        List<String> name2 = new ArrayList<>(Arrays.asList("b", "a"));
        List<String> name3 = new ArrayList<>(Arrays.asList("A", "b"));
        List<String> name4 = new ArrayList<>(Arrays.asList("A", "b"));
        System.out.println(name1.equals(name2));// name1  name2 ile týpatýp ayný? -->false
        System.out.println(name1.equals(name3));// name1  name3 ile týpatýp ayný? -->false
        System.out.println(name3.equals(name4) + "\n");// name3  name4 ile týpatýp ayný? -->true

        System.out.println("******** list'i Array'a çevirme : toArray() *********");

        //list'i Array'a çevirme : toArray();
        //1. Yontem: toArray() methodu'nun icinde parametre olarak new String[0] kullaniniz
        String arr[] = listIsimler.toArray(new String[0]);//arr adýnda String tipinde bir array tanýmladýk.isimlerden(List) toArray ile yeni String tipi obj deðerleri atadýk
        System.out.println("listIsimler'in array hali: "+Arrays.toString(arr));//[CEMAL, Reha, ZEHRA, ahmet, ahsen]


        //2. Yontem: Olusturdugunuz array'in data type'ini Object olarak secilir
        //Object class, Java'da butun class'larin parent'idir.Yani Object class ortak atadir.
        //Object class, Java'da parent'i olmayan tek class'dir.
        //String, Object class'in child'i oldugundan data type olarak bazi durumlarda
        //String yerine Object kullaniriz.
        Object arr1[] = listSayilar.toArray();
        System.out.println("listSayilar'ýn  array hali: "+Arrays.toString(arr1)+"\n");

        System.out.println("******** Array'i list'e çevirme : Arrays.asList(arrName) *********");

        //asList() methodu array'leri list'e cevirmek icin kullanilir.
        //asList() methodu parametre olarak array'in ismini kabul eder.

        String arr2[] = {"Aliye", "Canan"};

        List<String> list1 = Arrays.asList(arr2);
        System.out.println(list1);//[Aliye, Canan]


        //Çook önemli....
        // Array'den list'e cevirme yaptiginizda, elde ettiginiz list uzunluk olarak
        //esnek degildir.Yani array'den olusturdugunuz list'e ekleme ve cikarma yapamazsiniz.
        //list1.add("Emine");//add() yapamazsiniz.Run Time Error verir."UnsupportedOperationException"


        System.out.println(Arrays.toString(arr1) + "\n");

        System.out.println("******** list'i  boþaltma silme : clear() *********");
        //List i boþaltma silme : name.clear();
        listIsimler.clear();// isimler list ini boþalt. temizle, elemanlarýný sil.
        System.out.println(listIsimler);// [] boþ list verdi.
    }

}