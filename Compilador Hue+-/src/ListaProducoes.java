
public class ListaProducoes {

    private NaoTerminais[] nterminal;

    public NaoTerminais[] getNterminal() {
        return nterminal;
    }

    public void setNterminal(NaoTerminais[] nterminal) {
        this.nterminal = nterminal;
    }

    public void IniciarLista() {

        nterminal = new NaoTerminais[89];
        int i = 0;
        // 1 48	::=	2	10	36	49	50	51	35	-
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(48);
        nterminal[i].setProducao(35);
        nterminal[i].setProducao(51);
        nterminal[i].setProducao(50);
        nterminal[i].setProducao(49);
        nterminal[i].setProducao(36);
        nterminal[i].setProducao(10);
        nterminal[i].setProducao(2);
        i++;
        // 2	49	::=	7	52	38	53	37	54	-
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(49);
        nterminal[i].setProducao(54);
        nterminal[i].setProducao(37);
        nterminal[i].setProducao(102);
        nterminal[i].setProducao(53);
        nterminal[i].setProducao(38);
        nterminal[i].setProducao(52);
        nterminal[i].setProducao(101);
        nterminal[i].setProducao(7);
        i++;
        // 3	49	::=	15	-
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(49);
        nterminal[i].setProducao(15);
        i++;
        //4	52	::=	15	-
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(52);
        nterminal[i].setProducao(15);
        i++;
        //5	52	::=	40	7	52
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(52);
        nterminal[i].setProducao(52);
        nterminal[i].setProducao(101);
        nterminal[i].setProducao(7);
        nterminal[i].setProducao(40);
        i++;
        //6	53	::=	12
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(53);
        nterminal[i].setProducao(12);
        i++;
        //7	53	::=	17
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(53);
        nterminal[i].setProducao(17);
        i++;
        //8	53	::=	3
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(53);
        nterminal[i].setProducao(3);
        i++;
        //9	53	::=	23
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(53);
        nterminal[i].setProducao(23);
        i++;
        //10	54	::=	15
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(54);
        nterminal[i].setProducao(15);
        i++;
        //11	54	::=	55	38	53	37	54
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(54);
        nterminal[i].setProducao(54);
        nterminal[i].setProducao(37);
        nterminal[i].setProducao(102);
        nterminal[i].setProducao(53);
        nterminal[i].setProducao(38);
        nterminal[i].setProducao(55);
        i++;
        //12	55	::=	7	52
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(55);
        nterminal[i].setProducao(52);
        nterminal[i].setProducao(101);
        nterminal[i].setProducao(7);
        i++;
        //13	50	::=	56	7	57	36	49	50	51	4	43	58	42	35	50
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(50);
        nterminal[i].setProducao(50);
        nterminal[i].setProducao(35);
        nterminal[i].setProducao(42);
        nterminal[i].setProducao(58);
        nterminal[i].setProducao(43);
        nterminal[i].setProducao(4);
        nterminal[i].setProducao(51);
        nterminal[i].setProducao(50);
        nterminal[i].setProducao(49);
        nterminal[i].setProducao(36);
        nterminal[i].setProducao(57);
        nterminal[i].setProducao(103);
        nterminal[i].setProducao(7);
        nterminal[i].setProducao(56);
        i++;
        //14	56	::=	12
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(56);
        nterminal[i].setProducao(12);
        i++;
        //15	56	::=	2
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(56);
        nterminal[i].setProducao(2);
        i++;
        //16	56	::=	23
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(56);
        nterminal[i].setProducao(23);
        i++;
        //17	56	::=	17
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(56);
        nterminal[i].setProducao(17);
        i++;
        //18	56	::=	3
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(56);
        nterminal[i].setProducao(3);
        i++;
        //19	50	::=	15
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(50);
        nterminal[i].setProducao(15);
        i++;
        //20	58	::=	5
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(58);
        nterminal[i].setProducao(5);
        i++;
        //21	58	::=	6
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(58);
        nterminal[i].setProducao(6);
        i++;
        //22	58	::=	7
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(58);
        nterminal[i].setProducao(104);
        nterminal[i].setProducao(7);
        i++;
        //23	58	::=	8
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(58);
        nterminal[i].setProducao(8);
        i++;
        //24	58	::=	9
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(58);
        nterminal[i].setProducao(9);
        i++;
        //25	58	::=	15
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(58);
        nterminal[i].setProducao(15);
        i++;
        //26	57	::=	15
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(57);
        nterminal[i].setProducao(15);
        i++;
        //27	57	::=	43	59	42
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(57);
        nterminal[i].setProducao(42);
        nterminal[i].setProducao(59);
        nterminal[i].setProducao(43);
        i++;
        //28	59	::=	53	60
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(59);
        nterminal[i].setProducao(60);
        nterminal[i].setProducao(53);
        i++;
        //29	60	::=	37	53	60
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(60);
        nterminal[i].setProducao(60);
        nterminal[i].setProducao(53);
        nterminal[i].setProducao(37);
        i++;
        //30	60	::=	15
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(60);
        nterminal[i].setProducao(15);
        i++;
        //31	51	::=	13	61	37	62	18
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(51);
        nterminal[i].setProducao(18);
        nterminal[i].setProducao(62);
        nterminal[i].setProducao(37);
        nterminal[i].setProducao(61);
        nterminal[i].setProducao(13);
        i++;
        //32	62	::=	15
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(62);
        nterminal[i].setProducao(15);
        i++;
        //33	62	::=	61	37	62
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(62);
        nterminal[i].setProducao(62);
        nterminal[i].setProducao(37);
        nterminal[i].setProducao(61);
        i++;
        //34	61	::=	7	29	63
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(61);
        nterminal[i].setProducao(63);
        nterminal[i].setProducao(29);
        nterminal[i].setProducao(104);
        nterminal[i].setProducao(7);
        i++;
        //35	61	::=	9	29	63
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(61);
        nterminal[i].setProducao(63);
        nterminal[i].setProducao(29);
        nterminal[i].setProducao(9);
        i++;
        //36	61	::=	8	29	63
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(61);
        nterminal[i].setProducao(63);
        nterminal[i].setProducao(29);
        nterminal[i].setProducao(8);
        i++;
        //37	61	::=	63	29	63
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(61);
        nterminal[i].setProducao(63);
        nterminal[i].setProducao(29);
        nterminal[i].setProducao(63);
        i++;
        //38	61	::=	15
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(61);
        nterminal[i].setProducao(15);
        i++;
        //39	61	::=	24	7	64
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(61);
        nterminal[i].setProducao(64);
        nterminal[i].setProducao(7);
        nterminal[i].setProducao(24);
        i++;
        //40	64	::=	15
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(64);
        nterminal[i].setProducao(15);
        i++;
        //41	64	::=	43	65	66	42
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(64);
        nterminal[i].setProducao(42);
        nterminal[i].setProducao(66);
        nterminal[i].setProducao(65);
        nterminal[i].setProducao(43);
        i++;
        //42	66	::=	15
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(66);
        nterminal[i].setProducao(15);
        i++;
        //43	66	::=	40	65	66
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(66);
        nterminal[i].setProducao(66);
        nterminal[i].setProducao(65);
        nterminal[i].setProducao(40);
        i++;
        //44	65	::=	5
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(65);
        nterminal[i].setProducao(5);
        i++;
        //45	65	::=	9
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(65);
        nterminal[i].setProducao(9);
        i++;
        //46	65	::=	6
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(65);
        nterminal[i].setProducao(6);
        i++;
        //47	65	::=	8
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(65);
        nterminal[i].setProducao(8);
        i++;
        //48	65	::=	7
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(65);
        nterminal[i].setProducao(104);
        nterminal[i].setProducao(7);
        i++;
        //49	61	::=	14	43	7	67      42 	36	61	37	62	35	68
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(61);
        nterminal[i].setProducao(68);
        nterminal[i].setProducao(35);
        nterminal[i].setProducao(62);
        nterminal[i].setProducao(37);
        nterminal[i].setProducao(61);
        nterminal[i].setProducao(36);
        nterminal[i].setProducao(42);
        nterminal[i].setProducao(67);
        nterminal[i].setProducao(104);
        nterminal[i].setProducao(7);
        nterminal[i].setProducao(43);
        nterminal[i].setProducao(14);
        i++;
        //50	68	::=	19	36	61	37	62	35
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(68);
        nterminal[i].setProducao(35);
        nterminal[i].setProducao(62);
        nterminal[i].setProducao(37);
        nterminal[i].setProducao(61);
        nterminal[i].setProducao(36);
        nterminal[i].setProducao(19);
        i++;
        //51	68	::=	15
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(68);
        nterminal[i].setProducao(15);
        i++;
        //52	61	::=	1	43	7	67	42	36	61	37	62	35
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(61);
        nterminal[i].setProducao(35);
        nterminal[i].setProducao(62);
        nterminal[i].setProducao(37);
        nterminal[i].setProducao(61);
        nterminal[i].setProducao(36);
        nterminal[i].setProducao(42);
        nterminal[i].setProducao(67);
        nterminal[i].setProducao(104);
        nterminal[i].setProducao(7);
        nterminal[i].setProducao(43);
        nterminal[i].setProducao(1);
        i++;
        //53	67	::=	28	69
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(67);
        nterminal[i].setProducao(69);
        nterminal[i].setProducao(28);
        i++;
        //54	67	::=	45	69
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(67);
        nterminal[i].setProducao(69);
        nterminal[i].setProducao(45);
        i++;
        //55	67	::=	27	69
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(67);
        nterminal[i].setProducao(69);
        nterminal[i].setProducao(27);
        i++;
        //56	67	::=	26	69
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(67);
        nterminal[i].setProducao(69);
        nterminal[i].setProducao(26);
        i++;
        //57	67	::=	32	69
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(67);
        nterminal[i].setProducao(69);
        nterminal[i].setProducao(32);
        i++;
        //58	67	::=	30	69
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(67);
        nterminal[i].setProducao(69);
        nterminal[i].setProducao(30);
        i++;
        //59	69	::=	5
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(69);
        nterminal[i].setProducao(5);
        i++;
        //60	69	::=	6
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(69);
        nterminal[i].setProducao(6);
        i++;
        //61	69	::=	9
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(69);
        nterminal[i].setProducao(9);
        i++;
        //62	69	::=	8
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(69);
        nterminal[i].setProducao(8);
        i++;
        //63	69	::=	7
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(69);
        nterminal[i].setProducao(104);
        nterminal[i].setProducao(7);
        i++;
        //64	61	::=	16	43	7	29	69	37	7	67	37	70	42	36	61	37	62	35
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(61);
        nterminal[i].setProducao(35);
        nterminal[i].setProducao(62);
        nterminal[i].setProducao(37);
        nterminal[i].setProducao(61);
        nterminal[i].setProducao(36);
        nterminal[i].setProducao(42);
        nterminal[i].setProducao(70);
        nterminal[i].setProducao(37);
        nterminal[i].setProducao(67);
        nterminal[i].setProducao(104);
        nterminal[i].setProducao(7);
        nterminal[i].setProducao(37);
        nterminal[i].setProducao(69);
        nterminal[i].setProducao(29);
        nterminal[i].setProducao(104);
        nterminal[i].setProducao(7);
        nterminal[i].setProducao(43);
        nterminal[i].setProducao(16);
        i++;
        //65	70	::=	33	5
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(70);
        nterminal[i].setProducao(5);
        nterminal[i].setProducao(33);
        i++;
        //66	70	::=	46	5
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(70);
        nterminal[i].setProducao(5);
        nterminal[i].setProducao(46);
        i++;
        //67	61	::=	20	36	61	37	62	35	1	43	7	67	42
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(61);
        nterminal[i].setProducao(42);
        nterminal[i].setProducao(67);
        nterminal[i].setProducao(104);
        nterminal[i].setProducao(7);
        nterminal[i].setProducao(43);
        nterminal[i].setProducao(1);
        nterminal[i].setProducao(35);
        nterminal[i].setProducao(62);
        nterminal[i].setProducao(37);
        nterminal[i].setProducao(61);
        nterminal[i].setProducao(36);
        nterminal[i].setProducao(20);
        i++;
        //68	61	::=	22	25	7
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(61);
        nterminal[i].setProducao(104);
        nterminal[i].setProducao(7);
        nterminal[i].setProducao(25);
        nterminal[i].setProducao(22);
        i++;
        //69	61	::=	21	31	11	71
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(61);
        nterminal[i].setProducao(71);
        nterminal[i].setProducao(11);
        nterminal[i].setProducao(31);
        nterminal[i].setProducao(21);
        i++;
        //70	71	::=	15
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(71);
        nterminal[i].setProducao(15);
        i++;
        //71	71	::=	31	7	72	71	
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(71);
        nterminal[i].setProducao(71);
        nterminal[i].setProducao(72);
        nterminal[i].setProducao(104);
        nterminal[i].setProducao(7);
        nterminal[i].setProducao(31);
        i++;
        //72	71	::=	31	11	71
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(71);
        nterminal[i].setProducao(71);
        nterminal[i].setProducao(11);
        nterminal[i].setProducao(31);
        i++;
        //73	72	::=	15
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(72);
        nterminal[i].setProducao(15);
        i++;
        //74	72	::=	40	7	72
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(72);
        nterminal[i].setProducao(72);
        nterminal[i].setProducao(104);
        nterminal[i].setProducao(7);
        nterminal[i].setProducao(40);
        i++;
        //75	63	::=	73	74
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(63);
        nterminal[i].setProducao(74);
        nterminal[i].setProducao(73);
        i++;
        //76	63	::=	24	7	64
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(63);
        nterminal[i].setProducao(64);
        nterminal[i].setProducao(105);
        nterminal[i].setProducao(7);
        nterminal[i].setProducao(24);
        i++;
        //77	74	::=	34	73	74
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(74);
        nterminal[i].setProducao(74);
        nterminal[i].setProducao(107);
        nterminal[i].setProducao(73);
        nterminal[i].setProducao(34);
        i++;
        //78	74	::=	47	73	74
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(74);
        nterminal[i].setProducao(74);
        nterminal[i].setProducao(107);
        nterminal[i].setProducao(73);
        nterminal[i].setProducao(47);
        i++;
        //79	74	::=	15
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(74);
        nterminal[i].setProducao(15);
        i++;
        //80	73	::=	75	76
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(73);
        nterminal[i].setProducao(76);
        nterminal[i].setProducao(106);
        nterminal[i].setProducao(75);
        i++;
        //81	76	::=	15
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(76);
        nterminal[i].setProducao(15);
        i++;
        //82	76	::=	41	75	76
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(76);
        nterminal[i].setProducao(76);
        nterminal[i].setProducao(106);
        nterminal[i].setProducao(75);
        nterminal[i].setProducao(41);
        i++;
        //83	76	::=	39	75	76
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(76);
        nterminal[i].setProducao(76);
        nterminal[i].setProducao(100);
        nterminal[i].setProducao(107);
        nterminal[i].setProducao(75);
        nterminal[i].setProducao(39);
        i++;
        //84	75	::=	5
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(75);
        nterminal[i].setProducao(5);
        i++;
        //85	75	::=	6
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(75);
        nterminal[i].setProducao(6);
        i++;
        //86	75	::=	7
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(75);
        nterminal[i].setProducao(104);
        nterminal[i].setProducao(7);
        i++;
        //87	75	::=	9
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(75);
        nterminal[i].setProducao(9);
        i++;
        //88	75	::=	8
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(75);
        nterminal[i].setProducao(8);
        i++;
        //89	75	::=	43	63	42
        nterminal[i] = new NaoTerminais();
        nterminal[i].setNaoTerminais(75);
        nterminal[i].setProducao(42);
        nterminal[i].setProducao(63);
        nterminal[i].setProducao(43);

    }

}
