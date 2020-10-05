public abstract class Animal {

    private String name;
    private float maxRunDistance;
    private float maxSwimDistance;
    private float maxJumpHeight;

    public Animal(String name, float maxRunDistance, float maxSwimDistance, float maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public void run(float distance) {
        System.out.printf(this.getClass().getName() + " " + name + " run %sm: "
                + (distance <= maxRunDistance && distance >= 0) + '\n', distance);
    }

    public void jump(float height) {
        System.out.printf(this.getClass().getName() + " " + name + " jump %sm: "
                + (height <= maxJumpHeight && height >= 0) + '\n', height);
    }

    public void swim(float distance) {
        System.out.printf(this.getClass().getName() + " " + name + " swim %sm: "
                + (distance <= maxSwimDistance && distance >= 0) + '\n', distance);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + ": " +
                "name='" + name + '\'' +
                ", maxRunDistance=" + maxRunDistance +
                ", maxSwimDistance=" + maxSwimDistance +
                ", maxJumpHeight=" + maxJumpHeight +
                '\n';
    }
}
