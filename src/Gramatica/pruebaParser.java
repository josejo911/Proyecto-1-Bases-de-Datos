// Generated from prueba.g4 by ANTLR 4.7.1
package Gramatica;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pruebaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, CREATE=14, DATABASE=15, DATABASES=16, 
		ALTER=17, DROP=18, SHOW=19, USE=20, TABLE=21, CONSTRAINT=22, PRIMARY=23, 
		FOREIGN=24, KEY=25, REFERENCES=26, CHECK=27, INT=28, FLOAT=29, DATE=30, 
		CHAR=31, AND=32, OR=33, NOT=34, RENAME=35, TO=36, ADD=37, COLUMN=38, FROM=39, 
		INSERT=40, INTO=41, RELATIONAL=42, TABLES=43, COLUMNS=44, UPDATE=45, SELECT=46, 
		ORDER=47, BY=48, ASC=49, DESC=50, NULL=51, ALL=52, SET=53, WHERE=54, DELETE=55, 
		SEMICOLON=56, WS=57, COMMENTS=58, ID=59, NUM=60, DATEFORMAT=61, CHARFORMAT=62, 
		VALUES=63;
	public static final int
		RULE_program = 0, RULE_query = 1, RULE_createDatabase = 2, RULE_alterDatabase = 3, 
		RULE_dropDatabase = 4, RULE_showDatabase = 5, RULE_useDatabase = 6, RULE_createTable = 7, 
		RULE_dataType = 8, RULE_cConstraint = 9, RULE_primaryKey = 10, RULE_foreignKey = 11, 
		RULE_check = 12, RULE_logic = 13, RULE_valuesFormat = 14, RULE_selectFormat = 15, 
		RULE_orderFormat = 16, RULE_exp = 17, RULE_expression = 18, RULE_andExpr = 19, 
		RULE_eqExpr = 20, RULE_relationExpr = 21, RULE_unaryExpr = 22, RULE_eq_op = 23, 
		RULE_rel_op = 24, RULE_alterTable = 25, RULE_action = 26, RULE_dropTable = 27, 
		RULE_showTables = 28, RULE_showColumns = 29, RULE_insertInto = 30, RULE_update = 31, 
		RULE_deleteFrom = 32, RULE_select = 33;
	public static final String[] ruleNames = {
		"program", "query", "createDatabase", "alterDatabase", "dropDatabase", 
		"showDatabase", "useDatabase", "createTable", "dataType", "cConstraint", 
		"primaryKey", "foreignKey", "check", "logic", "valuesFormat", "selectFormat", 
		"orderFormat", "exp", "expression", "andExpr", "eqExpr", "relationExpr", 
		"unaryExpr", "eq_op", "rel_op", "alterTable", "action", "dropTable", "showTables", 
		"showColumns", "insertInto", "update", "deleteFrom", "select"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "','", "')'", "'PK_'", "'FK_'", "'CH_'", "'=='", "'!='", 
		"'<'", "'>'", "'<='", "'>='", "'='", null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "'*'", null, null, null, 
		"';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "CREATE", "DATABASE", "DATABASES", "ALTER", "DROP", "SHOW", 
		"USE", "TABLE", "CONSTRAINT", "PRIMARY", "FOREIGN", "KEY", "REFERENCES", 
		"CHECK", "INT", "FLOAT", "DATE", "CHAR", "AND", "OR", "NOT", "RENAME", 
		"TO", "ADD", "COLUMN", "FROM", "INSERT", "INTO", "RELATIONAL", "TABLES", 
		"COLUMNS", "UPDATE", "SELECT", "ORDER", "BY", "ASC", "DESC", "NULL", "ALL", 
		"SET", "WHERE", "DELETE", "SEMICOLON", "WS", "COMMENTS", "ID", "NUM", 
		"DATEFORMAT", "CHARFORMAT", "VALUES"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "prueba.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pruebaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SqlScriptContext extends ProgramContext {
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(pruebaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(pruebaParser.SEMICOLON, i);
		}
		public SqlScriptContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitSqlScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new SqlScriptContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << ALTER) | (1L << DROP) | (1L << SHOW) | (1L << USE) | (1L << INSERT) | (1L << UPDATE) | (1L << SELECT) | (1L << DELETE))) != 0)) {
				{
				{
				setState(68);
				query();
				setState(69);
				match(SEMICOLON);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
	 
		public QueryContext() { }
		public void copyFrom(QueryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SqlUseDBContext extends QueryContext {
		public UseDatabaseContext useDatabase() {
			return getRuleContext(UseDatabaseContext.class,0);
		}
		public SqlUseDBContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitSqlUseDB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqlAlterDBContext extends QueryContext {
		public AlterDatabaseContext alterDatabase() {
			return getRuleContext(AlterDatabaseContext.class,0);
		}
		public SqlAlterDBContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitSqlAlterDB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqlShowColumnsContext extends QueryContext {
		public ShowColumnsContext showColumns() {
			return getRuleContext(ShowColumnsContext.class,0);
		}
		public SqlShowColumnsContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitSqlShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqlCreateDBContext extends QueryContext {
		public CreateDatabaseContext createDatabase() {
			return getRuleContext(CreateDatabaseContext.class,0);
		}
		public SqlCreateDBContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitSqlCreateDB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqlShowTBContext extends QueryContext {
		public ShowTablesContext showTables() {
			return getRuleContext(ShowTablesContext.class,0);
		}
		public SqlShowTBContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitSqlShowTB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqlDropTBContext extends QueryContext {
		public DropTableContext dropTable() {
			return getRuleContext(DropTableContext.class,0);
		}
		public SqlDropTBContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitSqlDropTB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqlUpdateTBContext extends QueryContext {
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public SqlUpdateTBContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitSqlUpdateTB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqlAlterTBContext extends QueryContext {
		public AlterTableContext alterTable() {
			return getRuleContext(AlterTableContext.class,0);
		}
		public SqlAlterTBContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitSqlAlterTB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqlCreateTBContext extends QueryContext {
		public CreateTableContext createTable() {
			return getRuleContext(CreateTableContext.class,0);
		}
		public SqlCreateTBContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitSqlCreateTB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqlShowDBContext extends QueryContext {
		public ShowDatabaseContext showDatabase() {
			return getRuleContext(ShowDatabaseContext.class,0);
		}
		public SqlShowDBContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitSqlShowDB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqlDeleteTBContext extends QueryContext {
		public DeleteFromContext deleteFrom() {
			return getRuleContext(DeleteFromContext.class,0);
		}
		public SqlDeleteTBContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitSqlDeleteTB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqlDropDBContext extends QueryContext {
		public DropDatabaseContext dropDatabase() {
			return getRuleContext(DropDatabaseContext.class,0);
		}
		public SqlDropDBContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitSqlDropDB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqlInsertTBContext extends QueryContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public SqlInsertTBContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitSqlInsertTB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqlSelectTBContext extends QueryContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public SqlSelectTBContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitSqlSelectTB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_query);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new SqlCreateDBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				createDatabase();
				}
				break;
			case 2:
				_localctx = new SqlAlterDBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				alterDatabase();
				}
				break;
			case 3:
				_localctx = new SqlDropDBContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				dropDatabase();
				}
				break;
			case 4:
				_localctx = new SqlShowDBContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				showDatabase();
				}
				break;
			case 5:
				_localctx = new SqlUseDBContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				useDatabase();
				}
				break;
			case 6:
				_localctx = new SqlCreateTBContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
				createTable();
				}
				break;
			case 7:
				_localctx = new SqlAlterTBContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(82);
				alterTable();
				}
				break;
			case 8:
				_localctx = new SqlDropTBContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(83);
				dropTable();
				}
				break;
			case 9:
				_localctx = new SqlShowTBContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(84);
				showTables();
				}
				break;
			case 10:
				_localctx = new SqlShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(85);
				showColumns();
				}
				break;
			case 11:
				_localctx = new SqlInsertTBContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(86);
				insertInto();
				}
				break;
			case 12:
				_localctx = new SqlUpdateTBContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(87);
				update();
				}
				break;
			case 13:
				_localctx = new SqlDeleteTBContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(88);
				deleteFrom();
				}
				break;
			case 14:
				_localctx = new SqlSelectTBContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(89);
				select();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateDatabaseContext extends ParserRuleContext {
		public CreateDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDatabase; }
	 
		public CreateDatabaseContext() { }
		public void copyFrom(CreateDatabaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateDatabaseRuleContext extends CreateDatabaseContext {
		public TerminalNode CREATE() { return getToken(pruebaParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(pruebaParser.DATABASE, 0); }
		public TerminalNode ID() { return getToken(pruebaParser.ID, 0); }
		public CreateDatabaseRuleContext(CreateDatabaseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitCreateDatabaseRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDatabaseContext createDatabase() throws RecognitionException {
		CreateDatabaseContext _localctx = new CreateDatabaseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_createDatabase);
		try {
			_localctx = new CreateDatabaseRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(CREATE);
			setState(93);
			match(DATABASE);
			setState(94);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterDatabaseContext extends ParserRuleContext {
		public AlterDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDatabase; }
	 
		public AlterDatabaseContext() { }
		public void copyFrom(AlterDatabaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AlterDatabaseRuleContext extends AlterDatabaseContext {
		public TerminalNode ALTER() { return getToken(pruebaParser.ALTER, 0); }
		public TerminalNode DATABASE() { return getToken(pruebaParser.DATABASE, 0); }
		public List<TerminalNode> ID() { return getTokens(pruebaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pruebaParser.ID, i);
		}
		public TerminalNode RENAME() { return getToken(pruebaParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(pruebaParser.TO, 0); }
		public AlterDatabaseRuleContext(AlterDatabaseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitAlterDatabaseRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterDatabaseContext alterDatabase() throws RecognitionException {
		AlterDatabaseContext _localctx = new AlterDatabaseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_alterDatabase);
		try {
			_localctx = new AlterDatabaseRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(ALTER);
			setState(97);
			match(DATABASE);
			setState(98);
			match(ID);
			setState(99);
			match(RENAME);
			setState(100);
			match(TO);
			setState(101);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropDatabaseContext extends ParserRuleContext {
		public DropDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropDatabase; }
	 
		public DropDatabaseContext() { }
		public void copyFrom(DropDatabaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DropDatabaseRuleContext extends DropDatabaseContext {
		public TerminalNode DROP() { return getToken(pruebaParser.DROP, 0); }
		public TerminalNode DATABASE() { return getToken(pruebaParser.DATABASE, 0); }
		public TerminalNode ID() { return getToken(pruebaParser.ID, 0); }
		public DropDatabaseRuleContext(DropDatabaseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitDropDatabaseRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropDatabaseContext dropDatabase() throws RecognitionException {
		DropDatabaseContext _localctx = new DropDatabaseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dropDatabase);
		try {
			_localctx = new DropDatabaseRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(DROP);
			setState(104);
			match(DATABASE);
			setState(105);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowDatabaseContext extends ParserRuleContext {
		public ShowDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showDatabase; }
	 
		public ShowDatabaseContext() { }
		public void copyFrom(ShowDatabaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShowDatabaseRuleContext extends ShowDatabaseContext {
		public TerminalNode SHOW() { return getToken(pruebaParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(pruebaParser.DATABASES, 0); }
		public ShowDatabaseRuleContext(ShowDatabaseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitShowDatabaseRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowDatabaseContext showDatabase() throws RecognitionException {
		ShowDatabaseContext _localctx = new ShowDatabaseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_showDatabase);
		try {
			_localctx = new ShowDatabaseRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(SHOW);
			setState(108);
			match(DATABASES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseDatabaseContext extends ParserRuleContext {
		public UseDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useDatabase; }
	 
		public UseDatabaseContext() { }
		public void copyFrom(UseDatabaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UseDatabaseRuleContext extends UseDatabaseContext {
		public TerminalNode USE() { return getToken(pruebaParser.USE, 0); }
		public TerminalNode DATABASE() { return getToken(pruebaParser.DATABASE, 0); }
		public TerminalNode ID() { return getToken(pruebaParser.ID, 0); }
		public UseDatabaseRuleContext(UseDatabaseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitUseDatabaseRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseDatabaseContext useDatabase() throws RecognitionException {
		UseDatabaseContext _localctx = new UseDatabaseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_useDatabase);
		try {
			_localctx = new UseDatabaseRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(USE);
			setState(111);
			match(DATABASE);
			setState(112);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableContext extends ParserRuleContext {
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
	 
		public CreateTableContext() { }
		public void copyFrom(CreateTableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateTableRuleContext extends CreateTableContext {
		public TerminalNode CREATE() { return getToken(pruebaParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(pruebaParser.TABLE, 0); }
		public List<TerminalNode> ID() { return getTokens(pruebaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pruebaParser.ID, i);
		}
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode CONSTRAINT() { return getToken(pruebaParser.CONSTRAINT, 0); }
		public CConstraintContext cConstraint() {
			return getRuleContext(CConstraintContext.class,0);
		}
		public CreateTableRuleContext(CreateTableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitCreateTableRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_createTable);
		int _la;
		try {
			_localctx = new CreateTableRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(CREATE);
			setState(115);
			match(TABLE);
			setState(116);
			match(ID);
			setState(117);
			match(T__0);
			setState(118);
			match(ID);
			setState(119);
			dataType();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(120);
				match(T__1);
				setState(121);
				match(ID);
				setState(122);
				dataType();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(128);
			match(CONSTRAINT);
			setState(129);
			cConstraint();
			}
			setState(131);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DateContext extends DataTypeContext {
		public TerminalNode DATE() { return getToken(pruebaParser.DATE, 0); }
		public DateContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharContext extends DataTypeContext {
		public TerminalNode CHAR() { return getToken(pruebaParser.CHAR, 0); }
		public TerminalNode NUM() { return getToken(pruebaParser.NUM, 0); }
		public CharContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatContext extends DataTypeContext {
		public TerminalNode FLOAT() { return getToken(pruebaParser.FLOAT, 0); }
		public FloatContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends DataTypeContext {
		public TerminalNode INT() { return getToken(pruebaParser.INT, 0); }
		public IntContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dataType);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(FLOAT);
				}
				break;
			case DATE:
				_localctx = new DateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				match(DATE);
				}
				break;
			case CHAR:
				_localctx = new CharContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				match(CHAR);
				setState(137);
				match(T__0);
				setState(138);
				match(NUM);
				setState(139);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CConstraintContext extends ParserRuleContext {
		public CConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cConstraint; }
	 
		public CConstraintContext() { }
		public void copyFrom(CConstraintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrimaryKeyConstraintRuleContext extends CConstraintContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public PrimaryKeyConstraintRuleContext(CConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitPrimaryKeyConstraintRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForeignKeyConstraintRuleContext extends CConstraintContext {
		public List<ForeignKeyContext> foreignKey() {
			return getRuleContexts(ForeignKeyContext.class);
		}
		public ForeignKeyContext foreignKey(int i) {
			return getRuleContext(ForeignKeyContext.class,i);
		}
		public ForeignKeyConstraintRuleContext(CConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitForeignKeyConstraintRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CheckConstraintRuleContext extends CConstraintContext {
		public List<CheckContext> check() {
			return getRuleContexts(CheckContext.class);
		}
		public CheckContext check(int i) {
			return getRuleContext(CheckContext.class,i);
		}
		public CheckConstraintRuleContext(CConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitCheckConstraintRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CConstraintContext cConstraint() throws RecognitionException {
		CConstraintContext _localctx = new CConstraintContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cConstraint);
		int _la;
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new PrimaryKeyConstraintRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				primaryKey();
				}
				break;
			case T__4:
				_localctx = new ForeignKeyConstraintRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				foreignKey();
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(144);
					foreignKey();
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__5:
				_localctx = new CheckConstraintRuleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				check();
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(151);
					check();
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryKeyContext extends ParserRuleContext {
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
	 
		public PrimaryKeyContext() { }
		public void copyFrom(PrimaryKeyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrimaryKeyRuleContext extends PrimaryKeyContext {
		public List<TerminalNode> ID() { return getTokens(pruebaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pruebaParser.ID, i);
		}
		public TerminalNode PRIMARY() { return getToken(pruebaParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(pruebaParser.KEY, 0); }
		public PrimaryKeyRuleContext(PrimaryKeyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitPrimaryKeyRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_primaryKey);
		int _la;
		try {
			_localctx = new PrimaryKeyRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__3);
			setState(160);
			match(ID);
			setState(161);
			match(PRIMARY);
			setState(162);
			match(KEY);
			setState(163);
			match(T__0);
			setState(164);
			match(ID);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(165);
				match(T__1);
				setState(166);
				match(ID);
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeignKeyContext extends ParserRuleContext {
		public ForeignKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKey; }
	 
		public ForeignKeyContext() { }
		public void copyFrom(ForeignKeyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForeignKeyRuleContext extends ForeignKeyContext {
		public List<TerminalNode> ID() { return getTokens(pruebaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pruebaParser.ID, i);
		}
		public TerminalNode FOREIGN() { return getToken(pruebaParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(pruebaParser.KEY, 0); }
		public TerminalNode REFERENCES() { return getToken(pruebaParser.REFERENCES, 0); }
		public ForeignKeyRuleContext(ForeignKeyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitForeignKeyRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeignKeyContext foreignKey() throws RecognitionException {
		ForeignKeyContext _localctx = new ForeignKeyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_foreignKey);
		int _la;
		try {
			_localctx = new ForeignKeyRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__4);
			setState(175);
			match(ID);
			setState(176);
			match(FOREIGN);
			setState(177);
			match(KEY);
			setState(178);
			match(T__0);
			setState(179);
			match(ID);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(180);
				match(T__1);
				setState(181);
				match(ID);
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			match(T__2);
			setState(188);
			match(REFERENCES);
			setState(189);
			match(ID);
			setState(190);
			match(T__0);
			setState(191);
			match(ID);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(192);
				match(T__1);
				setState(193);
				match(ID);
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CheckContext extends ParserRuleContext {
		public CheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check; }
	 
		public CheckContext() { }
		public void copyFrom(CheckContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CheckRuleContext extends CheckContext {
		public TerminalNode ID() { return getToken(pruebaParser.ID, 0); }
		public TerminalNode CHECK() { return getToken(pruebaParser.CHECK, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CheckRuleContext(CheckContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitCheckRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckContext check() throws RecognitionException {
		CheckContext _localctx = new CheckContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_check);
		try {
			_localctx = new CheckRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__5);
			setState(202);
			match(ID);
			setState(203);
			match(CHECK);
			setState(204);
			match(T__0);
			setState(205);
			exp();
			setState(206);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicContext extends ParserRuleContext {
		public LogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic; }
	 
		public LogicContext() { }
		public void copyFrom(LogicContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndLogicRuleContext extends LogicContext {
		public TerminalNode AND() { return getToken(pruebaParser.AND, 0); }
		public AndLogicRuleContext(LogicContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitAndLogicRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrLogicRuleContext extends LogicContext {
		public TerminalNode OR() { return getToken(pruebaParser.OR, 0); }
		public OrLogicRuleContext(LogicContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitOrLogicRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicContext logic() throws RecognitionException {
		LogicContext _localctx = new LogicContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_logic);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				_localctx = new AndLogicRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(AND);
				}
				break;
			case OR:
				_localctx = new OrLogicRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(OR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValuesFormatContext extends ParserRuleContext {
		public ValuesFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesFormat; }
	 
		public ValuesFormatContext() { }
		public void copyFrom(ValuesFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumValueFormatRuleContext extends ValuesFormatContext {
		public TerminalNode NUM() { return getToken(pruebaParser.NUM, 0); }
		public NumValueFormatRuleContext(ValuesFormatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitNumValueFormatRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdValueFormatRuleContext extends ValuesFormatContext {
		public TerminalNode ID() { return getToken(pruebaParser.ID, 0); }
		public IdValueFormatRuleContext(ValuesFormatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitIdValueFormatRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharFormatRuleContext extends ValuesFormatContext {
		public TerminalNode CHARFORMAT() { return getToken(pruebaParser.CHARFORMAT, 0); }
		public CharFormatRuleContext(ValuesFormatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitCharFormatRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DateFormatRuleContext extends ValuesFormatContext {
		public TerminalNode DATEFORMAT() { return getToken(pruebaParser.DATEFORMAT, 0); }
		public DateFormatRuleContext(ValuesFormatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitDateFormatRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesFormatContext valuesFormat() throws RecognitionException {
		ValuesFormatContext _localctx = new ValuesFormatContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_valuesFormat);
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdValueFormatRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(ID);
				}
				break;
			case NUM:
				_localctx = new NumValueFormatRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(NUM);
				}
				break;
			case DATEFORMAT:
				_localctx = new DateFormatRuleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				match(DATEFORMAT);
				}
				break;
			case CHARFORMAT:
				_localctx = new CharFormatRuleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
				match(CHARFORMAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectFormatContext extends ParserRuleContext {
		public SelectFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectFormat; }
	 
		public SelectFormatContext() { }
		public void copyFrom(SelectFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AllSelectFormatRuleContext extends SelectFormatContext {
		public TerminalNode ALL() { return getToken(pruebaParser.ALL, 0); }
		public AllSelectFormatRuleContext(SelectFormatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitAllSelectFormatRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdSelectFormatRuleContext extends SelectFormatContext {
		public List<TerminalNode> ID() { return getTokens(pruebaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pruebaParser.ID, i);
		}
		public IdSelectFormatRuleContext(SelectFormatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitIdSelectFormatRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectFormatContext selectFormat() throws RecognitionException {
		SelectFormatContext _localctx = new SelectFormatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_selectFormat);
		int _la;
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				_localctx = new AllSelectFormatRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(ALL);
				}
				break;
			case ID:
				_localctx = new IdSelectFormatRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(ID);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(220);
					match(T__1);
					setState(221);
					match(ID);
					}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderFormatContext extends ParserRuleContext {
		public OrderFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderFormat; }
	 
		public OrderFormatContext() { }
		public void copyFrom(OrderFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AscOrderFormatRuleContext extends OrderFormatContext {
		public TerminalNode ASC() { return getToken(pruebaParser.ASC, 0); }
		public AscOrderFormatRuleContext(OrderFormatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitAscOrderFormatRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescOrderFormatRuleContext extends OrderFormatContext {
		public TerminalNode DESC() { return getToken(pruebaParser.DESC, 0); }
		public DescOrderFormatRuleContext(OrderFormatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitDescOrderFormatRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderFormatContext orderFormat() throws RecognitionException {
		OrderFormatContext _localctx = new OrderFormatContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_orderFormat);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASC:
				_localctx = new AscOrderFormatRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(ASC);
				}
				break;
			case DESC:
				_localctx = new DescOrderFormatRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(DESC);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmptyExpressionContext extends ExpContext {
		public EmptyExpressionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitEmptyExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpRuleContext extends ExpContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpRuleContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitExpRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exp);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new ExpRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				expression(0);
				}
				break;
			case T__2:
			case ORDER:
			case SEMICOLON:
				_localctx = new EmptyExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndExpressionRuleContext extends ExpressionContext {
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public AndExpressionRuleContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitAndExpressionRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExpressionRuleContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(pruebaParser.OR, 0); }
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public OrExpressionRuleContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitOrExpressionRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AndExpressionRuleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(238);
			andExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrExpressionRuleContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(240);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(241);
					match(OR);
					setState(242);
					andExpr(0);
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExprContext extends ParserRuleContext {
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
	 
		public AndExprContext() { }
		public void copyFrom(AndExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndExpressioRuleContext extends AndExprContext {
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public TerminalNode AND() { return getToken(pruebaParser.AND, 0); }
		public EqExprContext eqExpr() {
			return getRuleContext(EqExprContext.class,0);
		}
		public AndExpressioRuleContext(AndExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitAndExpressioRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqExpressionRuleContext extends AndExprContext {
		public EqExprContext eqExpr() {
			return getRuleContext(EqExprContext.class,0);
		}
		public EqExpressionRuleContext(AndExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitEqExpressionRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExprContext andExpr() throws RecognitionException {
		return andExpr(0);
	}

	private AndExprContext andExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExprContext _localctx = new AndExprContext(_ctx, _parentState);
		AndExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_andExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new EqExpressionRuleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(249);
			eqExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressioRuleContext(new AndExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_andExpr);
					setState(251);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(252);
					match(AND);
					setState(253);
					eqExpr(0);
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqExprContext extends ParserRuleContext {
		public EqExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqExpr; }
	 
		public EqExprContext() { }
		public void copyFrom(EqExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelationExprRuleContext extends EqExprContext {
		public RelationExprContext relationExpr() {
			return getRuleContext(RelationExprContext.class,0);
		}
		public RelationExprRuleContext(EqExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitRelationExprRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExpressionRuleContext extends EqExprContext {
		public EqExprContext eqExpr() {
			return getRuleContext(EqExprContext.class,0);
		}
		public Eq_opContext eq_op() {
			return getRuleContext(Eq_opContext.class,0);
		}
		public RelationExprContext relationExpr() {
			return getRuleContext(RelationExprContext.class,0);
		}
		public EqualityExpressionRuleContext(EqExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitEqualityExpressionRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqExprContext eqExpr() throws RecognitionException {
		return eqExpr(0);
	}

	private EqExprContext eqExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqExprContext _localctx = new EqExprContext(_ctx, _parentState);
		EqExprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_eqExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RelationExprRuleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(260);
			relationExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EqualityExpressionRuleContext(new EqExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_eqExpr);
					setState(262);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(263);
					eq_op();
					setState(264);
					relationExpr(0);
					}
					} 
				}
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationExprContext extends ParserRuleContext {
		public RelationExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationExpr; }
	 
		public RelationExprContext() { }
		public void copyFrom(RelationExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryExpressionRuleContext extends RelationExprContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public UnaryExpressionRuleContext(RelationExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitUnaryExpressionRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationExpressionRuleContext extends RelationExprContext {
		public RelationExprContext relationExpr() {
			return getRuleContext(RelationExprContext.class,0);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public RelationExpressionRuleContext(RelationExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitRelationExpressionRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationExprContext relationExpr() throws RecognitionException {
		return relationExpr(0);
	}

	private RelationExprContext relationExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationExprContext _localctx = new RelationExprContext(_ctx, _parentState);
		RelationExprContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_relationExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new UnaryExpressionRuleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(272);
			unaryExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelationExpressionRuleContext(new RelationExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_relationExpr);
					setState(274);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(275);
					rel_op();
					setState(276);
					unaryExpr();
					}
					} 
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExprContext extends ParserRuleContext {
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
	 
		public UnaryExprContext() { }
		public void copyFrom(UnaryExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotExpressionRuleContext extends UnaryExprContext {
		public TerminalNode ID() { return getToken(pruebaParser.ID, 0); }
		public TerminalNode NOT() { return getToken(pruebaParser.NOT, 0); }
		public NotExpressionRuleContext(UnaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitNotExpressionRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_unaryExpr);
		int _la;
		try {
			_localctx = new NotExpressionRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(T__0);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(284);
				match(NOT);
				}
			}

			setState(287);
			match(ID);
			setState(288);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Eq_opContext extends ParserRuleContext {
		public Eq_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitEq_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eq_opContext eq_op() throws RecognitionException {
		Eq_opContext _localctx = new Eq_opContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_eq_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rel_opContext extends ParserRuleContext {
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitRel_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterTableContext extends ParserRuleContext {
		public AlterTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTable; }
	 
		public AlterTableContext() { }
		public void copyFrom(AlterTableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AlterTableActionRuleContext extends AlterTableContext {
		public TerminalNode ALTER() { return getToken(pruebaParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(pruebaParser.TABLE, 0); }
		public TerminalNode ID() { return getToken(pruebaParser.ID, 0); }
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public AlterTableActionRuleContext(AlterTableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitAlterTableActionRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableIdRuleContext extends AlterTableContext {
		public TerminalNode ALTER() { return getToken(pruebaParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(pruebaParser.TABLE, 0); }
		public List<TerminalNode> ID() { return getTokens(pruebaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pruebaParser.ID, i);
		}
		public TerminalNode RENAME() { return getToken(pruebaParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(pruebaParser.TO, 0); }
		public AlterTableIdRuleContext(AlterTableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitAlterTableIdRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableContext alterTable() throws RecognitionException {
		AlterTableContext _localctx = new AlterTableContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_alterTable);
		int _la;
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new AlterTableIdRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(ALTER);
				setState(295);
				match(TABLE);
				setState(296);
				match(ID);
				setState(297);
				match(RENAME);
				setState(298);
				match(TO);
				setState(299);
				match(ID);
				}
				break;
			case 2:
				_localctx = new AlterTableActionRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(ALTER);
				setState(301);
				match(TABLE);
				setState(302);
				match(ID);
				setState(303);
				action();
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(304);
					match(T__1);
					setState(305);
					action();
					}
					}
					setState(310);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionContext extends ParserRuleContext {
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
	 
		public ActionContext() { }
		public void copyFrom(ActionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ActionAddConstraintRuleContext extends ActionContext {
		public TerminalNode ADD() { return getToken(pruebaParser.ADD, 0); }
		public TerminalNode CONSTRAINT() { return getToken(pruebaParser.CONSTRAINT, 0); }
		public CConstraintContext cConstraint() {
			return getRuleContext(CConstraintContext.class,0);
		}
		public ActionAddConstraintRuleContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitActionAddConstraintRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ActionDropConstraintRuleContext extends ActionContext {
		public TerminalNode DROP() { return getToken(pruebaParser.DROP, 0); }
		public TerminalNode CONSTRAINT() { return getToken(pruebaParser.CONSTRAINT, 0); }
		public TerminalNode ID() { return getToken(pruebaParser.ID, 0); }
		public ActionDropConstraintRuleContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitActionDropConstraintRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ActionAddColumnRuleContext extends ActionContext {
		public TerminalNode ADD() { return getToken(pruebaParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(pruebaParser.COLUMN, 0); }
		public TerminalNode ID() { return getToken(pruebaParser.ID, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(pruebaParser.CONSTRAINT, 0); }
		public CConstraintContext cConstraint() {
			return getRuleContext(CConstraintContext.class,0);
		}
		public ActionAddColumnRuleContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitActionAddColumnRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ActionDropColumnRuleContext extends ActionContext {
		public TerminalNode DROP() { return getToken(pruebaParser.DROP, 0); }
		public TerminalNode COLUMN() { return getToken(pruebaParser.COLUMN, 0); }
		public TerminalNode ID() { return getToken(pruebaParser.ID, 0); }
		public ActionDropColumnRuleContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitActionDropColumnRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_action);
		try {
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new ActionAddColumnRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(ADD);
				setState(314);
				match(COLUMN);
				setState(315);
				match(ID);
				setState(316);
				dataType();
				setState(317);
				match(CONSTRAINT);
				setState(318);
				cConstraint();
				}
				break;
			case 2:
				_localctx = new ActionAddConstraintRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				match(ADD);
				setState(321);
				match(CONSTRAINT);
				setState(322);
				cConstraint();
				}
				break;
			case 3:
				_localctx = new ActionDropColumnRuleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				match(DROP);
				setState(324);
				match(COLUMN);
				setState(325);
				match(ID);
				}
				break;
			case 4:
				_localctx = new ActionDropConstraintRuleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(326);
				match(DROP);
				setState(327);
				match(CONSTRAINT);
				setState(328);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropTableContext extends ParserRuleContext {
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
	 
		public DropTableContext() { }
		public void copyFrom(DropTableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DropTableRuleContext extends DropTableContext {
		public TerminalNode DROP() { return getToken(pruebaParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(pruebaParser.TABLE, 0); }
		public TerminalNode ID() { return getToken(pruebaParser.ID, 0); }
		public DropTableRuleContext(DropTableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitDropTableRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_dropTable);
		try {
			_localctx = new DropTableRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(DROP);
			setState(332);
			match(TABLE);
			setState(333);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowTablesContext extends ParserRuleContext {
		public ShowTablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showTables; }
	 
		public ShowTablesContext() { }
		public void copyFrom(ShowTablesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShowTablesRuleContext extends ShowTablesContext {
		public TerminalNode SHOW() { return getToken(pruebaParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(pruebaParser.TABLES, 0); }
		public ShowTablesRuleContext(ShowTablesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitShowTablesRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowTablesContext showTables() throws RecognitionException {
		ShowTablesContext _localctx = new ShowTablesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_showTables);
		try {
			_localctx = new ShowTablesRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(SHOW);
			setState(336);
			match(TABLES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowColumnsContext extends ParserRuleContext {
		public ShowColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showColumns; }
	 
		public ShowColumnsContext() { }
		public void copyFrom(ShowColumnsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShowColumnsRuleContext extends ShowColumnsContext {
		public TerminalNode SHOW() { return getToken(pruebaParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(pruebaParser.COLUMNS, 0); }
		public TerminalNode FROM() { return getToken(pruebaParser.FROM, 0); }
		public TerminalNode ID() { return getToken(pruebaParser.ID, 0); }
		public ShowColumnsRuleContext(ShowColumnsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitShowColumnsRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowColumnsContext showColumns() throws RecognitionException {
		ShowColumnsContext _localctx = new ShowColumnsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_showColumns);
		try {
			_localctx = new ShowColumnsRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(SHOW);
			setState(339);
			match(COLUMNS);
			setState(340);
			match(FROM);
			setState(341);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertIntoContext extends ParserRuleContext {
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
	 
		public InsertIntoContext() { }
		public void copyFrom(InsertIntoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InsertIntoRuleContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(pruebaParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(pruebaParser.INTO, 0); }
		public List<TerminalNode> ID() { return getTokens(pruebaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pruebaParser.ID, i);
		}
		public TerminalNode VALUES() { return getToken(pruebaParser.VALUES, 0); }
		public List<ValuesFormatContext> valuesFormat() {
			return getRuleContexts(ValuesFormatContext.class);
		}
		public ValuesFormatContext valuesFormat(int i) {
			return getRuleContext(ValuesFormatContext.class,i);
		}
		public InsertIntoRuleContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitInsertIntoRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_insertInto);
		int _la;
		try {
			_localctx = new InsertIntoRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(INSERT);
			setState(344);
			match(INTO);
			setState(345);
			match(ID);
			setState(346);
			match(T__0);
			setState(347);
			match(ID);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(348);
				match(T__1);
				setState(349);
				match(ID);
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(355);
			match(T__2);
			setState(356);
			match(VALUES);
			setState(357);
			match(T__0);
			setState(358);
			valuesFormat();
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(359);
				match(T__1);
				setState(360);
				valuesFormat();
				}
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(366);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateContext extends ParserRuleContext {
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
	 
		public UpdateContext() { }
		public void copyFrom(UpdateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UpdateRuleContext extends UpdateContext {
		public TerminalNode UPDATE() { return getToken(pruebaParser.UPDATE, 0); }
		public List<TerminalNode> ID() { return getTokens(pruebaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pruebaParser.ID, i);
		}
		public TerminalNode SET() { return getToken(pruebaParser.SET, 0); }
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(pruebaParser.WHERE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public UpdateRuleContext(UpdateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitUpdateRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_update);
		int _la;
		try {
			_localctx = new UpdateRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(UPDATE);
			setState(369);
			match(ID);
			setState(370);
			match(SET);
			setState(371);
			match(ID);
			setState(372);
			match(T__12);
			setState(373);
			dataType();
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(374);
				match(T__1);
				setState(375);
				dataType();
				}
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(381);
				match(WHERE);
				setState(382);
				exp();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteFromContext extends ParserRuleContext {
		public DeleteFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteFrom; }
	 
		public DeleteFromContext() { }
		public void copyFrom(DeleteFromContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeleteFromRuleContext extends DeleteFromContext {
		public TerminalNode DELETE() { return getToken(pruebaParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(pruebaParser.FROM, 0); }
		public TerminalNode ID() { return getToken(pruebaParser.ID, 0); }
		public TerminalNode WHERE() { return getToken(pruebaParser.WHERE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DeleteFromRuleContext(DeleteFromContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitDeleteFromRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteFromContext deleteFrom() throws RecognitionException {
		DeleteFromContext _localctx = new DeleteFromContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_deleteFrom);
		int _la;
		try {
			_localctx = new DeleteFromRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(DELETE);
			setState(386);
			match(FROM);
			setState(387);
			match(ID);
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(388);
				match(WHERE);
				setState(389);
				exp();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectContext extends ParserRuleContext {
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
	 
		public SelectContext() { }
		public void copyFrom(SelectContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectRuleContext extends SelectContext {
		public TerminalNode SELECT() { return getToken(pruebaParser.SELECT, 0); }
		public SelectFormatContext selectFormat() {
			return getRuleContext(SelectFormatContext.class,0);
		}
		public TerminalNode FROM() { return getToken(pruebaParser.FROM, 0); }
		public TerminalNode ID() { return getToken(pruebaParser.ID, 0); }
		public TerminalNode WHERE() { return getToken(pruebaParser.WHERE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(pruebaParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(pruebaParser.BY, 0); }
		public OrderFormatContext orderFormat() {
			return getRuleContext(OrderFormatContext.class,0);
		}
		public SelectRuleContext(SelectContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitSelectRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_select);
		int _la;
		try {
			_localctx = new SelectRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(SELECT);
			setState(393);
			selectFormat();
			setState(394);
			match(FROM);
			setState(395);
			match(ID);
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(396);
				match(WHERE);
				setState(397);
				exp();
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(398);
					match(ORDER);
					setState(399);
					match(BY);
					setState(400);
					orderFormat();
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 19:
			return andExpr_sempred((AndExprContext)_localctx, predIndex);
		case 20:
			return eqExpr_sempred((EqExprContext)_localctx, predIndex);
		case 21:
			return relationExpr_sempred((RelationExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpr_sempred(AndExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean eqExpr_sempred(EqExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationExpr_sempred(RelationExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3A\u0198\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\7\2J\n\2\f\2\16\2M\13\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3]\n\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t~\n\t\f\t\16\t\u0081\13\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008f\n\n\3\13\3\13\3\13"+
		"\7\13\u0094\n\13\f\13\16\13\u0097\13\13\3\13\3\13\7\13\u009b\n\13\f\13"+
		"\16\13\u009e\13\13\5\13\u00a0\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f"+
		"\u00aa\n\f\f\f\16\f\u00ad\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\7\r\u00b9\n\r\f\r\16\r\u00bc\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00c5"+
		"\n\r\f\r\16\r\u00c8\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\5\17\u00d5\n\17\3\20\3\20\3\20\3\20\5\20\u00db\n\20\3\21\3\21"+
		"\3\21\3\21\7\21\u00e1\n\21\f\21\16\21\u00e4\13\21\5\21\u00e6\n\21\3\22"+
		"\3\22\5\22\u00ea\n\22\3\23\3\23\5\23\u00ee\n\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\7\24\u00f6\n\24\f\24\16\24\u00f9\13\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\7\25\u0101\n\25\f\25\16\25\u0104\13\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\7\26\u010d\n\26\f\26\16\26\u0110\13\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\7\27\u0119\n\27\f\27\16\27\u011c\13\27\3\30\3\30\5"+
		"\30\u0120\n\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0135\n\33\f\33\16\33\u0138"+
		"\13\33\5\33\u013a\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u014c\n\34\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \7 \u0161"+
		"\n \f \16 \u0164\13 \3 \3 \3 \3 \3 \3 \7 \u016c\n \f \16 \u016f\13 \3"+
		" \3 \3!\3!\3!\3!\3!\3!\3!\3!\7!\u017b\n!\f!\16!\u017e\13!\3!\3!\5!\u0182"+
		"\n!\3\"\3\"\3\"\3\"\3\"\5\"\u0189\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0194"+
		"\n#\5#\u0196\n#\3#\2\6&(*,$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BD\2\4\3\2\t\n\3\2\13\17\2\u01a7\2K\3\2\2\2\4\\"+
		"\3\2\2\2\6^\3\2\2\2\bb\3\2\2\2\ni\3\2\2\2\fm\3\2\2\2\16p\3\2\2\2\20t\3"+
		"\2\2\2\22\u008e\3\2\2\2\24\u009f\3\2\2\2\26\u00a1\3\2\2\2\30\u00b0\3\2"+
		"\2\2\32\u00cb\3\2\2\2\34\u00d4\3\2\2\2\36\u00da\3\2\2\2 \u00e5\3\2\2\2"+
		"\"\u00e9\3\2\2\2$\u00ed\3\2\2\2&\u00ef\3\2\2\2(\u00fa\3\2\2\2*\u0105\3"+
		"\2\2\2,\u0111\3\2\2\2.\u011d\3\2\2\2\60\u0124\3\2\2\2\62\u0126\3\2\2\2"+
		"\64\u0139\3\2\2\2\66\u014b\3\2\2\28\u014d\3\2\2\2:\u0151\3\2\2\2<\u0154"+
		"\3\2\2\2>\u0159\3\2\2\2@\u0172\3\2\2\2B\u0183\3\2\2\2D\u018a\3\2\2\2F"+
		"G\5\4\3\2GH\7:\2\2HJ\3\2\2\2IF\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L"+
		"\3\3\2\2\2MK\3\2\2\2N]\5\6\4\2O]\5\b\5\2P]\5\n\6\2Q]\5\f\7\2R]\5\16\b"+
		"\2S]\5\20\t\2T]\5\64\33\2U]\58\35\2V]\5:\36\2W]\5<\37\2X]\5> \2Y]\5@!"+
		"\2Z]\5B\"\2[]\5D#\2\\N\3\2\2\2\\O\3\2\2\2\\P\3\2\2\2\\Q\3\2\2\2\\R\3\2"+
		"\2\2\\S\3\2\2\2\\T\3\2\2\2\\U\3\2\2\2\\V\3\2\2\2\\W\3\2\2\2\\X\3\2\2\2"+
		"\\Y\3\2\2\2\\Z\3\2\2\2\\[\3\2\2\2]\5\3\2\2\2^_\7\20\2\2_`\7\21\2\2`a\7"+
		"=\2\2a\7\3\2\2\2bc\7\23\2\2cd\7\21\2\2de\7=\2\2ef\7%\2\2fg\7&\2\2gh\7"+
		"=\2\2h\t\3\2\2\2ij\7\24\2\2jk\7\21\2\2kl\7=\2\2l\13\3\2\2\2mn\7\25\2\2"+
		"no\7\22\2\2o\r\3\2\2\2pq\7\26\2\2qr\7\21\2\2rs\7=\2\2s\17\3\2\2\2tu\7"+
		"\20\2\2uv\7\27\2\2vw\7=\2\2wx\7\3\2\2xy\7=\2\2y\177\5\22\n\2z{\7\4\2\2"+
		"{|\7=\2\2|~\5\22\n\2}z\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3"+
		"\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7\30\2\2\u0083"+
		"\u0084\5\24\13\2\u0084\u0085\3\2\2\2\u0085\u0086\7\5\2\2\u0086\21\3\2"+
		"\2\2\u0087\u008f\7\36\2\2\u0088\u008f\7\37\2\2\u0089\u008f\7 \2\2\u008a"+
		"\u008b\7!\2\2\u008b\u008c\7\3\2\2\u008c\u008d\7>\2\2\u008d\u008f\7\5\2"+
		"\2\u008e\u0087\3\2\2\2\u008e\u0088\3\2\2\2\u008e\u0089\3\2\2\2\u008e\u008a"+
		"\3\2\2\2\u008f\23\3\2\2\2\u0090\u00a0\5\26\f\2\u0091\u0095\5\30\r\2\u0092"+
		"\u0094\5\30\r\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3"+
		"\2\2\2\u0095\u0096\3\2\2\2\u0096\u00a0\3\2\2\2\u0097\u0095\3\2\2\2\u0098"+
		"\u009c\5\32\16\2\u0099\u009b\5\32\16\2\u009a\u0099\3\2\2\2\u009b\u009e"+
		"\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a0\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009f\u0090\3\2\2\2\u009f\u0091\3\2\2\2\u009f\u0098\3\2"+
		"\2\2\u00a0\25\3\2\2\2\u00a1\u00a2\7\6\2\2\u00a2\u00a3\7=\2\2\u00a3\u00a4"+
		"\7\31\2\2\u00a4\u00a5\7\33\2\2\u00a5\u00a6\7\3\2\2\u00a6\u00ab\7=\2\2"+
		"\u00a7\u00a8\7\4\2\2\u00a8\u00aa\7=\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad"+
		"\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ae\u00af\7\5\2\2\u00af\27\3\2\2\2\u00b0\u00b1\7\7\2"+
		"\2\u00b1\u00b2\7=\2\2\u00b2\u00b3\7\32\2\2\u00b3\u00b4\7\33\2\2\u00b4"+
		"\u00b5\7\3\2\2\u00b5\u00ba\7=\2\2\u00b6\u00b7\7\4\2\2\u00b7\u00b9\7=\2"+
		"\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7\5\2\2\u00be"+
		"\u00bf\7\34\2\2\u00bf\u00c0\7=\2\2\u00c0\u00c1\7\3\2\2\u00c1\u00c6\7="+
		"\2\2\u00c2\u00c3\7\4\2\2\u00c3\u00c5\7=\2\2\u00c4\u00c2\3\2\2\2\u00c5"+
		"\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2"+
		"\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7\5\2\2\u00ca\31\3\2\2\2\u00cb\u00cc"+
		"\7\b\2\2\u00cc\u00cd\7=\2\2\u00cd\u00ce\7\35\2\2\u00ce\u00cf\7\3\2\2\u00cf"+
		"\u00d0\5$\23\2\u00d0\u00d1\7\5\2\2\u00d1\33\3\2\2\2\u00d2\u00d5\7\"\2"+
		"\2\u00d3\u00d5\7#\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\35"+
		"\3\2\2\2\u00d6\u00db\7=\2\2\u00d7\u00db\7>\2\2\u00d8\u00db\7?\2\2\u00d9"+
		"\u00db\7@\2\2\u00da\u00d6\3\2\2\2\u00da\u00d7\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00da\u00d9\3\2\2\2\u00db\37\3\2\2\2\u00dc\u00e6\7\66\2\2\u00dd\u00e2"+
		"\7=\2\2\u00de\u00df\7\4\2\2\u00df\u00e1\7=\2\2\u00e0\u00de\3\2\2\2\u00e1"+
		"\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e6\3\2"+
		"\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00dc\3\2\2\2\u00e5\u00dd\3\2\2\2\u00e6"+
		"!\3\2\2\2\u00e7\u00ea\7\63\2\2\u00e8\u00ea\7\64\2\2\u00e9\u00e7\3\2\2"+
		"\2\u00e9\u00e8\3\2\2\2\u00ea#\3\2\2\2\u00eb\u00ee\5&\24\2\u00ec\u00ee"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee%\3\2\2\2\u00ef"+
		"\u00f0\b\24\1\2\u00f0\u00f1\5(\25\2\u00f1\u00f7\3\2\2\2\u00f2\u00f3\f"+
		"\3\2\2\u00f3\u00f4\7#\2\2\u00f4\u00f6\5(\25\2\u00f5\u00f2\3\2\2\2\u00f6"+
		"\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\'\3\2\2\2"+
		"\u00f9\u00f7\3\2\2\2\u00fa\u00fb\b\25\1\2\u00fb\u00fc\5*\26\2\u00fc\u0102"+
		"\3\2\2\2\u00fd\u00fe\f\3\2\2\u00fe\u00ff\7\"\2\2\u00ff\u0101\5*\26\2\u0100"+
		"\u00fd\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2"+
		"\2\2\u0103)\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\b\26\1\2\u0106\u0107"+
		"\5,\27\2\u0107\u010e\3\2\2\2\u0108\u0109\f\3\2\2\u0109\u010a\5\60\31\2"+
		"\u010a\u010b\5,\27\2\u010b\u010d\3\2\2\2\u010c\u0108\3\2\2\2\u010d\u0110"+
		"\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f+\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0111\u0112\b\27\1\2\u0112\u0113\5.\30\2\u0113\u011a\3"+
		"\2\2\2\u0114\u0115\f\3\2\2\u0115\u0116\5\62\32\2\u0116\u0117\5.\30\2\u0117"+
		"\u0119\3\2\2\2\u0118\u0114\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2"+
		"\2\2\u011a\u011b\3\2\2\2\u011b-\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011f"+
		"\7\3\2\2\u011e\u0120\7$\2\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0122\7=\2\2\u0122\u0123\7\5\2\2\u0123/\3\2\2\2\u0124"+
		"\u0125\t\2\2\2\u0125\61\3\2\2\2\u0126\u0127\t\3\2\2\u0127\63\3\2\2\2\u0128"+
		"\u0129\7\23\2\2\u0129\u012a\7\27\2\2\u012a\u012b\7=\2\2\u012b\u012c\7"+
		"%\2\2\u012c\u012d\7&\2\2\u012d\u013a\7=\2\2\u012e\u012f\7\23\2\2\u012f"+
		"\u0130\7\27\2\2\u0130\u0131\7=\2\2\u0131\u0136\5\66\34\2\u0132\u0133\7"+
		"\4\2\2\u0133\u0135\5\66\34\2\u0134\u0132\3\2\2\2\u0135\u0138\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2"+
		"\2\2\u0139\u0128\3\2\2\2\u0139\u012e\3\2\2\2\u013a\65\3\2\2\2\u013b\u013c"+
		"\7\'\2\2\u013c\u013d\7(\2\2\u013d\u013e\7=\2\2\u013e\u013f\5\22\n\2\u013f"+
		"\u0140\7\30\2\2\u0140\u0141\5\24\13\2\u0141\u014c\3\2\2\2\u0142\u0143"+
		"\7\'\2\2\u0143\u0144\7\30\2\2\u0144\u014c\5\24\13\2\u0145\u0146\7\24\2"+
		"\2\u0146\u0147\7(\2\2\u0147\u014c\7=\2\2\u0148\u0149\7\24\2\2\u0149\u014a"+
		"\7\30\2\2\u014a\u014c\7=\2\2\u014b\u013b\3\2\2\2\u014b\u0142\3\2\2\2\u014b"+
		"\u0145\3\2\2\2\u014b\u0148\3\2\2\2\u014c\67\3\2\2\2\u014d\u014e\7\24\2"+
		"\2\u014e\u014f\7\27\2\2\u014f\u0150\7=\2\2\u01509\3\2\2\2\u0151\u0152"+
		"\7\25\2\2\u0152\u0153\7-\2\2\u0153;\3\2\2\2\u0154\u0155\7\25\2\2\u0155"+
		"\u0156\7.\2\2\u0156\u0157\7)\2\2\u0157\u0158\7=\2\2\u0158=\3\2\2\2\u0159"+
		"\u015a\7*\2\2\u015a\u015b\7+\2\2\u015b\u015c\7=\2\2\u015c\u015d\7\3\2"+
		"\2\u015d\u0162\7=\2\2\u015e\u015f\7\4\2\2\u015f\u0161\7=\2\2\u0160\u015e"+
		"\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0166\7\5\2\2\u0166\u0167\7A"+
		"\2\2\u0167\u0168\7\3\2\2\u0168\u016d\5\36\20\2\u0169\u016a\7\4\2\2\u016a"+
		"\u016c\5\36\20\2\u016b\u0169\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3"+
		"\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170"+
		"\u0171\7\5\2\2\u0171?\3\2\2\2\u0172\u0173\7/\2\2\u0173\u0174\7=\2\2\u0174"+
		"\u0175\7\67\2\2\u0175\u0176\7=\2\2\u0176\u0177\7\17\2\2\u0177\u017c\5"+
		"\22\n\2\u0178\u0179\7\4\2\2\u0179\u017b\5\22\n\2\u017a\u0178\3\2\2\2\u017b"+
		"\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u0181\3\2"+
		"\2\2\u017e\u017c\3\2\2\2\u017f\u0180\78\2\2\u0180\u0182\5$\23\2\u0181"+
		"\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182A\3\2\2\2\u0183\u0184\79\2\2\u0184"+
		"\u0185\7)\2\2\u0185\u0188\7=\2\2\u0186\u0187\78\2\2\u0187\u0189\5$\23"+
		"\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189C\3\2\2\2\u018a\u018b"+
		"\7\60\2\2\u018b\u018c\5 \21\2\u018c\u018d\7)\2\2\u018d\u0195\7=\2\2\u018e"+
		"\u018f\78\2\2\u018f\u0193\5$\23\2\u0190\u0191\7\61\2\2\u0191\u0192\7\62"+
		"\2\2\u0192\u0194\5\"\22\2\u0193\u0190\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u0196\3\2\2\2\u0195\u018e\3\2\2\2\u0195\u0196\3\2\2\2\u0196E\3\2\2\2"+
		"!K\\\177\u008e\u0095\u009c\u009f\u00ab\u00ba\u00c6\u00d4\u00da\u00e2\u00e5"+
		"\u00e9\u00ed\u00f7\u0102\u010e\u011a\u011f\u0136\u0139\u014b\u0162\u016d"+
		"\u017c\u0181\u0188\u0193\u0195";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}