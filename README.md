# Budjettisovellus    



Sovelluksen tarkoitus on auttaa käyttäjää seuraamaan budjettiaan ja arvioimaan menojaan.
Budjettisimulaatio-ohjelmassa simuloidaan tuloja ja menoja 1, 3 tai 6kk ajalta.
Ohjelmaan ei tulla tekemään graaffista käyttöliittymää ajanpuutteellisuuden vuoksi.

## Dokumentaatio  

[Suunnitelma/raapustus](https://github.com/hunnak/ot-harjoitusty-/blob/master/dokumentaatio/suunnitelma.md)

[Suunnitelman täydennys/arkkitehtuuri](https://github.com/hunnak/ot-harjoitusty-/blob/master/dokumentaatio/arkkitehtuuri.md)

[Vaatimusmäärittely](https://github.com/hunnak/ot-harjoitusty-/blob/master/dokumentaatio/vaatimusmaarittely.md)

[työaikakirjanpito](https://github.com/hunnak/ot-harjoitusty-/blob/master/dokumentaatio/tyoaikakirjanpito.md)




## Komentorivitoiminnot

## Testaus 


Testit suoritetaan komennolla

mvn test

Testikattavuusraportti luodaan komennolla

mvn jacoco:report

Kattavuusraporttia voi tarkastella avaamalla selaimella tiedosto target/site/jacoco/index.html

## Suoritettavan jarin generointi

komento 

mvn package

generoi suoritettavan jar-tiedoston target kansioon (huom. ei se jar tiedosto jossa lukee original).

## Javadoc

Javadoc generoidaan komennolla

mvn javadoc:javadoc

JavaDocia voi tarkastella avaamalla selaimella tiedosto target/site/apidocs/index.html

## Checkstyle

Tiedostoon checkstyle.xml määrittelemät tarkistukset suoritetaan komennolla

 mvn jxr:jxr checkstyle:checkstyle

Mahdolliset virheilmoitukset selviävät avaamalla selaimella tiedosto target/site/checkstyle.html


