package com.carnewal.gameofthrones.model;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Brecht on 7/01/2016.
 */
public class CharacterMockData {

    /*public static final String[] characterPictures;
    public static final String[] characterNames;
    public static final String[] characterDetails;
*/


    public static final ArrayList<GOTCharacter> characters
            = new ArrayList<GOTCharacter>(Arrays.asList(
            new GOTCharacter[]{
                    new GOTCharacter("http://i.lv3.hbo.com/assets/images/series/game-of-thrones/character/s5/petyr-baelish-512x512.jpg", "Petyr Baelish aka Littlefinger", "Nakedly ambitious, Littlefinger left the Small Council to marry Lysa Arryn and secure the Vale to the Lannister's side. Beyond his official duties, he is the eyes and ears of King's Landing along with Varys."),
                    new GOTCharacter("http://i.lv3.hbo.com/assets/images/series/game-of-thrones/character/s5/myrcella-baratheon-512x512.jpg", "Myrcella Baratheon", "Fair-haired and demure, Myrcella now lives in Dorne as part of a deal her uncle Tyrion made with House Martell to align their houses and keep the princess safe."),
                    new GOTCharacter("http://i.lv3.hbo.com/assets/images/series/game-of-thrones/character/s5/stannis-512x512.jpg", "Stannis Baratheon", "A serious man who preferred the solitude of the family seat in Dragonstone to King's Landing, Stannis is still challenging his nephew Joffrey for the Iron Throne. The priestess Melisandre helped him murder his brother Renly and narrow the field of rivals."),

            }));


}
