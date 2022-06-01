package com.wizeek.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution146Test {

    private Solution146 solution;

    @Test
    public void test1() {
        solution = new Solution146(2);
        solution.put(1, 1);
        solution.put(2, 2);
        assertEquals(1, solution.get(1));
        solution.put(3, 3);
        assertEquals(-1, solution.get(2));
        solution.put(4, 4);
        assertEquals(-1, solution.get(1));
        assertEquals(3, solution.get(3));
        assertEquals(4, solution.get(4));
    }

    @Test
    public void test2() {
        solution = new Solution146(2);
        solution.put(2, 1);
        solution.put(1, 1);
        solution.put(2, 3);
        solution.put(4, 1);
        assertEquals(-1, solution.get(1));
        assertEquals(3, solution.get(2));
    }

    @Test
    public void test3() {
        solution = new Solution146(105);
        solution.put(33, 219);
        assertEquals(-1, solution.get(39));
        solution.put(96, 56);
        assertEquals(-1, solution.get(129));
        assertEquals(-1, solution.get(115));
        assertEquals(-1, solution.get(112));
        solution.put(3, 280);
        assertEquals(-1, solution.get(40));
        solution.put(85, 193);
        solution.put(10, 10);
        solution.put(100, 136);
        solution.put(12, 66);
        solution.put(81, 261);
        solution.put(33, 58);
        assertEquals(280, solution.get(3));
        solution.put(121, 308);
        solution.put(129, 263);
        assertEquals(-1, solution.get(105));
        solution.put(104, 38);
        solution.put(65, 85);
        solution.put(3, 141);
        solution.put(29, 30);
        solution.put(80, 191);
        solution.put(52, 191);
        solution.put(8, 300);
        assertEquals(-1, solution.get(136));
        solution.put(48, 261);
        solution.put(3, 193);
        solution.put(133, 193);
        solution.put(60, 183);
        solution.put(128, 148);
        solution.put(52, 176);
        assertEquals(261, solution.get(48));
        solution.put(48, 119);
        solution.put(10, 241);
        assertEquals(-1, solution.get(124));
        solution.put(130, 127);
        assertEquals(-1, solution.get(61));
        solution.put(124, 27);
        assertEquals(-1, solution.get(94));
        solution.put(29, 304);
        solution.put(102, 314);
        assertEquals(-1, solution.get(110));
        solution.put(23, 49);
        solution.put(134, 12);
        solution.put(55, 90);
        assertEquals(-1, solution.get(14));
        assertEquals(38, solution.get(104));
        solution.put(77, 165);
        solution.put(60, 160);
        assertEquals(-1, solution.get(117));
        solution.put(58, 30);
        assertEquals(-1, solution.get(54));
        assertEquals(-1, solution.get(136));
        assertEquals(148, solution.get(128));
        assertEquals(-1, solution.get(131));
        solution.put(48, 114);
        assertEquals(-1, solution.get(136));
        solution.put(46, 51);
        solution.put(129, 291);
        solution.put(96, 207);
        assertEquals(-1, solution.get(131));
        solution.put(89, 153);
        solution.put(120, 154);
        assertEquals(-1, solution.get(111));
        assertEquals(-1, solution.get(47));
        assertEquals(-1, solution.get(5));
        solution.put(114, 157);
        solution.put(57, 82);
        solution.put(113, 106);
        solution.put(74, 208);
        assertEquals(-1, solution.get(56));
        assertEquals(-1, solution.get(59));
        assertEquals(136, solution.get(100));
        assertEquals(-1, solution.get(132));
        solution.put(127, 202);
        assertEquals(-1, solution.get(75));
        solution.put(102, 147);
        assertEquals(-1, solution.get(37));
        solution.put(53, 79);
        solution.put(119, 220);
        assertEquals(-1, solution.get(47));
        assertEquals(-1, solution.get(101));
        assertEquals(153, solution.get(89));
        assertEquals(-1, solution.get(20));
        assertEquals(-1, solution.get(93));
        assertEquals(-1, solution.get(7));
        solution.put(48, 109);
        solution.put(71, 146);
        assertEquals(-1, solution.get(43));
        assertEquals(-1, solution.get(122));
        solution.put(3, 160);
        assertEquals(-1, solution.get(17));
        solution.put(80, 22);
        solution.put(80, 272);
        assertEquals(-1, solution.get(75));
        assertEquals(-1, solution.get(117));
        solution.put(76, 204);
        solution.put(74, 141);
        solution.put(107, 93);
        solution.put(34, 280);
        solution.put(31, 94);
        assertEquals(-1, solution.get(132));
        solution.put(71, 258);
        assertEquals(-1, solution.get(61));
        assertEquals(160, solution.get(60));
        solution.put(69, 272);
        assertEquals(51, solution.get(46));
        solution.put(42, 264);
        solution.put(87, 126);
        solution.put(107, 236);
        solution.put(131, 218);
        assertEquals(-1, solution.get(79));
        solution.put(41, 71);
        solution.put(94, 111);
        solution.put(19, 124);
        solution.put(52, 70);
        assertEquals(218, solution.get(131));
        assertEquals(-1, solution.get(103));
        assertEquals(261, solution.get(81));
        assertEquals(-1, solution.get(126));
        solution.put(61, 279);
        solution.put(37, 100);
        assertEquals(-1, solution.get(95));
        assertEquals(-1, solution.get(54));
        solution.put(59, 136);
        solution.put(101, 219);
        solution.put(15, 248);
        solution.put(37, 91);
        solution.put(11, 174);
        solution.put(99, 65);
        solution.put(105, 249);
        assertEquals(193, solution.get(85));
        solution.put(108, 287);
        solution.put(96, 4);
        assertEquals(-1, solution.get(70));
        assertEquals(-1, solution.get(24));
        solution.put(52, 206);
        solution.put(59, 306);
        solution.put(18, 296);
        solution.put(79, 95);
        solution.put(50, 131);
        solution.put(3, 161);
        solution.put(2, 229);
        solution.put(39, 183);
        solution.put(90, 225);
        solution.put(75, 23);
        solution.put(136, 280);
        assertEquals(220, solution.get(119));
        solution.put(81, 272);
        assertEquals(-1, solution.get(106));
        assertEquals(-1, solution.get(106));
        assertEquals(-1, solution.get(70));
        solution.put(73, 60);
        solution.put(19, 250);
        solution.put(82, 291);
        solution.put(117, 53);
        solution.put(16, 176);
        assertEquals(-1, solution.get(40));
        solution.put(7, 70);
        solution.put(135, 212);
        assertEquals(306, solution.get(59));
        solution.put(81, 201);
        solution.put(75, 305);
        assertEquals(219, solution.get(101));
        solution.put(8, 250);
        assertEquals(-1, solution.get(38));
        solution.put(28, 220);
        assertEquals(-1, solution.get(21));
        solution.put(105, 266);
        assertEquals(266, solution.get(105));
        assertEquals(193, solution.get(85));
        assertEquals(90, solution.get(55));
        assertEquals(-1, solution.get(6));
        solution.put(78, 83);
        assertEquals(-1, solution.get(126));
        assertEquals(147, solution.get(102));
        assertEquals(-1, solution.get(66));
        solution.put(61, 42);
        solution.put(127, 35);
        solution.put(117, 105);
        assertEquals(148, solution.get(128));
        assertEquals(147, solution.get(102));
        assertEquals(131, solution.get(50));
        solution.put(24, 133);
        solution.put(40, 178);
        solution.put(78, 157);
        solution.put(71, 22);
        assertEquals(-1, solution.get(25));
        assertEquals(291, solution.get(82));
        assertEquals(291, solution.get(129));
        solution.put(126, 12);
        assertEquals(-1, solution.get(45));
        assertEquals(178, solution.get(40));
        assertEquals(-1, solution.get(86));
        assertEquals(136, solution.get(100));
        solution.put(30, 110);
        assertEquals(-1, solution.get(49));
        solution.put(47, 185);
        solution.put(123, 101);
        assertEquals(147, solution.get(102));
        assertEquals(-1, solution.get(5));
        solution.put(40, 267);
        solution.put(48, 155);
        assertEquals(287, solution.get(108));
        assertEquals(-1, solution.get(45));
        solution.put(14, 182);
        solution.put(20, 117);
        solution.put(43, 124);
        assertEquals(-1, solution.get(38));
        solution.put(77, 158);
        assertEquals(-1, solution.get(111));
        assertEquals(183, solution.get(39));
        solution.put(69, 126);
        solution.put(113, 199);
        solution.put(21, 216);
        assertEquals(174, solution.get(11));
        solution.put(117, 207);
        assertEquals(110, solution.get(30));
        solution.put(97, 84);
        assertEquals(-1, solution.get(109));
        solution.put(99, 218);
        assertEquals(-1, solution.get(109));
        solution.put(113, 1);
        assertEquals(-1, solution.get(62));
        solution.put(49, 89);
        solution.put(53, 311);
        assertEquals(12, solution.get(126));
        solution.put(32, 153);
        solution.put(14, 296);
        assertEquals(-1, solution.get(22));
        solution.put(14, 225);
        assertEquals(89, solution.get(49));
        assertEquals(305, solution.get(75));
        solution.put(61, 241);
        assertEquals(70, solution.get(7));
        assertEquals(-1, solution.get(6));
        assertEquals(94, solution.get(31));
        solution.put(75, 15);
        assertEquals(-1, solution.get(115));
        solution.put(84, 181);
        solution.put(125, 111);
        solution.put(105, 94);
        solution.put(48, 294);
        assertEquals(-1, solution.get(106));
        assertEquals(241, solution.get(61));
        solution.put(53, 190);
        assertEquals(176, solution.get(16));
        solution.put(12, 252);
        assertEquals(220, solution.get(28));
        solution.put(111, 122);
        assertEquals(-1, solution.get(122));
        solution.put(10, 21);
        assertEquals(306, solution.get(59));
        assertEquals(-1, solution.get(72));
        assertEquals(183, solution.get(39));
        assertEquals(-1, solution.get(6));
        assertEquals(12, solution.get(126));
        solution.put(131, 177);
        solution.put(105, 253);
        assertEquals(-1, solution.get(26));
        solution.put(43, 311);
        assertEquals(95, solution.get(79));
        solution.put(91, 32);
        solution.put(7, 141);
        assertEquals(-1, solution.get(38));
        assertEquals(-1, solution.get(13));
        solution.put(79, 135);
        assertEquals(311, solution.get(43));
        assertEquals(111, solution.get(94));
        solution.put(80, 182);
        assertEquals(190, solution.get(53));
        solution.put(120, 309);
        solution.put(3, 109);
        assertEquals(84, solution.get(97));
        solution.put(9, 128);
        solution.put(114, 121);
        assertEquals(-1, solution.get(56));
        assertEquals(-1, solution.get(56));
        solution.put(124, 86);
        solution.put(34, 145);
        assertEquals(177, solution.get(131));
        assertEquals(157, solution.get(78));
        solution.put(86, 21);
        assertEquals(-1, solution.get(98));
        solution.put(115, 164);
        solution.put(47, 225);
        assertEquals(-1, solution.get(95));
        solution.put(89, 55);
        solution.put(26, 134);
        solution.put(8, 15);
        assertEquals(174, solution.get(11));
        solution.put(84, 276);
        solution.put(81, 67);
        assertEquals(51, solution.get(46));
        assertEquals(183, solution.get(39));
        assertEquals(-1, solution.get(92));
        assertEquals(4, solution.get(96));
        solution.put(89, 51);
        solution.put(136, 240);
        assertEquals(-1, solution.get(45));
        assertEquals(-1, solution.get(27));
        solution.put(24, 209);
        solution.put(82, 145);
        assertEquals(21, solution.get(10));
        solution.put(104, 225);
        solution.put(120, 203);
        solution.put(121, 108);
        solution.put(11, 47);
        assertEquals(51, solution.get(89));
        solution.put(80, 66);
        assertEquals(176, solution.get(16));
        solution.put(95, 101);
        assertEquals(89, solution.get(49));
        assertEquals(-1, solution.get(1));
        solution.put(77, 184);
        assertEquals(-1, solution.get(27));
        solution.put(74, 313);
        solution.put(14, 118);
        assertEquals(176, solution.get(16));
        assertEquals(313, solution.get(74));
        solution.put(88, 251);
        assertEquals(86, solution.get(124));
        solution.put(58, 101);
        solution.put(42, 81);
        assertEquals(229, solution.get(2));
        solution.put(133, 101);
        assertEquals(176, solution.get(16));
        solution.put(1, 254);
        solution.put(25, 167);
        solution.put(53, 56);
        solution.put(73, 198);
        assertEquals(294, solution.get(48));
        assertEquals(110, solution.get(30));
        assertEquals(101, solution.get(95));
        solution.put(90, 102);
        solution.put(92, 56);
        solution.put(2, 130);
        solution.put(52, 11);
        assertEquals(128, solution.get(9));
        assertEquals(49, solution.get(23));
        solution.put(53, 275);
        solution.put(23, 258);
        assertEquals(82, solution.get(57));
        solution.put(136, 183);
        solution.put(75, 265);
        assertEquals(193, solution.get(85));
        solution.put(68, 274);
        solution.put(15, 255);
        assertEquals(193, solution.get(85));
        solution.put(33, 314);
        solution.put(101, 223);
        solution.put(39, 248);
        solution.put(18, 261);
        solution.put(37, 160);
        assertEquals(-1, solution.get(112));
        assertEquals(85, solution.get(65));
        solution.put(31, 240);
        solution.put(40, 295);
        solution.put(99, 231);
        assertEquals(101, solution.get(123));
        solution.put(34, 43);
        assertEquals(126, solution.get(87));
        assertEquals(66, solution.get(80));
        solution.put(47, 279);
        solution.put(89, 299);
        assertEquals(-1, solution.get(72));
        solution.put(26, 277);
        solution.put(92, 13);
        solution.put(46, 92);
        solution.put(67, 163);
        solution.put(85, 184);
        assertEquals(-1, solution.get(38));
        solution.put(35, 65);
        assertEquals(-1, solution.get(70));
        assertEquals(67, solution.get(81));
        solution.put(40, 65);
        assertEquals(66, solution.get(80));
        solution.put(80, 23);
        solution.put(76, 258);
        assertEquals(126, solution.get(69));
        assertEquals(101, solution.get(133));
        solution.put(123, 196);
        solution.put(119, 212);
        solution.put(13, 150);
        solution.put(22, 52);
        solution.put(20, 105);
        solution.put(61, 233);
        assertEquals(84, solution.get(97));
        solution.put(128, 307);
        assertEquals(184, solution.get(85));
        assertEquals(23, solution.get(80));
        assertEquals(198, solution.get(73));
        assertEquals(110, solution.get(30));
        solution.put(46, 44);
        assertEquals(101, solution.get(95));
        solution.put(121, 211);
        solution.put(48, 307);
        assertEquals(130, solution.get(2));
        solution.put(27, 166);
        assertEquals(131, solution.get(50));
        solution.put(75, 41);
        solution.put(101, 105);
        assertEquals(130, solution.get(2));
        solution.put(110, 121);
        solution.put(32, 88);
        solution.put(75, 84);
        solution.put(30, 165);
        solution.put(41, 142);
        solution.put(128, 102);
        solution.put(105, 90);
        solution.put(86, 68);
        solution.put(13, 292);
        solution.put(83, 63);
        solution.put(5, 239);
        assertEquals(239, solution.get(5));
        solution.put(68, 204);
        assertEquals(35, solution.get(127));
        solution.put(42, 137);
        assertEquals(-1, solution.get(93));
        solution.put(90, 258);
        solution.put(40, 275);
        solution.put(7, 96);
        assertEquals(287, solution.get(108));
        solution.put(104, 91);
        assertEquals(-1, solution.get(63));
        assertEquals(240, solution.get(31));
        solution.put(31, 89);
        assertEquals(313, solution.get(74));
        assertEquals(67, solution.get(81));
        solution.put(126, 148);
        assertEquals(-1, solution.get(107));
        solution.put(13, 28);
        solution.put(21, 139);
        assertEquals(121, solution.get(114));
        assertEquals(239, solution.get(5));
        assertEquals(299, solution.get(89));
        assertEquals(101, solution.get(133));
        assertEquals(105, solution.get(20));
        solution.put(96, 135);
        solution.put(86, 100);
        solution.put(83, 75);
        assertEquals(118, solution.get(14));
        solution.put(26, 195);
        assertEquals(160, solution.get(37));
        solution.put(1, 287);
        assertEquals(135, solution.get(79));
        assertEquals(255, solution.get(15));
        assertEquals(-1, solution.get(6));
        solution.put(68, 11);
        assertEquals(11, solution.get(52));
        solution.put(124, 80);
        solution.put(123, 277);
        solution.put(99, 281);
        assertEquals(101, solution.get(133));
        assertEquals(258, solution.get(90));
        assertEquals(-1, solution.get(45));
        assertEquals(35, solution.get(127));
        solution.put(9, 68);
        solution.put(123, 6);
        solution.put(124, 251);
        solution.put(130, 191);
        solution.put(23, 174);
        solution.put(69, 295);
        assertEquals(88, solution.get(32));
        assertEquals(160, solution.get(37));
        solution.put(1, 64);
        solution.put(48, 116);
        assertEquals(11, solution.get(68));
        solution.put(117, 173);
        solution.put(16, 89);
        assertEquals(276, solution.get(84));
        solution.put(28, 234);
        assertEquals(291, solution.get(129));
        assertEquals(299, solution.get(89));
        assertEquals(90, solution.get(55));
        assertEquals(75, solution.get(83));
        solution.put(99, 264);
        assertEquals(291, solution.get(129));
        assertEquals(276, solution.get(84));
        assertEquals(118, solution.get(14));
        solution.put(26, 274);
        assertEquals(-1, solution.get(109));
        assertEquals(121, solution.get(110));
        solution.put(96, 120);
        solution.put(128, 207);
        assertEquals(252, solution.get(12));
        solution.put(99, 233);
        solution.put(20, 305);
        solution.put(26, 24);
        solution.put(102, 32);
        assertEquals(145, solution.get(82));
        solution.put(16, 30);
        solution.put(5, 244);
        assertEquals(191, solution.get(130));
        solution.put(109, 36);
        solution.put(134, 162);
        solution.put(13, 165);
        solution.put(45, 235);
        solution.put(112, 80);
        assertEquals(-1, solution.get(6));
        solution.put(34, 98);
        solution.put(64, 250);
        solution.put(18, 237);
        solution.put(72, 21);
        solution.put(42, 105);
        solution.put(57, 108);
        solution.put(28, 229);
        assertEquals(75, solution.get(83));
        solution.put(1, 34);
        solution.put(93, 151);
        solution.put(132, 94);
        solution.put(18, 24);
        solution.put(57, 68);
        solution.put(42, 137);
        assertEquals(65, solution.get(35));
        assertEquals(23, solution.get(80));
        solution.put(10, 288);
        assertEquals(139, solution.get(21));
        assertEquals(164, solution.get(115));
        assertEquals(177, solution.get(131));
        assertEquals(165, solution.get(30));
        assertEquals(311, solution.get(43));
        solution.put(97, 262);
        solution.put(55, 146);
        solution.put(81, 112);
        solution.put(2, 212);
        solution.put(5, 312);
        solution.put(82, 107);
        solution.put(14, 151);
        assertEquals(184, solution.get(77));
        solution.put(60, 42);
        solution.put(90, 309);
        assertEquals(309, solution.get(90));
        solution.put(131, 220);
        assertEquals(100, solution.get(86));
        solution.put(106, 85);
        solution.put(85, 254);
        assertEquals(151, solution.get(14));
        solution.put(66, 262);
        solution.put(88, 243);
        assertEquals(-1, solution.get(3));
        solution.put(50, 301);
        solution.put(118, 91);
        assertEquals(167, solution.get(25));
        assertEquals(90, solution.get(105));
        assertEquals(-1, solution.get(100));
        assertEquals(299, solution.get(89));
        solution.put(111, 152);
        solution.put(65, 24);
        solution.put(41, 264);
        assertEquals(173, solution.get(117));
        assertEquals(173, solution.get(117));
        solution.put(80, 45);
        assertEquals(-1, solution.get(38));
        solution.put(11, 151);
        solution.put(126, 203);
        solution.put(128, 59);
        solution.put(6, 129);
        assertEquals(-1, solution.get(91));
        solution.put(118, 2);
        solution.put(50, 164);
        assertEquals(313, solution.get(74));
        assertEquals(45, solution.get(80));
        solution.put(48, 308);
        solution.put(109, 82);
        solution.put(3, 48);
        solution.put(123, 10);
        solution.put(59, 249);
        solution.put(128, 64);
        solution.put(41, 287);
        solution.put(52, 278);
        solution.put(98, 151);
        assertEquals(252, solution.get(12));
        assertEquals(167, solution.get(25));
        solution.put(18, 254);
        solution.put(24, 40);
        assertEquals(212, solution.get(119));
        solution.put(66, 44);
        solution.put(61, 19);
        solution.put(80, 132);
        solution.put(62, 111);
        assertEquals(132, solution.get(80));
        solution.put(57, 188);
        assertEquals(94, solution.get(132));
        assertEquals(137, solution.get(42));
        solution.put(18, 314);
        assertEquals(308, solution.get(48));
        solution.put(86, 138);
        assertEquals(-1, solution.get(8));
        solution.put(27, 88);
        solution.put(96, 178);
        solution.put(17, 104);
        solution.put(112, 86);
        assertEquals(167, solution.get(25));
        solution.put(129, 119);
        solution.put(93, 44);
        assertEquals(164, solution.get(115));
        solution.put(33, 36);
        solution.put(85, 190);
        assertEquals(288, solution.get(10));
        solution.put(52, 182);
        solution.put(76, 182);
        assertEquals(82, solution.get(109));
        assertEquals(2, solution.get(118));
        solution.put(82, 301);
        solution.put(26, 158);
        assertEquals(-1, solution.get(71));
        solution.put(108, 309);
        solution.put(58, 132);
        solution.put(13, 299);
        solution.put(117, 183);
        assertEquals(164, solution.get(115));
        assertEquals(299, solution.get(89));
        assertEquals(137, solution.get(42));
        solution.put(11, 285);
        solution.put(30, 144);
        assertEquals(295, solution.get(69));
        solution.put(31, 53);
        assertEquals(139, solution.get(21));
        solution.put(96, 162);
        solution.put(4, 227);
        solution.put(77, 120);
        solution.put(128, 136);
        assertEquals(-1, solution.get(92));
        solution.put(119, 208);
        solution.put(87, 61);
        solution.put(9, 40);
        solution.put(48, 273);
        assertEquals(101, solution.get(95));
        assertEquals(65, solution.get(35));
        solution.put(62, 267);
        solution.put(88, 161);
        assertEquals(249, solution.get(59));
        assertEquals(190, solution.get(85));
        solution.put(131, 53);
        solution.put(114, 98);
        solution.put(90, 257);
        solution.put(108, 46);
        assertEquals(-1, solution.get(54));
        solution.put(128, 223);
        solution.put(114, 168);
        solution.put(89, 203);
        assertEquals(-1, solution.get(100));
        assertEquals(-1, solution.get(116));
        assertEquals(151, solution.get(14));
        solution.put(61, 104);
        solution.put(44, 161);
        solution.put(60, 132);
        solution.put(21, 310);
        assertEquals(203, solution.get(89));
        solution.put(109, 237);
        assertEquals(90, solution.get(105));
        assertEquals(88, solution.get(32));
        solution.put(78, 101);
        solution.put(14, 71);
        solution.put(100, 47);
        solution.put(102, 33);
        solution.put(44, 29);
        assertEquals(190, solution.get(85));
        assertEquals(160, solution.get(37));
        solution.put(68, 175);
        solution.put(116, 182);
        solution.put(42, 47);
        assertEquals(40, solution.get(9));
        solution.put(64, 37);
        solution.put(23, 32);
        solution.put(11, 124);
        solution.put(130, 189);
        assertEquals(24, solution.get(65));
        solution.put(33, 219);
        solution.put(79, 253);
        assertEquals(132, solution.get(80));
        assertEquals(30, solution.get(16));
        solution.put(38, 18);
        solution.put(35, 67);
        assertEquals(-1, solution.get(107));
        assertEquals(161, solution.get(88));
        solution.put(37, 13);
        solution.put(71, 188);
        assertEquals(67, solution.get(35));
        solution.put(58, 268);
        solution.put(18, 260);
        solution.put(73, 23);
        solution.put(28, 102);
        assertEquals(119, solution.get(129));
        assertEquals(161, solution.get(88));
        assertEquals(24, solution.get(65));
        assertEquals(132, solution.get(80));
        solution.put(119, 146);
        assertEquals(-1, solution.get(113));
        assertEquals(267, solution.get(62));
        solution.put(123, 138);
        solution.put(18, 1);
        solution.put(26, 208);
        assertEquals(-1, solution.get(107));
        assertEquals(-1, solution.get(107));
        solution.put(76, 132);
        solution.put(121, 191);
        assertEquals(227, solution.get(4));
        assertEquals(-1, solution.get(8));
        assertEquals(183, solution.get(117));
        solution.put(11, 118);
        assertEquals(311, solution.get(43));
        assertEquals(295, solution.get(69));
        assertEquals(-1, solution.get(136));
        solution.put(66, 298);
        assertEquals(167, solution.get(25));
        assertEquals(188, solution.get(71));
        assertEquals(47, solution.get(100));
        solution.put(26, 141);
        solution.put(53, 256);
        solution.put(111, 205);
        solution.put(126, 106);
        assertEquals(311, solution.get(43));
        solution.put(14, 39);
        solution.put(44, 41);
        solution.put(23, 230);
        assertEquals(53, solution.get(131));
        assertEquals(256, solution.get(53));
        solution.put(104, 268);
        assertEquals(144, solution.get(30));
        solution.put(108, 48);
        solution.put(72, 45);
        assertEquals(268, solution.get(58));
        assertEquals(-1, solution.get(46));
        solution.put(128, 301);
        assertEquals(188, solution.get(71));
        assertEquals(233, solution.get(99));
        assertEquals(-1, solution.get(113));
        assertEquals(191, solution.get(121));
        solution.put(130, 122);
        solution.put(102, 5);
        solution.put(111, 51);
        solution.put(85, 229);
        solution.put(86, 157);
        solution.put(82, 283);
        solution.put(88, 52);
        solution.put(136, 105);
        assertEquals(-1, solution.get(40));
        assertEquals(-1, solution.get(63));
        solution.put(114, 244);
        solution.put(29, 82);
        solution.put(83, 278);
        assertEquals(53, solution.get(131));
        solution.put(56, 33);
        assertEquals(138, solution.get(123));
        assertEquals(118, solution.get(11));
        assertEquals(146, solution.get(119));
        solution.put(119, 1);
        solution.put(48, 52);
        assertEquals(-1, solution.get(47));
        solution.put(127, 136);
        solution.put(78, 38);
        solution.put(117, 64);
        solution.put(130, 134);
        solution.put(93, 69);
        solution.put(70, 98);
        assertEquals(175, solution.get(68));
        solution.put(4, 3);
        solution.put(92, 173);
        solution.put(114, 65);
        solution.put(7, 309);
        assertEquals(53, solution.get(31));
        solution.put(107, 271);
        solution.put(110, 69);
        assertEquals(-1, solution.get(45));
        solution.put(35, 288);
        assertEquals(-1, solution.get(20));
        solution.put(38, 79);
        assertEquals(-1, solution.get(46));
        solution.put(6, 123);
        assertEquals(-1, solution.get(19));
        solution.put(84, 95);
        assertEquals(132, solution.get(76));
        solution.put(71, 31);
        solution.put(72, 171);
        solution.put(35, 123);
        assertEquals(88, solution.get(32));
        solution.put(73, 85);
        assertEquals(-1, solution.get(94));
        assertEquals(301, solution.get(128));
        assertEquals(102, solution.get(28));
        assertEquals(79, solution.get(38));
        assertEquals(237, solution.get(109));
        solution.put(85, 197);
        solution.put(10, 41);
        solution.put(71, 50);
        assertEquals(301, solution.get(128));
        solution.put(3, 55);
        solution.put(15, 9);
        solution.put(127, 215);
        assertEquals(104, solution.get(17));
        assertEquals(13, solution.get(37));
        solution.put(111, 272);
        solution.put(79, 169);
        solution.put(86, 206);
        solution.put(40, 264);
        assertEquals(-1, solution.get(134));
        solution.put(16, 207);
        solution.put(27, 127);
        solution.put(29, 48);
        solution.put(32, 122);
        solution.put(15, 35);
        solution.put(117, 36);
        assertEquals(215, solution.get(127));
        assertEquals(-1, solution.get(36));
        solution.put(72, 70);
        solution.put(49, 201);
        solution.put(89, 215);
        solution.put(134, 290);
        solution.put(77, 64);
        solution.put(26, 101);
        assertEquals(233, solution.get(99));
        solution.put(36, 96);
        solution.put(84, 129);
        solution.put(125, 264);
        assertEquals(311, solution.get(43));
        assertEquals(79, solution.get(38));
        solution.put(24, 76);
        solution.put(45, 2);
        solution.put(32, 24);
        solution.put(84, 235);
        solution.put(16, 240);
        solution.put(17, 289);
        solution.put(49, 94);
        solution.put(90, 54);
        solution.put(88, 199);
        assertEquals(230, solution.get(23));
        solution.put(87, 19);
        solution.put(11, 19);
        assertEquals(76, solution.get(24));
        assertEquals(188, solution.get(57));
        assertEquals(3, solution.get(4));
        assertEquals(264, solution.get(40));
        solution.put(133, 286);
        solution.put(127, 231);
        assertEquals(-1, solution.get(51));
        solution.put(52, 196);
        assertEquals(127, solution.get(27));
        assertEquals(41, solution.get(10));
        assertEquals(69, solution.get(93));
        solution.put(115, 143);
        solution.put(62, 64);
        solution.put(59, 200);
        solution.put(75, 85);
        solution.put(7, 93);
        solution.put(117, 270);
        solution.put(116, 6);
        assertEquals(24, solution.get(32));
        assertEquals(-1, solution.get(135));
        solution.put(2, 140);
        solution.put(23, 1);
        solution.put(11, 69);
        solution.put(89, 30);
        solution.put(27, 14);
        assertEquals(47, solution.get(100));
        assertEquals(104, solution.get(61));
        solution.put(99, 41);
        solution.put(88, 12);
        assertEquals(-1, solution.get(41));
        solution.put(52, 203);
        assertEquals(24, solution.get(65));
        solution.put(62, 78);
        solution.put(104, 276);
        solution.put(105, 307);
        assertEquals(93, solution.get(7));
        solution.put(23, 123);
        assertEquals(-1, solution.get(22));
        solution.put(35, 299);
        assertEquals(295, solution.get(69));
        assertEquals(69, solution.get(11));
        solution.put(14, 112);
        assertEquals(143, solution.get(115));
        assertEquals(86, solution.get(112));
        assertEquals(48, solution.get(108));
        solution.put(110, 165);
        solution.put(83, 165);
        solution.put(36, 260);
        solution.put(54, 73);
        assertEquals(260, solution.get(36));
        solution.put(93, 69);
        assertEquals(290, solution.get(134));
        solution.put(125, 96);
        solution.put(74, 127);
        solution.put(110, 305);
        solution.put(92, 309);
        solution.put(87, 45);
        solution.put(31, 266);
        assertEquals(41, solution.get(10));
        solution.put(114, 206);
        solution.put(49, 141);
        assertEquals(283, solution.get(82));
        solution.put(92, 3);
        solution.put(91, 160);
        assertEquals(-1, solution.get(41));
        solution.put(60, 147);
        solution.put(36, 239);
        solution.put(23, 296);
        solution.put(134, 120);
        assertEquals(123, solution.get(6));
        solution.put(5, 283);
        solution.put(117, 68);
        assertEquals(299, solution.get(35));
        assertEquals(-1, solution.get(120));
        solution.put(44, 191);
        solution.put(121, 14);
        solution.put(118, 113);
        solution.put(84, 106);
        assertEquals(296, solution.get(23));
        solution.put(15, 240);
        assertEquals(13, solution.get(37));
        solution.put(52, 256);
        solution.put(119, 116);
        solution.put(101, 7);
        solution.put(14, 157);
        solution.put(29, 225);
        solution.put(4, 247);
        solution.put(8, 112);
        solution.put(8, 189);
        solution.put(96, 220);
        assertEquals(276, solution.get(104));
        solution.put(72, 106);
        solution.put(23, 170);
        solution.put(67, 209);
        solution.put(70, 39);
        assertEquals(1, solution.get(18));
        assertEquals(123, solution.get(6));
        assertEquals(-1, solution.get(34));
        solution.put(121, 157);
        assertEquals(240, solution.get(16));
        assertEquals(-1, solution.get(19));
        solution.put(83, 283);
        solution.put(13, 22);
        solution.put(33, 143);
        solution.put(88, 133);
        assertEquals(133, solution.get(88));
        solution.put(5, 49);
        assertEquals(79, solution.get(38));
        assertEquals(305, solution.get(110));
        assertEquals(209, solution.get(67));
        solution.put(23, 227);
        assertEquals(175, solution.get(68));
        assertEquals(55, solution.get(3));
        solution.put(27, 265);
        assertEquals(266, solution.get(31));
        solution.put(13, 103);
        assertEquals(6, solution.get(116));
        solution.put(111, 282);
        solution.put(43, 71);
        assertEquals(120, solution.get(134));
        solution.put(70, 141);
        assertEquals(157, solution.get(14));
        assertEquals(116, solution.get(119));
        assertEquals(71, solution.get(43));
        assertEquals(-1, solution.get(122));
        solution.put(38, 187);
        solution.put(8, 9);
        assertEquals(-1, solution.get(63));
        solution.put(42, 140);
        assertEquals(283, solution.get(83));
        assertEquals(3, solution.get(92));
        assertEquals(-1, solution.get(106));
        assertEquals(102, solution.get(28));
        solution.put(57, 139);
        solution.put(36, 257);
        solution.put(30, 204);
        assertEquals(106, solution.get(72));
        solution.put(105, 243);
        assertEquals(240, solution.get(16));
        solution.put(74, 25);
        assertEquals(-1, solution.get(22));
        solution.put(118, 144);
        assertEquals(286, solution.get(133));
        assertEquals(50, solution.get(71));
        solution.put(99, 21);
        assertEquals(101, solution.get(26));
        assertEquals(299, solution.get(35));
        solution.put(89, 209);
        solution.put(106, 158);
        solution.put(76, 63);
        solution.put(112, 216);
        assertEquals(301, solution.get(128));
        assertEquals(73, solution.get(54));
        solution.put(16, 165);
        solution.put(76, 206);
        solution.put(69, 253);
        assertEquals(227, solution.get(23));
        solution.put(54, 111);
        assertEquals(-1, solution.get(80));
        solution.put(111, 72);
        solution.put(95, 217);
        assertEquals(144, solution.get(118));
        solution.put(4, 146);
        assertEquals(-1, solution.get(47));
        solution.put(108, 290);
        assertEquals(71, solution.get(43));
        solution.put(70, 8);
        assertEquals(68, solution.get(117));
        assertEquals(157, solution.get(121));
        solution.put(42, 220);
        assertEquals(52, solution.get(48));
        assertEquals(24, solution.get(32));
        solution.put(68, 213);
        solution.put(30, 157);
        solution.put(62, 68);
        assertEquals(268, solution.get(58));
        solution.put(125, 283);
        solution.put(132, 45);
        assertEquals(197, solution.get(85));
        assertEquals(3, solution.get(92));
        solution.put(23, 257);
        assertEquals(25, solution.get(74));
        solution.put(18, 256);
        assertEquals(54, solution.get(90));
        solution.put(10, 158);
        solution.put(57, 34);
        assertEquals(265, solution.get(27));
        assertEquals(271, solution.get(107));
    }
}
