
public class TabelaDeParsing {

    private final Integer tabParsing[][] = new Integer[29][47];
    private final int t = 48;
    private final int y = 1;

    public TabelaDeParsing() {

        tabParsing[48 - t][2 - y] = 1;
        tabParsing[49 - t][2 - y] = 3;
        tabParsing[49 - t][3 - y] = 3;
        tabParsing[49 - t][7 - y] = 2;
        tabParsing[49 - t][12 - y] = 3;
        tabParsing[49 - t][13 - y] = 3;
        tabParsing[49 - t][17 - y] = 3;
        tabParsing[49 - t][23 - y] = 3;
        tabParsing[49 - t][44 - y] = 3;
        tabParsing[50 - t][2 - y] = 13;
        tabParsing[50 - t][3 - y] = 13;
        tabParsing[50 - t][12 - y] = 13;
        tabParsing[50 - t][13 - y] = 19;
        tabParsing[50 - t][17 - y] = 13;
        tabParsing[50 - t][23 - y] = 13;
        tabParsing[51 - t][13 - y] = 31;
        tabParsing[52 - t][38 - y] = 4;
        tabParsing[52 - t][40 - y] = 5;
        tabParsing[53 - t][3 - y] = 8;
        tabParsing[53 - t][12 - y] = 6;
        tabParsing[53 - t][17 - y] = 7;
        tabParsing[53 - t][23 - y] = 9;
        tabParsing[54 - t][2 - y] = 10;
        tabParsing[54 - t][3 - y] = 10;
        tabParsing[54 - t][7 - y] = 11;
        tabParsing[54 - t][12 - y] = 10;
        tabParsing[54 - t][13 - y] = 10;
        tabParsing[54 - t][17 - y] = 10;
        tabParsing[54 - t][23 - y] = 10;
        tabParsing[54 - t][44 - y] = 10;
        tabParsing[55 - t][7 - y] = 12;
        tabParsing[56 - t][2 - y] = 15;
        tabParsing[56 - t][3 - y] = 18;
        tabParsing[56 - t][12 - y] = 14;
        tabParsing[56 - t][17 - y] = 17;
        tabParsing[56 - t][23 - y] = 16;
        tabParsing[57 - t][36 - y] = 26;
        tabParsing[57 - t][43 - y] = 27;
        tabParsing[58 - t][5 - y] = 20;
        tabParsing[58 - t][6 - y] = 21;
        tabParsing[58 - t][7 - y] = 22;
        tabParsing[58 - t][8 - y] = 23;
        tabParsing[58 - t][9 - y] = 24;
        tabParsing[58 - t][42 - y] = 25;
        tabParsing[59 - t][3 - y] = 28;
        tabParsing[59 - t][12 - y] = 28;
        tabParsing[59 - t][17 - y] = 28;
        tabParsing[59 - t][23 - y] = 28;
        tabParsing[60 - t][37 - y] = 29;
        tabParsing[60 - t][42 - y] = 30;
        tabParsing[61 - t][1 - y] = 52;
        tabParsing[61 - t][5 - y] = 37;
        tabParsing[61 - t][6 - y] = 37;
        tabParsing[61 - t][7 - y] = 37;
        tabParsing[61 - t][8 - y] = 37;
        tabParsing[61 - t][9 - y] = 37;
        tabParsing[61 - t][14 - y] = 49;
        tabParsing[61 - t][16 - y] = 64;
        tabParsing[61 - t][20 - y] = 67;
        tabParsing[61 - t][21 - y] = 69;
        tabParsing[61 - t][22 - y] = 68;
        tabParsing[61 - t][24 - y] = 39;
        tabParsing[61 - t][37 - y] = 38;
        tabParsing[61 - t][43 - y] = 37;
        tabParsing[62 - t][18 - y] = 32;
        tabParsing[62 - t][35 - y] = 32;//modificada
        //tabParsing[62 - t][35 - y] = 33;
        tabParsing[63 - t][5 - y] = 75;
        tabParsing[63 - t][6 - y] = 75;
        tabParsing[63 - t][7 - y] = 75;
        tabParsing[63 - t][8 - y] = 75;
        tabParsing[63 - t][9 - y] = 75;
        tabParsing[63 - t][24 - y] = 76;
        tabParsing[63 - t][43 - y] = 75;
        tabParsing[64 - t][29 - y] = 40;
        tabParsing[64 - t][37 - y] = 40;
        tabParsing[64 - t][42 - y] = 40;
        tabParsing[64 - t][43 - y] = 41;
        tabParsing[65 - t][5 - y] = 44;
        tabParsing[65 - t][6 - y] = 46;
        tabParsing[65 - t][7 - y] = 48;
        tabParsing[65 - t][8 - y] = 47;
        tabParsing[65 - t][9 - y] = 45;
        tabParsing[66 - t][40 - y] = 43;
        tabParsing[66 - t][42 - y] = 42;
        tabParsing[67 - t][26 - y] = 56;
        tabParsing[67 - t][27 - y] = 55;
        tabParsing[67 - t][28 - y] = 53;
        tabParsing[67 - t][30 - y] = 58;
        tabParsing[67 - t][32 - y] = 57;
        tabParsing[67 - t][45 - y] = 54;
        tabParsing[68 - t][19 - y] = 50;
        tabParsing[68 - t][37 - y] = 51;
        tabParsing[69 - t][5 - y] = 59;
        tabParsing[69 - t][6 - y] = 60;
        tabParsing[69 - t][7 - y] = 63;
        tabParsing[69 - t][8 - y] = 62;
        tabParsing[69 - t][9 - y] = 61;
        tabParsing[70 - t][33 - y] = 65;
        tabParsing[70 - t][46 - y] = 66;
        tabParsing[71 - t][31 - y] = 72;
        tabParsing[71 - t][37 - y] = 70;
        tabParsing[72 - t][31 - y] = 73;
        tabParsing[72 - t][37 - y] = 73;
        tabParsing[72 - t][40 - y] = 74;
        tabParsing[73 - t][5 - y] = 80;
        tabParsing[73 - t][6 - y] = 80;
        tabParsing[73 - t][7 - y] = 80;
        tabParsing[73 - t][8 - y] = 80;
        tabParsing[73 - t][9 - y] = 80;
        tabParsing[73 - t][43 - y] = 80;
        tabParsing[74 - t][29 - y] = 79;
        tabParsing[74 - t][34 - y] = 77;
        tabParsing[74 - t][37 - y] = 79;
        tabParsing[74 - t][42 - y] = 79;
        tabParsing[74 - t][47 - y] = 78;
        tabParsing[75 - t][5 - y] = 84;
        tabParsing[75 - t][6 - y] = 85;
        tabParsing[75 - t][7 - y] = 86;
        tabParsing[75 - t][8 - y] = 88;
        tabParsing[75 - t][9 - y] = 87;
        tabParsing[75 - t][43 - y] = 89;
        tabParsing[76 - t][29 - y] = 81;
        tabParsing[76 - t][34 - y] = 81;
        tabParsing[76 - t][37 - y] = 81;
        tabParsing[76 - t][39 - y] = 83;
        tabParsing[76 - t][41 - y] = 82;
        tabParsing[76 - t][42 - y] = 81;
        tabParsing[76 - t][47 - y] = 81;
    }

    public Integer[][] getParsing() {

        return tabParsing;

    }

}
