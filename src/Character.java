/**
 * Created by Dominic DeMaria(Jak) on 2/19/2018.
 *
 **/
public class Character {
    protected String name;//Name of character
    private int str;
    private int dex;
    private int intel;
    private int hp_Current;
    private int hp_Total;

    public Character(String name)
    {
        this.name = name;
        int str = 10;
        int dex = 10;
        int intel = 10;
        int hp_Current = 10* str;//Starting hp = 100
        int hp_Total = 10 * str;
    }//end of Character

    //Setters start here
    public void setName(String name) {
        this.name = name;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public void setIntel(int intel) {
        this.intel = intel;
    }

    public void setHp(int hp_Current, int str_New, int str_Old) {
        this.hp_Total = 10 * str_New;
        this.hp_Current = hp_Current + 10 * (str_New - str_Old);
    }
    //End of Setters

    //Getters start here
    public String getName() {
        return name;
    }

    public int getStr() {
        return str;
    }

    public int getDex() {
        return dex;
    }

    public int getIntel() {
        return intel;
    }

    public int getHp_Current() {
        return hp_Current;
    }
    public int getHp_Total() {
        return hp_Total;
    }
    //End of getters
}//End of Class Character
