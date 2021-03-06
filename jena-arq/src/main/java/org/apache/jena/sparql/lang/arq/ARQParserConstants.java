/* Generated By:JavaCC: Do not edit this line. ARQParserConstants.java */
package org.apache.jena.sparql.lang.arq ;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface ARQParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int SINGLE_LINE_COMMENT = 6;
  /** RegularExpression Id. */
  int WS = 7;
  /** RegularExpression Id. */
  int WSC = 8;
  /** RegularExpression Id. */
  int BOM = 9;
  /** RegularExpression Id. */
  int IRIref = 10;
  /** RegularExpression Id. */
  int PNAME_NS = 11;
  /** RegularExpression Id. */
  int PNAME_LN = 12;
  /** RegularExpression Id. */
  int BLANK_NODE_LABEL = 13;
  /** RegularExpression Id. */
  int VAR1 = 14;
  /** RegularExpression Id. */
  int VAR2 = 15;
  /** RegularExpression Id. */
  int LANGTAG = 16;
  /** RegularExpression Id. */
  int A2Z = 17;
  /** RegularExpression Id. */
  int A2ZN = 18;
  /** RegularExpression Id. */
  int KW_A = 19;
  /** RegularExpression Id. */
  int BASE = 20;
  /** RegularExpression Id. */
  int PREFIX = 21;
  /** RegularExpression Id. */
  int SELECT = 22;
  /** RegularExpression Id. */
  int DISTINCT = 23;
  /** RegularExpression Id. */
  int REDUCED = 24;
  /** RegularExpression Id. */
  int JSON = 25;
  /** RegularExpression Id. */
  int DESCRIBE = 26;
  /** RegularExpression Id. */
  int CONSTRUCT = 27;
  /** RegularExpression Id. */
  int ASK = 28;
  /** RegularExpression Id. */
  int LIMIT = 29;
  /** RegularExpression Id. */
  int OFFSET = 30;
  /** RegularExpression Id. */
  int ORDER = 31;
  /** RegularExpression Id. */
  int BY = 32;
  /** RegularExpression Id. */
  int VALUES = 33;
  /** RegularExpression Id. */
  int UNDEF = 34;
  /** RegularExpression Id. */
  int ASC = 35;
  /** RegularExpression Id. */
  int DESC = 36;
  /** RegularExpression Id. */
  int NAMED = 37;
  /** RegularExpression Id. */
  int FROM = 38;
  /** RegularExpression Id. */
  int WHERE = 39;
  /** RegularExpression Id. */
  int AND = 40;
  /** RegularExpression Id. */
  int GRAPH = 41;
  /** RegularExpression Id. */
  int OPTIONAL = 42;
  /** RegularExpression Id. */
  int UNION = 43;
  /** RegularExpression Id. */
  int MINUS_P = 44;
  /** RegularExpression Id. */
  int BIND = 45;
  /** RegularExpression Id. */
  int SERVICE = 46;
  /** RegularExpression Id. */
  int LET = 47;
  /** RegularExpression Id. */
  int EXISTS = 48;
  /** RegularExpression Id. */
  int NOT = 49;
  /** RegularExpression Id. */
  int AS = 50;
  /** RegularExpression Id. */
  int GROUP = 51;
  /** RegularExpression Id. */
  int HAVING = 52;
  /** RegularExpression Id. */
  int SEPARATOR = 53;
  /** RegularExpression Id. */
  int AGG = 54;
  /** RegularExpression Id. */
  int COUNT = 55;
  /** RegularExpression Id. */
  int MIN = 56;
  /** RegularExpression Id. */
  int MAX = 57;
  /** RegularExpression Id. */
  int SUM = 58;
  /** RegularExpression Id. */
  int AVG = 59;
  /** RegularExpression Id. */
  int STDEV = 60;
  /** RegularExpression Id. */
  int STDEV_SAMP = 61;
  /** RegularExpression Id. */
  int STDEV_POP = 62;
  /** RegularExpression Id. */
  int VARIANCE = 63;
  /** RegularExpression Id. */
  int VAR_SAMP = 64;
  /** RegularExpression Id. */
  int VAR_POP = 65;
  /** RegularExpression Id. */
  int SAMPLE = 66;
  /** RegularExpression Id. */
  int GROUP_CONCAT = 67;
  /** RegularExpression Id. */
  int FILTER = 68;
  /** RegularExpression Id. */
  int BOUND = 69;
  /** RegularExpression Id. */
  int COALESCE = 70;
  /** RegularExpression Id. */
  int IN = 71;
  /** RegularExpression Id. */
  int IF = 72;
  /** RegularExpression Id. */
  int BNODE = 73;
  /** RegularExpression Id. */
  int IRI = 74;
  /** RegularExpression Id. */
  int URI = 75;
  /** RegularExpression Id. */
  int CAST = 76;
  /** RegularExpression Id. */
  int CALL = 77;
  /** RegularExpression Id. */
  int MULTI = 78;
  /** RegularExpression Id. */
  int SHORTEST = 79;
  /** RegularExpression Id. */
  int STR = 80;
  /** RegularExpression Id. */
  int STRLANG = 81;
  /** RegularExpression Id. */
  int STRDT = 82;
  /** RegularExpression Id. */
  int DTYPE = 83;
  /** RegularExpression Id. */
  int LANG = 84;
  /** RegularExpression Id. */
  int LANGMATCHES = 85;
  /** RegularExpression Id. */
  int IS_URI = 86;
  /** RegularExpression Id. */
  int IS_IRI = 87;
  /** RegularExpression Id. */
  int IS_BLANK = 88;
  /** RegularExpression Id. */
  int IS_LITERAL = 89;
  /** RegularExpression Id. */
  int IS_NUMERIC = 90;
  /** RegularExpression Id. */
  int REGEX = 91;
  /** RegularExpression Id. */
  int SAME_TERM = 92;
  /** RegularExpression Id. */
  int RAND = 93;
  /** RegularExpression Id. */
  int ABS = 94;
  /** RegularExpression Id. */
  int CEIL = 95;
  /** RegularExpression Id. */
  int FLOOR = 96;
  /** RegularExpression Id. */
  int ROUND = 97;
  /** RegularExpression Id. */
  int CONCAT = 98;
  /** RegularExpression Id. */
  int SUBSTR = 99;
  /** RegularExpression Id. */
  int STRLEN = 100;
  /** RegularExpression Id. */
  int REPLACE = 101;
  /** RegularExpression Id. */
  int UCASE = 102;
  /** RegularExpression Id. */
  int LCASE = 103;
  /** RegularExpression Id. */
  int ENCODE_FOR_URI = 104;
  /** RegularExpression Id. */
  int CONTAINS = 105;
  /** RegularExpression Id. */
  int STRSTARTS = 106;
  /** RegularExpression Id. */
  int STRENDS = 107;
  /** RegularExpression Id. */
  int STRBEFORE = 108;
  /** RegularExpression Id. */
  int STRAFTER = 109;
  /** RegularExpression Id. */
  int YEAR = 110;
  /** RegularExpression Id. */
  int MONTH = 111;
  /** RegularExpression Id. */
  int DAY = 112;
  /** RegularExpression Id. */
  int HOURS = 113;
  /** RegularExpression Id. */
  int MINUTES = 114;
  /** RegularExpression Id. */
  int SECONDS = 115;
  /** RegularExpression Id. */
  int TIMEZONE = 116;
  /** RegularExpression Id. */
  int TZ = 117;
  /** RegularExpression Id. */
  int NOW = 118;
  /** RegularExpression Id. */
  int UUID = 119;
  /** RegularExpression Id. */
  int STRUUID = 120;
  /** RegularExpression Id. */
  int VERSION = 121;
  /** RegularExpression Id. */
  int MD5 = 122;
  /** RegularExpression Id. */
  int SHA1 = 123;
  /** RegularExpression Id. */
  int SHA224 = 124;
  /** RegularExpression Id. */
  int SHA256 = 125;
  /** RegularExpression Id. */
  int SHA384 = 126;
  /** RegularExpression Id. */
  int SHA512 = 127;
  /** RegularExpression Id. */
  int TRUE = 128;
  /** RegularExpression Id. */
  int FALSE = 129;
  /** RegularExpression Id. */
  int DATA = 130;
  /** RegularExpression Id. */
  int INSERT = 131;
  /** RegularExpression Id. */
  int DELETE = 132;
  /** RegularExpression Id. */
  int INSERT_DATA = 133;
  /** RegularExpression Id. */
  int DELETE_DATA = 134;
  /** RegularExpression Id. */
  int DELETE_WHERE = 135;
  /** RegularExpression Id. */
  int LOAD = 136;
  /** RegularExpression Id. */
  int CLEAR = 137;
  /** RegularExpression Id. */
  int CREATE = 138;
  /** RegularExpression Id. */
  int ADD = 139;
  /** RegularExpression Id. */
  int MOVE = 140;
  /** RegularExpression Id. */
  int COPY = 141;
  /** RegularExpression Id. */
  int META = 142;
  /** RegularExpression Id. */
  int SILENT = 143;
  /** RegularExpression Id. */
  int DROP = 144;
  /** RegularExpression Id. */
  int INTO = 145;
  /** RegularExpression Id. */
  int TO = 146;
  /** RegularExpression Id. */
  int DFT = 147;
  /** RegularExpression Id. */
  int ALL = 148;
  /** RegularExpression Id. */
  int WITH = 149;
  /** RegularExpression Id. */
  int USING = 150;
  /** RegularExpression Id. */
  int DIGITS = 151;
  /** RegularExpression Id. */
  int INTEGER = 152;
  /** RegularExpression Id. */
  int DECIMAL = 153;
  /** RegularExpression Id. */
  int DOUBLE = 154;
  /** RegularExpression Id. */
  int INTEGER_POSITIVE = 155;
  /** RegularExpression Id. */
  int DECIMAL_POSITIVE = 156;
  /** RegularExpression Id. */
  int DOUBLE_POSITIVE = 157;
  /** RegularExpression Id. */
  int INTEGER_NEGATIVE = 158;
  /** RegularExpression Id. */
  int DECIMAL_NEGATIVE = 159;
  /** RegularExpression Id. */
  int DOUBLE_NEGATIVE = 160;
  /** RegularExpression Id. */
  int EXPONENT = 161;
  /** RegularExpression Id. */
  int QUOTE_3D = 162;
  /** RegularExpression Id. */
  int QUOTE_3S = 163;
  /** RegularExpression Id. */
  int ECHAR = 164;
  /** RegularExpression Id. */
  int STRING_LITERAL1 = 165;
  /** RegularExpression Id. */
  int STRING_LITERAL2 = 166;
  /** RegularExpression Id. */
  int STRING_LITERAL_LONG1 = 167;
  /** RegularExpression Id. */
  int STRING_LITERAL_LONG2 = 168;
  /** RegularExpression Id. */
  int LPAREN = 169;
  /** RegularExpression Id. */
  int RPAREN = 170;
  /** RegularExpression Id. */
  int NIL = 171;
  /** RegularExpression Id. */
  int LBRACE = 172;
  /** RegularExpression Id. */
  int RBRACE = 173;
  /** RegularExpression Id. */
  int LBRACKET = 174;
  /** RegularExpression Id. */
  int RBRACKET = 175;
  /** RegularExpression Id. */
  int ANON = 176;
  /** RegularExpression Id. */
  int SEMICOLON = 177;
  /** RegularExpression Id. */
  int COMMA = 178;
  /** RegularExpression Id. */
  int DOT = 179;
  /** RegularExpression Id. */
  int EQ = 180;
  /** RegularExpression Id. */
  int NE = 181;
  /** RegularExpression Id. */
  int GT = 182;
  /** RegularExpression Id. */
  int LT = 183;
  /** RegularExpression Id. */
  int LE = 184;
  /** RegularExpression Id. */
  int GE = 185;
  /** RegularExpression Id. */
  int BANG = 186;
  /** RegularExpression Id. */
  int TILDE = 187;
  /** RegularExpression Id. */
  int COLON = 188;
  /** RegularExpression Id. */
  int SC_OR = 189;
  /** RegularExpression Id. */
  int SC_AND = 190;
  /** RegularExpression Id. */
  int PLUS = 191;
  /** RegularExpression Id. */
  int MINUS = 192;
  /** RegularExpression Id. */
  int STAR = 193;
  /** RegularExpression Id. */
  int SLASH = 194;
  /** RegularExpression Id. */
  int DATATYPE = 195;
  /** RegularExpression Id. */
  int AT = 196;
  /** RegularExpression Id. */
  int ASSIGN = 197;
  /** RegularExpression Id. */
  int VBAR = 198;
  /** RegularExpression Id. */
  int CARAT = 199;
  /** RegularExpression Id. */
  int FPATH = 200;
  /** RegularExpression Id. */
  int RPATH = 201;
  /** RegularExpression Id. */
  int QMARK = 202;
  /** RegularExpression Id. */
  int PN_CHARS_BASE = 203;
  /** RegularExpression Id. */
  int PN_CHARS_U = 204;
  /** RegularExpression Id. */
  int PN_CHARS = 205;
  /** RegularExpression Id. */
  int PN_PREFIX = 206;
  /** RegularExpression Id. */
  int PN_LOCAL = 207;
  /** RegularExpression Id. */
  int VARNAME = 208;
  /** RegularExpression Id. */
  int PN_LOCAL_ESC = 209;
  /** RegularExpression Id. */
  int PLX = 210;
  /** RegularExpression Id. */
  int HEX = 211;
  /** RegularExpression Id. */
  int PERCENT = 212;
  /** RegularExpression Id. */
  int UNKNOWN = 213;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\f\"",
    "<SINGLE_LINE_COMMENT>",
    "<WS>",
    "<WSC>",
    "\"\\ufeff\"",
    "<IRIref>",
    "<PNAME_NS>",
    "<PNAME_LN>",
    "<BLANK_NODE_LABEL>",
    "<VAR1>",
    "<VAR2>",
    "<LANGTAG>",
    "<A2Z>",
    "<A2ZN>",
    "\"a\"",
    "\"base\"",
    "\"prefix\"",
    "\"select\"",
    "\"distinct\"",
    "\"reduced\"",
    "\"json\"",
    "\"describe\"",
    "\"construct\"",
    "\"ask\"",
    "\"limit\"",
    "\"offset\"",
    "\"order\"",
    "\"by\"",
    "\"values\"",
    "\"undef\"",
    "\"asc\"",
    "\"desc\"",
    "\"named\"",
    "\"from\"",
    "\"where\"",
    "\"and\"",
    "\"graph\"",
    "\"optional\"",
    "\"union\"",
    "\"minus\"",
    "\"bind\"",
    "\"service\"",
    "\"let\"",
    "\"exists\"",
    "\"not\"",
    "\"as\"",
    "\"group\"",
    "\"having\"",
    "\"separator\"",
    "\"agg\"",
    "\"count\"",
    "\"min\"",
    "\"max\"",
    "\"sum\"",
    "\"avg\"",
    "\"stdev\"",
    "\"stdev_samp\"",
    "\"stdev_pop\"",
    "\"variance\"",
    "\"var_samp\"",
    "\"var_pop\"",
    "\"sample\"",
    "\"group_concat\"",
    "\"filter\"",
    "\"bound\"",
    "\"coalesce\"",
    "\"in\"",
    "\"if\"",
    "\"bnode\"",
    "\"iri\"",
    "\"uri\"",
    "\"cast\"",
    "\"call\"",
    "\"multi\"",
    "\"shortest\"",
    "\"str\"",
    "\"strlang\"",
    "\"strdt\"",
    "\"datatype\"",
    "\"lang\"",
    "\"langmatches\"",
    "\"isURI\"",
    "\"isIRI\"",
    "\"isBlank\"",
    "\"isLiteral\"",
    "\"isNumeric\"",
    "\"regex\"",
    "\"sameTerm\"",
    "\"RAND\"",
    "\"ABS\"",
    "\"CEIL\"",
    "\"FLOOR\"",
    "\"ROUND\"",
    "\"CONCAT\"",
    "\"SUBSTR\"",
    "\"STRLEN\"",
    "\"REPLACE\"",
    "\"UCASE\"",
    "\"LCASE\"",
    "\"ENCODE_FOR_URI\"",
    "\"CONTAINS\"",
    "\"STRSTARTS\"",
    "\"STRENDS\"",
    "\"STRBEFORE\"",
    "\"STRAFTER\"",
    "\"YEAR\"",
    "\"MONTH\"",
    "\"DAY\"",
    "\"HOURS\"",
    "\"MINUTES\"",
    "\"SECONDS\"",
    "\"TIMEZONE\"",
    "\"TZ\"",
    "\"NOW\"",
    "\"UUID\"",
    "\"STRUUID\"",
    "\"VERSION\"",
    "\"MD5\"",
    "\"SHA1\"",
    "\"SHA224\"",
    "\"SHA256\"",
    "\"SHA384\"",
    "\"SHA512\"",
    "\"true\"",
    "\"false\"",
    "\"data\"",
    "\"insert\"",
    "\"delete\"",
    "<INSERT_DATA>",
    "<DELETE_DATA>",
    "<DELETE_WHERE>",
    "\"load\"",
    "\"clear\"",
    "\"create\"",
    "\"add\"",
    "\"move\"",
    "\"copy\"",
    "\"meta\"",
    "\"silent\"",
    "\"drop\"",
    "\"into\"",
    "\"to\"",
    "\"default\"",
    "\"all\"",
    "\"with\"",
    "\"using\"",
    "<DIGITS>",
    "<INTEGER>",
    "<DECIMAL>",
    "<DOUBLE>",
    "<INTEGER_POSITIVE>",
    "<DECIMAL_POSITIVE>",
    "<DOUBLE_POSITIVE>",
    "<INTEGER_NEGATIVE>",
    "<DECIMAL_NEGATIVE>",
    "<DOUBLE_NEGATIVE>",
    "<EXPONENT>",
    "\"\\\"\\\"\\\"\"",
    "\"\\\'\\\'\\\'\"",
    "<ECHAR>",
    "<STRING_LITERAL1>",
    "<STRING_LITERAL2>",
    "<STRING_LITERAL_LONG1>",
    "<STRING_LITERAL_LONG2>",
    "\"(\"",
    "\")\"",
    "<NIL>",
    "\"{\"",
    "\"}\"",
    "\"[\"",
    "\"]\"",
    "<ANON>",
    "\";\"",
    "\",\"",
    "\".\"",
    "\"=\"",
    "\"!=\"",
    "\">\"",
    "\"<\"",
    "\"<=\"",
    "\">=\"",
    "\"!\"",
    "\"~\"",
    "\":\"",
    "\"||\"",
    "\"&&\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"^^\"",
    "\"@\"",
    "\":=\"",
    "\"|\"",
    "\"^\"",
    "\"->\"",
    "\"<-\"",
    "\"?\"",
    "<PN_CHARS_BASE>",
    "<PN_CHARS_U>",
    "<PN_CHARS>",
    "<PN_PREFIX>",
    "<PN_LOCAL>",
    "<VARNAME>",
    "<PN_LOCAL_ESC>",
    "<PLX>",
    "<HEX>",
    "<PERCENT>",
    "<UNKNOWN>",
  };

}
