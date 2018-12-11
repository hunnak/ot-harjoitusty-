
Arkkitehtuurista suunniteltu tällä hetkellä seuraavasti.

Pääohjelma ja käyttis omassa .ui kansiossaan, sekä poistettu jacoco testiraportista.

Logiikka omassa kansiossaan.

logiikassa menot ja tulot lasketaan yhdessä samassa kansiossa.
Näillä näkymin jokaisesta kuukaudesta tehdään oma tulo+meno-olio (MoneyFlow).
Tulot ja menot käsitellään yhdessä TimeAndAverage oliossa/luokassa.
Käyttöliittymällä on yhteys näihin olioihin, suoraan TimeAndAverageen ja välillisesti tulo+meno-olioihin.
