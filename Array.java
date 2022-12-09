public class Array extends Type {
    public final Type of;
    public final int size;

    public Array(int size, Type of){
        super("[]",Tag.ARRAY_TYPE,size * of.width);
        this.size = size;
        this.of = of;
    }
}
