package com.mmtap.trader.bridjapi;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.TimeT;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * +------------------------------------------------------------------+<br>
 * <i>native declaration : MT4ManagerAPI.h:1010</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("MT4ManagerAPI") 
public class TradeRecord extends StructObject {
	static {
		BridJ.register();
	}
	/** order ticket */
	@Field(0) 
	public int order() {
		return this.io.getIntField(this, 0);
	}
	/** order ticket */
	@Field(0) 
	public TradeRecord order(int order) {
		this.io.setIntField(this, 0, order);
		return this;
	}
	/** owner's login */
	@Field(1) 
	public int login() {
		return this.io.getIntField(this, 1);
	}
	/** owner's login */
	@Field(1) 
	public TradeRecord login(int login) {
		this.io.setIntField(this, 1, login);
		return this;
	}
	/**
	 * security<br>
	 * C type : char[12]
	 */
	@Array({12}) 
	@Field(2) 
	public Pointer<Byte > symbol() {
		return this.io.getPointerField(this, 2);
	}
	/** security precision */
	@Field(3) 
	public int digits() {
		return this.io.getIntField(this, 3);
	}
	/** security precision */
	@Field(3) 
	public TradeRecord digits(int digits) {
		this.io.setIntField(this, 3, digits);
		return this;
	}
	/** trade command */
	@Field(4) 
	public int cmd() {
		return this.io.getIntField(this, 4);
	}
	/** trade command */
	@Field(4) 
	public TradeRecord cmd(int cmd) {
		this.io.setIntField(this, 4, cmd);
		return this;
	}
	/** volume */
	@Field(5) 
	public int volume() {
		return this.io.getIntField(this, 5);
	}
	/** volume */
	@Field(5) 
	public TradeRecord volume(int volume) {
		this.io.setIntField(this, 5, volume);
		return this;
	}
	/** open time */
	@Field(6) 
	public TimeT open_time() {
		return this.io.getTimeTField(this, 6);
	}
	/** open time */
	@Field(6) 
	public TradeRecord open_time(TimeT open_time) {
		this.io.setTimeTField(this, 6, open_time);
		return this;
	}
	/** reserved */
	@Field(7) 
	public int state() {
		return this.io.getIntField(this, 7);
	}
	/** reserved */
	@Field(7) 
	public TradeRecord state(int state) {
		this.io.setIntField(this, 7, state);
		return this;
	}
	/** open price */
	@Field(8) 
	public double open_price() {
		return this.io.getDoubleField(this, 8);
	}
	/** open price */
	@Field(8) 
	public TradeRecord open_price(double open_price) {
		this.io.setDoubleField(this, 8, open_price);
		return this;
	}
	/** stop loss & take profit */
	@Field(9) 
	public double sl() {
		return this.io.getDoubleField(this, 9);
	}
	/** stop loss & take profit */
	@Field(9) 
	public TradeRecord sl(double sl) {
		this.io.setDoubleField(this, 9, sl);
		return this;
	}
	/** stop loss & take profit */
	@Field(10) 
	public double tp() {
		return this.io.getDoubleField(this, 10);
	}
	/** stop loss & take profit */
	@Field(10) 
	public TradeRecord tp(double tp) {
		this.io.setDoubleField(this, 10, tp);
		return this;
	}
	/** close time */
	@Field(11) 
	public TimeT close_time() {
		return this.io.getTimeTField(this, 11);
	}
	/** close time */
	@Field(11) 
	public TradeRecord close_time(TimeT close_time) {
		this.io.setTimeTField(this, 11, close_time);
		return this;
	}
	/** gateway order volume */
	@Field(12) 
	public int gw_volume() {
		return this.io.getIntField(this, 12);
	}
	/** gateway order volume */
	@Field(12) 
	public TradeRecord gw_volume(int gw_volume) {
		this.io.setIntField(this, 12, gw_volume);
		return this;
	}
	/** pending order's expiration time */
	@Field(13) 
	public TimeT expiration() {
		return this.io.getTimeTField(this, 13);
	}
	/** pending order's expiration time */
	@Field(13) 
	public TradeRecord expiration(TimeT expiration) {
		this.io.setTimeTField(this, 13, expiration);
		return this;
	}
	/** trade reason */
	@Field(14) 
	public byte reason() {
		return this.io.getByteField(this, 14);
	}
	/** trade reason */
	@Field(14) 
	public TradeRecord reason(byte reason) {
		this.io.setByteField(this, 14, reason);
		return this;
	}
	/**
	 * reserved fields<br>
	 * C type : char[3]
	 */
	@Array({3}) 
	@Field(15) 
	public Pointer<Byte > conv_reserv() {
		return this.io.getPointerField(this, 15);
	}
	/**
	 * convertation rates from profit currency to group deposit currency<br>
	 * C type : double[2]
	 */
	@Array({2}) 
	@Field(16) 
	public Pointer<Double > conv_rates() {
		return this.io.getPointerField(this, 16);
	}
	/** commission */
	@Field(17) 
	public double commission() {
		return this.io.getDoubleField(this, 17);
	}
	/** commission */
	@Field(17) 
	public TradeRecord commission(double commission) {
		this.io.setDoubleField(this, 17, commission);
		return this;
	}
	/** agent commission */
	@Field(18) 
	public double commission_agent() {
		return this.io.getDoubleField(this, 18);
	}
	/** agent commission */
	@Field(18) 
	public TradeRecord commission_agent(double commission_agent) {
		this.io.setDoubleField(this, 18, commission_agent);
		return this;
	}
	/** order swaps */
	@Field(19) 
	public double storage() {
		return this.io.getDoubleField(this, 19);
	}
	/** order swaps */
	@Field(19) 
	public TradeRecord storage(double storage) {
		this.io.setDoubleField(this, 19, storage);
		return this;
	}
	/** close price */
	@Field(20) 
	public double close_price() {
		return this.io.getDoubleField(this, 20);
	}
	/** close price */
	@Field(20) 
	public TradeRecord close_price(double close_price) {
		this.io.setDoubleField(this, 20, close_price);
		return this;
	}
	/** profit */
	@Field(21) 
	public double profit() {
		return this.io.getDoubleField(this, 21);
	}
	/** profit */
	@Field(21) 
	public TradeRecord profit(double profit) {
		this.io.setDoubleField(this, 21, profit);
		return this;
	}
	/** taxes */
	@Field(22) 
	public double taxes() {
		return this.io.getDoubleField(this, 22);
	}
	/** taxes */
	@Field(22) 
	public TradeRecord taxes(double taxes) {
		this.io.setDoubleField(this, 22, taxes);
		return this;
	}
	/** special value used by client experts */
	@Field(23) 
	public int magic() {
		return this.io.getIntField(this, 23);
	}
	/** special value used by client experts */
	@Field(23) 
	public TradeRecord magic(int magic) {
		this.io.setIntField(this, 23, magic);
		return this;
	}
	/**
	 * comment<br>
	 * C type : char[32]
	 */
	@Array({32}) 
	@Field(24) 
	public Pointer<Byte > comment() {
		return this.io.getPointerField(this, 24);
	}
	/** gateway order ticket */
	@Field(25) 
	public int gw_order() {
		return this.io.getIntField(this, 25);
	}
	/** gateway order ticket */
	@Field(25) 
	public TradeRecord gw_order(int gw_order) {
		this.io.setIntField(this, 25, gw_order);
		return this;
	}
	/** used by MT Manager */
	@Field(26) 
	public int activation() {
		return this.io.getIntField(this, 26);
	}
	/** used by MT Manager */
	@Field(26) 
	public TradeRecord activation(int activation) {
		this.io.setIntField(this, 26, activation);
		return this;
	}
	/** gateway order price deviation (pips) from order open price */
	@Field(27) 
	public short gw_open_price() {
		return this.io.getShortField(this, 27);
	}
	/** gateway order price deviation (pips) from order open price */
	@Field(27) 
	public TradeRecord gw_open_price(short gw_open_price) {
		this.io.setShortField(this, 27, gw_open_price);
		return this;
	}
	/** gateway order price deviation (pips) from order close price */
	@Field(28) 
	public short gw_close_price() {
		return this.io.getShortField(this, 28);
	}
	/** gateway order price deviation (pips) from order close price */
	@Field(28) 
	public TradeRecord gw_close_price(short gw_close_price) {
		this.io.setShortField(this, 28, gw_close_price);
		return this;
	}
	/** margin convertation rate (rate of convertation from margin currency to deposit one) */
	@Field(29) 
	public double margin_rate() {
		return this.io.getDoubleField(this, 29);
	}
	/** margin convertation rate (rate of convertation from margin currency to deposit one) */
	@Field(29) 
	public TradeRecord margin_rate(double margin_rate) {
		this.io.setDoubleField(this, 29, margin_rate);
		return this;
	}
	/** timestamp */
	@Field(30) 
	public TimeT timestamp() {
		return this.io.getTimeTField(this, 30);
	}
	/** timestamp */
	@Field(30) 
	public TradeRecord timestamp(TimeT timestamp) {
		this.io.setTimeTField(this, 30, timestamp);
		return this;
	}
	/**
	 * for api usage<br>
	 * C type : int[4]
	 */
	@Array({4}) 
	@Field(31) 
	public Pointer<Integer > api_data() {
		return this.io.getPointerField(this, 31);
	}
	/**
	 * internal data<br>
	 * C type : TradeRecord*
	 */
	@Field(32) 
	public Pointer<TradeRecord > next() {
		return this.io.getPointerField(this, 32);
	}
	/**
	 * internal data<br>
	 * C type : TradeRecord*
	 */
	@Field(32) 
	public TradeRecord next(Pointer<TradeRecord > next) {
		this.io.setPointerField(this, 32, next);
		return this;
	}
	public TradeRecord() {
		super();
	}
	public TradeRecord(Pointer pointer) {
		super(pointer);
	}
}
