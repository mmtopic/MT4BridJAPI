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
 * <i>native declaration : MT4ManagerAPI.h:875</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("MT4ManagerAPI") 
public class TickRequest extends StructObject {
	static {
		BridJ.register();
	}
	/**
	 * symbol<br>
	 * C type : char[12]
	 */
	@Array({12}) 
	@Field(0) 
	public Pointer<Byte > symbol() {
		return this.io.getPointerField(this, 0);
	}
	/** start of period */
	@Field(1) 
	public TimeT from() {
		return this.io.getTimeTField(this, 1);
	}
	/** start of period */
	@Field(1) 
	public TickRequest from(TimeT from) {
		this.io.setTimeTField(this, 1, from);
		return this;
	}
	/** end of period */
	@Field(2) 
	public TimeT to() {
		return this.io.getTimeTField(this, 2);
	}
	/** end of period */
	@Field(2) 
	public TickRequest to(TimeT to) {
		this.io.setTimeTField(this, 2, to);
		return this;
	}
	/** TICK_FLAG_* flags */
	@Field(3) 
	public byte flags() {
		return this.io.getByteField(this, 3);
	}
	/** TICK_FLAG_* flags */
	@Field(3) 
	public TickRequest flags(byte flags) {
		this.io.setByteField(this, 3, flags);
		return this;
	}
	public TickRequest() {
		super();
	}
	public TickRequest(Pointer pointer) {
		super(pointer);
	}
}