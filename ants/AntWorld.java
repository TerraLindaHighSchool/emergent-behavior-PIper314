import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * The world where ants live.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class AntWorld extends World
{
    public static final int SIZE = 640;

    /**
     * Create a new world. It will be initialised with a few ant hills
     * and food sources
     */
    public AntWorld()
    {
        super(SIZE, SIZE, 1);
        setPaintOrder(Ant.class, AntHill.class);
        prepare();
    }
    
    public void act()
    {
        if(getObjects(Food.class).size() == 0)
        {
            Greenfoot.stop();
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        AntHill antHill = new AntHill();
        addObject(antHill,272,349);
        Food food = new Food();
        addObject(food,472,243);
        Food food2 = new Food();
        addObject(food2,353,456);
        Food food3 = new Food();
        addObject(food3,62,67);
        Food food4 = new Food();
        addObject(food4,466,80);
        Food food5 = new Food();
        addObject(food5,251,254);
        Food food6 = new Food();
        addObject(food6,434,405);
        Food food7 = new Food();
        addObject(food7,505,561);
        Food food8 = new Food();
        addObject(food8,57,325);
        antHill.setLocation(164,434);
        food6.setLocation(104,558);
        food.setLocation(554,298);
        food5.setLocation(254,231);
        AntHill antHill2 = new AntHill();
        addObject(antHill2,462,234);
    }
}
