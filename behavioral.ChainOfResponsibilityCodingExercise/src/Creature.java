import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;


abstract class Creature
{
    protected Game game;
    protected int baseAttack, baseDefense;

    public Creature(Game game, int baseAttack, int baseDefense) {
        this.game = game;
        this.baseAttack = baseAttack;
        this.baseDefense = baseDefense;
    }

    public abstract int getAttack();
    public abstract int getDefense();
    public abstract void query(Object source, StatQuery statQuery);
}

class Goblin extends Creature
{
    protected Goblin(Game game, int baseAttack, int baseDefense) {
        super(game, baseAttack, baseDefense);
    }

    public Goblin(Game game)
    {
        super(game, 1, 1);
    }

    @Override
    public int getAttack()
    {
        StatQuery statQuery = new StatQuery(Statistic.ATTACK);
        game.creatures.forEach(creature -> {
            creature.query(this, statQuery);
        });
        return statQuery.result;
    }

    @Override
    public int getDefense()
    {
        StatQuery statQuery = new StatQuery(Statistic.DEFENSE);
        game.creatures.forEach(creature -> {
            creature.query(this, statQuery);
        });
        return statQuery.result;    }

    @Override
    public void query(Object source, StatQuery statQuery) {
        if (source == this) {
            switch (statQuery.statistic) {
                case ATTACK -> statQuery.result += baseAttack;
                case DEFENSE -> statQuery.result += baseDefense;
            }
        } else if (statQuery.statistic == Statistic.DEFENSE) {
            statQuery.result++;
        }
    }
}

class GoblinKing extends Goblin
{
    public GoblinKing(Game game)
    {
        super(game, 3, 3);
    }

    @Override
    public void query(Object source, StatQuery statQuery) {
        if (source != this && statQuery.statistic == Statistic.ATTACK) {
            statQuery.result++;
        } else super.query(source, statQuery);
    }
}

enum Statistic
{
    ATTACK, DEFENSE
}

class StatQuery {
    public Statistic statistic;
    public int result;

    public StatQuery(Statistic statistic) {
        this.statistic = statistic;
    }
}

class Game
{
    public List<Creature> creatures = new ArrayList<>();
}

class Tests {
    @Test
    public void Test()
    {
        Game game = new Game();
        Goblin goblin = new Goblin(game);
        game.creatures.add(goblin);
        assertEquals(1, goblin.getAttack());
        assertEquals(1, goblin.getDefense());

        Goblin goblin1 = new Goblin(game);
        Goblin goblin2 = new Goblin(game);
        game.creatures.add(goblin1);
        game.creatures.add(goblin2);

        assertEquals(1, goblin.getAttack());
        assertEquals(3, goblin.getDefense());
        assertEquals(1, goblin1.getAttack());
        assertEquals(3, goblin1.getDefense());
        assertEquals(1, goblin2.getAttack());
        assertEquals(3, goblin2.getDefense());

        GoblinKing goblinKing = new GoblinKing(game);
        game.creatures.add(goblinKing);
        assertEquals(2, goblin.getAttack());
        assertEquals(4, goblin.getDefense());
        assertEquals(2, goblin1.getAttack());
        assertEquals(4, goblin1.getDefense());
        assertEquals(2, goblin2.getAttack());
        assertEquals(4, goblin2.getDefense());
        assertEquals(3, goblinKing.getAttack());
        assertEquals(6, goblinKing.getDefense());

        game.creatures.remove(goblin);
        assertEquals(2, goblin1.getAttack());
        assertEquals(3, goblin1.getDefense());
        assertEquals(3, goblinKing.getAttack());
        assertEquals(5, goblinKing.getDefense());
    }
    @Test
    public void manyGoblinsTest()
    {
        Game game = new Game();
        Goblin goblin = new Goblin(game);
        game.creatures.add(goblin);

        assertEquals(1, goblin.getAttack());
        assertEquals(1, goblin.getDefense());

        Goblin goblin2 = new Goblin(game);
        game.creatures.add(goblin2);

        assertEquals(1, goblin.getAttack());
        assertEquals(2, goblin.getDefense());

        GoblinKing goblin3 = new GoblinKing(game);
        game.creatures.add(goblin3);

        assertEquals(2, goblin.getAttack());
        assertEquals(3, goblin.getDefense());
    }
}