package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.Pacman;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {

//        var marioGame = new MarioGame();
//        var superContra = new SuperContraGame();
        var pacman = new Pacman();
        var gameRunner = new GameRunner(pacman);
        gameRunner.run();

    }
}
