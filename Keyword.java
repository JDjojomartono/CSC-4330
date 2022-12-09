
public class Keyword extends Token{
    public final String lexeme;

    public Keyword(String lexeme, int tag){
        super(tag);
        this.lexeme = lexeme;
    }
    public static final Keyword AND = new Keyword("&&", Tag.AND),
        OR = new Keyword("||", Tag.OR),
        EQUAL = new Keyword("==", Tag.EQ),
        N_EQUAL = new Keyword("!=", Tag.NE),
        L_EQUAL = new Keyword("<=", Tag.LE),
        G_EQUAL = new Keyword(">=", Tag.GE),
        TRUE = new Keyword("true", Tag.TRUE),
        FALSE = new Keyword("false", Tag.FALSE),
        IF = new Keyword("if", Tag.IF),
        FOR = new Keyword("for", Tag.FOR),
        ELSE = new Keyword("else", Tag.ELSE),
        BREAK = new Keyword("break", Tag.BREAK),
        DO = new Keyword("do", Tag.DO),
        WHILE = new Keyword("while", Tag.WHILE),
        BOOLEAN = new Keyword("boolean", Tag.BOOLEAN),
        INT = new Keyword("int", Tag.INT),
        CHAR = new Keyword("char", Tag.CHAR),
        FLOAT = new Keyword("float", Tag.FLOAT);
}