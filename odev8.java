/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oyunt
 */
import java.util.Scanner;
public class odev8 {
 

        public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Duvarda kanla yazılmış I LOVE YOU NANCY yazısını görüyosunuz ve İncelemeye başlamadan"
        +" önce olay yerine ulaşan ilk polisin şaşkınlıkla ve \n"
        + " panikle cesedi biraz oynattığını ve pek çok yerde olası delilleri bozduğunu öğreniyor"
        + " ve çok sinirleniyorsun. Ancak sakinleşip, ekibine bir görev dağılımı yapıyorsun. Olası \n"
        + "katile dair en belirgin iz için hangi göreve odaklanırsın?");
        System.out.println(
        "1/'Nancy'nin kim ve kurbanla bağlantısının ne olduğunu araştırmak?"+
        "2/Kurbanın tırnak aralarından örnek almak.\n"+
        "3/Duvardaki yazıda parmak izi incelemesi yapmak."+
        "4/Yerdeki kanların şeklinden ve kurbanın pozisyonundan olayın nasıl geliştiğini tespit etmek.\n"+
        "5/Cesedi otopsi için laborotuvara götürmek.");
        int sc = input.nextInt();
        if (sc==1) {
        System.out.println("Zaman Kaybettin!");         
        }
        else if (sc==2) {
        System.out.println("Doğru hamle! Elbette cevaplardaki bütün görevler araştırma açısından birbirinden\n"
        + " önemliydi ve hepsini tek tek yaptırdın ancak ilk olarak kurbanın tırnak içlerinden örnek aldırdın çünkü maktül\n"
        + " katiliyle mücadele etmişti ve tırnak içlerinde katile ait bir doku örneği olabilirdi.");
        System.out.println("Pazartesi,salı,çarşamba bu 3 gün,kadının yalan söyleme günü.\n"
        + "Perşembe,cuma,cumartesi bu 3 gün de erkeğin yalan söyleme günü\n"
        +"pazar günü ise her ikisinin doğruyu söyleme günü Soru şu ; Erkek ben 'dün yalan söyledim'dediğinde\n "
        + "kadın,'ben de'diye cevap veriyor bugün hangi gündür");
        System.out.println("1/pazartesi"
        + "2/salı"
        + "3/çarşamba"
        + "4/perşembe"
        + "5/cuma"
        + "6/cumartesi"
        + "7/pazar");
         int sc2 = input.nextInt();
        if (sc2==4){
        System.out.println("Ama ne yazık buradan ve diğer araştırmalardan hiçbir sonuç çıkmadı katil oldukça titiz bir şekilde çalışmış ve adeta arkasında iz bırakmamıştı. \nTek gelişme; yerdeki bir kol saatinin üzerinden çıkan parmak iziydi ve bam! Parmak izi, doktorun iş arkadaşı Nancy Miller'a aitti.\n"
        + " Derhal Nancy'i sorgulamak için getirttiniz kadın, doktorun sevgilisiydi ancak bir konferans için üç gündür şehir dışındaydı ve şehre sadece bir saat önce gelmişti.\n Saat ise doktorun değildi. Bu garipliği çözmeye çalışırken birden gizemli bir adresten e-posta aldın.\n E-postada şunlar yazıyordu;" +
        "Merhaba dedektif!Sana bir süprizim var! Araştırman gereken tek cinayet doktorun değil.\n Sana şehrin farklı yerlerinde 5 kişinin daha cesedini bıraktım.\n Kim olduğumu merak ediyorsan seninle oynamak istediğim oyuna eşlik etmelisin.\n Sana çeşitli sorular soracağım ve her doğru cevabında sana, bir sonraki kurbanın yerini söyleyeceğim.\n"
        + " Cevabını bu mail adresine gönder ve benden haber bekle.\n "+"Bravo! Elbette cevabı göndermeden önce hemen mail adresinin izini sürmeye çalıştın ancak katil burda da izini saklıyordu ve adres takip edilemiyordu.\n Sen de cevabı gönderdin; bir adres ve 'Hakkımda tek bir delil bulamayacaksın.' yazılı mail aldın.\n"
        +"Beyaz adında bir heykeltıraş,Siyah adında bir müzisyen ve Kırmızı adında bir ressam kahvede buluşuyorlar.\nİçlerinden birisi'Benim saçım siyah,birimizinki kırmızı,diğerinizinki de beyaz, ama hiçbirimizin adıyla saç rengi tutmuyor'der.\nBeyaz'Çok haklısın'diye yanıtlar'ressamın saç rengi nedir'");
        System.out.println("1/kırmızı"
        + "2/beyaz"
        + "3/siyah");
        int sc3 = input.nextInt(); 
        if (sc3==1){
        System.out.println("bilemediniz");
        }
        else if (sc3==3){
        System.out.println("Verilen adrese gittiğinizde; terk edilmiş bir evde aynı korkunç manzara içerisinde ve yine benzer şekilde öldürülmüş doktorun hastahanesinde çalışan hasta bakıcı,\n William Green'in cesedini buldunuz. Akıl oyunlarını seven, kibirli ve bu hastahanedeki insanları hedef alan bir seri katille karşı karşıyaydınız.\n "
        + "Her şeyi, her yeri büyük bir ayrıntı ile incelediniz ve hiçbir sonuç çıkmadı ve derken beklenen mail geldi;\n" +
        "İlk hediyemi aldın dedektif!Boşuna etrafı arayarak zaman kaybetme bir şey bulamayacaksınız.\n "
        + "Neyse siz beceriksizliğe devam edin"+"Eski bir fabrikada bulduğunuz sıradaki kurban, hastahanenin baş hemşiresi Claire Davis'ti. \nOlay mahali ve ölüm şekli diğer kurbanlar  ile aynıydı ve yine \n"
        + "katile dair hiçbir ip ucu yoktu. O sırada kurbanın hemen yanı başında duran kilitli kasayı fark ettin ve\n bir önceki soruda bulduğun şifreyi girerek açtın. Kasayı içerisinden üzerine D.W. harfleri işlenmiş eski bir hasta önlüğü çıktı. \n"
        + "Derhal incelemeye aldınız ancak harfler dışında önlüğün üzerinde hiçbir iz yoktu. Bu sırada beklenen e-posta geldi;\n" +
        "Fena gitmiyorsun dedektif!Kasaya senin için bıraktığım şey benim için oldukça değerli, kıymetini bil! "+"Sıradaki kurban ise hastahenin eski güvenlik görevlisi Billy Martin'di. \nOlay mahali eski bir depoydu ve ayrıntılar diğerleri ile aynıydı\n" +
        "Ancak bu defa adamlarından biri, bahçedeki tellere takılıp yırtılmış bir t-shirt parçası buldu.\n Analiz için ilk olay yerinde Nancy'nin parmak izini bulan adamınla ve onu koruması için doktoru ilk bulan polis memurunu  merkeze gönderdin.\n Katil, yüksek bir ihtimalle doktoru öldürmeden"
        + " önce diğer 5 kişiyi kaçırmış ve sırayla öldürmüştü.\n Adamlarına, kayıp ya da haber alınamayan hastahane çalışanlarını tespit etmek ve daha önce hastahanede yatmış, isminin baş harfleri D.W.\n  olan bütün hastaların isimlerini bulmasını emrettin. Tüm bunlar olurken bir e- posta daha geldi;\n"+
         "Zekan fena değil dedektif ama emin ol o kumaş parçasından da bir şey çıkmayacak!\n"+"Ancak bu defaki kurban dengeleri oldukça değiştirdi çünkü hastahane ile ilgisi olmayan eski bir polisti! Ölüm şekli ise diğerleri ile aynıydı.\n Bu sırada kumaş parçasını laboratuvara gönderdiğin adamın Nathan ve polis memuru Danny'nin yolda kaza yaptığı haberini aldın.\n İkisi de iyiydi ancak delil zarar görmüştü."
        + " Bu kesinlikle katilin işiydi! Hem seni izleyebiliyor hem de adımlarınızı takip ediyordu.\n Çevrenden iyice şüphelenmeye başladığın için maktülü tek başına incelemeye karar verdin ve bir adet koyu renkli bir saç teli buldun. \nTek başına incelemek için laboratuvara doğru yola çıktığın sırada e-posta geldi;\n" +
        "Sana o kumaş parçasından bir şey çıkmayacağını söylemiştim:)"+"Son kurbanı bulmak için sıradaki soruyu da cevaplamalısın ancak bu defa yanıt verip,\n olay yerine gitmek için sadece 30 dakikan var! Soru işaretli yere ne gelmeli?");
        }
        System.out.println("1+4=5/2+5=12/3+6=21/8+11=?");
        System.out.println("1/96"
        + "2/40"
        + "3/32"
        + "4/52");
        int sc4 = input.nextInt(); 
        if (sc4==1){
        System.out.println("Zamanın çok az olduğu için saç telini inceleyemeden olay yerine gittin. \nHerkes olay yerine giderken ekibinden Brayn, bir kaç gün önce merdivenlerden düştüğünü ve ağrıları arttığı için eve gitmek istediğini söyledi.\n Bu duruma biraz kızsan da ona izin verdin. Adresle birlikte gelen mesaj ise oldukça şaşırtıcıydı;' Adaletimi kendim sağladım ve sadece tek bir adım kaldı\n!");
        System.out.println("Bu defaki kurban boş bir araziye atılmıştı ve diğerlerinden farklı olarak feci şekilde dövülerek öldürmüştü.\n Üstelik bir kaç suçtan sabıkası olan Vincent King adlı bir adamdı. Son iki kurbanın hastahane ile bağlantısının olmaması oldukça düşündürücüydü.\n Üstelik adamların yaptığı incelemede hastahaneden başka kimsenin kayıp olmadığını öğrenmişti, bu insanların farklı bir ortak noktaları olmalıydı.\n Bu düşünceler içerisinde inceleme yaparken yerde kısmi bir ayak izi buldun ancak net bir sonuç için yeterli değil gibiydi.\n Son kurbanı da bulduğunuza göre bütün delilleri baştan incelemeliydiniz. O sırada çok edici bir e-posta daha aldın.\n" +
        "Sana son bir sürprizim daha var; ailen benim elimde!\n" +
        "Onları bir yere kapattım ve kurduğum düzenekle uzaktan da olsa patlatmaya hazırım.\n 5 yıllık intikamımın en önemli parçası sensin. Eğer bu soruya da doğru cevap verirsen sana yardımcı olmak için bir şüpheli listesi göndereceğim, \nacelet et ve soruyu cevapla! Zamanın çok az olduğu için saç telini inceleyemeden olay yerine gittin.\n Herkes olay yerine giderken ekibinden Brayn, bir kaç gün önce merdivenlerden düştüğünü ve ağrıları arttığı için eve gitmek istediğini söyledi.\n Bu duruma biraz kızsan da ona izin verdin. Adresle birlikte gelen mesaj ise oldukça şaşırtıcıydı;'\n Adaletimi kendim sağladım ve sadece tek bir adım kaldı!");
        System.out.println("Adam postacıya sordu:'Üç kızınız olduğunu duydum,kaç yaşlarındalar?\n'"
        + "Postacı:Yaşları çarpımı 36 eder."
        + "Adam:Bundan pek bir şey anlamadım"
        + "Postacı:Üçünün yaşları toplamı sizin evinizin numarsı"
        + "Adam:Hala bir şey anlamıyorum"
        + "Postacı:En büyük kızım piyona çalar"
        + "Adam:Şimdi anladım.Kızların yaşları kaçtır");
        System.out.println("1/2,3,6"
        + "2/1,3,12"
        + "3/1,1,36"
        + "4/1,6,6"
        + "5/3,3,4"
        + "6/1,4,9"
        + "7/2,2,9");
        int sc5 = input.nextInt(); 
        if (sc5==7){
        System.out.println(" Harikasın! Bu oldukça zor soruyu de çözdün ve tam tahmin ettiğin gibi katil sana etrafındaki 4 insanın ismini verdi.\n Mail de bir de şunlar yazıyordu; bu 4 kişiden sadece birini tutuklamalısın dedektif! Aksi takdirde veya yanlış kişiyi yakalarsan aileni büyük bir zevkle patlatacağım.\n Umarım bu kez işini doğru yaparsın!"+"Sen de bütün delillerin ve olayların tekrar üzerinden geçtin, kurbanların bağlantısını çözemeye çalıştın...\n Katil kesinlikle etrafından biri olmalıydı çünkü her hareketini izliyor gibi mesajlar göndermişti\n "
        + "ayrıca seninle de bir derdi olmalıydı. Acele etmeliydin çünkü şüphelileri elinde tutsan da tek tek araştırma\n yapacak vaktin yoktu tüm ailen her an yok olabilirdi ve yerlerini sadece bir kişi biliyordu.\n"
        + " O yüzden katili hemen bulup, konuşturmalıydın!\n" +
        "Topladığın bilgilerle şüpheliler hakkında notlar çıkardın ve dördünü de merkeze getirttin.\n");
        System.out.println("1/Danny Smith: İlk olay yerindeki polis memuru:- Doktorun öldürüldüğü yere gelen ilk polisti ve olası kanıtlara zarar vermişti ancak bunun yanlışlıkla olduğunu söylüyordu. \n" +
        "- Bulunan t-shirt parçasını incelemeye götürürken kaza yapan iki kişiden biriydi.\n" +
        "- Her olayda size eşlik eden polis ekibinin içerisindeydi.\n" +
        "- 5 yıldır polislik yapıyor.\n" +
        "- Doktor Evans'ın katili ile mücadele ettiğini biliyordun ve yüksek ihtimalle ölmeden önce ona sert bir yumruk atmıştı. Danny Smith'in de karın bölgesinde bir morluk vardı ancak arkadaşları ile maç yaparken olduğunu iddia ediyordu.\n");}
        System.out.println("2/ Brayn Potter: İzin isteyen adamın:- Son kurban hariç diğer tüm olay mahallerinde inceleme yapmış ve hiçbir delil bulamamıştı.\n" +
        "- Ancak t-shirt parçasını bulan oydu.\n" +
        "- Dördüncü kurbanı bulduktan sonra kötü hissettiğini söyleyerek eve gitmişti.\n" +
        "- 5 yıldır olay yeri inceleme ekibinde yer alıyor.\n" +
        "- Vücudundaki morlukların merdivenden düştüğü için olduğunu söylüyordu\n");
         System.out.println("3/Nathan Wilson; Parmak izi ve dna analizi yapan adamın:- İlk olay yerinde Nancy'nin parmak izini bulan kişiydi\n" +
        "- Bulunan t-shirt parçasını laboratuvara götürürken polis memuru ile birlikte kaza yapan diğer kişiydi ve arabayı o kullanıyordu\n" +
        "- Kazadan sonra işine geri dönmek istediğini söylemişti ancak dinlenmesi için zorla eve göndermiştin.\n" +
        "- 3 yıldır ola yeri inceleme ekibinde çalışıyor.\n" +
        "- Göğsünde bir morluk vardı ancak nasıl olduğunu hatırlamadığını belki kaza sırasında olmuş olabileceğini söylüyordu\n");
         System.out.println("4/ Nancy Miller: Doktor:- Doktor Evans'ın sevgilisiydi\n" +
        "- Olay yerinde bulunan saatin üzerinde parmak izi bulunmuştu ancak 3 gündür şehir dışında bir konferansta olduğunu iddia ediyordu.\n" +
        "- Araştırma yaptığınızda şehir dışına çıktığını ancak konferansa katılmadığını öğrendiniz \n" +
        "- 6 yıldır doktorluk yapıyor." +
        "- Bir süredir doktordan ayrılmak istiyordu ve başka biri ile ilişkisi vardı.\n");
        System.out.println("Hangisi?");
        int sc6 = input.nextInt();
        if (sc6==4){
        System.out.println("Katil, en başarılı elemanlarından biri olan Nathan Wilson'dı\n" +
        "Sense tüm soğukkanlılığın ve muhteşem zekan ile bu psikopat katili kendi oyununda alt ettin ve yakaladın. Nathan'a ne kadar güvensende sende bir şüphe uyandırmıştı ve bunun üzerine yoğunlaştın.\n "
        + "Öncelikle olay yerinde onun bulduğunu iddia ettiği parmak izinden pek bir şey çıkmamıştı ve biraz alakasız duruyordu,\n sonrasında ise önemli bir delili götürürken kaza geçirmesi şüphelerini iyice arttırdı. Onun işte olmadığı sırada ailen kaçırılmıştı.\n "
        + "Ona yoğunlaşmanı sağlayan bir diğer önemli neden ise önlükte yazan D.W. harfleriydi. Nathan'ın da soy adı W ile başlıyordu ve bu önlük onun bir yakınına ait olabilirdi,\n üstelik bulduğun saç teline uyan bir saç rengi vardı. Buradan yola çıkarak geçmişini biraz araştırdın ve tam 5 yıl önce kardeşi Dean Wilson'ın bu hastahanede yatarken öldüğünü tespit ettin.\n Onu tutukladıktan sonra her şeyi anlattı ve aileni kurtardıktan sonra olay aydınlandı\n." +
        "Dean'in ölümü oldukça şüpheliydi. Bir saldırıya uğramıştı ve hastahanede yoğun bakıma kaldırılmıştı.\n "
        + "Onunla ilgilenen doktor John Evans'tı ve Dean tam hayati tehlikeyi atlatmışken şüpheli bir koplikasyon sonucu hayatını kaybetmişti.\n"
        + " İşaretler sanki yoğun bakımdayken birinin yarım bıraktığı işi tamamlamak için Dean'e bir şeyler yaptığını gösteriyor gibiydi.\n "
        + "O sırada bu davayı hatırladın çünkü bununla ilgilenmek için sen görevlendirilmiştin ancak hiçbir kanıt bulamadın.\n"
        + "Doktor o gece işten sevgili Nancy ile yemek yemek için işten erken çıkmış, güvenlik görevlisi ve baş hemşire ise şüpheli hiç kimseyi görmemişti.\n"
        + " Saldırı hakkında baş şüpheli ise Vincen King'in ta kendisiydi ancak Dean'i bulan polis memuru Sean Thomas saldırganı tam göremediğini söylemişti ve elinden kaçırmıştı. Nathan ise intikam için sıkı bir plan yapmıştı.\n "
        + "Öncelikle çok çalışarak olay yeri incelemeye girmiş ve başarısı ile senin dikkatini çekerek ekibine dahil olmuştu. Sonra zamanını beklemiş ve en sonunda kardeşinin ölümünden sorumlu tuttuğu tüm herkesi öldürmüş ve o gece doktoru meşgul ettiği için suçu Nancy'e atmak istemişti.\n"
        + " Ancak en büyük hedefi sendin ve bu yüzden hem kariyerini hem de aileni mahvetmek istemişti. Neyseki üstün zekan sayesinde her şeyi çözdün ve bu psikopatı yakaladın!\n");
        }
       
        
        
   
        // TODO code application logic here
    }
    
}}}}

