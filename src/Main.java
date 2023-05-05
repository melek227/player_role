
//rol belirli bir bağlamda bir nesneye sahip belirli özellikler kümesidir.
//bir nesne farklı bağlamlarda farklı roller alabilir
//bir öğrenci hem full time hem yüksek lisans öğrencisi olabilir
//hem full time hem de lisans öğrencisi olabilir
//multiple inheritance var

public class Main {
    public static void main(String[] args) {

        Ogrenci ali=new Ogrenci();
        ali.devamRolu=new FullTime();
        ali.devamRolu.devamsizlik=150;
        System.out.println("ali devamsizliktan kaldı mı:" +ali.devamRolu.devamsiz());
        ali.devamRolu=new PartTime();
        ali.devamRolu.devamsizlik=150;
        System.out.println("ali devamsizliktan kaldı mı:" +ali.devamRolu.devamsiz());
        ali.notOrtalama=3;
        ali.egitimSeviyesi=new Lisans();
        System.out.println("ali mezun olabilir mi : " +ali.egitimSeviyesi.mezuniyet((int)ali.notOrtalama));





        }
    }
