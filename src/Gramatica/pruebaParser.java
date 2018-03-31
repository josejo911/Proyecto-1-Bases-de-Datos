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
		WHERE=48, DELETE=49, SEMICOLON=50, WS=51, ID=52, NUM=53, DATEFORMAT=54, 
		CHARFORMAT=55, VALUES=56;
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
		"WS", "ID", "NUM", "DATEFORMAT", "CHARFORMAT", "VALUES"
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
			setState(99);
			match(CREATE);
			setState(100);
			match(TABLE);
			setState(101);
			match(ID);
			setState(102);
			match(T__0);
			setState(103);
			match(ID);
			setState(104);
			dataType();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(105);
				match(T__1);
				setState(106);
				match(ID);
				setState(107);
				dataType();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(113);
			match(CONSTRAINT);
			setState(114);
			cConstraint();
			}
			setState(116);
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
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(FLOAT);
				}
				break;
			case DATE:
				_localctx = new DateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(DATE);
				}
				break;
			case CHAR:
				_localctx = new CharContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				match(CHAR);
				setState(122);
				match(T__0);
				setState(123);
				match(NUM);
				setState(124);
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
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new PrimaryKeyConstraintRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				primaryKey();
				}
				break;
			case T__4:
				_localctx = new ForeignKeyConstraintRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				foreignKey();
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(129);
					foreignKey();
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__5:
				_localctx = new CheckConstraintRuleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				check();
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(136);
					check();
					}
					}
					setState(141);
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
			setState(144);
			match(T__3);
			setState(145);
			match(ID);
			setState(146);
			match(PRIMARY);
			setState(147);
			match(KEY);
			setState(148);
			match(T__0);
			setState(149);
			match(ID);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(150);
				match(T__1);
				setState(151);
				match(ID);
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
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
			setState(159);
			match(T__4);
			setState(160);
			match(ID);
			setState(161);
			match(FOREIGN);
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
			setState(173);
			match(REFERENCES);
			setState(174);
			match(ID);
			setState(175);
			match(T__0);
			setState(176);
			match(ID);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(177);
				match(T__1);
				setState(178);
				match(ID);
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
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
			setState(186);
			match(T__5);
			setState(187);
			match(ID);
			setState(188);
			match(CHECK);
			setState(189);
			match(T__0);
			setState(190);
			expression(0);
			setState(191);
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
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				_localctx = new AndLogicRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(AND);
				}
				break;
			case OR:
				_localctx = new OrLogicRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
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
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdValueFormatRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(ID);
				}
				break;
			case NUM:
				_localctx = new NumValueFormatRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(NUM);
				}
				break;
			case DATEFORMAT:
				_localctx = new DateFormatRuleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				match(DATEFORMAT);
				}
				break;
			case CHARFORMAT:
				_localctx = new CharFormatRuleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
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
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				_localctx = new AllSelectFormatRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(ALL);
				}
				break;
			case ID:
				_localctx = new IdSelectFormatRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(ID);
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(205);
					match(T__1);
					setState(206);
					match(ID);
					}
					}
					setState(211);
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
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASC:
				_localctx = new AscOrderFormatRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(ASC);
				}
				break;
			case DESC:
				_localctx = new DescOrderFormatRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
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
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				_localctx = new NumExpressionRuleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(219);
				match(NUM);
				}
				break;
			case ID:
				{
				_localctx = new IdExpressionRuleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220);
				match(ID);
				}
				break;
			case NOT:
				{
				_localctx = new NotExpressionRuleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221);
				match(NOT);
				setState(222);
				expression(2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(232);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionRuleContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(225);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(226);
						match(RELATIONAL);
						setState(227);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new LogicExpressionRuleContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(228);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(229);
						logic();
						setState(230);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(236);
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
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new AlterTableIdRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(ALTER);
				setState(238);
				match(TABLE);
				setState(239);
				match(ID);
				setState(240);
				match(RENAME);
				setState(241);
				match(TO);
				setState(242);
				match(ID);
				}
				break;
			case 2:
				_localctx = new AlterTableActionRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(ALTER);
				setState(244);
				match(TABLE);
				setState(245);
				match(ID);
				setState(246);
				action();
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(247);
					match(T__1);
					setState(248);
					action();
					}
					}
					setState(253);
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
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new ActionAddColumnRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(ADD);
				setState(257);
				match(COLUMN);
				setState(258);
				match(ID);
				setState(259);
				dataType();
				setState(260);
				match(CONSTRAINT);
				setState(261);
				cConstraint();
				}
				break;
			case 2:
				_localctx = new ActionAddConstraintRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(ADD);
				setState(264);
				match(CONSTRAINT);
				setState(265);
				cConstraint();
				}
				break;
			case 3:
				_localctx = new ActionDropColumnRuleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				match(DROP);
				setState(267);
				match(COLUMN);
				setState(268);
				match(ID);
				}
				break;
			case 4:
				_localctx = new ActionDropConstraintRuleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				match(DROP);
				setState(270);
				match(CONSTRAINT);
				setState(271);
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
			setState(274);
			match(DROP);
			setState(275);
			match(TABLE);
			setState(276);
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
			setState(278);
			match(SHOW);
			setState(279);
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
			setState(281);
			match(SHOW);
			setState(282);
			match(COLUMNS);
			setState(283);
			match(FROM);
			setState(284);
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
			setState(286);
			match(INSERT);
			setState(287);
			match(INTO);
			setState(288);
			match(ID);
			setState(289);
			match(T__0);
			setState(290);
			match(ID);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(291);
				match(T__1);
				setState(292);
				match(ID);
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298);
			match(T__2);
			setState(299);
			match(VALUES);
			setState(300);
			match(T__0);
			setState(301);
			valuesFormat();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(302);
				match(T__1);
				setState(303);
				valuesFormat();
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
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
			setState(311);
			match(UPDATE);
			setState(312);
			match(ID);
			setState(313);
			match(SET);
			setState(314);
			match(ID);
			setState(315);
			match(T__6);
			setState(316);
			dataType();
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(317);
				match(T__1);
				setState(318);
				dataType();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(324);
				match(WHERE);
				setState(325);
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
			setState(328);
			match(DELETE);
			setState(329);
			match(FROM);
			setState(330);
			match(ID);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(331);
				match(WHERE);
				setState(332);
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
			setState(335);
			match(SELECT);
			setState(336);
			selectFormat();
			setState(337);
			match(FROM);
			setState(338);
			match(ID);
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(339);
				match(WHERE);
				setState(340);
				expression(0);
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(341);
					match(ORDER);
					setState(342);
					match(BY);
					setState(343);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u015f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3O\n\3\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\to\n\t\f\t\16\tr\13\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0080\n\n\3\13\3\13\3"+
		"\13\7\13\u0085\n\13\f\13\16\13\u0088\13\13\3\13\3\13\7\13\u008c\n\13\f"+
		"\13\16\13\u008f\13\13\5\13\u0091\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\7\f\u009b\n\f\f\f\16\f\u009e\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\7\r\u00aa\n\r\f\r\16\r\u00ad\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r"+
		"\u00b6\n\r\f\r\16\r\u00b9\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\5\17\u00c6\n\17\3\20\3\20\3\20\3\20\5\20\u00cc\n\20\3\21"+
		"\3\21\3\21\3\21\7\21\u00d2\n\21\f\21\16\21\u00d5\13\21\5\21\u00d7\n\21"+
		"\3\22\3\22\5\22\u00db\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u00e2\n\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00eb\n\23\f\23\16\23\u00ee\13"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00fc"+
		"\n\24\f\24\16\24\u00ff\13\24\5\24\u0101\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0113\n\25"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\7\31\u0128\n\31\f\31\16\31\u012b\13\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\7\31\u0133\n\31\f\31\16\31\u0136\13\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0142\n\32\f\32\16"+
		"\32\u0145\13\32\3\32\3\32\5\32\u0149\n\32\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u0150\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u015b\n"+
		"\34\5\34\u015d\n\34\3\34\2\3$\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\66\2\2\2\u0173\2=\3\2\2\2\4N\3\2\2\2\6P\3\2\2\2\bT"+
		"\3\2\2\2\n[\3\2\2\2\f_\3\2\2\2\16b\3\2\2\2\20e\3\2\2\2\22\177\3\2\2\2"+
		"\24\u0090\3\2\2\2\26\u0092\3\2\2\2\30\u00a1\3\2\2\2\32\u00bc\3\2\2\2\34"+
		"\u00c5\3\2\2\2\36\u00cb\3\2\2\2 \u00d6\3\2\2\2\"\u00da\3\2\2\2$\u00e1"+
		"\3\2\2\2&\u0100\3\2\2\2(\u0112\3\2\2\2*\u0114\3\2\2\2,\u0118\3\2\2\2."+
		"\u011b\3\2\2\2\60\u0120\3\2\2\2\62\u0139\3\2\2\2\64\u014a\3\2\2\2\66\u0151"+
		"\3\2\2\289\5\4\3\29:\7\64\2\2:<\3\2\2\2;8\3\2\2\2<?\3\2\2\2=;\3\2\2\2"+
		"=>\3\2\2\2>\3\3\2\2\2?=\3\2\2\2@O\5\6\4\2AO\5\b\5\2BO\5\n\6\2CO\5\f\7"+
		"\2DO\5\16\b\2EO\5\20\t\2FO\5&\24\2GO\5*\26\2HO\5,\27\2IO\5.\30\2JO\5\60"+
		"\31\2KO\5\62\32\2LO\5\64\33\2MO\5\66\34\2N@\3\2\2\2NA\3\2\2\2NB\3\2\2"+
		"\2NC\3\2\2\2ND\3\2\2\2NE\3\2\2\2NF\3\2\2\2NG\3\2\2\2NH\3\2\2\2NI\3\2\2"+
		"\2NJ\3\2\2\2NK\3\2\2\2NL\3\2\2\2NM\3\2\2\2O\5\3\2\2\2PQ\7\n\2\2QR\7\13"+
		"\2\2RS\7\66\2\2S\7\3\2\2\2TU\7\r\2\2UV\7\13\2\2VW\7\66\2\2WX\7\37\2\2"+
		"XY\7 \2\2YZ\7\66\2\2Z\t\3\2\2\2[\\\7\16\2\2\\]\7\13\2\2]^\7\66\2\2^\13"+
		"\3\2\2\2_`\7\17\2\2`a\7\f\2\2a\r\3\2\2\2bc\7\20\2\2cd\7\13\2\2d\17\3\2"+
		"\2\2ef\7\n\2\2fg\7\21\2\2gh\7\66\2\2hi\7\3\2\2ij\7\66\2\2jp\5\22\n\2k"+
		"l\7\4\2\2lm\7\66\2\2mo\5\22\n\2nk\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2"+
		"\2qs\3\2\2\2rp\3\2\2\2st\7\22\2\2tu\5\24\13\2uv\3\2\2\2vw\7\5\2\2w\21"+
		"\3\2\2\2x\u0080\7\30\2\2y\u0080\7\31\2\2z\u0080\7\32\2\2{|\7\33\2\2|}"+
		"\7\3\2\2}~\7\67\2\2~\u0080\7\5\2\2\177x\3\2\2\2\177y\3\2\2\2\177z\3\2"+
		"\2\2\177{\3\2\2\2\u0080\23\3\2\2\2\u0081\u0091\5\26\f\2\u0082\u0086\5"+
		"\30\r\2\u0083\u0085\5\30\r\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0091\3\2\2\2\u0088\u0086\3\2"+
		"\2\2\u0089\u008d\5\32\16\2\u008a\u008c\5\32\16\2\u008b\u008a\3\2\2\2\u008c"+
		"\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0091\3\2"+
		"\2\2\u008f\u008d\3\2\2\2\u0090\u0081\3\2\2\2\u0090\u0082\3\2\2\2\u0090"+
		"\u0089\3\2\2\2\u0091\25\3\2\2\2\u0092\u0093\7\6\2\2\u0093\u0094\7\66\2"+
		"\2\u0094\u0095\7\23\2\2\u0095\u0096\7\25\2\2\u0096\u0097\7\3\2\2\u0097"+
		"\u009c\7\66\2\2\u0098\u0099\7\4\2\2\u0099\u009b\7\66\2\2\u009a\u0098\3"+
		"\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\5\2\2\u00a0\27\3\2\2"+
		"\2\u00a1\u00a2\7\7\2\2\u00a2\u00a3\7\66\2\2\u00a3\u00a4\7\24\2\2\u00a4"+
		"\u00a5\7\25\2\2\u00a5\u00a6\7\3\2\2\u00a6\u00ab\7\66\2\2\u00a7\u00a8\7"+
		"\4\2\2\u00a8\u00aa\7\66\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ae\u00af\7\5\2\2\u00af\u00b0\7\26\2\2\u00b0\u00b1\7\66\2\2\u00b1"+
		"\u00b2\7\3\2\2\u00b2\u00b7\7\66\2\2\u00b3\u00b4\7\4\2\2\u00b4\u00b6\7"+
		"\66\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7\5"+
		"\2\2\u00bb\31\3\2\2\2\u00bc\u00bd\7\b\2\2\u00bd\u00be\7\66\2\2\u00be\u00bf"+
		"\7\27\2\2\u00bf\u00c0\7\3\2\2\u00c0\u00c1\5$\23\2\u00c1\u00c2\7\5\2\2"+
		"\u00c2\33\3\2\2\2\u00c3\u00c6\7\34\2\2\u00c4\u00c6\7\35\2\2\u00c5\u00c3"+
		"\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\35\3\2\2\2\u00c7\u00cc\7\66\2\2\u00c8"+
		"\u00cc\7\67\2\2\u00c9\u00cc\78\2\2\u00ca\u00cc\79\2\2\u00cb\u00c7\3\2"+
		"\2\2\u00cb\u00c8\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc"+
		"\37\3\2\2\2\u00cd\u00d7\7\60\2\2\u00ce\u00d3\7\66\2\2\u00cf\u00d0\7\4"+
		"\2\2\u00d0\u00d2\7\66\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d6\u00cd\3\2\2\2\u00d6\u00ce\3\2\2\2\u00d7!\3\2\2\2\u00d8\u00db"+
		"\7-\2\2\u00d9\u00db\7.\2\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db"+
		"#\3\2\2\2\u00dc\u00dd\b\23\1\2\u00dd\u00e2\7\67\2\2\u00de\u00e2\7\66\2"+
		"\2\u00df\u00e0\7\36\2\2\u00e0\u00e2\5$\23\4\u00e1\u00dc\3\2\2\2\u00e1"+
		"\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00ec\3\2\2\2\u00e3\u00e4\f\5"+
		"\2\2\u00e4\u00e5\7&\2\2\u00e5\u00eb\5$\23\6\u00e6\u00e7\f\3\2\2\u00e7"+
		"\u00e8\5\34\17\2\u00e8\u00e9\5$\23\4\u00e9\u00eb\3\2\2\2\u00ea\u00e3\3"+
		"\2\2\2\u00ea\u00e6\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed%\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7\r\2\2"+
		"\u00f0\u00f1\7\21\2\2\u00f1\u00f2\7\66\2\2\u00f2\u00f3\7\37\2\2\u00f3"+
		"\u00f4\7 \2\2\u00f4\u0101\7\66\2\2\u00f5\u00f6\7\r\2\2\u00f6\u00f7\7\21"+
		"\2\2\u00f7\u00f8\7\66\2\2\u00f8\u00fd\5(\25\2\u00f9\u00fa\7\4\2\2\u00fa"+
		"\u00fc\5(\25\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2"+
		"\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100"+
		"\u00ef\3\2\2\2\u0100\u00f5\3\2\2\2\u0101\'\3\2\2\2\u0102\u0103\7!\2\2"+
		"\u0103\u0104\7\"\2\2\u0104\u0105\7\66\2\2\u0105\u0106\5\22\n\2\u0106\u0107"+
		"\7\22\2\2\u0107\u0108\5\24\13\2\u0108\u0113\3\2\2\2\u0109\u010a\7!\2\2"+
		"\u010a\u010b\7\22\2\2\u010b\u0113\5\24\13\2\u010c\u010d\7\16\2\2\u010d"+
		"\u010e\7\"\2\2\u010e\u0113\7\66\2\2\u010f\u0110\7\16\2\2\u0110\u0111\7"+
		"\22\2\2\u0111\u0113\7\66\2\2\u0112\u0102\3\2\2\2\u0112\u0109\3\2\2\2\u0112"+
		"\u010c\3\2\2\2\u0112\u010f\3\2\2\2\u0113)\3\2\2\2\u0114\u0115\7\16\2\2"+
		"\u0115\u0116\7\21\2\2\u0116\u0117\7\66\2\2\u0117+\3\2\2\2\u0118\u0119"+
		"\7\17\2\2\u0119\u011a\7\'\2\2\u011a-\3\2\2\2\u011b\u011c\7\17\2\2\u011c"+
		"\u011d\7(\2\2\u011d\u011e\7#\2\2\u011e\u011f\7\66\2\2\u011f/\3\2\2\2\u0120"+
		"\u0121\7$\2\2\u0121\u0122\7%\2\2\u0122\u0123\7\66\2\2\u0123\u0124\7\3"+
		"\2\2\u0124\u0129\7\66\2\2\u0125\u0126\7\4\2\2\u0126\u0128\7\66\2\2\u0127"+
		"\u0125\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2"+
		"\2\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d\7\5\2\2\u012d"+
		"\u012e\7:\2\2\u012e\u012f\7\3\2\2\u012f\u0134\5\36\20\2\u0130\u0131\7"+
		"\4\2\2\u0131\u0133\5\36\20\2\u0132\u0130\3\2\2\2\u0133\u0136\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0137\u0138\7\5\2\2\u0138\61\3\2\2\2\u0139\u013a\7)\2\2\u013a\u013b"+
		"\7\66\2\2\u013b\u013c\7\61\2\2\u013c\u013d\7\66\2\2\u013d\u013e\7\t\2"+
		"\2\u013e\u0143\5\22\n\2\u013f\u0140\7\4\2\2\u0140\u0142\5\22\n\2\u0141"+
		"\u013f\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2"+
		"\2\2\u0144\u0148\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0147\7\62\2\2\u0147"+
		"\u0149\5$\23\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\63\3\2\2"+
		"\2\u014a\u014b\7\63\2\2\u014b\u014c\7#\2\2\u014c\u014f\7\66\2\2\u014d"+
		"\u014e\7\62\2\2\u014e\u0150\5$\23\2\u014f\u014d\3\2\2\2\u014f\u0150\3"+
		"\2\2\2\u0150\65\3\2\2\2\u0151\u0152\7*\2\2\u0152\u0153\5 \21\2\u0153\u0154"+
		"\7#\2\2\u0154\u015c\7\66\2\2\u0155\u0156\7\62\2\2\u0156\u015a\5$\23\2"+
		"\u0157\u0158\7+\2\2\u0158\u0159\7,\2\2\u0159\u015b\5\"\22\2\u015a\u0157"+
		"\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u0155\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015d\67\3\2\2\2\36=Np\177\u0086\u008d\u0090\u009c\u00ab"+
		"\u00b7\u00c5\u00cb\u00d3\u00d6\u00da\u00e1\u00ea\u00ec\u00fd\u0100\u0112"+
		"\u0129\u0134\u0143\u0148\u014f\u015a\u015c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}