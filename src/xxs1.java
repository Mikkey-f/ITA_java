class xxs1 implements character{
   private final String name = "xll";
    @Override
    public void attack() {
        System.out.println(name +":attack!");
    }

    @Override
    public void greet() {
        System.out.println(name+":Hi!");
    }

    @Override
    public void move() {
        System.out.println(name+":move!");
    }

    @Override
    public int speed() {
        return 10;
    }
}
