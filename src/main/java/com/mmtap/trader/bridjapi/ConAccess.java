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
 * <i>native declaration : MT4ManagerAPI.h:133</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("MT4ManagerAPI") 
public class ConAccess extends StructObject {
	static {
		BridJ.register();
	}
	/** type of action (FW_BLOCK,FW_PERMIT) */
	@Field(0) 
	public int action() {
		return this.io.getIntField(this, 0);
	}
	/** type of action (FW_BLOCK,FW_PERMIT) */
	@Field(0) 
	public ConAccess action(int action) {
		this.io.setIntField(this, 0, action);
		return this;
	}
	/** from, to addresses */
	@CLong 
	@Field(1) 
	public long from() {
		return this.io.getCLongField(this, 1);
	}
	/** from, to addresses */
	@CLong 
	@Field(1) 
	public ConAccess from(long from) {
		this.io.setCLongField(this, 1, from);
		return this;
	}
	/** from, to addresses */
	@CLong 
	@Field(2) 
	public long to() {
		return this.io.getCLongField(this, 2);
	}
	/** from, to addresses */
	@CLong 
	@Field(2) 
	public ConAccess to(long to) {
		this.io.setCLongField(this, 2, to);
		return this;
	}
	/**
	 * comment<br>
	 * C type : char[64]
	 */
	@Array({64}) 
	@Field(3) 
	public Pointer<Byte > comment() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * reserved<br>
	 * C type : int[17]
	 */
	@Array({17}) 
	@Field(4) 
	public Pointer<Integer > reserved() {
		return this.io.getPointerField(this, 4);
	}
	public ConAccess() {
		super();
	}
	public ConAccess(Pointer pointer) {
		super(pointer);
	}
}
