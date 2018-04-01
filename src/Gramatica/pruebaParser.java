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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, CREATE=8, DATABASE=9, 
		DATABASES=10, ALTER=11, DROP=12, SHOW=13, USE=14, TABLE=15, CONSTRAINT=16, 
		PRIMARY=17, FOREIGN=18, KEY=19, REFERENCES=20, CHECK=21, INT=22, FLOAT=23, 
		DATE=24, CHAR=25, AND=26, OR=27, NOT=28, RENAME=29, TO=30, ADD=31, COLUMN=32, 
		FROM=33, INSERT=34, INTO=35, RELATIONAL=36, TABLES=37, COLUMNS=38, UPDATE=39, 
		SELECT=40, ORDER=41, BY=42, ASC=43, DESC=44, NULL=45, ALL=46, SET=47, 
		WHERE=48, DELETE=49, SEMICOLON=50, WS=51, COMMENTS=52, ID=53, NUM=54, 
		DATEFORMAT=55, CHARFORMAT=56, VALUES=57;
	public static final int
		RULE_program = 0, RULE_query = 1, RULE_createDatabase = 2, RULE_alterDatabase = 3, 
		RULE_dropDatabase = 4, RULE_showDatabase = 5, RULE_useDatabase = 6, RULE_createTable = 7, 
		RULE_dataType = 8, RULE_cConstraint = 9, RULE_primaryKey = 10, RULE_foreignKey = 11, 
		RULE_check = 12, RULE_logic = 13, RULE_valuesFormat = 14, RULE_selectFormat = 15, 
		RULE_orderFormat = 16, RULE_expression = 17, RULE_alterTable = 18, RULE_action = 19, 
		RULE_dropTable = 20, RULE_showTables = 21, RULE_showColumns = 22, RULE_insertInto = 23, 
		RULE_update = 24, RULE_deleteFrom = 25, RULE_select = 26;
	public static final String[] ruleNames = {
		"program", "query", "createDatabase", "alterDatabase", "dropDatabase", 
		"showDatabase", "useDatabase", "createTable", "dataType", "cConstraint", 
		"primaryKey", "foreignKey", "check", "logic", "valuesFormat", "selectFormat", 
		"orderFormat", "expression", "alterTable", "action", "dropTable", "showTables", 
		"showColumns", "insertInto", "update", "deleteFrom", "select"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "','", "')'", "'PK_'", "'FK_'", "'CH_'", "'='", null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"'*'", null, null, null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "CREATE", "DATABASE", 
		"DATABASES", "ALTER", "DROP", "SHOW", "USE", "TABLE", "CONSTRAINT", "PRIMARY", 
		"FOREIGN", "KEY", "REFERENCES", "CHECK", "INT", "FLOAT", "DATE", "CHAR", 
		"AND", "OR", "NOT", "RENAME", "TO", "ADD", "COLUMN", "FROM", "INSERT", 
		"INTO", "RELATIONAL", "TABLES", "COLUMNS", "UPDATE", "SELECT", "ORDER", 
		"BY", "ASC", "DESC", "NULL", "ALL", "SET", "WHERE", "DELETE", "SEMICOLON", 
		"WS", "COMMENTS", "ID", "NUM", "DATEFORMAT", "CHARFORMAT", "VALUES"
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
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << ALTER) | (1L << DROP) | (1L << SHOW) | (1L << USE) | (1L << INSERT) | (1L << UPDATE) | (1L << SELECT) | (1L << DELETE))) != 0)) {
				{
				{
				setState(54);
				query();
				setState(55);
				match(SEMICOLON);
				}
				}
				setState(61);
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
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new SqlCreateDBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				createDatabase();
				}
				break;
			case 2:
				_localctx = new SqlAlterDBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				alterDatabase();
				}
				break;
			case 3:
				_localctx = new SqlDropDBContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				dropDatabase();
				}
				break;
			case 4:
				_localctx = new SqlShowDBContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				showDatabase();
				}
				break;
			case 5:
				_localctx = new SqlUseDBContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				useDatabase();
				}
				break;
			case 6:
				_localctx = new SqlCreateTBContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(67);
				createTable();
				}
				break;
			case 7:
				_localctx = new SqlAlterTBContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(68);
				alterTable();
				}
				break;
			case 8:
				_localctx = new SqlDropTBContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(69);
				dropTable();
				}
				break;
			case 9:
				_localctx = new SqlShowTBContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(70);
				showTables();
				}
				break;
			case 10:
				_localctx = new SqlShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(71);
				showColumns();
				}
				break;
			case 11:
				_localctx = new SqlInsertTBContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(72);
				insertInto();
				}
				break;
			case 12:
				_localctx = new SqlUpdateTBContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(73);
				update();
				}
				break;
			case 13:
				_localctx = new SqlDeleteTBContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(74);
				deleteFrom();
				}
				break;
			case 14:
				_localctx = new SqlSelectTBContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(75);
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
			setState(78);
			match(CREATE);
			setState(79);
			match(DATABASE);
			setState(80);
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
			setState(82);
			match(ALTER);
			setState(83);
			match(DATABASE);
			setState(84);
			match(ID);
			setState(85);
			match(RENAME);
			setState(86);
			match(TO);
			setState(87);
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
			setState(89);
			match(DROP);
			setState(90);
			match(DATABASE);
			setState(91);
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
			setState(93);
			match(SHOW);
			setState(94);
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
			setState(96);
			match(USE);
			setState(97);
			match(DATABASE);
			setState(98);
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
			setState(100);
			match(CREATE);
			setState(101);
			match(TABLE);
			setState(102);
			match(ID);
			setState(103);
			match(T__0);
			setState(104);
			match(ID);
			setState(105);
			dataType();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(106);
				match(T__1);
				setState(107);
				match(ID);
				setState(108);
				dataType();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(114);
			match(CONSTRAINT);
			setState(115);
			cConstraint();
			}
			setState(117);
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
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(FLOAT);
				}
				break;
			case DATE:
				_localctx = new DateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				match(DATE);
				}
				break;
			case CHAR:
				_localctx = new CharContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				match(CHAR);
				setState(123);
				match(T__0);
				setState(124);
				match(NUM);
				setState(125);
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
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new PrimaryKeyConstraintRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				primaryKey();
				}
				break;
			case T__4:
				_localctx = new ForeignKeyConstraintRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				foreignKey();
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(130);
					foreignKey();
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__5:
				_localctx = new CheckConstraintRuleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				check();
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(137);
					check();
					}
					}
					setState(142);
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
			setState(145);
			match(T__3);
			setState(146);
			match(ID);
			setState(147);
			match(PRIMARY);
			setState(148);
			match(KEY);
			setState(149);
			match(T__0);
			setState(150);
			match(ID);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(151);
				match(T__1);
				setState(152);
				match(ID);
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
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
			setState(160);
			match(T__4);
			setState(161);
			match(ID);
			setState(162);
			match(FOREIGN);
			setState(163);
			match(KEY);
			setState(164);
			match(T__0);
			setState(165);
			match(ID);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(166);
				match(T__1);
				setState(167);
				match(ID);
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			match(T__2);
			setState(174);
			match(REFERENCES);
			setState(175);
			match(ID);
			setState(176);
			match(T__0);
			setState(177);
			match(ID);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(178);
				match(T__1);
				setState(179);
				match(ID);
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(187);
			match(T__5);
			setState(188);
			match(ID);
			setState(189);
			match(CHECK);
			setState(190);
			match(T__0);
			setState(191);
			expression(0);
			setState(192);
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
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				_localctx = new AndLogicRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(AND);
				}
				break;
			case OR:
				_localctx = new OrLogicRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
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
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdValueFormatRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(ID);
				}
				break;
			case NUM:
				_localctx = new NumValueFormatRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(NUM);
				}
				break;
			case DATEFORMAT:
				_localctx = new DateFormatRuleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(DATEFORMAT);
				}
				break;
			case CHARFORMAT:
				_localctx = new CharFormatRuleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
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
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				_localctx = new AllSelectFormatRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(ALL);
				}
				break;
			case ID:
				_localctx = new IdSelectFormatRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(ID);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(206);
					match(T__1);
					setState(207);
					match(ID);
					}
					}
					setState(212);
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
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASC:
				_localctx = new AscOrderFormatRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(ASC);
				}
				break;
			case DESC:
				_localctx = new DescOrderFormatRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
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
	public static class NotExpressionRuleContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(pruebaParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionRuleContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitNotExpressionRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicExpressionRuleContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public LogicExpressionRuleContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitLogicExpressionRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExpressionRuleContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RELATIONAL() { return getToken(pruebaParser.RELATIONAL, 0); }
		public RelationalExpressionRuleContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitRelationalExpressionRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumExpressionRuleContext extends ExpressionContext {
		public TerminalNode NUM() { return getToken(pruebaParser.NUM, 0); }
		public NumExpressionRuleContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitNumExpressionRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExpressionRuleContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(pruebaParser.ID, 0); }
		public IdExpressionRuleContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pruebaVisitor ) return ((pruebaVisitor<? extends T>)visitor).visitIdExpressionRule(this);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				_localctx = new NumExpressionRuleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(220);
				match(NUM);
				}
				break;
			case ID:
				{
				_localctx = new IdExpressionRuleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221);
				match(ID);
				}
				break;
			case NOT:
				{
				_localctx = new NotExpressionRuleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222);
				match(NOT);
				setState(223);
				expression(2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(233);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionRuleContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(226);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(227);
						match(RELATIONAL);
						setState(228);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new LogicExpressionRuleContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(229);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(230);
						logic();
						setState(231);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(237);
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
		enterRule(_localctx, 36, RULE_alterTable);
		int _la;
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new AlterTableIdRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(ALTER);
				setState(239);
				match(TABLE);
				setState(240);
				match(ID);
				setState(241);
				match(RENAME);
				setState(242);
				match(TO);
				setState(243);
				match(ID);
				}
				break;
			case 2:
				_localctx = new AlterTableActionRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(ALTER);
				setState(245);
				match(TABLE);
				setState(246);
				match(ID);
				setState(247);
				action();
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(248);
					match(T__1);
					setState(249);
					action();
					}
					}
					setState(254);
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
		enterRule(_localctx, 38, RULE_action);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new ActionAddColumnRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(ADD);
				setState(258);
				match(COLUMN);
				setState(259);
				match(ID);
				setState(260);
				dataType();
				setState(261);
				match(CONSTRAINT);
				setState(262);
				cConstraint();
				}
				break;
			case 2:
				_localctx = new ActionAddConstraintRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(ADD);
				setState(265);
				match(CONSTRAINT);
				setState(266);
				cConstraint();
				}
				break;
			case 3:
				_localctx = new ActionDropColumnRuleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				match(DROP);
				setState(268);
				match(COLUMN);
				setState(269);
				match(ID);
				}
				break;
			case 4:
				_localctx = new ActionDropConstraintRuleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				match(DROP);
				setState(271);
				match(CONSTRAINT);
				setState(272);
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
		enterRule(_localctx, 40, RULE_dropTable);
		try {
			_localctx = new DropTableRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(DROP);
			setState(276);
			match(TABLE);
			setState(277);
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
		enterRule(_localctx, 42, RULE_showTables);
		try {
			_localctx = new ShowTablesRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(SHOW);
			setState(280);
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
		enterRule(_localctx, 44, RULE_showColumns);
		try {
			_localctx = new ShowColumnsRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(SHOW);
			setState(283);
			match(COLUMNS);
			setState(284);
			match(FROM);
			setState(285);
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
		enterRule(_localctx, 46, RULE_insertInto);
		int _la;
		try {
			_localctx = new InsertIntoRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(INSERT);
			setState(288);
			match(INTO);
			setState(289);
			match(ID);
			setState(290);
			match(T__0);
			setState(291);
			match(ID);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(292);
				match(T__1);
				setState(293);
				match(ID);
				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(299);
			match(T__2);
			setState(300);
			match(VALUES);
			setState(301);
			match(T__0);
			setState(302);
			valuesFormat();
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(303);
				match(T__1);
				setState(304);
				valuesFormat();
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(310);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 48, RULE_update);
		int _la;
		try {
			_localctx = new UpdateRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(UPDATE);
			setState(313);
			match(ID);
			setState(314);
			match(SET);
			setState(315);
			match(ID);
			setState(316);
			match(T__6);
			setState(317);
			dataType();
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(318);
				match(T__1);
				setState(319);
				dataType();
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(325);
				match(WHERE);
				setState(326);
				expression(0);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 50, RULE_deleteFrom);
		int _la;
		try {
			_localctx = new DeleteFromRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(DELETE);
			setState(330);
			match(FROM);
			setState(331);
			match(ID);
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(332);
				match(WHERE);
				setState(333);
				expression(0);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 52, RULE_select);
		int _la;
		try {
			_localctx = new SelectRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(SELECT);
			setState(337);
			selectFormat();
			setState(338);
			match(FROM);
			setState(339);
			match(ID);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(340);
				match(WHERE);
				setState(341);
				expression(0);
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(342);
					match(ORDER);
					setState(343);
					match(BY);
					setState(344);
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
		case 17:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u0160\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3O\n\3\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tp\n\t\f\t\16\ts\13\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0081\n\n\3\13\3"+
		"\13\3\13\7\13\u0086\n\13\f\13\16\13\u0089\13\13\3\13\3\13\7\13\u008d\n"+
		"\13\f\13\16\13\u0090\13\13\5\13\u0092\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\7\f\u009c\n\f\f\f\16\f\u009f\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\7\r\u00ab\n\r\f\r\16\r\u00ae\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\7\r\u00b7\n\r\f\r\16\r\u00ba\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\5\17\u00c7\n\17\3\20\3\20\3\20\3\20\5\20\u00cd\n\20"+
		"\3\21\3\21\3\21\3\21\7\21\u00d3\n\21\f\21\16\21\u00d6\13\21\5\21\u00d8"+
		"\n\21\3\22\3\22\5\22\u00dc\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u00e3\n"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00ec\n\23\f\23\16\23\u00ef"+
		"\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24"+
		"\u00fd\n\24\f\24\16\24\u0100\13\24\5\24\u0102\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0114"+
		"\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0129\n\31\f\31\16\31\u012c\13\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0134\n\31\f\31\16\31\u0137\13\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0143\n\32\f\32"+
		"\16\32\u0146\13\32\3\32\3\32\5\32\u014a\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u0151\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u015c"+
		"\n\34\5\34\u015e\n\34\3\34\2\3$\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\66\2\2\2\u0174\2=\3\2\2\2\4N\3\2\2\2\6P\3\2\2\2"+
		"\bT\3\2\2\2\n[\3\2\2\2\f_\3\2\2\2\16b\3\2\2\2\20f\3\2\2\2\22\u0080\3\2"+
		"\2\2\24\u0091\3\2\2\2\26\u0093\3\2\2\2\30\u00a2\3\2\2\2\32\u00bd\3\2\2"+
		"\2\34\u00c6\3\2\2\2\36\u00cc\3\2\2\2 \u00d7\3\2\2\2\"\u00db\3\2\2\2$\u00e2"+
		"\3\2\2\2&\u0101\3\2\2\2(\u0113\3\2\2\2*\u0115\3\2\2\2,\u0119\3\2\2\2."+
		"\u011c\3\2\2\2\60\u0121\3\2\2\2\62\u013a\3\2\2\2\64\u014b\3\2\2\2\66\u0152"+
		"\3\2\2\289\5\4\3\29:\7\64\2\2:<\3\2\2\2;8\3\2\2\2<?\3\2\2\2=;\3\2\2\2"+
		"=>\3\2\2\2>\3\3\2\2\2?=\3\2\2\2@O\5\6\4\2AO\5\b\5\2BO\5\n\6\2CO\5\f\7"+
		"\2DO\5\16\b\2EO\5\20\t\2FO\5&\24\2GO\5*\26\2HO\5,\27\2IO\5.\30\2JO\5\60"+
		"\31\2KO\5\62\32\2LO\5\64\33\2MO\5\66\34\2N@\3\2\2\2NA\3\2\2\2NB\3\2\2"+
		"\2NC\3\2\2\2ND\3\2\2\2NE\3\2\2\2NF\3\2\2\2NG\3\2\2\2NH\3\2\2\2NI\3\2\2"+
		"\2NJ\3\2\2\2NK\3\2\2\2NL\3\2\2\2NM\3\2\2\2O\5\3\2\2\2PQ\7\n\2\2QR\7\13"+
		"\2\2RS\7\67\2\2S\7\3\2\2\2TU\7\r\2\2UV\7\13\2\2VW\7\67\2\2WX\7\37\2\2"+
		"XY\7 \2\2YZ\7\67\2\2Z\t\3\2\2\2[\\\7\16\2\2\\]\7\13\2\2]^\7\67\2\2^\13"+
		"\3\2\2\2_`\7\17\2\2`a\7\f\2\2a\r\3\2\2\2bc\7\20\2\2cd\7\13\2\2de\7\67"+
		"\2\2e\17\3\2\2\2fg\7\n\2\2gh\7\21\2\2hi\7\67\2\2ij\7\3\2\2jk\7\67\2\2"+
		"kq\5\22\n\2lm\7\4\2\2mn\7\67\2\2np\5\22\n\2ol\3\2\2\2ps\3\2\2\2qo\3\2"+
		"\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\7\22\2\2uv\5\24\13\2vw\3\2\2\2wx"+
		"\7\5\2\2x\21\3\2\2\2y\u0081\7\30\2\2z\u0081\7\31\2\2{\u0081\7\32\2\2|"+
		"}\7\33\2\2}~\7\3\2\2~\177\78\2\2\177\u0081\7\5\2\2\u0080y\3\2\2\2\u0080"+
		"z\3\2\2\2\u0080{\3\2\2\2\u0080|\3\2\2\2\u0081\23\3\2\2\2\u0082\u0092\5"+
		"\26\f\2\u0083\u0087\5\30\r\2\u0084\u0086\5\30\r\2\u0085\u0084\3\2\2\2"+
		"\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0092"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008e\5\32\16\2\u008b\u008d\5\32\16"+
		"\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0082\3\2\2\2\u0091"+
		"\u0083\3\2\2\2\u0091\u008a\3\2\2\2\u0092\25\3\2\2\2\u0093\u0094\7\6\2"+
		"\2\u0094\u0095\7\67\2\2\u0095\u0096\7\23\2\2\u0096\u0097\7\25\2\2\u0097"+
		"\u0098\7\3\2\2\u0098\u009d\7\67\2\2\u0099\u009a\7\4\2\2\u009a\u009c\7"+
		"\67\2\2\u009b\u0099\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7\5"+
		"\2\2\u00a1\27\3\2\2\2\u00a2\u00a3\7\7\2\2\u00a3\u00a4\7\67\2\2\u00a4\u00a5"+
		"\7\24\2\2\u00a5\u00a6\7\25\2\2\u00a6\u00a7\7\3\2\2\u00a7\u00ac\7\67\2"+
		"\2\u00a8\u00a9\7\4\2\2\u00a9\u00ab\7\67\2\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\5\2\2\u00b0\u00b1\7\26\2\2\u00b1"+
		"\u00b2\7\67\2\2\u00b2\u00b3\7\3\2\2\u00b3\u00b8\7\67\2\2\u00b4\u00b5\7"+
		"\4\2\2\u00b5\u00b7\7\67\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00bb\u00bc\7\5\2\2\u00bc\31\3\2\2\2\u00bd\u00be\7\b\2\2\u00be\u00bf"+
		"\7\67\2\2\u00bf\u00c0\7\27\2\2\u00c0\u00c1\7\3\2\2\u00c1\u00c2\5$\23\2"+
		"\u00c2\u00c3\7\5\2\2\u00c3\33\3\2\2\2\u00c4\u00c7\7\34\2\2\u00c5\u00c7"+
		"\7\35\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\35\3\2\2\2\u00c8"+
		"\u00cd\7\67\2\2\u00c9\u00cd\78\2\2\u00ca\u00cd\79\2\2\u00cb\u00cd\7:\2"+
		"\2\u00cc\u00c8\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb"+
		"\3\2\2\2\u00cd\37\3\2\2\2\u00ce\u00d8\7\60\2\2\u00cf\u00d4\7\67\2\2\u00d0"+
		"\u00d1\7\4\2\2\u00d1\u00d3\7\67\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d6\3"+
		"\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d7\u00ce\3\2\2\2\u00d7\u00cf\3\2\2\2\u00d8!\3\2\2\2"+
		"\u00d9\u00dc\7-\2\2\u00da\u00dc\7.\2\2\u00db\u00d9\3\2\2\2\u00db\u00da"+
		"\3\2\2\2\u00dc#\3\2\2\2\u00dd\u00de\b\23\1\2\u00de\u00e3\78\2\2\u00df"+
		"\u00e3\7\67\2\2\u00e0\u00e1\7\36\2\2\u00e1\u00e3\5$\23\4\u00e2\u00dd\3"+
		"\2\2\2\u00e2\u00df\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00ed\3\2\2\2\u00e4"+
		"\u00e5\f\5\2\2\u00e5\u00e6\7&\2\2\u00e6\u00ec\5$\23\6\u00e7\u00e8\f\3"+
		"\2\2\u00e8\u00e9\5\34\17\2\u00e9\u00ea\5$\23\4\u00ea\u00ec\3\2\2\2\u00eb"+
		"\u00e4\3\2\2\2\u00eb\u00e7\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2"+
		"\2\2\u00ed\u00ee\3\2\2\2\u00ee%\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1"+
		"\7\r\2\2\u00f1\u00f2\7\21\2\2\u00f2\u00f3\7\67\2\2\u00f3\u00f4\7\37\2"+
		"\2\u00f4\u00f5\7 \2\2\u00f5\u0102\7\67\2\2\u00f6\u00f7\7\r\2\2\u00f7\u00f8"+
		"\7\21\2\2\u00f8\u00f9\7\67\2\2\u00f9\u00fe\5(\25\2\u00fa\u00fb\7\4\2\2"+
		"\u00fb\u00fd\5(\25\2\u00fc\u00fa\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc"+
		"\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0101"+
		"\u00f0\3\2\2\2\u0101\u00f6\3\2\2\2\u0102\'\3\2\2\2\u0103\u0104\7!\2\2"+
		"\u0104\u0105\7\"\2\2\u0105\u0106\7\67\2\2\u0106\u0107\5\22\n\2\u0107\u0108"+
		"\7\22\2\2\u0108\u0109\5\24\13\2\u0109\u0114\3\2\2\2\u010a\u010b\7!\2\2"+
		"\u010b\u010c\7\22\2\2\u010c\u0114\5\24\13\2\u010d\u010e\7\16\2\2\u010e"+
		"\u010f\7\"\2\2\u010f\u0114\7\67\2\2\u0110\u0111\7\16\2\2\u0111\u0112\7"+
		"\22\2\2\u0112\u0114\7\67\2\2\u0113\u0103\3\2\2\2\u0113\u010a\3\2\2\2\u0113"+
		"\u010d\3\2\2\2\u0113\u0110\3\2\2\2\u0114)\3\2\2\2\u0115\u0116\7\16\2\2"+
		"\u0116\u0117\7\21\2\2\u0117\u0118\7\67\2\2\u0118+\3\2\2\2\u0119\u011a"+
		"\7\17\2\2\u011a\u011b\7\'\2\2\u011b-\3\2\2\2\u011c\u011d\7\17\2\2\u011d"+
		"\u011e\7(\2\2\u011e\u011f\7#\2\2\u011f\u0120\7\67\2\2\u0120/\3\2\2\2\u0121"+
		"\u0122\7$\2\2\u0122\u0123\7%\2\2\u0123\u0124\7\67\2\2\u0124\u0125\7\3"+
		"\2\2\u0125\u012a\7\67\2\2\u0126\u0127\7\4\2\2\u0127\u0129\7\67\2\2\u0128"+
		"\u0126\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7\5\2\2\u012e"+
		"\u012f\7;\2\2\u012f\u0130\7\3\2\2\u0130\u0135\5\36\20\2\u0131\u0132\7"+
		"\4\2\2\u0132\u0134\5\36\20\2\u0133\u0131\3\2\2\2\u0134\u0137\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2"+
		"\2\2\u0138\u0139\7\5\2\2\u0139\61\3\2\2\2\u013a\u013b\7)\2\2\u013b\u013c"+
		"\7\67\2\2\u013c\u013d\7\61\2\2\u013d\u013e\7\67\2\2\u013e\u013f\7\t\2"+
		"\2\u013f\u0144\5\22\n\2\u0140\u0141\7\4\2\2\u0141\u0143\5\22\n\2\u0142"+
		"\u0140\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2"+
		"\2\2\u0145\u0149\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\7\62\2\2\u0148"+
		"\u014a\5$\23\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\63\3\2\2"+
		"\2\u014b\u014c\7\63\2\2\u014c\u014d\7#\2\2\u014d\u0150\7\67\2\2\u014e"+
		"\u014f\7\62\2\2\u014f\u0151\5$\23\2\u0150\u014e\3\2\2\2\u0150\u0151\3"+
		"\2\2\2\u0151\65\3\2\2\2\u0152\u0153\7*\2\2\u0153\u0154\5 \21\2\u0154\u0155"+
		"\7#\2\2\u0155\u015d\7\67\2\2\u0156\u0157\7\62\2\2\u0157\u015b\5$\23\2"+
		"\u0158\u0159\7+\2\2\u0159\u015a\7,\2\2\u015a\u015c\5\"\22\2\u015b\u0158"+
		"\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u0156\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\67\3\2\2\2\36=Nq\u0080\u0087\u008e\u0091\u009d\u00ac"+
		"\u00b8\u00c6\u00cc\u00d4\u00d7\u00db\u00e2\u00eb\u00ed\u00fe\u0101\u0113"+
		"\u012a\u0135\u0144\u0149\u0150\u015b\u015d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}