
Arkkitehtuurista suunniteltu tällä hetkellä seuraavasti.

Pääohjelma ja käyttis omassa .ui kansiossaan (tarkoitus myös poistaa jacoco testiraportista).

logiikka omassa kansiossaan.

logiikassa menot ja tulot lasketaan omissa luokissaan/olioissa
Näillä näkymin jokaisesta kuukaudesta tehdään oma tulo- ja meno-olio.
Tulot ja menot käsitellään yhdessä TimeAndAverage oliossa/luokassa.
Käyttöliittymällä on yhteys näihin olioihin, suoraan TimeAndAverageen ja todennäköisesti välillisesti tulo- ja meno-olioihin.
