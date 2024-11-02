package testHaloOglasi;

import baseHaloOglasi.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pageHaloOglasi.*;
import pageMailinator.EmailPage;
import pageMailinator.InboxPage;
import pageMailinator.MailinatorHomePage;

import java.util.UUID;

public class RegistracijaTest extends BaseTest {

        HomePage homePage;
        UlogujSePage ulogujSePage;
        RegistrujSePage registrujSePage;
        UspesnaRegistracijaPage uspesnaRegistracijaPage;
        MailinatorHomePage mailinatorHomePage;
        InboxPage inboxPage;
        EmailPage emailPage;
        AktivacijaNalogaPage aktivacijaNalogaPage;

        @Before
        public void setUpTest() {
            homePage = new HomePage();
            ulogujSePage = new UlogujSePage();
            registrujSePage = new RegistrujSePage();
            uspesnaRegistracijaPage = new UspesnaRegistracijaPage();
            mailinatorHomePage = new MailinatorHomePage();
            inboxPage = new InboxPage();
            emailPage = new EmailPage();
            aktivacijaNalogaPage = new AktivacijaNalogaPage();
        }

        @Test
        public void haloOglasiTestUspesneRegistracijeFizickofLica() {
            homePage.ulogujSeButtonClick();
            ulogujSePage.registrujSeLinkClick();
            registrujSePage.fizickogLicaRadioButtonClick();
            registrujSePage.korisnickoImeInputFieldSendKeys("perislav789");
            registrujSePage.emailInputFieldSendKeys("perislav789@mailinator.com");
            registrujSePage.lozinkaInputFieldSednKeys("123456");
            registrujSePage.ponoviLozinkuInputFieldSendKeys("123456");
            registrujSePage.saglasnostZaFiskalneRacuneCheckboxClick();
            registrujSePage.registrujMeButtonClick();

            Assert.assertTrue(uspesnaRegistracijaPage.uspesnaRegistracijaMessageIsDisplayed());
            Assert.assertEquals("Registracija je uspela!\n" + "Kako bi Vaš nalog postao aktivan, neophodno je da kliknite na link u mejlu koji Vam je poslat na : perislav789@mailinator.com !",
                    uspesnaRegistracijaPage.uspesnaRegistracijaMessageGetText());

            uspesnaRegistracijaPage.otvoriStranicuMailinator();
            mailinatorHomePage.enterPublicMailinatorInboxInputFieldSendKeys("perislav789@mailinator.com");
            inboxPage.emailZaAktivacijuNalogaLinkClick();
            emailPage.switchFocusToIFrame();
            emailPage.aktivirajNalogButtonClick();
            emailPage.setUpWindowSwitch();

            Assert.assertTrue(aktivacijaNalogaPage.aktivacijaNalogaMessageIsDisplayed());
            Assert.assertEquals("Vaš nalog je uspešno aktiviran!\n" + "Produžite na stranicu za logovanje kako biste pristupili našem portalu. Prijava",
                    aktivacijaNalogaPage.aktivacijaNalogaMessageGetText());

        }

        @Test
        public void haloOglasiTestUspesneRegistracijeFizickofLicaUnapredjen() {
            // faker biblioteka na internetu

            String korisnik = "perislav" + UUID.randomUUID().toString().substring(0,5);
            String korisnikEmail = korisnik + "@mailinator.com";

            homePage.ulogujSeButtonClick();
            ulogujSePage.registrujSeLinkClick();
            registrujSePage.fizickogLicaRadioButtonClick();
            registrujSePage.korisnickoImeInputFieldSendKeys(korisnik);
            registrujSePage.emailInputFieldSendKeys(korisnikEmail);
            registrujSePage.lozinkaInputFieldSednKeys("123456");
            registrujSePage.ponoviLozinkuInputFieldSendKeys("123456");
            registrujSePage.saglasnostZaFiskalneRacuneCheckboxClick();
            registrujSePage.registrujMeButtonClick();

            Assert.assertTrue(uspesnaRegistracijaPage.uspesnaRegistracijaMessageIsDisplayed());
            Assert.assertEquals("Registracija je uspela!\n" + "Kako bi Vaš nalog postao aktivan, neophodno je da kliknite na link u mejlu koji Vam je poslat na : "+ korisnikEmail +" !",
                    uspesnaRegistracijaPage.uspesnaRegistracijaMessageGetText());

            uspesnaRegistracijaPage.otvoriStranicuMailinator();
            mailinatorHomePage.enterPublicMailinatorInboxInputFieldSendKeys(korisnikEmail);
            inboxPage.emailZaAktivacijuNalogaLinkClick();
            emailPage.switchFocusToIFrame();
            emailPage.aktivirajNalogButtonClick();
            emailPage.setUpWindowSwitch();

            Assert.assertTrue(aktivacijaNalogaPage.aktivacijaNalogaMessageIsDisplayed());
            Assert.assertEquals("Vaš nalog je uspešno aktiviran!\n" + "Produžite na stranicu za logovanje kako biste pristupili našem portalu. Prijava",
                    aktivacijaNalogaPage.aktivacijaNalogaMessageGetText());

        }


    }

