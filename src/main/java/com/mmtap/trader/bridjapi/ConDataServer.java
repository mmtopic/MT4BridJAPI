package com.mmtap.trader.bridjapi;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.CLong;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * +------------------------------------------------------------------+<br>
 * <i>native declaration : MT4ManagerAPI.h:145</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("MT4ManagerAPI") 
public class ConDataServer extends StructObject {
	static {
		BridJ.register();
	}
	/**
	 * server address (server:ip)<br>
	 * C type : char[64]
	 */
	@Array({64}) 
	@Field(0) 
	public Pointer<Byte > server() {
		return this.io.getPointerField(this, 0);
	}
	/** server IP */
	@CLong 
	@Field(1) 
	public long ip() {
		return this.io.getCLongField(this, 1);
	}
	/** server IP */
	@CLong 
	@Field(1) 
	public ConDataServer ip(long ip) {
		this.io.setCLongField(this, 1, ip);
		return this;
	}
	/**
	 * server description<br>
	 * C type : char[64]
	 */
	@Array({64}) 
	@Field(2) 
	public Pointer<Byte > description() {
		return this.io.getPointerField(this, 2);
	}
	/** can server be proxy? */
	@Field(3) 
	public int isproxy() {
		return this.io.getIntField(this, 3);
	}
	/** can server be proxy? */
	@Field(3) 
	public ConDataServer isproxy(int isproxy) {
		this.io.setIntField(this, 3, isproxy);
		return this;
	}
	/** priority: 0-7 base, 255-idle */
	@Field(4) 
	public int priority() {
		return this.io.getIntField(this, 4);
	}
	/** priority: 0-7 base, 255-idle */
	@Field(4) 
	public ConDataServer priority(int priority) {
		this.io.setIntField(this, 4, priority);
		return this;
	}
	/** server loading (UINT_MAX-server does not inform its loading) */
	@Field(5) 
	public int loading() {
		return this.io.getIntField(this, 5);
	}
	/** server loading (UINT_MAX-server does not inform its loading) */
	@Field(5) 
	public ConDataServer loading(int loading) {
		this.io.setIntField(this, 5, loading);
		return this;
	}
	/** internal IP address */
	@CLong 
	@Field(6) 
	public long ip_internal() {
		return this.io.getCLongField(this, 6);
	}
	/** internal IP address */
	@CLong 
	@Field(6) 
	public ConDataServer ip_internal(long ip_internal) {
		this.io.setCLongField(this, 6, ip_internal);
		return this;
	}
	/**
	 * reserved<br>
	 * C type : int[2]
	 */
	@Array({2}) 
	@Field(7) 
	public Pointer<Integer > reserved() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * internal (not used)<br>
	 * C type : ConDataServer*
	 */
	@Field(8) 
	public Pointer<ConDataServer > next() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * internal (not used)<br>
	 * C type : ConDataServer*
	 */
	@Field(8) 
	public ConDataServer next(Pointer<ConDataServer > next) {
		this.io.setPointerField(this, 8, next);
		return this;
	}
	public ConDataServer() {
		super();
	}
	public ConDataServer(Pointer pointer) {
		super(pointer);
	}
}