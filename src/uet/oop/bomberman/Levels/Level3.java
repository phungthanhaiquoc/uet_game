package uet.oop.bomberman.Levels;


import javafx.scene.image.Image;
import uet.oop.bomberman.entities.animal.Animal;
import uet.oop.bomberman.entities.animal.Doll;
import uet.oop.bomberman.entities.animal.Ballom;
import uet.oop.bomberman.graphics.MapCreation;
import uet.oop.bomberman.graphics.Sprite;

import static uet.oop.bomberman.BombermanGame.*;

import static uet.oop.bomberman.BombermanGame.enemy;
import static uet.oop.bomberman.Control.Menu.bomb_number;
import static uet.oop.bomberman.Control.Menu.time_number;
import static uet.oop.bomberman.entities.animal.Bomber.swap_kill;
import static uet.oop.bomberman.entities.block.Bomb.is_bomb;
import static uet.oop.bomberman.entities.items.SpeedItem.speed;

public class Level3 {
    public Level3() {
        enemy.clear();
        block.clear();
        swap_kill = 1;
        new MapCreation("res/levels/Level3.txt");
        player.setLife(true);
        player.setX(32);
        player.setY(32);
        speed = 1;

        time_number = 120;
        bomb_number = 40;
        is_bomb = 0;

        player.setImg(Sprite.control_right_2.getFxImage());
        Image transparent = new Image("images/transparent.png");
        author_view.setImage(transparent);

        Animal enemy1 = new Ballom(5, 5, Sprite.ballom_left_1.getFxImage());
        Animal enemy2 = new Ballom(11, 9, Sprite.ballom_left_1.getFxImage());
        enemy.add(enemy1);
        enemy.add(enemy2);

        Animal enemy3 = new Doll(7, 5, Sprite.doll_left_1.getFxImage());
        enemy.add(enemy3);

        for (Animal animal : enemy) {
            animal.setLife(true);
        }
    }
}