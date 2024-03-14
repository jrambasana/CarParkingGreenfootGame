import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{
   public static Counter counter = new Counter();
   public static Counter counter2 = new Counter();
   SimpleTimer st = new SimpleTimer();
   Message m1 = new Message();
    /**
     * Constructor for objects of class Background.
     * 
     */
    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Car b1 = new Car();
        addObject(b1,45,340);
        counter.setValue(0);
        counter2.setValue(0);
        st.mark();
        prepare();
    }


    public void act()
    {
       
            counter2.setValue(st.millisElapsed()/1000);
            
        if(counter2.getValue() >= 100 || counter.getValue() >= 100 ){
            Greenfoot.delay(50);
            clearBackground();            
            m1.setImage("game-over.png");
            m1.setLocation(300,200);
            m1.setRotation(0);
            Greenfoot.stop();
        }
    }
    public void clearBackground()
    {
            removeObjects(getObjects(Side.class));
            removeObjects(getObjects(Home.class));
            removeObjects(getObjects(Car.class));
            removeObjects(getObjects(Tree.class));
            removeObjects(getObjects(Brick.class));
            showText("     ",45, 340);
            showText("       ",526, 357);
            removeObjects(getObjects(Sensor.class));
            removeObjects(getObjects(Explosion.class));
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {

        showText("START",45, 340);
        showText("PARKING",526, 357);
        showText("Damage", 543, 20);
        addObject(counter, 543, 41);
        showText("Timer",543, 70);
        addObject(counter2, 547, 371);

        counter2.setLocation(547, 381);
        counter.setLocation(543, 48);

        Sensor sensor = new Sensor();
        addObject(sensor, 524, 355);
        sensor.setLocation(524, 355);
        Tree tree = new Tree();
        addObject(tree, 510, 113);
        Tree tree2 = new Tree();
        addObject(tree2, 577, 120);
        Tree tree3 = new Tree();
        addObject(tree3, 505, 297);
        Tree tree4 = new Tree();
        addObject(tree4, 578, 300);
        tree3.setLocation(509, 286);
        tree4.setLocation(569, 288);
        tree2.setLocation(569, 115);
        Side side = new Side();
        addObject(side, 12, 393);
        side.setLocation(10, 388);
        Side side2 = new Side();
        addObject(side2, 16, 373);
        Side side3 = new Side();
        addObject(side3, 13, 343);
        Side side4 = new Side();
        addObject(side4, 12, 318);
        Side side5 = new Side();
        addObject(side5, 12, 295);
        Side side6 = new Side();
        addObject(side6, 13, 273);
        Side side7 = new Side();
        addObject(side7, 13, 244);
        Side side8 = new Side();
        addObject(side8, 13, 221);
        Side side9 = new Side();
        addObject(side9, 13, 203);
        Side side10 = new Side();
        addObject(side10, 14, 180);
        Side side11 = new Side();
        addObject(side11, 15, 162);
        Side side12 = new Side();
        addObject(side12, 16, 143);
        Side side13 = new Side();
        addObject(side13, 17, 115);
        Side side14 = new Side();
        addObject(side14, 17, 78);
        Side side15 = new Side();
        addObject(side15, 16, 44);
        Side side16 = new Side();
        addObject(side16, 14, 19);
        Side side17 = new Side();
        addObject(side17, 42, 19);
        Side side18 = new Side();
        addObject(side18, 71, 22);
        Side side19 = new Side();
        addObject(side19, 96, 24);
        Side side20 = new Side();
        addObject(side20, 133, 23);
        Side side21 = new Side();
        addObject(side21, 170, 24);
        Side side22 = new Side();
        addObject(side22, 188, 24);
        side.setLocation(8, 388);
        side.setLocation(8, 393);
        side.setLocation(8, 390);
        side2.setLocation(26, 389);
        side3.setLocation(48, 392);
        side4.setLocation(71, 390);
        side3.setLocation(51, 392);
        side2.setLocation(28, 392);
        side.setLocation(9, 391);
        side4.setLocation(73, 391);
        side5.setLocation(7, 361);
        side6.setLocation(8, 332);
        side7.setLocation(9, 304);
        side8.setLocation(7, 278);
        side9.setLocation(13, 203);
        side9.setLocation(13, 203);
        side9.setLocation(13, 203);
        side9.setLocation(13, 203);
        side9.setLocation(13, 203);
        side9.setLocation(13, 203);
        side9.setLocation(13, 203);
        side9.setLocation(13, 203);
        side9.setLocation(13, 203);
        side9.setLocation(13, 203);
        side9.setLocation(13, 203);
        side9.setLocation(13, 203);
        side9.setLocation(13, 203);
        side9.setLocation(13, 203);
        side9.setLocation(13, 203);
        side9.setLocation(8, 248);
        side10.setLocation(9, 219);
        side11.setLocation(9, 190);
        side12.setLocation(9, 159);
        side13.setLocation(9, 129);
        side14.setLocation(10, 99);
        side15.setLocation(9, 65);
        side16.setLocation(9, 33);
        side17.setLocation(9, 10);
        side18.setLocation(34, 9);
        side4.setLocation(59, 10);
        side3.setLocation(66, 390);
        side2.setLocation(35, 393);
        side3.setLocation(62, 392);
        side19.setLocation(84, 10);
        side19.setLocation(86, 10);
        side20.setLocation(115, 11);
        side21.setLocation(148, 10);
        side22.setLocation(177, 11);
        side20.setLocation(114, 11);
        side21.setLocation(144, 10);
        side22.setLocation(175, 10);

        Side side23 = new Side();
        addObject(side23, 175, 396);
        Side side24 = new Side();
        addObject(side24, 214, 397);
        Side side25 = new Side();
        addObject(side25, 243, 397);
        Side side26 = new Side();
        addObject(side26, 272, 399);
        Side side27 = new Side();
        addObject(side27, 299, 395);
        Side side28 = new Side();
        addObject(side28, 326, 395);
        side23.setLocation(166, 391);
        side24.setLocation(201, 391);
        side25.setLocation(230, 390);
        side26.setLocation(263, 392);
        side27.setLocation(294, 393);
        side28.setLocation(322, 391);
        side27.setLocation(294, 391);
        side26.setLocation(263, 391);
        side25.setLocation(233, 392);
        side27.setLocation(297, 391);
        side26.setLocation(269, 391);
        side25.setLocation(240, 391);
        side24.setLocation(210, 391);
        side23.setLocation(181, 391);
        Side side29 = new Side();
        addObject(side29, 163, 387);
        side29.setLocation(158, 391);
        Side side30 = new Side();
        addObject(side30, 286, 16);
        Side side31 = new Side();
        addObject(side31, 319, 26);
        Side side32 = new Side();
        addObject(side32, 347, 27);
        Side side33 = new Side();
        addObject(side33, 373, 31);
        Side side34 = new Side();
        addObject(side34, 398, 29);
        Side side35 = new Side();
        addObject(side35, 421, 30);
        Side side36 = new Side();
        addObject(side36, 448, 26);
        side30.setLocation(280, 9);
        side31.setLocation(305, 10);
        side32.setLocation(329, 10);
        side33.setLocation(355, 10);
        side34.setLocation(380, 10);
        side35.setLocation(404, 10);
        side36.setLocation(430, 10);
        Side side37 = new Side();
        addObject(side37, 461, 16);
        tree3.setLocation(477, 71);
        tree4.setLocation(446, 104);
        counter2.setLocation(472, 263);

        sensor.setLocation(524, 355);
        tree2.setLocation(574, 274);
        tree.setLocation(523, 275);
        tree3.setLocation(572, 209);
        tree4.setLocation(520, 208);
        counter2.setLocation(545, 107);
        Tree tree5 = new Tree();
        addObject(tree5, 580, 159);
        Tree tree6 = new Tree();
        addObject(tree6, 537, 156);
        tree2.setLocation(575, 279);
        tree.setLocation(525, 280);
        tree3.setLocation(576, 220);
        tree4.setLocation(526, 222);
        tree6.setLocation(529, 164);
        tree5.setLocation(575, 162);
        tree6.setLocation(525, 164);
        side37.setLocation(454, 11);
        Side side38 = new Side();
        addObject(side38, 485, 17);
        Side side39 = new Side();
        addObject(side39, 489, 51);
        Side side40 = new Side();
        addObject(side40, 489, 81);
        Side side41 = new Side();
        addObject(side41, 490, 106);
        Side side42 = new Side();
        addObject(side42, 492, 133);
        Side side43 = new Side();
        addObject(side43, 491, 155);
        Side side44 = new Side();
        addObject(side44, 494, 191);
        Side side45 = new Side();
        addObject(side45, 494, 216);
        Side side46 = new Side();
        addObject(side46, 494, 237);
        Side side47 = new Side();
        addObject(side47, 494, 262);
        Side side48 = new Side();
        addObject(side48, 494, 287);
        Side side49 = new Side();
        Side side50 = new Side();
        addObject(side50, 428, 392);
        Side side51 = new Side();
        addObject(side51, 455, 398);
        Side side52 = new Side();
        addObject(side52, 474, 397);
        side38.setLocation(477, 11);
        side39.setLocation(489, 38);
        side40.setLocation(490, 63);
        side41.setLocation(490, 93);
        side42.setLocation(490, 119);
        side43.setLocation(489, 146);
        side44.setLocation(490, 172);
        side45.setLocation(490, 199);
        side46.setLocation(489, 226);
        side47.setLocation(489, 249);
        side48.setLocation(489, 272);
        Side side53 = new Side();
        addObject(side53, 490, 295);
        side53.setLocation(489, 295);
        Side side54 = new Side();
        addObject(side54, 499, 17);
        side54.setLocation(495, 11);
        side33.setLocation(350, 10);
        side34.setLocation(374, 10);
        side35.setLocation(398, 10);
        side36.setLocation(422, 10);
        side37.setLocation(445, 10);
        side38.setLocation(468, 9);
        side54.setLocation(490, 11);
        side38.setLocation(468, 10);
        side50.setLocation(425, 392);
        side51.setLocation(447, 391);
        side50.setLocation(425, 390);
        side51.setLocation(446, 391);
        side50.setLocation(425, 391);
        side52.setLocation(467, 391);
        side51.setLocation(447, 391);
        side5.setLocation(7, 364);
        side6.setLocation(8, 336);
        side7.setLocation(9, 309);
        side8.setLocation(8, 282);
        side9.setLocation(8, 255);
        side10.setLocation(9, 226);
        side11.setLocation(9, 198);
        side12.setLocation(9, 168);
        side13.setLocation(9, 140);
        side14.setLocation(9, 111);
        side15.setLocation(8, 79);
        side16.setLocation(9, 48);
        side17.setLocation(9, 11);
        Side side55 = new Side();
        addObject(side55, 127, 57);
        side18.setLocation(30, 11);
        side4.setLocation(53, 10);
        side19.setLocation(76, 10);
        side20.setLocation(99, 10);
        side21.setLocation(123, 10);
        side55.setLocation(148, 10);
        side22.setLocation(173, 9);
        side22.setLocation(168, 9);
        side55.setLocation(144, 10);
        side22.setLocation(167, 10);
        Side side56 = new Side();
        addObject(side56, 193, 16);
        side56.setLocation(191, 10);

        Home home13 = new Home();
        addObject(home13, 118, 367);
        Home home14 = new Home();
        addObject(home14, 121, 292);
        Home home15 = new Home();
        addObject(home15, 133, 217);
        Home home16 = new Home();
        addObject(home16, 132, 141);
        Home home17 = new Home();
        addObject(home17, 245, 49);
        Home home18 = new Home();
        addObject(home18, 251, 136);
        Home home19 = new Home();
        addObject(home19, 257, 216);
        Home home20 = new Home();
        addObject(home20, 262, 284);
        Home home21 = new Home();
        addObject(home21, 388, 369);
        Home home22 = new Home();
        addObject(home22, 387, 296);
        Home home23 = new Home();
        addObject(home23, 390, 223);
        Home home24 = new Home();
        addObject(home24, 388, 145);
        home13.setLocation(113, 360);
        home14.setLocation(113, 284);
        home15.setLocation(113, 208);
        home16.setLocation(113, 132);
        home17.setLocation(244, 40);
        home18.setLocation(244, 116);
        home19.setLocation(244, 192);
        home20.setLocation(244, 268);
        home24.setLocation(385, 124);
        home23.setLocation(385, 183);
        home22.setLocation(385, 208);
        home21.setLocation(385, 360);
        home23.setLocation(385, 284);
        home22.setLocation(385, 208);
        home24.setLocation(385, 132);

        counter2.setLocation(544, 97);
        counter.setLocation(543, 46);
        counter2.setLocation(544, 94);
        tree6.setLocation(415, 75);
        tree5.setLocation(424, 114);
        tree4.setLocation(429, 150);
        tree3.setLocation(447, 205);
        tree.setLocation(523, 303);
        tree.setLocation(441, 257);
        tree2.setLocation(419, 178);

        Brick brick13 = new Brick();
        addObject(brick13, 503, 396);
        Brick brick14 = new Brick();
        addObject(brick14, 545, 395);
        Brick brick15 = new Brick();
        addObject(brick15, 591, 395);
        Brick brick16 = new Brick();
        addObject(brick16, 595, 375);
        Brick brick17 = new Brick();
        addObject(brick17, 595, 358);
        Brick brick18 = new Brick();
        addObject(brick18, 596, 338);

        Brick brick20 = new Brick();
        addObject(brick20, 558, 326);
        Brick brick21 = new Brick();
        addObject(brick21, 524, 332);
        brick15.setLocation(585, 392);

        brick18.setLocation(591, 318);
        brick17.setLocation(586, 328);
        brick16.setLocation(586, 371);
        brick18.setLocation(591, 320);
        brick17.setLocation(586, 349);
        brick18.setLocation(585, 327);
        brick21.setLocation(497, 327);
        brick20.setLocation(547, 327);
        brick21.setLocation(510, 327);
        brick14.setLocation(546, 392);
        brick13.setLocation(508, 393);

        sensor.setLocation(527, 359);
        tree.setLocation(576, 289);
        tree3.setLocation(576, 223);
        tree4.setLocation(575, 146);
        tree3.setLocation(576, 217);
        tree.setLocation(576, 286);
        tree2.setLocation(526, 286);
        tree5.setLocation(526, 218);
        tree6.setLocation(525, 149);

        addObject(m1, 8, 31);
        removeObject(tree4);
        Tree tree7 = new Tree();
        addObject(tree7, 583, 156);
        tree7.setLocation(576, 148);
    }
}
