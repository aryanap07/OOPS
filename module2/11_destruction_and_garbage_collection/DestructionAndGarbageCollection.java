class Resource {
    String name;

    Resource(String name) {
        this.name = name;
        System.out.println("Created: " + name);
    }
}

public class DestructionAndGarbageCollection {
    public static void main(String[] args) {
        Resource resource = new Resource("Temporary Resource");
        resource = null;

        System.gc();

        System.out.println("The object is eligible for garbage collection.");
        System.out.println("Java does not provide a deterministic destructor.");
    }
}
