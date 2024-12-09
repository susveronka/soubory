import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Evidence {

    private List <Osoba> osoby = new ArrayList<>();
    public void pridejOsobu(Osoba osoba){

        osoby.add(osoba);
    }


    public void odeberOsobu(Osoba osoba){

        osoby.remove(osoba);
    }


    private List<Osoba> getOsoby(){
        return new ArrayList<>(osoby);
    }

    public void zapisOsobyDoSouboru(String nazevSouboru,
                                    String oddelovac) throws ChybaException {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(nazevSouboru)))) { //otevře se ale vždy se zavře
           for (Osoba osoba: osoby){
               writer.println(osoba.getVek()+oddelovac+
                       osoba.getJmeno()+oddelovac+
                       osoba.getdatumNarozeni//...
                        ); // pojí se k položkám v souboru se zápisy do souboru

           }

        }catch(FileNotFoundException e){
                throw new ChybaException
                        ("Chyba při zápisu do souboru  '" + nazevSouboru + "'  nebylNalezen: " + e.getLocalizedMessage());


            } catch(IOException e){
                throw new ChybaException
                        ("Chyba při zápisu do souboru  '" + nazevSouboru + "'  nebylNalezen: " + e.getLocalizedMessage());
            }
        }
    }

//Buffered ukládá soubory do sebe aby byl efektivnější (zmenší počet operací - mezipaměť)