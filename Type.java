public class Type extends Keyword{
    public final int width;

    public Type(String lexeme, int tag, int width){
        super(lexeme,tag);
        this.width = width;
    }

    public static Type INT = new Type("int",Tag.BASIC_TYPE,4);
    public static Type FLOAT = new Type("float",Tag.BASIC_TYPE,8);
    public static Type CHAR = new Type("char",Tag.BASIC_TYPE,1);
    public static Type BOOLEAN = new Type("boolean",Tag.BASIC_TYPE,1);

    public static boolean isNumeric(Type p){
        return p == Type.CHAR || p == Type.INT || p == Type.FLOAT;
    }

    public static Type maxNumericType(Type a,Type b){
        if(!isNumeric(a) || !isNumeric(b)){
            return null;
        }
        if(a == Type.FLOAT||b == Type.FLOAT){
            return Type.FLOAT;
        }
        if(a == Type.INT||b == Type.INT){
            return Type.INT;
        }
        if(a == Type.CHAR||b == Type.CHAR){
            return Type.CHAR;
        }
        return Type.BOOLEAN;
    }
}
