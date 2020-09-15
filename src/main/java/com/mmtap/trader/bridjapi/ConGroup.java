package com.mmtap.trader.bridjapi;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * +------------------------------------------------------------------+<br>
 * <i>native declaration : MT4ManagerAPI.h:294</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("MT4ManagerAPI") 
public class ConGroup extends StructObject {
	static {
		BridJ.register();
	}
	/**
	 * group name<br>
	 * C type : char[16]
	 */
	@Array({16}) 
	@Field(0) 
	public Pointer<Byte > group() {
		return this.io.getPointerField(this, 0);
	}
	/** enable group */
	@Field(1) 
	public int enable() {
		return this.io.getIntField(this, 1);
	}
	/** enable group */
	@Field(1) 
	public ConGroup enable(int enable) {
		this.io.setIntField(this, 1, enable);
		return this;
	}
	/** trade confirmation timeout (seconds) */
	@Field(2) 
	public int timeout() {
		return this.io.getIntField(this, 2);
	}
	/** trade confirmation timeout (seconds) */
	@Field(2) 
	public ConGroup timeout(int timeout) {
		this.io.setIntField(this, 2, timeout);
		return this;
	}
	/** one-time password mode */
	@Field(3) 
	public int otp_mode() {
		return this.io.getIntField(this, 3);
	}
	/** one-time password mode */
	@Field(3) 
	public ConGroup otp_mode(int otp_mode) {
		this.io.setIntField(this, 3, otp_mode);
		return this;
	}
	/**
	 * company name<br>
	 * C type : char[128]
	 */
	@Array({128}) 
	@Field(4) 
	public Pointer<Byte > company() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * statements signature<br>
	 * C type : char[128]
	 */
	@Array({128}) 
	@Field(5) 
	public Pointer<Byte > signature() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * company support page<br>
	 * C type : char[128]
	 */
	@Array({128}) 
	@Field(6) 
	public Pointer<Byte > support_page() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * statements SMTP server<br>
	 * C type : char[64]
	 */
	@Array({64}) 
	@Field(7) 
	public Pointer<Byte > smtp_server() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * statements SMTP login<br>
	 * C type : char[32]
	 */
	@Array({32}) 
	@Field(8) 
	public Pointer<Byte > smtp_login() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * statements SMTP password<br>
	 * C type : char[32]
	 */
	@Array({32}) 
	@Field(9) 
	public Pointer<Byte > smtp_password() {
		return this.io.getPointerField(this, 9);
	}
	/**
	 * support email<br>
	 * C type : char[64]
	 */
	@Array({64}) 
	@Field(10) 
	public Pointer<Byte > support_email() {
		return this.io.getPointerField(this, 10);
	}
	/**
	 * path to directory with custom templates<br>
	 * C type : char[32]
	 */
	@Array({32}) 
	@Field(11) 
	public Pointer<Byte > templates() {
		return this.io.getPointerField(this, 11);
	}
	/** copy statements on support email */
	@Field(12) 
	public int copies() {
		return this.io.getIntField(this, 12);
	}
	/** copy statements on support email */
	@Field(12) 
	public ConGroup copies(int copies) {
		this.io.setIntField(this, 12, copies);
		return this;
	}
	/** enable statements */
	@Field(13) 
	public int reports() {
		return this.io.getIntField(this, 13);
	}
	/** enable statements */
	@Field(13) 
	public ConGroup reports(int reports) {
		this.io.setIntField(this, 13, reports);
		return this;
	}
	/** default leverage (user don't specify leverage himself) */
	@Field(14) 
	public int default_leverage() {
		return this.io.getIntField(this, 14);
	}
	/** default leverage (user don't specify leverage himself) */
	@Field(14) 
	public ConGroup default_leverage(int default_leverage) {
		this.io.setIntField(this, 14, default_leverage);
		return this;
	}
	/** default deposit  (user don't specify balance  himself) */
	@Field(15) 
	public double default_deposit() {
		return this.io.getDoubleField(this, 15);
	}
	/** default deposit  (user don't specify balance  himself) */
	@Field(15) 
	public ConGroup default_deposit(double default_deposit) {
		this.io.setDoubleField(this, 15, default_deposit);
		return this;
	}
	/** maximum simultaneous securities */
	@Field(16) 
	public int maxsecurities() {
		return this.io.getIntField(this, 16);
	}
	/** maximum simultaneous securities */
	@Field(16) 
	public ConGroup maxsecurities(int maxsecurities) {
		this.io.setIntField(this, 16, maxsecurities);
		return this;
	}
	/**
	 * security group settings<br>
	 * C type : ConGroupSec[(32)]
	 */
	@Array({32}) 
	@Field(17) 
	public Pointer<ConGroupSec > secgroups() {
		return this.io.getPointerField(this, 17);
	}
	/**
	 * special securities settings<br>
	 * C type : ConGroupMargin[(128)]
	 */
	@Array({128}) 
	@Field(18) 
	public Pointer<ConGroupMargin > secmargins() {
		return this.io.getPointerField(this, 18);
	}
	/** count of special securities settings */
	@Field(19) 
	public int secmargins_total() {
		return this.io.getIntField(this, 19);
	}
	/** count of special securities settings */
	@Field(19) 
	public ConGroup secmargins_total(int secmargins_total) {
		this.io.setIntField(this, 19, secmargins_total);
		return this;
	}
	/**
	 * deposit currency<br>
	 * C type : char[12]
	 */
	@Array({12}) 
	@Field(20) 
	public Pointer<Byte > currency() {
		return this.io.getPointerField(this, 20);
	}
	/** virtual credit */
	@Field(21) 
	public double credit() {
		return this.io.getDoubleField(this, 21);
	}
	/** virtual credit */
	@Field(21) 
	public ConGroup credit(double credit) {
		this.io.setDoubleField(this, 21, credit);
		return this;
	}
	/** margin call level (percents) */
	@Field(22) 
	public int margin_call() {
		return this.io.getIntField(this, 22);
	}
	/** margin call level (percents) */
	@Field(22) 
	public ConGroup margin_call(int margin_call) {
		this.io.setIntField(this, 22, margin_call);
		return this;
	}
	/** margin mode-MARGIN_DONT_USE,MARGIN_USE_ALL,MARGIN_USE_PROFIT,MARGIN_USE_LOSS */
	@Field(23) 
	public int margin_mode() {
		return this.io.getIntField(this, 23);
	}
	/** margin mode-MARGIN_DONT_USE,MARGIN_USE_ALL,MARGIN_USE_PROFIT,MARGIN_USE_LOSS */
	@Field(23) 
	public ConGroup margin_mode(int margin_mode) {
		this.io.setIntField(this, 23, margin_mode);
		return this;
	}
	/** stop out level */
	@Field(24) 
	public int margin_stopout() {
		return this.io.getIntField(this, 24);
	}
	/** stop out level */
	@Field(24) 
	public ConGroup margin_stopout(int margin_stopout) {
		this.io.setIntField(this, 24, margin_stopout);
		return this;
	}
	/** annual interest rate (percents) */
	@Field(25) 
	public double interestrate() {
		return this.io.getDoubleField(this, 25);
	}
	/** annual interest rate (percents) */
	@Field(25) 
	public ConGroup interestrate(double interestrate) {
		this.io.setDoubleField(this, 25, interestrate);
		return this;
	}
	/** use rollovers & interestrate */
	@Field(26) 
	public int use_swap() {
		return this.io.getIntField(this, 26);
	}
	/** use rollovers & interestrate */
	@Field(26) 
	public ConGroup use_swap(int use_swap) {
		this.io.setIntField(this, 26, use_swap);
		return this;
	}
	/** news mode */
	@Field(27) 
	public int news() {
		return this.io.getIntField(this, 27);
	}
	/** news mode */
	@Field(27) 
	public ConGroup news(int news) {
		this.io.setIntField(this, 27, news);
		return this;
	}
	/** rights bit mask-ALLOW_FLAG_EMAIL */
	@Field(28) 
	public int rights() {
		return this.io.getIntField(this, 28);
	}
	/** rights bit mask-ALLOW_FLAG_EMAIL */
	@Field(28) 
	public ConGroup rights(int rights) {
		this.io.setIntField(this, 28, rights);
		return this;
	}
	/** check IE prices on requests */
	@Field(29) 
	public int check_ie_prices() {
		return this.io.getIntField(this, 29);
	}
	/** check IE prices on requests */
	@Field(29) 
	public ConGroup check_ie_prices(int check_ie_prices) {
		this.io.setIntField(this, 29, check_ie_prices);
		return this;
	}
	/** maximum orders and open positions */
	@Field(30) 
	public int maxpositions() {
		return this.io.getIntField(this, 30);
	}
	/** maximum orders and open positions */
	@Field(30) 
	public ConGroup maxpositions(int maxpositions) {
		this.io.setIntField(this, 30, maxpositions);
		return this;
	}
	/** partial close mode (if !=0 original position will be fully closed and remain position will be fully reopened) */
	@Field(31) 
	public int close_reopen() {
		return this.io.getIntField(this, 31);
	}
	/** partial close mode (if !=0 original position will be fully closed and remain position will be fully reopened) */
	@Field(31) 
	public ConGroup close_reopen(int close_reopen) {
		this.io.setIntField(this, 31, close_reopen);
		return this;
	}
	/** hedge prohibition flag */
	@Field(32) 
	public int hedge_prohibited() {
		return this.io.getIntField(this, 32);
	}
	/** hedge prohibition flag */
	@Field(32) 
	public ConGroup hedge_prohibited(int hedge_prohibited) {
		this.io.setIntField(this, 32, hedge_prohibited);
		return this;
	}
	/** fifo rule */
	@Field(33) 
	public int close_fifo() {
		return this.io.getIntField(this, 33);
	}
	/** fifo rule */
	@Field(33) 
	public ConGroup close_fifo(int close_fifo) {
		this.io.setIntField(this, 33, close_fifo);
		return this;
	}
	/** use large leg margin for hedged positions */
	@Field(34) 
	public int hedge_largeleg() {
		return this.io.getIntField(this, 34);
	}
	/** use large leg margin for hedged positions */
	@Field(34) 
	public ConGroup hedge_largeleg(int hedge_largeleg) {
		this.io.setIntField(this, 34, hedge_largeleg);
		return this;
	}
	/**
	 * reserved<br>
	 * C type : int[2]
	 */
	@Array({2}) 
	@Field(35) 
	public Pointer<Integer > unused_rights() {
		return this.io.getPointerField(this, 35);
	}
	/**
	 * internal data<br>
	 * C type : char[16]
	 */
	@Array({16}) 
	@Field(36) 
	public Pointer<Byte > securities_hash() {
		return this.io.getPointerField(this, 36);
	}
	/** margin controlling type { MARGIN_TYPE_PERCENT,  MARGIN_TYPE_CURRENCY } */
	@Field(37) 
	public int margin_type() {
		return this.io.getIntField(this, 37);
	}
	/** margin controlling type { MARGIN_TYPE_PERCENT,  MARGIN_TYPE_CURRENCY } */
	@Field(37) 
	public ConGroup margin_type(int margin_type) {
		this.io.setIntField(this, 37, margin_type);
		return this;
	}
	/** inactivity period after which account moves to archive base (in days) */
	@Field(38) 
	public int archive_period() {
		return this.io.getIntField(this, 38);
	}
	/** inactivity period after which account moves to archive base (in days) */
	@Field(38) 
	public ConGroup archive_period(int archive_period) {
		this.io.setIntField(this, 38, archive_period);
		return this;
	}
	/** maxumum balance of accounts to move in archive base */
	@Field(39) 
	public int archive_max_balance() {
		return this.io.getIntField(this, 39);
	}
	/** maxumum balance of accounts to move in archive base */
	@Field(39) 
	public ConGroup archive_max_balance(int archive_max_balance) {
		this.io.setIntField(this, 39, archive_max_balance);
		return this;
	}
	/** skip fully hedged accounts when checking for stopout */
	@Field(40) 
	public int stopout_skip_hedged() {
		return this.io.getIntField(this, 40);
	}
	/** skip fully hedged accounts when checking for stopout */
	@Field(40) 
	public ConGroup stopout_skip_hedged(int stopout_skip_hedged) {
		this.io.setIntField(this, 40, stopout_skip_hedged);
		return this;
	}
	/** pendings clean period */
	@Field(41) 
	public int archive_pending_period() {
		return this.io.getIntField(this, 41);
	}
	/** pendings clean period */
	@Field(41) 
	public ConGroup archive_pending_period(int archive_pending_period) {
		this.io.setIntField(this, 41, archive_pending_period);
		return this;
	}
	/**
	 * LANGID array<br>
	 * C type : UINT[8]
	 */
	@Array({8}) 
	@Field(42) 
	public Pointer<Integer > news_languages() {
		return this.io.getPointerField(this, 42);
	}
	/** news languages total */
	@Field(43) 
	public int news_languages_total() {
		return this.io.getIntField(this, 43);
	}
	/** news languages total */
	@Field(43) 
	public ConGroup news_languages_total(int news_languages_total) {
		this.io.setIntField(this, 43, news_languages_total);
		return this;
	}
	/** C type : int[17] */
	@Array({17}) 
	@Field(44) 
	public Pointer<Integer > reserved() {
		return this.io.getPointerField(this, 44);
	}
	public ConGroup() {
		super();
	}
	public ConGroup(Pointer pointer) {
		super(pointer);
	}
}