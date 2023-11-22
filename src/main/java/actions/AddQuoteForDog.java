package actions;

import dataModels.*;
import pages.ClientPage;
import utils.Data;

public class AddQuoteForDog {

    public Dog getDogDetails(String user) throws Exception {
        return  Data.from(user).get(Dog.class);
    }
    public Exotic getExoticDetails(String user) throws Exception {
        return  Data.from(user).get(Exotic.class);
    }

    public Cat getCatDetails(String user) throws Exception {
        return  Data.from(user).get(Cat.class);
    }

    public Dog getDogDetailsIntroductory(String user) throws Exception {
        return  Data.from(user).get(Dog.class);
    }

    public Cat getCatDetailsIntroductory(String user) throws Exception {
        return  Data.from(user).get(Cat.class);
    }

    public Horse getHorseDetails(String user) throws Exception {
        return  Data.from(user).get(Horse.class);
    }

}
