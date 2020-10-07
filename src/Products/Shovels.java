package Products;

public class Shovels  extends Product{
    public enum Size {
        SMALL,
        NORMAL,
        BIG,
    }

    public enum Material{
        ALUMINUM,
        STEEL,
        PLASTIC,
    }

    private Size size;
    private Material material;

    public Shovels(String productName, int id, int quantity, Size size, Material material) {
        super(productName, id, quantity);
        this.size = size;
        this.material = material;
    }

    public Size getSize() {
        return size;
    }

    public Material getMaterial() {
        return material;
    }
}
