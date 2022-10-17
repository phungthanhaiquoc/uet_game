package uet.oop.bomberman.Levels;

import javafx.scene.image.Image;
import uet.oop.bomberman.entities.animal.Animal;
import uet.oop.bomberman.entities.animal.Oneal;
import uet.oop.bomberman.entities.animal.Ballom;
import uet.oop.bomberman.entities.animal.Kondoria;
import uet.oop.bomberman.graphics.MapCreation;
import uet.oop.bomberman.graphics.Sprite;

import static uet.oop.bomberman.BombermanGame.*;

import static uet.oop.bomberman.BombermanGame.enemy;
import static uet.oop.bomberman.Control.Menu.bomb_number;
import static uet.oop.bomberman.Control.Menu.time_number;
import static uet.oop.bomberman.entities.animal.Bomber.swap_kill;
import static uet.oop.bomberman.entities.block.Bomb.is_bomb;
import static uet.oop.bomberman.entities.items.SpeedItem.speed;


public class Level2 {
    public Level2() {
        enemy.clear();
        block.clear();
        swap_kill = 1;
        new MapCreation("res/levels/Level2.txt");
        player.setLife(true);
        player.setX(32);
        player.setY(32);
        speed = 1;

        time_number = 120;
        bomb_number = 30;
        is_bomb = 0;

        player.setImg(Sprite.control_right_2.getFxImage());
        Image transparent = new Image("images/transparent.png");
        author_view.setImage(transparent);

        Animal enemy1 = new Ballom(5, 5, Sprite.ballom_left_1.getFxImage());
        Animal enemy2 = new Ballom(11, 9, Sprite.ballom_left_1.getFxImage());
        enemy.add(enemy1);
        enemy.add(enemy2);

        Animal enemy3 = new Kondoria(1, 3, Sprite.kondoria_right_1.getFxImage());
        Animal enemy4 = new Kondoria(1, 7, Sprite.kondoria_right_1.getFxImage());
        Animal enemy5 = new Kondoria(1, 11, Sprite.kondoria_right_1.getFxImage());
        enemy.add(enemy3);
        enemy.add(enemy4);
        enemy.add(enemy5);

        Animal enemy6 = new Oneal(7, 5, Sprite.oneal_right_1.getFxImage());
        Animal enemy7 = new Oneal(19, 7, Sprite.oneal_right_1.getFxImage());
        enemy.add(enemy6);
        enemy.add(enemy7);

        for (Animal animal : enemy) {
            animal.setLife(true);
        }
    }
}